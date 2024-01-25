import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array14;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_257 = new Class88("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_7 = new Class4();

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "Z")
	public static boolean aBoolean614 = false;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
	public static final int anInt8724 = 328;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
	public static int anInt8725 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIZII)V")
	public static void method7171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static544.method7976(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static228.anIntArrayArray46[arg0];
		@Pc(45) int local45 = arg4 - local15;
		@Pc(49) int local49 = local15 + arg4;
		Static118.method2461(local40, local45, arg2, arg4 - arg3);
		Static118.method2461(local40, local49, arg5, local45);
		Static118.method2461(local40, arg3 + arg4, arg2, local49);
		while (local10 < local24) {
			local34 += 2;
			local36 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				Static72.anIntArray181[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(125) int[] local125;
			@Pc(131) int[] local131;
			@Pc(135) int local135;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if (local27 >= 0) {
				local24--;
				if (local15 > local24) {
					local125 = Static228.anIntArrayArray46[arg0 + local24];
					local131 = Static228.anIntArrayArray46[arg0 - local24];
					local135 = Static72.anIntArray181[local24];
					local139 = local10 + arg4;
					local144 = arg4 - local10;
					local148 = local135 + arg4;
					local153 = arg4 - local135;
					Static118.method2461(local125, local153, arg2, local144);
					Static118.method2461(local125, local148, arg5, local153);
					Static118.method2461(local125, local139, arg2, local148);
					Static118.method2461(local131, local153, arg2, local144);
					Static118.method2461(local131, local148, arg5, local153);
					Static118.method2461(local131, local139, arg2, local148);
				} else {
					local125 = Static228.anIntArrayArray46[local24 + arg0];
					local131 = Static228.anIntArrayArray46[arg0 - local24];
					local135 = arg4 + local10;
					local139 = arg4 - local10;
					Static118.method2461(local125, local135, arg2, local139);
					Static118.method2461(local131, local135, arg2, local139);
				}
				local27 -= local24 << 1;
			}
			local125 = Static228.anIntArrayArray46[arg0 + local10];
			local131 = Static228.anIntArrayArray46[arg0 - local10];
			local135 = arg4 + local24;
			local139 = arg4 - local24;
			if (local10 < local15) {
				local144 = local10 > local29 ? Static72.anIntArray181[local10] : local29;
				local148 = arg4 + local144;
				local153 = arg4 - local144;
				Static118.method2461(local125, local153, arg2, local139);
				Static118.method2461(local125, local148, arg5, local153);
				Static118.method2461(local125, local135, arg2, local148);
				Static118.method2461(local131, local153, arg2, local139);
				Static118.method2461(local131, local148, arg5, local153);
				Static118.method2461(local131, local135, arg2, local148);
			} else {
				Static118.method2461(local125, local135, arg2, local139);
				Static118.method2461(local131, local135, arg2, local139);
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
	public static void method7172() {
		@Pc(7) int local7 = Static381.anInt7254;
		@Pc(9) int[] local9 = Static496.anIntArray465;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class30_Sub1_Sub1_Sub1 local19 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt4170 > 0) {
				local19.anInt4170--;
				if (local19.anInt4170 == 0) {
					local19.aString38 = null;
				}
			}
		}
		for (@Pc(42) int local42 = 0; local42 < Static451.anInt4553; local42++) {
			@Pc(49) long local49 = (long) Static11.anIntArray16[local42];
			@Pc(55) Class12_Sub41 local55 = (Class12_Sub41) Static29.aClass68_7.method1917(local49);
			if (local55 != null) {
				@Pc(60) Class30_Sub1_Sub1_Sub2 local60 = local55.aClass30_Sub1_Sub1_Sub2_2;
				if (local60.anInt4170 > 0) {
					local60.anInt4170--;
					if (local60.anInt4170 == 0) {
						local60.aString38 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)V")
	public static void method7173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(11, arg0);
		local8.method820();
		local8.anInt808 = arg2;
		local8.anInt806 = arg1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
	public static int method7174(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
