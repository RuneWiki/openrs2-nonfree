import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!sq;")
	public static Class319 aClass319_2;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	public static int[] anIntArray230 = new int[1];

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[16];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIBII)Z")
	public static boolean method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 + arg2 > arg6 && arg3 + arg6 > arg2) {
			return arg7 + arg5 > arg1 && arg5 < arg1 + arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method3007() {
		for (@Pc(15) Class2_Sub7_Sub14 local15 = (Class2_Sub7_Sub14) Static514.aClass114_40.method2772(); local15 != null; local15 = (Class2_Sub7_Sub14) Static514.aClass114_40.method2762()) {
			@Pc(20) Class16_Sub1_Sub1_Sub5 local20 = local15.aClass16_Sub1_Sub1_Sub5_1;
			if (local20.anInt4345 < Static389.anInt6694) {
				local15.method8920();
				local20.method3792();
			} else if (Static389.anInt6694 >= local20.anInt4339) {
				local20.method3798();
				if (local20.anInt4321 > 0) {
					@Pc(44) Class2_Sub32 local44 = (Class2_Sub32) Static514.aClass323_32.method7484((long) (local20.anInt4321 - 1));
					if (local44 != null) {
						@Pc(49) Class16_Sub1_Sub1_Sub3_Sub1 local49 = local44.aClass16_Sub1_Sub1_Sub3_Sub1_2;
						if (local49.anInt8037 >= 0 && local49.anInt8037 < Static456.anInt7428 * 512 && local49.anInt8034 >= 0 && local49.anInt8034 < Static5.anInt112 * 512) {
							local20.method3796(local49.anInt8037, local49.anInt8034, Static389.anInt6694, Static392.method5799(local20.aByte109, local49.anInt8037, local49.anInt8034) - local20.anInt4314);
						}
					}
				}
				if (local20.anInt4321 < 0) {
					@Pc(104) int local104 = -local20.anInt4321 - 1;
					@Pc(109) Class16_Sub1_Sub1_Sub3_Sub2 local109;
					if (Static608.anInt10056 == local104) {
						local109 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1;
					} else {
						local109 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local104];
					}
					if (local109 != null && local109.anInt8037 >= 0 && Static456.anInt7428 * 512 > local109.anInt8037 && local109.anInt8034 >= 0 && Static5.anInt112 * 512 > local109.anInt8034) {
						local20.method3796(local109.anInt8037, local109.anInt8034, Static389.anInt6694, Static392.method5799(local20.aByte109, local109.anInt8037, local109.anInt8034) - local20.anInt4314);
					}
				}
				local20.method3794(Static190.anInt3789);
				Static196.method3387(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method3009(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static568.anInt9305 >= 100) {
			Static601.method8468(Static573.aClass345_41.method7951(Static496.anInt7407));
			return;
		}
		@Pc(23) String local23 = Static529.method7327(arg1);
		if (local23 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(28) int local28 = 0; local28 < Static568.anInt9305; local28++) {
			@Pc(35) String local35 = Static529.method7327(Static84.aStringArray8[local28]);
			if (local35 != null && local35.equals(local23)) {
				Static601.method8468(arg1 + Static573.aClass345_42.method7951(Static496.anInt7407));
				return;
			}
			if (Static188.aStringArray22[local28] != null) {
				local66 = Static529.method7327(Static188.aStringArray22[local28]);
				if (local66 != null && local66.equals(local23)) {
					Static601.method8468(arg1 + Static573.aClass345_42.method7951(Static496.anInt7407));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static289.anInt5236; local97++) {
			local66 = Static529.method7327(Static514.aStringArray44[local97]);
			if (local66 != null && local66.equals(local23)) {
				Static601.method8468(Static573.aClass345_47.method7951(Static496.anInt7407) + arg1 + Static573.aClass345_48.method7951(Static496.anInt7407));
				return;
			}
			if (Static83.aStringArray7[local97] != null) {
				@Pc(140) String local140 = Static529.method7327(Static83.aStringArray7[local97]);
				if (local140 != null && local140.equals(local23)) {
					Static601.method8468(Static573.aClass345_47.method7951(Static496.anInt7407) + arg1 + Static573.aClass345_48.method7951(Static496.anInt7407));
					return;
				}
			}
		}
		if (Static529.method7327(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82).equals(local23)) {
			Static601.method8468(Static573.aClass345_44.method7951(Static496.anInt7407));
			return;
		}
		@Pc(199) Class2_Sub31 local199 = Static275.method4480(Static640.aClass314_2, Static157.aClass145_53);
		local199.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(arg1) + 1);
		local199.aClass2_Sub17_Sub1_2.method2856(arg1);
		local199.aClass2_Sub17_Sub1_2.method2837(arg0 ? 1 : 0);
		Static526.method7309(local199);
	}
}
