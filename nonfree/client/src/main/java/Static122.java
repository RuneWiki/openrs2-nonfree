import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	public static int anInt2710;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	public static int anInt2713;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	public static int anInt2711 = -1;

	@OriginalMember(owner = "client!me", name = "O", descriptor = "[I")
	public static final int[] anIntArray212 = new int[25];

	@OriginalMember(owner = "client!me", name = "P", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_804 = Static81.method1507("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!me", name = "R", descriptor = "[I")
	public static final int[] anIntArray213 = new int[2000];

	@OriginalMember(owner = "client!me", name = "S", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_805 = Static81.method1507("Mitglieder)2Welt");

	@OriginalMember(owner = "client!me", name = "U", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_806 = Static81.method1507("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!me", name = "V", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(II)V")
	public static void method2067() {
		Static120.aClass69_29 = null;
		Static16.anInt377 = 0;
		Static116.anInt2596 = -1;
		Static91.anInt2111 = 1;
		Static152.aBoolean156 = false;
		Static103.anInt2312 = 2;
		Static47.anInt1175 = -1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)V")
	public static void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static39.method731(Static98.anIntArrayArray16[arg4], arg1 - arg0, arg1 - -arg0, arg2);
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg3;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local29 << 1;
		@Pc(37) int local37 = arg3 * arg3;
		@Pc(41) int local41 = local37 << 1;
		@Pc(45) int local45 = arg3 << 1;
		@Pc(55) int local55 = (1 - local45) * local29 + local41;
		@Pc(59) int local59 = local29 << 2;
		@Pc(68) int local68 = local37 - (local45 - 1) * local33;
		@Pc(72) int local72 = local37 << 2;
		@Pc(80) int local80 = local41 * 3;
		@Pc(88) int local88 = ((arg3 << 1) - 3) * local33;
		@Pc(94) int local94 = local72;
		@Pc(100) int local100 = local59 * (arg3 - 1);
		while (local25 > 0) {
			if (local55 < 0) {
				while (local55 < 0) {
					local55 += local80;
					local80 += local72;
					local68 += local94;
					local94 += local72;
					local23++;
				}
			}
			if (local68 < 0) {
				local23++;
				local55 += local80;
				local80 += local72;
				local68 += local94;
				local94 += local72;
			}
			local68 += -local88;
			@Pc(165) int local165 = arg1 - local23;
			@Pc(169) int local169 = local23 + arg1;
			local88 -= local59;
			local55 += -local100;
			local100 -= local59;
			local25--;
			@Pc(188) int local188 = arg4 + local25;
			@Pc(193) int local193 = arg4 - local25;
			Static39.method731(Static98.anIntArrayArray16[local193], local165, local169, arg2);
			Static39.method731(Static98.anIntArrayArray16[local188], local165, local169, arg2);
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 method2070() {
		@Pc(9) Class1_Sub2_Sub8_Sub3 local9 = new Class1_Sub2_Sub8_Sub3();
		local9.anInt3019 = Static83.anInt2001;
		local9.anInt3022 = Static85.anIntArray288[0];
		local9.anInt3017 = Static153.anIntArray291[0];
		@Pc(26) byte[] local26 = Static53.aByteArrayArray5[0];
		local9.anInt3021 = Static201.anInt4511;
		local9.anInt3020 = Static80.anIntArray164[0];
		local9.anInt3018 = Static35.anIntArray360[0];
		@Pc(51) int local51 = local9.anInt3022 * local9.anInt3017;
		local9.anIntArray246 = new int[local51];
		for (@Pc(57) int local57 = 0; local57 < local51; local57++) {
			local9.anIntArray246[local57] = Static148.anIntArray279[local26[local57] & 0xFF];
		}
		Static110.method1908();
		return local9;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lclient!dj;")
	public static Class24 method2071(@OriginalArg(0) int arg0) {
		@Pc(14) Class24 local14 = new Class24();
		local14.anInt1084 = 0;
		local14.aByteArray13 = new byte[arg0];
		return local14;
	}
}
