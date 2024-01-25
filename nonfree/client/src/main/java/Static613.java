import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!vv", name = "eb", descriptor = "Lclient!la;")
	public static Class207 aClass207_124;

	@OriginalMember(owner = "client!vv", name = "gb", descriptor = "I")
	public static int anInt10268;

	@OriginalMember(owner = "client!vv", name = "hb", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array21;

	@OriginalMember(owner = "client!vv", name = "ib", descriptor = "I")
	public static int anInt10269;

	@OriginalMember(owner = "client!vv", name = "fb", descriptor = "Lclient!vj;")
	public static final Class365 aClass365_17 = new Class365(0, 1);

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)I")
	public static int method8740(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "([[BBLclient!fea;)V")
	public static void method8741(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class104_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(44) int local44;
		for (@Pc(25) int local25 = 0; local25 < local15; local25++) {
			@Pc(31) byte[] local31 = arg0[local25];
			if (local31 != null) {
				@Pc(38) Class5_Sub22 local38 = new Class5_Sub22(local31);
				local44 = Static312.anIntArray597[local25] >> 8;
				@Pc(50) int local50 = Static312.anIntArray597[local25] & 0xFF;
				@Pc(57) int local57 = local44 * 64 - Static565.anInt9560;
				@Pc(64) int local64 = local50 * 64 - Static567.anInt9589;
				Static229.method3856();
				arg1.method2149(Static567.anInt9589, Static322.aClass352Array1, local57, local64, Static565.anInt9560, local38);
				arg1.method2163(local12, local57, local38, local64, Static213.aClass133_5);
				if (!arg1.aBoolean199 && local44 == anInt10268 / 8 && local50 == Static233.anInt4295 / 8 && local12[0] != -1) {
					Static360.aClass64_1 = Static513.aClass260_2.method6305(local12[3], Static55.aClass191_1, local12[2], local12[0], local12[1]);
					Static270.anInt4854 = local12[4];
				}
			}
		}
		for (@Pc(137) int local137 = 0; local137 < local15; local137++) {
			@Pc(150) int local150 = (Static312.anIntArray597[local137] >> 8) * 64 - Static565.anInt9560;
			local44 = (Static312.anIntArray597[local137] & 0xFF) * 64 - Static567.anInt9589;
			@Pc(165) byte[] local165 = arg0[local137];
			if (local165 == null && Static233.anInt4295 < 800) {
				Static229.method3856();
				arg1.method2152(local44, local150);
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(II)I")
	public static int method8743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static328.aShortArrayArray23 == null ? 0 : Static328.aShortArrayArray23[arg0][arg1] & 0xFFFF;
	}
}
