import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!tda", name = "G", descriptor = "[Lclient!fg;")
	public static final Class89[] aClass89Array1 = new Class89[2048];

	@OriginalMember(owner = "client!tda", name = "K", descriptor = "I")
	public static int anInt8307 = 0;

	@OriginalMember(owner = "client!tda", name = "M", descriptor = "Lclient!db;")
	public static final Class57 aClass57_14 = new Class57(8, 0, 4, 1);

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "([BBLjava/lang/String;I)I")
	public static int method6894(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 <= '\u007f') {
				arg0[local15++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg0[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg2;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(BI)V")
	public static void method6895(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub10_Sub16 local16 = Static362.method5701(arg0, 2);
		local16.method6212();
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)V")
	public static void method6897(@OriginalArg(0) int arg0) {
		Static129.anInt2692 = arg0;
		Static531.anInt9235 = -1;
		Static531.anInt9235 = -1;
		Static374.method5885();
	}
}
