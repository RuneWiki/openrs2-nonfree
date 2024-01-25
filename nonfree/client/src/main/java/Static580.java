import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!up;")
	public static final Class346 aClass346_1 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "l", descriptor = "Lclient!up;")
	public static final Class346 aClass346_2 = new Class346(Static288.aClass176_4);

	@OriginalMember(owner = "client!up", name = "m", descriptor = "Lclient!up;")
	public static final Class346 aClass346_3 = new Class346(Static288.aClass176_4);

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!up;")
	public static final Class346 aClass346_4 = new Class346(Static288.aClass176_4);

	@OriginalMember(owner = "client!up", name = "o", descriptor = "Lclient!up;")
	public static final Class346 aClass346_5 = new Class346(Static288.aClass176_4);

	@OriginalMember(owner = "client!up", name = "p", descriptor = "Lclient!up;")
	public static final Class346 aClass346_6 = new Class346(Static288.aClass176_4);

	@OriginalMember(owner = "client!up", name = "q", descriptor = "Lclient!up;")
	public static final Class346 aClass346_7 = new Class346(Static288.aClass176_4);

	@OriginalMember(owner = "client!up", name = "r", descriptor = "Lclient!up;")
	public static final Class346 aClass346_8 = new Class346(Static288.aClass176_4);

	@OriginalMember(owner = "client!up", name = "s", descriptor = "Lclient!up;")
	public static final Class346 aClass346_9 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Lclient!up;")
	public static final Class346 aClass346_10 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "u", descriptor = "Lclient!up;")
	public static final Class346 aClass346_11 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "v", descriptor = "Lclient!up;")
	public static final Class346 aClass346_12 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "w", descriptor = "Lclient!up;")
	public static final Class346 aClass346_13 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "x", descriptor = "Lclient!up;")
	public static final Class346 aClass346_14 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "y", descriptor = "Lclient!up;")
	public static final Class346 aClass346_15 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "z", descriptor = "Lclient!up;")
	public static final Class346 aClass346_16 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "A", descriptor = "Lclient!up;")
	public static final Class346 aClass346_17 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "B", descriptor = "Lclient!up;")
	public static final Class346 aClass346_18 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "C", descriptor = "Lclient!up;")
	public static final Class346 aClass346_19 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "D", descriptor = "Lclient!up;")
	public static final Class346 aClass346_20 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "E", descriptor = "Lclient!up;")
	public static final Class346 aClass346_21 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "F", descriptor = "Lclient!up;")
	public static final Class346 aClass346_22 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "G", descriptor = "Lclient!up;")
	public static final Class346 aClass346_23 = new Class346(Static288.aClass176_2);

	@OriginalMember(owner = "client!up", name = "H", descriptor = "Lclient!up;")
	public static final Class346 aClass346_24 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "I", descriptor = "Lclient!up;")
	public static final Class346 aClass346_25 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "J", descriptor = "Lclient!up;")
	public static final Class346 aClass346_26 = new Class346(Static288.aClass176_1);

	@OriginalMember(owner = "client!up", name = "K", descriptor = "Lclient!up;")
	public static final Class346 aClass346_27 = new Class346(Static288.aClass176_3);

	@OriginalMember(owner = "client!up", name = "L", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_234 = new Class215(93, -2);

	@OriginalMember(owner = "client!up", name = "M", descriptor = "I")
	public static int anInt10350 = -1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!iv;ILclient!ha;II)V")
	public static void method8637(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class306 local9 = Static16.aClass237_3.method6466(arg1.anInt5364);
		if (local9.anInt9255 == -1) {
			return;
		}
		if (arg1.aBoolean403) {
			@Pc(23) int local23 = arg4 + arg1.anInt5388;
			arg4 = local23 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(39) Class46 local39 = local9.method7745(arg4, arg1.aBoolean406, arg3);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg1.anInt5411;
		@Pc(48) int local48 = arg1.anInt5389;
		if ((arg4 & 0x1) == 1) {
			local45 = arg1.anInt5389;
			local48 = arg1.anInt5411;
		}
		@Pc(70) int local70 = local39.method6205();
		@Pc(73) int local73 = local39.method6219();
		if (local9.aBoolean662) {
			local73 = local48 * 4;
			local70 = local45 * 4;
		}
		if (local9.anInt9257 == 0) {
			local39.method6212(arg0, arg2 - (local48 - 1) * 4, local70, local73);
		} else {
			local39.method6209(arg0, arg2 - (local48 - 1) * 4, local70, local73, 0, local9.anInt9257 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)[Lclient!up;")
	public static Class346[] method8638() {
		return new Class346[] { aClass346_1, aClass346_2, aClass346_3, aClass346_4, aClass346_5, aClass346_6, aClass346_7, aClass346_8, aClass346_9, aClass346_10, aClass346_11, aClass346_12, aClass346_13, aClass346_14, aClass346_15, aClass346_16, aClass346_17, aClass346_18, aClass346_19, aClass346_20, aClass346_21, aClass346_22, aClass346_23, aClass346_24, aClass346_25, aClass346_26, aClass346_27 };
	}
}
