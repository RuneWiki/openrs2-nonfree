import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!nb", name = "db", descriptor = "Lclient!cs;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!nb", name = "eb", descriptor = "Lclient!tg;")
	public static Class330 aClass330_30 = new Class330();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI[ILclient!rs;I[I)Lclient!rl;")
	public static Class1_Sub2 method5375(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class133_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(16) byte[] local16 = new byte[arg3 * arg0];
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(29) int local29 = local18 * arg3 + arg1[local18];
			for (@Pc(31) int local31 = 0; local31 < arg4[local18]; local31++) {
				local16[local29++] = -1;
			}
		}
		return new Class1_Sub2(arg2, arg3, arg0, local16);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZILjava/lang/String;I)V")
	public static void method5376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class295 local8 = Static324.method4920(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray21 != null) {
			@Pc(18) Class5_Sub51 local18 = new Class5_Sub51();
			local18.anInt9437 = arg0;
			local18.aString103 = arg2;
			local18.aClass295_19 = local8;
			local18.anObjectArray33 = local8.anObjectArray21;
			Static370.method5457(local18);
		}
		if (Static151.anInt2620 != 10 || !Static75.method1286(local8).method6705(arg0 - 1)) {
			return;
		}
		@Pc(62) Class5_Sub48 local62;
		if (arg0 == 1) {
			local62 = Static16.method232(Static308.aClass46_76, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 2) {
			local62 = Static16.method232(Static515.aClass46_96, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 3) {
			local62 = Static16.method232(Static387.aClass46_69, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 4) {
			local62 = Static16.method232(Static193.aClass46_89, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 5) {
			local62 = Static16.method232(Static561.aClass46_104, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 6) {
			local62 = Static16.method232(Static140.aClass46_28, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 7) {
			local62 = Static16.method232(Static119.aClass46_23, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 8) {
			local62 = Static16.method232(Static19.aClass46_3, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 9) {
			local62 = Static16.method232(Static245.aClass46_103, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
		if (arg0 == 10) {
			local62 = Static16.method232(Static361.aClass46_102, Static276.aClass251_2);
			Static326.method4967(arg3, local62, arg1, local8.anInt8010);
			Static277.method4436(local62);
		}
	}

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "(I)I")
	public static int method5377() {
		@Pc(5) Class87 local5 = Static213.aClass87_107;
		synchronized (Static213.aClass87_107) {
			return Static213.aClass87_107.method1795();
		}
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)[Lclient!aia;")
	public static Class15[] method5378() {
		return new Class15[] { Static517.aClass15_8, Static567.aClass15_9, Static33.aClass15_1, Static288.aClass15_5, Static389.aClass15_7, Static340.aClass15_6 };
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V")
	public static void method5379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class4_Sub2_Sub3 local13 = local7.aClass4_Sub2_Sub3_1;
		@Pc(16) Class4_Sub2_Sub3 local16 = local7.aClass4_Sub2_Sub3_2;
		if (local13 != null) {
			local13.aShort113 = (short) (local13.aShort113 * arg3 / (0x10 << Static115.anInt2156 - 7));
			local13.aShort114 = (short) (local13.aShort114 * arg3 / (0x10 << Static115.anInt2156 - 7));
		}
		if (local16 != null) {
			local16.aShort113 = (short) (local16.aShort113 * arg3 / (0x10 << Static115.anInt2156 - 7));
			local16.aShort114 = (short) (local16.aShort114 * arg3 / (0x10 << Static115.anInt2156 - 7));
		}
	}
}
