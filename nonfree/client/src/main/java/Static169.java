import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!ae;")
	public static Class8 aClass8_53;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!o;")
	public static final Class246 aClass246_14 = new Class246(15, 0, 1, 0);

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "[S")
	private static final short[] aShortArray52 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "[S")
	private static final short[] aShortArray53 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[S")
	private static final short[] aShortArray51 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { aShortArray52, aShortArray53, aShortArray51 };

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!pb;")
	public static final Class265 aClass265_9 = new Class265(4);

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[I")
	public static int[] anIntArray157 = null;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!pq;)V")
	public static void method2431(@OriginalArg(1) Class132_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static160.anObject10 == null) {
			@Pc(9) Class50_Sub1_Sub1 local9 = new Class50_Sub1_Sub1();
			local16 = local9.method1232();
			Static160.anObject10 = Static486.method7063(local16);
		}
		if (Static46.anObject6 == null) {
			@Pc(34) Class50_Sub2_Sub2 local34 = new Class50_Sub2_Sub2();
			local16 = local34.method5252();
			Static46.anObject6 = Static486.method7063(local16);
		}
		@Pc(49) Class106 local49 = arg0.aClass106_1;
		if (local49.method2166() && Static271.anObject25 == null) {
			local16 = Static151.method2163(16.0F, 0.6F, 0.5F, new Class71_Sub1(419684), 4.0F, 4.0F);
			Static271.anObject25 = Static486.method7063(local16);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Lclient!gda;")
	public static Class117 method2432(@OriginalArg(0) int arg0) {
		@Pc(15) Class117 local15 = (Class117) Static248.aClass10_21.method373((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static664.aClass8_147.method262(arg0, 0);
		local15 = new Class117();
		if (local25 != null) {
			local15.method2476(new Class6_Sub23(local25));
		}
		local15.method2477();
		Static248.aClass10_21.method366(local15, (long) arg0);
		return local15;
	}
}
