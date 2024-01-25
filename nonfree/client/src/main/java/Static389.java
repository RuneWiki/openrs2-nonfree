import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array21;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
	public static int anInt6418 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIBLclient!ps;)V")
	public static void method5370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class273 arg2) {
		if (arg2.aByte90 == 0) {
			arg2.anInt6855 = arg2.anInt6836;
		} else if (arg2.aByte90 == 1) {
			arg2.anInt6855 = (arg1 - arg2.anInt6814) / 2 + arg2.anInt6836;
		} else if (arg2.aByte90 == 2) {
			arg2.anInt6855 = arg1 - arg2.anInt6814 - arg2.anInt6836;
		} else if (arg2.aByte90 == 3) {
			arg2.anInt6855 = arg1 * arg2.anInt6836 >> 14;
		} else if (arg2.aByte90 == 4) {
			arg2.anInt6855 = (arg2.anInt6836 * arg1 >> 14) + (arg1 - arg2.anInt6814) / 2;
		} else {
			arg2.anInt6855 = arg1 - arg2.anInt6814 - (arg2.anInt6836 * arg1 >> 14);
		}
		if (arg2.aByte88 == 0) {
			arg2.anInt6817 = arg2.anInt6819;
		} else if (arg2.aByte88 == 1) {
			arg2.anInt6817 = arg2.anInt6819 + (arg0 - arg2.anInt6883) / 2;
		} else if (arg2.aByte88 == 2) {
			arg2.anInt6817 = arg0 - arg2.anInt6819 - arg2.anInt6883;
		} else if (arg2.aByte88 == 3) {
			arg2.anInt6817 = arg2.anInt6819 * arg0 >> 14;
		} else if (arg2.aByte88 == 4) {
			arg2.anInt6817 = (arg0 - arg2.anInt6883) / 2 + (arg0 * arg2.anInt6819 >> 14);
		} else {
			arg2.anInt6817 = arg0 - arg2.anInt6883 - (arg0 * arg2.anInt6819 >> 14);
		}
		if (!Static440.aBoolean582) {
			return;
		}
		if (Static70.method1164(arg2).anInt3330 == 0 && arg2.anInt6868 != 0) {
			return;
		}
		if (arg2.anInt6855 < 0) {
			arg2.anInt6855 = 0;
		} else if (arg2.anInt6855 + arg2.anInt6814 > arg1) {
			arg2.anInt6855 = arg1 - arg2.anInt6814;
		}
		if (arg2.anInt6817 < 0) {
			arg2.anInt6817 = 0;
			return;
		}
		if (arg2.anInt6883 + arg2.anInt6817 > arg0) {
			arg2.anInt6817 = arg0 - arg2.anInt6883;
			return;
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)Lclient!po;")
	public static Class12_Sub2_Sub5 method5373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub2_Sub5_1;
	}
}
