import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "Lclient!qj;")
	public static Class272 aClass272_1;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public static int anInt2199 = -1;

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[8];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2011(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static19.method5213(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1.charAt(local25) != arg0; local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
	public static int method2012() {
		if (Static104.anInt1999 == 0) {
			Static272.aClass184_2.method4496(new Class87("jaclib"));
			if (Static272.aClass184_2.method4500().method6482() != 100) {
				return 1;
			}
			if (!((Class87) Static272.aClass184_2.method4500()).method2563()) {
				Static111.aClient1.method1342();
			}
			Static104.anInt1999 = 1;
		}
		@Pc(235) int local235;
		@Pc(260) int local260;
		@Pc(274) int local274;
		@Pc(280) int local280;
		if (Static104.anInt1999 == 1) {
			Static172.aClass184Array1 = Static272.method4499();
			Static272.aClass184_1.method4496(new Class233(Static89.aClass251_23));
			Static272.aClass184_3.method4496(new Class87("jaggl"));
			Static272.aClass184_4.method4496(new Class87("jagdx"));
			Static272.aClass184_5.method4496(new Class87("jagmisc"));
			Static272.aClass184_6.method4496(new Class87("sw3d"));
			Static272.aClass184_7.method4496(new Class87("hw3d"));
			Static272.aClass184_8.method4496(new Class233(Static13.aClass251_100));
			Static272.aClass184_9.method4496(new Class233(Static455.aClass251_106));
			Static272.aClass184_10.method4496(new Class233(Static579.aClass251_129));
			Static272.aClass184_11.method4496(new Class233(Static341.aClass251_84));
			Static272.aClass184_12.method4496(new Class233(Static438.aClass251_99));
			Static272.aClass184_13.method4496(new Class233(Static48.aClass251_14));
			Static272.aClass184_14.method4496(new Class233(Static114.aClass251_27));
			Static272.aClass184_15.method4496(new Class233(Static447.aClass251_104));
			Static272.aClass184_16.method4496(new Class233(Static459.aClass251_108));
			Static272.aClass184_17.method4496(new Class233(Static156.aClass251_48));
			Static272.aClass184_18.method4496(new Class233(Static313.aClass251_75));
			Static272.aClass184_19.method4496(new Class233(Static533.aClass251_123));
			Static272.aClass184_20.method4496(new Class233(Static476.aClass251_113));
			Static272.aClass184_21.method4496(new Class233(Static132.aClass251_33));
			Static272.aClass184_22.method4496(new Class38(Static466.aClass251_111, "huffman"));
			Static272.aClass184_23.method4496(new Class233(Static284.aClass251_68));
			Static272.aClass184_24.method4496(new Class233(Static466.aClass251_110));
			Static272.aClass184_25.method4496(new Class233(Static264.aClass251_66));
			Static272.aClass184_26.method4496(new Class294(Static4.aClass251_4, "details"));
			for (local235 = 0; local235 < Static172.aClass184Array1.length; local235++) {
				if (Static172.aClass184Array1[local235].method4500() == null) {
					throw new RuntimeException();
				}
			}
			local260 = 0;
			@Pc(262) Class184[] local262 = Static172.aClass184Array1;
			for (@Pc(264) int local264 = 0; local264 < local262.length; local264++) {
				@Pc(270) Class184 local270 = local262[local264];
				local274 = local270.method4493();
				local280 = local270.method4500().method6482();
				local260 += local274 * local280 / 100;
			}
			Static125.anInt9119 = local260;
			Static104.anInt1999 = 2;
		}
		if (Static172.aClass184Array1 == null) {
			return 100;
		}
		local235 = 0;
		local260 = 0;
		@Pc(324) boolean local324 = true;
		@Pc(326) Class184[] local326 = Static172.aClass184Array1;
		for (@Pc(328) int local328 = 0; local328 < local326.length; local328++) {
			@Pc(334) Class184 local334 = local326[local328];
			local280 = local334.method4493();
			@Pc(344) int local344 = local334.method4500().method6482();
			if (local344 < 100) {
				local324 = false;
			}
			local235 += local280;
			local260 += local344 * local280 / 100;
		}
		if (local324) {
			if (!((Class87) Static272.aClass184_5.method4500()).method2563()) {
				Static111.aClient1.method1341();
			}
			Static172.aClass184Array1 = null;
		}
		local260 -= Static125.anInt9119;
		local235 -= Static125.anInt9119;
		local274 = local235 > 0 ? local260 * 100 / local235 : 100;
		if (!local324 && local274 > 99) {
			local274 = 99;
		}
		return local274;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[BIII[BIII)V")
	public static void method2015(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -(arg0 >> 2);
		@Pc(21) int local21 = -(arg0 & 0x3);
		for (@Pc(24) int local24 = -arg2; local24 < 0; local24++) {
			@Pc(32) int local32;
			for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
				local32 = arg5++;
				arg1[local32] = (byte) (arg1[local32] - arg4[arg6++]);
				@Pc(45) int local45 = arg5++;
				arg1[local45] = (byte) (arg1[local45] - arg4[arg6++]);
				@Pc(58) int local58 = arg5++;
				arg1[local58] = (byte) (arg1[local58] - arg4[arg6++]);
				@Pc(71) int local71 = arg5++;
				arg1[local71] = (byte) (arg1[local71] - arg4[arg6++]);
			}
			for (@Pc(90) int local90 = local21; local90 < 0; local90++) {
				local32 = arg5++;
				arg1[local32] = (byte) (arg1[local32] - arg4[arg6++]);
			}
			arg6 += arg3;
			arg5 += arg7;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBZ)V")
	public static void method2016(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) Class6_Sub49 local16 = Static84.method1640(arg0, arg1);
		if (local16 != null) {
			local16.method7804();
		}
	}
}
