import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
	public static int anInt8199;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_284 = new Class179(109, 0);

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
	public static int anInt8197 = -1;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
	public static int anInt8198 = 0;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "[Lclient!g;")
	public static final Class6_Sub4_Sub4[] aClass6_Sub4_Sub4Array6 = new Class6_Sub4_Sub4[14];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIJ)V")
	public static void method6984(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg2 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static508.method8438(true, 0, 0, local10, arg1, local21, 0, arg0);
			return;
		}
		@Pc(58) Class308 local58 = Static411.aClass88_3.method2024(local28);
		@Pc(69) int local69;
		@Pc(66) int local66;
		if (local21 == 0 || local21 == 2) {
			local69 = local58.anInt8587;
			local66 = local58.anInt8589;
		} else {
			local66 = local58.anInt8587;
			local69 = local58.anInt8589;
		}
		@Pc(80) int local80 = local58.anInt8612;
		if (local21 != 0) {
			local80 = (local80 << local21 & 0xF) + (local80 >> 4 - local21);
		}
		Static508.method8438(true, local80, local66, 0, arg1, 0, local69, arg0);
	}
}
