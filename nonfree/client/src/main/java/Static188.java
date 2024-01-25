import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "[I")
	public static final int[] anIntArray2 = new int[4096];

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[S")
	public static final short[] aShortArray2 = new short[] { 22, 49, 30, 48, 46, 12, 15, 16 };

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public static int anInt28 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!faa;)V")
	public static void method48(@OriginalArg(1) Class97 arg0) {
		if (!Static540.aBoolean580) {
			return;
		}
		if (arg0.anObjectArray8 != null) {
			@Pc(18) Class97 local18 = Static76.method1088(Static152.anInt1934, Static96.anInt7891);
			if (local18 != null) {
				@Pc(24) Class6_Sub1 local24 = new Class6_Sub1();
				local24.aClass97_2 = arg0;
				local24.aClass97_3 = local18;
				local24.anObjectArray1 = arg0.anObjectArray8;
				Static199.method3316(local24);
			}
		}
		Static534.method7063(Static9.aClass316_3);
		Static340.aClass6_Sub12_Sub2_1.method6042(arg0.anInt2678);
		Static340.aClass6_Sub12_Sub2_1.method6041(Static208.anInt3948);
		Static340.aClass6_Sub12_Sub2_1.method6006(Static152.anInt1934);
		Static340.aClass6_Sub12_Sub2_1.method6041(Static96.anInt7891);
		Static340.aClass6_Sub12_Sub2_1.method6032(arg0.anInt2607);
		Static340.aClass6_Sub12_Sub2_1.method6058(arg0.anInt2675);
	}
}
