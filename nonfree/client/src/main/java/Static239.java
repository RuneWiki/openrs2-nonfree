import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!k", name = "w", descriptor = "[I")
	public static final int[] anIntArray668 = new int[13];

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Lclient!js;")
	public static final Class156 aClass156_16 = new Class156(12, 0, 1, 0);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method6196(@OriginalArg(1) Class4 arg0) {
		@Pc(7) int local7 = Static513.anInt9093;
		@Pc(9) int local9 = Static276.anInt8648;
		@Pc(11) int local11 = Static324.anInt6120;
		@Pc(13) int local13 = Static336.anInt6244;
		arg0.method7162(-10660793, local11, local7, local9, local13);
		arg0.method7162(-16777216, local11 - 2, local7 - -1, local9 + 1, 16);
		arg0.method7190(local9 + 18, local11 + -2, -16777216, local13 - 19, local7 + 1);
		Static511.aClass36_4.method7954(-10660793, local9 + 14, Static544.aClass45_115.method1474(Static544.anInt7853), local7 + 3, -1);
		@Pc(74) int local74 = Static10.aClass99_1.method6618();
		@Pc(78) int local78 = Static10.aClass99_1.method6619();
		@Pc(80) int local80 = 0;
		for (@Pc(85) Class1_Sub25 local85 = (Class1_Sub25) Static105.aClass295_10.method7543(); local85 != null; local85 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
			@Pc(100) int local100 = local9 + (-local80 + Static197.anInt4015 + -1) * 16 + 31;
			@Pc(102) short local102 = -1;
			if (local7 < local74 && local74 < local7 + local11 && local100 - 13 < local78 && local78 < local100 + 3 && local85.aBoolean340) {
				local102 = -256;
			}
			@Pc(131) int[] local131 = null;
			if (Static337.method5699(local85.anInt4365)) {
				local131 = Static181.aClass316_1.method8107((int) local85.aLong114).anIntArray443;
			} else if (local85.anInt4368 != -1) {
				local131 = Static181.aClass316_1.method8107(local85.anInt4368).anIntArray443;
			} else if (Static459.method7010(local85.anInt4365)) {
				@Pc(171) Class1_Sub41 local171 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local85.aLong114);
				if (local171 != null) {
					@Pc(176) Class20_Sub1_Sub1_Sub2 local176 = local171.aClass20_Sub1_Sub1_Sub2_2;
					@Pc(179) Class283 local179 = local176.aClass283_1;
					if (local179.anIntArray743 != null) {
						local179 = local179.method7368(Static417.aClass10_1);
					}
					if (local179 != null) {
						local131 = local179.anIntArray744;
					}
				}
			} else if (Static456.method6996(local85.anInt4365)) {
				@Pc(215) Class51 local215;
				if (local85.anInt4365 == 1010) {
					local215 = Static398.aClass18_4.method609((int) local85.aLong114);
				} else {
					local215 = Static398.aClass18_4.method609((int) (local85.aLong114 >>> 32 & 0x7FFFFFFFL));
				}
				if (local215.anIntArray108 != null) {
					local215 = local215.method1625(Static417.aClass10_1);
				}
				if (local215 != null) {
					local131 = local215.anIntArray106;
				}
			}
			@Pc(246) String local246 = Static140.method2620(local85);
			if (local131 != null) {
				local246 = local246 + Static19.method550(local131);
			}
			Static511.aClass36_4.method7950(local246, Static204.aClass104Array38, local100, local7 + 3, local102, Static527.anIntArray813);
			if (local85.aBoolean341) {
				Static57.aClass104_6.method7716(local7 + Static270.aClass96_10.method2370(local246) + 5, local100 + -12);
			}
			local80++;
		}
		Static318.method5466(Static336.anInt6244, Static324.anInt6120, Static513.anInt9093, Static276.anInt8648);
	}
}
