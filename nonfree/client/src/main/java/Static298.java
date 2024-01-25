import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
	public static int anInt5449;

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
	public static int anInt5454;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_194 = new Class184(103, -2);

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "[I")
	public static final int[] anIntArray414 = new int[13];

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4383(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BZIII)Lclient!te;")
	public static Class3_Sub40 method4386(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class3_Sub40 local15 = new Class3_Sub40();
		local15.anInt6668 = arg1;
		local15.anInt6670 = arg2;
		Static30.aClass127_3.method3257((long) arg3, local15);
		Static348.method5827(arg1);
		@Pc(34) Class68 local34 = Static321.method4661(arg3);
		if (local34 != null) {
			Static442.method5899(local34);
		}
		if (Static426.aClass68_13 != null) {
			Static442.method5899(Static426.aClass68_13);
			Static426.aClass68_13 = null;
		}
		Static218.method3482();
		if (local34 != null) {
			Static446.method5923(!arg0, local34);
		}
		if (!arg0) {
			Static272.method4043(arg1);
		}
		if (!arg0 && Static337.anInt6221 != -1) {
			Static289.method4240(Static337.anInt6221, 1);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public static void method4388() {
		for (@Pc(1) int local1 = 0; local1 < Static229.anInt4389; local1++) {
			@Pc(6) int local6 = Static168.anIntArray263[local1];
			@Pc(10) Class1_Sub3_Sub3_Sub2 local10 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local6];
			@Pc(16) int local16 = Static110.aClass3_Sub2_Sub2_1.method6053();
			if ((local16 & 0x80) != 0) {
				local16 += Static110.aClass3_Sub2_Sub2_1.method6053() << 8;
			}
			@Pc(38) int local38;
			@Pc(47) int local47;
			if ((local16 & 0x2) != 0) {
				local38 = Static110.aClass3_Sub2_Sub2_1.method6006();
				if (local38 == 65535) {
					local38 = -1;
				}
				local47 = Static110.aClass3_Sub2_Sub2_1.method6013();
				Static319.method4637(local38, local10, local47);
			}
			if ((local16 & 0x2000) != 0) {
				local38 = Static110.aClass3_Sub2_Sub2_1.method6044();
				@Pc(65) int[] local65 = new int[local38];
				@Pc(68) int[] local68 = new int[local38];
				@Pc(71) int[] local71 = new int[local38];
				for (@Pc(73) int local73 = 0; local73 < local38; local73++) {
					@Pc(78) int local78 = Static110.aClass3_Sub2_Sub2_1.method6041();
					if (local78 == 65535) {
						local78 = -1;
					}
					local65[local73] = local78;
					local68[local73] = Static110.aClass3_Sub2_Sub2_1.method6044();
					local71[local73] = Static110.aClass3_Sub2_Sub2_1.method6003();
				}
				Static167.method5104(local71, local65, local68, local10);
			}
			if ((local16 & 0x1) != 0) {
				local38 = Static110.aClass3_Sub2_Sub2_1.method6040();
				local47 = Static110.aClass3_Sub2_Sub2_1.method5997();
				local10.method4843(local38, Static290.anInt5325, local47);
				local10.anInt6059 = Static290.anInt5325 + 300;
				local10.anInt6099 = Static110.aClass3_Sub2_Sub2_1.method6013();
			}
			if ((local16 & 0x20) != 0) {
				local10.aString57 = Static110.aClass3_Sub2_Sub2_1.method6027();
				local10.anInt6119 = 100;
			}
			if ((local16 & 0x100) != 0) {
				local10.anInt6147 = Static110.aClass3_Sub2_Sub2_1.method6006();
				local10.anInt6152 = Static110.aClass3_Sub2_Sub2_1.method6004();
			}
			if ((local16 & 0x800) != 0) {
				local38 = Static110.aClass3_Sub2_Sub2_1.method6041();
				local10.anInt6097 = Static110.aClass3_Sub2_Sub2_1.method5997();
				local10.anInt6107 = Static110.aClass3_Sub2_Sub2_1.method5997();
				local10.aBoolean428 = (local38 & 0x8000) != 0;
				local10.anInt6109 = local38 & 0x7FFF;
				local10.anInt6112 = local10.anInt6097 + local10.anInt6109 + Static290.anInt5325;
			}
			if ((local16 & 0x10) != 0) {
				local10.anInt6102 = Static110.aClass3_Sub2_Sub2_1.method6003();
				if (local10.anInt6102 == 65535) {
					local10.anInt6102 = -1;
				}
			}
			if ((local16 & 0x4) != 0) {
				if (local10.aClass47_1.method1305()) {
					Static5.method107(local10);
				}
				local10.method4854(Static154.aClass251_2.method5684(Static110.aClass3_Sub2_Sub2_1.method6006()));
				local10.method4844(local10.aClass47_1.anInt1578);
				local10.anInt6100 = local10.aClass47_1.anInt1585 << 3;
				if (local10.aClass47_1.method1305()) {
					Static301.method4446(null, local10, null, local10.anIntArray453[0], 0, local10.aByte77, local10.anIntArray454[0]);
				}
			}
			if ((local16 & 0x40) != 0) {
				local38 = Static110.aClass3_Sub2_Sub2_1.method6040();
				local47 = Static110.aClass3_Sub2_Sub2_1.method6013();
				local10.method4843(local38, Static290.anInt5325, local47);
			}
			@Pc(341) int local341;
			if ((local16 & 0x8) != 0) {
				local38 = Static110.aClass3_Sub2_Sub2_1.method6004();
				if (local38 == 65535) {
					local38 = -1;
				}
				local47 = Static110.aClass3_Sub2_Sub2_1.method6025();
				local341 = Static110.aClass3_Sub2_Sub2_1.method6044();
				local10.method4834(false, local47, local38, local341);
			}
			if ((local16 & 0x400) != 0) {
				local10.anInt6065 = Static110.aClass3_Sub2_Sub2_1.method6049();
				local10.anInt6061 = Static110.aClass3_Sub2_Sub2_1.method6048();
				local10.anInt6071 = Static110.aClass3_Sub2_Sub2_1.method6048();
				local10.anInt6085 = Static110.aClass3_Sub2_Sub2_1.method6011();
				local10.anInt6123 = Static110.aClass3_Sub2_Sub2_1.method6003() + Static290.anInt5325;
				local10.anInt6108 = Static110.aClass3_Sub2_Sub2_1.method6006() + Static290.anInt5325;
				local10.anInt6089 = Static110.aClass3_Sub2_Sub2_1.method6053();
				local10.anInt6085 += local10.anIntArray454[0];
				local10.anInt6071 += local10.anIntArray453[0];
				local10.anInt6133 = 1;
				local10.anInt6061 += local10.anIntArray454[0];
				local10.anInt6065 += local10.anIntArray453[0];
				local10.anInt6136 = 0;
			}
			if ((local16 & 0x1000) != 0) {
				local10.aByte79 = Static110.aClass3_Sub2_Sub2_1.method6011();
				local10.aByte82 = Static110.aClass3_Sub2_Sub2_1.method6011();
				local10.aByte80 = Static110.aClass3_Sub2_Sub2_1.method6049();
				local10.aByte81 = (byte) Static110.aClass3_Sub2_Sub2_1.method6053();
				local10.anInt6116 = Static290.anInt5325 + Static110.aClass3_Sub2_Sub2_1.method6041();
				local10.anInt6103 = Static290.anInt5325 + Static110.aClass3_Sub2_Sub2_1.method6003();
			}
			if ((local16 & 0x200) != 0) {
				local38 = Static110.aClass3_Sub2_Sub2_1.method6006();
				local47 = Static110.aClass3_Sub2_Sub2_1.method6014();
				if (local38 == 65535) {
					local38 = -1;
				}
				local341 = Static110.aClass3_Sub2_Sub2_1.method5997();
				local10.method4834(true, local47, local38, local341);
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4396(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
