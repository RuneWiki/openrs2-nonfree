import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public static int anInt9035;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean633 = false;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
	public static final int[] anIntArray485 = new int[4];

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!gv;")
	public static final Class128 aClass128_7 = new Class128();

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(CI)Z")
	public static boolean method7375(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static129.method2632(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static17.aCharArray1;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static371.aCharArray7;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (arg0 == local55) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!un;IILclient!wd;)V")
	public static void method7377(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class354 arg2) {
		@Pc(17) Class4_Sub23 local17 = new Class4_Sub23();
		local17.anInt4040 = arg0.method4905();
		local17.anInt4038 = arg0.method4931();
		local17.anIntArray195 = new int[local17.anInt4040];
		local17.aClass234Array1 = new Class234[local17.anInt4040];
		local17.aByteArrayArrayArray3 = new byte[local17.anInt4040][][];
		local17.aClass234Array2 = new Class234[local17.anInt4040];
		local17.anIntArray197 = new int[local17.anInt4040];
		local17.anIntArray196 = new int[local17.anInt4040];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt4040; local59++) {
			try {
				@Pc(65) int local65 = arg0.method4905();
				@Pc(88) String local88;
				@Pc(92) String local92;
				@Pc(96) int local96;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local88 = arg0.method4920();
					local92 = arg0.method4920();
					local96 = 0;
					if (local65 == 1) {
						local96 = arg0.method4931();
					}
					local17.anIntArray195[local59] = local65;
					local17.anIntArray196[local59] = local96;
					local17.aClass234Array2[local59] = arg2.method8224(local92, Static99.method2179(local88));
				} else if (local65 == 3 || local65 == 4) {
					local88 = arg0.method4920();
					local92 = arg0.method4920();
					local96 = arg0.method4905();
					@Pc(99) String[] local99 = new String[local96];
					for (@Pc(101) int local101 = 0; local101 < local96; local101++) {
						local99[local101] = arg0.method4920();
					}
					@Pc(120) byte[][] local120 = new byte[local96][];
					@Pc(133) int local133;
					if (local65 == 3) {
						for (@Pc(127) int local127 = 0; local127 < local96; local127++) {
							local133 = arg0.method4931();
							local120[local127] = new byte[local133];
							arg0.method4926(local133, local120[local127]);
						}
					}
					local17.anIntArray195[local59] = local65;
					@Pc(158) Class[] local158 = new Class[local96];
					for (local133 = 0; local133 < local96; local133++) {
						local158[local133] = Static99.method2179(local99[local133]);
					}
					local17.aClass234Array1[local59] = arg2.method8221(local92, local158, Static99.method2179(local88));
					local17.aByteArrayArrayArray3[local59] = local120;
				}
			} catch (@Pc(235) ClassNotFoundException local235) {
				local17.anIntArray197[local59] = -1;
			} catch (@Pc(242) SecurityException local242) {
				local17.anIntArray197[local59] = -2;
			} catch (@Pc(249) NullPointerException local249) {
				local17.anIntArray197[local59] = -3;
			} catch (@Pc(256) Exception local256) {
				local17.anIntArray197[local59] = -4;
			} catch (@Pc(263) Throwable local263) {
				local17.anIntArray197[local59] = -5;
			}
		}
		Static410.aClass244_54.method5960(local17);
	}
}
