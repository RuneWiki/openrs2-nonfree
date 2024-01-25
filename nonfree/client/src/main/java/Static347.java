import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!oda", name = "M", descriptor = "I")
	public static int anInt6620;

	@OriginalMember(owner = "client!oda", name = "P", descriptor = "I")
	public static int anInt6621;

	@OriginalMember(owner = "client!oda", name = "G", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!oda", name = "O", descriptor = "S")
	public static short aShort99 = 1;

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "(I)V")
	public static void method5527() {
		Static236.aClass5_4.X(Static293.anInt8472, Static7.aClass3_Sub15_Sub1_1.aBoolean606 ? Static477.anInt8634 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!qf;BLclient!oa;)V")
	public static void method5528(@OriginalArg(0) Class245 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(36) boolean local36 = Static99.aClass96_7.method2506(arg0.aBoolean497 ? Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1 : null, arg0.anInt7285, arg0.anInt7255, arg0.anInt7235, arg0.anInt7269 | 0xFF000000, arg0.anInt7271, arg1) == null;
		if (local36) {
			Static131.aClass71_22.method2076(new Class3_Sub36(arg0.anInt7271, arg0.anInt7285, arg0.anInt7255, arg0.anInt7269 | 0xFF000000, arg0.anInt7235, arg0.aBoolean497));
			Static31.method809(arg0);
		}
	}

	@OriginalMember(owner = "client!oda", name = "j", descriptor = "(I)V")
	public static void method5529() {
		if (Static318.anInt5230 == 1 || Static318.anInt5230 == 3 || Static318.anInt5230 != Static340.anInt6418 && (Static318.anInt5230 == 0 || Static340.anInt6418 == 0)) {
			Static183.anInt5938 = 0;
			Static221.anInt4798 = 0;
			Static240.aClass267_20.method6648();
		}
		Static340.anInt6418 = Static318.anInt5230;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBLjava/lang/String;[B)I")
	public static int method5530(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) int local10 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local10; local20 += 4) {
			@Pc(28) int local28 = Static286.method4858(arg1.charAt(local20));
			@Pc(43) int local43 = local10 > local20 + 1 ? Static286.method4858(arg1.charAt(local20 + 1)) : -1;
			@Pc(62) int local62 = local20 + 2 >= local10 ? -1 : Static286.method4858(arg1.charAt(local20 + 2));
			@Pc(77) int local77 = local20 + 3 < local10 ? Static286.method4858(arg1.charAt(local20 + 3)) : -1;
			arg2[arg0++] = (byte) (local43 >>> 4 | local28 << 2);
			if (local62 == -1) {
				break;
			}
			arg2[arg0++] = (byte) (local62 >>> 2 | (local43 & 0xF) << 4);
			if (local77 == -1) {
				break;
			}
			arg2[arg0++] = (byte) ((local62 & 0x3) << 6 | local77);
		}
		return arg0;
	}
}
