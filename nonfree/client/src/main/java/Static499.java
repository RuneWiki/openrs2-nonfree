import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!st", name = "t", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_38 = new Class329(13, 0, 1, 0);

	@OriginalMember(owner = "client!st", name = "D", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_39 = new Class329(0, 2, 2, 1);

	@OriginalMember(owner = "client!st", name = "F", descriptor = "[I")
	public static final int[] anIntArray272 = new int[50];

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZII)V")
	public static void method4576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 + Static321.anInt5874;
		@Pc(13) int local13 = arg2 + Static137.anInt3293;
		if (Static189.aClass333ArrayArrayArray1 == null || arg1 < 0 || arg2 < 0 || Static345.anInt6228 <= arg1 || Static535.anInt9341 <= arg2 || !Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122) && arg0 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117) {
			return;
		}
		@Pc(54) long local54 = (long) (arg0 << 28 | local13 << 14 | local9);
		@Pc(60) Class3_Sub4 local60 = (Class3_Sub4) Static537.aClass297_34.method6531(local54);
		if (local60 == null) {
			Static375.method5255(arg0, arg1, arg2);
			return;
		}
		@Pc(74) Class3_Sub31 local74 = (Class3_Sub31) local60.aClass244_1.method5572();
		if (local74 == null) {
			Static375.method5255(arg0, arg1, arg2);
			return;
		}
		@Pc(88) Class25_Sub2_Sub4_Sub1 local88 = (Class25_Sub2_Sub4_Sub1) Static375.method5255(arg0, arg1, arg2);
		if (local88 == null) {
			local88 = new Class25_Sub2_Sub4_Sub1(arg1 << 9, Static256.aClass127Array3[arg0].method7862(arg2, arg1), arg2 << 9, arg0, arg0);
		} else {
			local88.anInt4861 = local88.anInt4848 = -1;
		}
		local88.anInt4842 = local74.anInt5291;
		local88.anInt4854 = local74.anInt5292;
		label56: while (true) {
			@Pc(131) Class3_Sub31 local131 = (Class3_Sub31) local60.aClass244_1.method5576();
			if (local131 == null) {
				break;
			}
			if (local88.anInt4854 != local131.anInt5292) {
				local88.anInt4861 = local131.anInt5292;
				local88.anInt4859 = local131.anInt5291;
				while (true) {
					@Pc(152) Class3_Sub31 local152 = (Class3_Sub31) local60.aClass244_1.method5576();
					if (local152 == null) {
						break label56;
					}
					if (local152.anInt5292 != local88.anInt4854 && local152.anInt5292 != local88.anInt4861) {
						local88.anInt4852 = local152.anInt5291;
						local88.anInt4848 = local152.anInt5292;
					}
				}
			}
		}
		@Pc(196) int local196 = Static78.method3298((arg1 << 9) + 256, arg0, (arg2 << 9) + 256);
		local88.aByte118 = (byte) arg0;
		local88.anInt8480 = local196;
		local88.anInt8476 = arg1 << 9;
		local88.aByte117 = (byte) arg0;
		local88.anInt4863 = 0;
		local88.anInt8482 = arg2 << 9;
		if (Static269.method4098(arg1, arg2)) {
			local88.aByte118++;
		}
		Static229.method3737(arg0, arg1, arg2, local196, local88);
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
	public static void method4578() {
		Static580.method7902();
		Static105.method2182(Static348.aClass3_Sub51_Sub1_5.aBoolean676);
		Static229.aClass58_5 = Static49.method1204(Static129.aCanvas6, 22050, Static467.aClass168_12, 0);
		Static275.method4166(Static554.method7604(null));
		Static170.aClass58_6 = Static49.method1204(Static129.aCanvas6, 2048, Static467.aClass168_12, 1);
		Static170.aClass58_6.method5327(Static354.aClass3_Sub16_Sub4_2);
	}
}
