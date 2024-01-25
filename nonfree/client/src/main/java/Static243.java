import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!lr", name = "S", descriptor = "Lclient!pb;")
	public static Class194 aClass194_4;

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array8;

	@OriginalMember(owner = "client!lr", name = "R", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
	public static int anInt4160 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([BLjava/lang/String;II)I")
	public static int method3375(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 <= '\u007f') {
				arg0[local15++] = (byte) local23;
			} else if (local23 > '\u07ff') {
				arg0[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg2;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!l;Ljava/awt/Canvas;BI)Lclient!za;")
	public static Class75 method3376(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class75_Sub1(arg2, arg1, arg0);
	}
}
