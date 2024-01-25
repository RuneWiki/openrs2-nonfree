import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
	public static int anInt8247;

	@OriginalMember(owner = "client!qr", name = "N", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_186 = new Class359(96, 6);

	@OriginalMember(owner = "client!qr", name = "P", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_187 = new Class359(91, 6);

	@OriginalMember(owner = "client!qr", name = "R", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_188 = new Class359(12, 0);

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_74 = new Class305(44, 7);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!uaa;Z)Lclient!uaa;")
	public static Class345 method7048(@OriginalArg(0) Class345 arg0) {
		@Pc(11) Class345 local11 = Static84.method1817(arg0);
		if (local11 == null) {
			local11 = arg0.aClass345_12;
		}
		return local11;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public static void method7049() {
		for (@Pc(6) Class28_Sub8 local6 = (Class28_Sub8) Static439.aClass156_7.method3775(); local6 != null; local6 = (Class28_Sub8) Static439.aClass156_7.method3775()) {
			Static371.method5568(local6);
		}
		@Pc(32) int local32;
		@Pc(30) int local30;
		if (Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 1) {
			local30 = 3;
			local32 = 0;
		} else {
			local30 = Static419.anInt7416;
			local32 = Static419.anInt7416;
		}
		Static84.method1828();
		for (@Pc(41) int local41 = local32; local41 <= local30; local41++) {
			Static84.method1827();
			Static84.method1826(local41);
			Static84.method1818(local41);
		}
		Static84.method1823();
		Static84.method1814();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method7050(@OriginalArg(0) Class5_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static495.aClass109Array4 != Static111.aClass109Array3) {
			@Pc(12) int local12 = Static605.aClass109Array5[arg1].method7702(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class109 local19 = Static605.aClass109Array5[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7702(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7693(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!qf;IIZ)V")
	public static void method7051(@OriginalArg(0) Class5_Sub3_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!Static493.aBoolean702) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class5_Sub3_Sub20 local16 = (Class5_Sub3_Sub20) arg0.aClass358_7.method8322(); local16 != null; local16 = (Class5_Sub3_Sub20) arg0.aClass358_7.method8328()) {
			local22 = Static435.method8377(local16);
			if (local10 < local22) {
				local10 = local22;
			}
		}
		local10 += 8;
		local22 = arg0.anInt8017 * 16 + 21;
		Static469.anInt7914 = arg0.anInt8017 * 16 + (Static375.aBoolean592 ? 26 : 22);
		@Pc(62) int local62 = Static633.anInt10304 + Static477.anInt8042;
		if (local10 + local62 > Static32.anInt510) {
			local62 = Static477.anInt8042 - local10;
		}
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(89) int local89 = Static375.aBoolean592 ? 33 : 31;
		@Pc(96) int local96 = arg1 + 13 - local89;
		if (Static79.anInt1140 < local96 + local22) {
			local96 = Static79.anInt1140 - local22;
		}
		Static556.anInt9088 = local62;
		if (local96 < 0) {
			local96 = 0;
		}
		Static220.anInt4457 = local96;
		Static345.aClass5_Sub3_Sub15_1 = arg0;
		Static260.anInt4826 = local10;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method7052(@OriginalArg(2) String arg0) {
		Static234.method3619(0, "", "", "", arg0, 4);
	}
}
