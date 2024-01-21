import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!hg;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Lclient!pe;")
	public static Class13 aClass13_31;

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_21;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public static final int anInt3751 = 4;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
	public static final int[] anIntArray416 = new int[anInt3751];

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "[[Lclient!ih;")
	public static final Class38[][] aClass38ArrayArray1 = new Class38[anInt3751][500];

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_54 = new Class89(64);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public static int anInt3743 = 0;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1016 = Static158.method3034(" has logged out)3");

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1017 = aClass60_1016;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1018 = Static158.method3034("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
	public static int anInt3754 = 0;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1019 = aClass60_1018;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
	public static int anInt3755 = 0;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method2891() {
		aClass29_1.method3261();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static186.aLongArray10[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static146.aLongArray8[local22] = 0L;
		}
		Static123.anInt3377 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!sh;)V")
	public static void method2893(@OriginalArg(1) Class80 arg0) {
		Static114.aClass80_1 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)Z")
	public static boolean method2894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static15.method397(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static188.method3446(local10 + 1, Static100.anIntArrayArrayArray5[arg0][arg1][arg2] + arg3, local14 + 1) && Static188.method3446(local10 + 128 - 1, Static100.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static188.method3446(local10 + 128 - 1, Static100.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static188.method3446(local10 + 1, Static100.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public static void method2895() {
		Static128.aClass89_49.method3439();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(ZI)V")
	public static void method2896(@OriginalArg(0) boolean arg0) {
		if (Static159.aClass66_41 == null) {
			return;
		}
		try {
			@Pc(16) Class2_Sub3 local16 = new Class2_Sub3(4);
			local16.method224(arg0 ? 2 : 3);
			local16.method238(0);
			Static159.aClass66_41.method2838(local16.aByteArray4, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static159.aClass66_41.method2834();
			} catch (@Pc(44) Exception local44) {
			}
			Static159.aClass66_41 = null;
			Static39.anInt1274++;
		}
	}
}
