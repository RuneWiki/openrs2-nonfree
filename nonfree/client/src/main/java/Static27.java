import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!f", name = "Cb", descriptor = "I")
	public static int anInt853;

	@OriginalMember(owner = "client!f", name = "vb", descriptor = "I")
	public static int anInt848 = 0;

	@OriginalMember(owner = "client!f", name = "Hb", descriptor = "Lclient!s;")
	public static Class66 aClass66_2 = new Class66(4096);

	@OriginalMember(owner = "client!f", name = "Ib", descriptor = "I")
	public static int anInt856 = 0;

	@OriginalMember(owner = "client!f", name = "bc", descriptor = "Lclient!mb;")
	private static Class45 aClass45_419 = Static63.method1251("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!f", name = "Jb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_414 = aClass45_419;

	@OriginalMember(owner = "client!f", name = "Ub", descriptor = "Lclient!mb;")
	private static Class45 aClass45_417 = Static63.method1251("wishes to trade with you)3");

	@OriginalMember(owner = "client!f", name = "Lb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_415 = aClass45_417;

	@OriginalMember(owner = "client!f", name = "Mb", descriptor = "I")
	public static int anInt858 = -1;

	@OriginalMember(owner = "client!f", name = "Sb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_416 = Static63.method1251("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!f", name = "fc", descriptor = "Lclient!mb;")
	public static Class45 aClass45_420 = aClass45_419;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ia;IILclient!ia;I)Lclient!ia;")
	public static Class5_Sub2_Sub8 method605(@OriginalArg(0) Class5_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub2_Sub8 arg3) {
		@Pc(37) Class5_Sub2_Sub8 local37 = Static81.method1513(arg0.anInt1244, arg3, arg0.anInt1243, arg1, arg0.anInt1260, 0, arg2, arg0.anInt1265, arg0.anInt1262, 0, Static19.aClass5_Sub2_Sub8ArrayArray1[arg0.anInt1262 >> 16]);
		if (local37 == null) {
			if (arg0.aClass5_Sub2_Sub8Array1 != null) {
				local37 = Static81.method1513(arg0.anInt1244, arg3, arg0.anInt1243, arg1, arg0.anInt1260, 0, arg2, arg0.anInt1265, arg0.anInt1262, 0, arg0.aClass5_Sub2_Sub8Array1);
			}
			return local37;
		} else {
			return local37;
		}
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
	public static void method609() {
		aClass45_414 = null;
		aClass45_419 = null;
		aClass45_417 = null;
		aClass45_420 = null;
		aClass66_2 = null;
		aClass45_415 = null;
		aClass45_416 = null;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
	public static void method610() {
		Static4.anInt106 = 0;
		Static79.anInt2240 = 0;
		Static25.method559();
		Static56.method1169();
		Static119.method2130();
		Static105.method1905();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static4.anInt106; local19++) {
			local25 = Static79.anIntArray313[local19];
			if (Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local25].anInt2406 != Static3.anInt94) {
				Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local25] = null;
			}
		}
		if (Static69.anInt1989 != Static70.aClass5_Sub9_Sub1_3.anInt2140) {
			throw new RuntimeException("gpp1 pos:" + Static70.aClass5_Sub9_Sub1_3.anInt2140 + " psize:" + Static69.anInt1989);
		}
		for (local25 = 0; local25 < Static56.anInt1694; local25++) {
			if (Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[Static64.anIntArray283[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static56.anInt1694);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)Z")
	public static boolean method613(@OriginalArg(0) int arg0) {
		if (!Static36.method768(arg0)) {
			return false;
		}
		@Pc(23) boolean local23 = false;
		@Pc(27) Class5_Sub2_Sub8[] local27 = Static19.aClass5_Sub2_Sub8ArrayArray1[arg0];
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(35) Class5_Sub2_Sub8 local35 = local27[local29];
			if (local35 != null && local35.anInt1269 == 6) {
				@Pc(61) int local61;
				if (local35.anInt1279 != -1 || local35.anInt1275 != -1) {
					@Pc(56) boolean local56 = Static85.method1627(local35);
					if (local56) {
						local61 = local35.anInt1275;
					} else {
						local61 = local35.anInt1279;
					}
					if (local61 != -1) {
						@Pc(77) Class5_Sub2_Sub9 local77 = Static63.method1252(local61);
						local35.anInt1257 += Static90.anInt2533;
						label52: while (true) {
							do {
								do {
									if (local35.anInt1257 <= local77.anIntArray252[local35.anInt1236]) {
										break label52;
									}
									local35.anInt1257 -= local77.anIntArray252[local35.anInt1236];
									local35.anInt1236++;
									local23 = true;
								} while (local77.anIntArray249.length > local35.anInt1236);
								local35.anInt1236 -= local77.anInt1672;
							} while (local35.anInt1236 >= 0 && local35.anInt1236 < local77.anIntArray249.length);
							local35.anInt1236 = 0;
						}
					}
				}
				if (local35.anInt1240 != 0 && !local35.aBoolean66) {
					local61 = local35.anInt1240 << 16 >> 16;
					@Pc(161) int local161 = local35.anInt1240 >> 16;
					local23 = true;
					local61 *= Static90.anInt2533;
					local35.anInt1235 = local61 + local35.anInt1235 & 0x7FF;
					@Pc(179) int local179 = local161 * Static90.anInt2533;
					local35.anInt1266 = local179 + local35.anInt1266 & 0x7FF;
				}
			}
		}
		return local23;
	}
}
