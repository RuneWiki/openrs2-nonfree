import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_45 = new Class137(64);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!js;")
	public static Class48 method3301(@OriginalArg(0) Component arg0) {
		return new Class48_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()V")
	public static void method3302() {
		Static208.method5498(Static320.anInt5205);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)I")
	public static int method3303() {
		return 6;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLjava/lang/String;I[B)I")
	public static int method3305(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(23) char local23 = arg0.charAt(local12);
			if (local23 <= '\u007f') {
				arg2[local10++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg2[local10++] = (byte) (local23 >> 6 | 0xC0);
				arg2[local10++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg2[local10++] = (byte) (local23 >> 12 | 0xE0);
				arg2[local10++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg2[local10++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local10 - arg1;
	}
}
