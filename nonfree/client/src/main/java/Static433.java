import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
	public static int anInt7009 = 13156520;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public static void method5968() {
		if (Static77.aClass252_2 != null) {
			Static77.aClass252_2.method5479();
		}
		if (Static235.aThread2 == null) {
			return;
		}
		while (true) {
			try {
				Static235.aThread2.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZZIZIII)V")
	public static void method5969(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) Class89_Sub1 local20 = Static1.aClass89_Sub1Array6[local14];
		Static1.aClass89_Sub1Array6[local14] = Static1.aClass89_Sub1Array6[arg3];
		Static1.aClass89_Sub1Array6[arg3] = local20;
		for (@Pc(32) int local32 = arg1; local32 < arg3; local32++) {
			if (Static183.method2680(local20, arg4, Static1.aClass89_Sub1Array6[local32], arg0, arg5, arg2) <= 0) {
				@Pc(49) Class89_Sub1 local49 = Static1.aClass89_Sub1Array6[local32];
				Static1.aClass89_Sub1Array6[local32] = Static1.aClass89_Sub1Array6[local16];
				Static1.aClass89_Sub1Array6[local16++] = local49;
			}
		}
		Static1.aClass89_Sub1Array6[arg3] = Static1.aClass89_Sub1Array6[local16];
		Static1.aClass89_Sub1Array6[local16] = local20;
		method5969(arg0, arg1, arg2, local16 - 1, arg4, arg5);
		method5969(arg0, local16 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILclient!kc;)V")
	public static void method5970(@OriginalArg(1) Class13_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(17) Class2_Sub33 local17 = (Class2_Sub33) Static221.aClass118_18.method2595((long) arg0.anInt4582);
		if (local17 == null) {
			Static222.method3036(arg0.anIntArray306[0], null, arg0.aByte127, null, arg0.anIntArray307[0], 0, arg0);
		} else {
			local17.method5117();
		}
	}
}
