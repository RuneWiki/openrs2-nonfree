import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BIIIII)V")
	public static void method7385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg2) {
			Static268.method3924(arg2, arg1, arg3, arg0);
		} else if (Static330.anInt6025 <= arg3 - arg2 && arg2 + arg3 <= Static194.anInt3788 && Static120.anInt2491 <= arg0 - arg4 && Static71.anInt1350 >= arg0 + arg4) {
			Static549.method7489(arg4, arg2, arg1, arg3, arg0);
		} else {
			Static586.method7841(arg3, arg2, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
	public static void method7386() {
		Static79.aClass207_5.method4398();
		Static301.aClass207_29.method4398();
		Static201.aClass207_21.method4398();
		Static593.aClass207_62.method4398();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBI)Z")
	public static boolean method7387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIZ)Lclient!ql;")
	public static Class1_Sub38 method7388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class1_Sub38 local7 = new Class1_Sub38();
		local7.anInt7675 = arg2;
		local7.anInt7676 = arg1;
		Static148.aClass91_6.method2269((long) arg0, local7);
		Static15.method368(arg1);
		@Pc(36) Class160 local36 = Static512.method7155(arg0);
		if (local36 != null) {
			Static415.method5900(local36);
		}
		if (Static390.aClass160_43 != null) {
			Static415.method5900(Static390.aClass160_43);
			Static390.aClass160_43 = null;
		}
		Static595.method7986();
		if (local36 != null) {
			Static361.method5313(local36, !arg3);
		}
		if (!arg3) {
			Static451.method6308(arg1);
		}
		if (!arg3 && Static165.anInt3165 != -1) {
			Static568.method7207(Static165.anInt3165, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIZ)I")
	public static int method7389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
