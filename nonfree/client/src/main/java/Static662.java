import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "[I")
	public static int[] anIntArray718 = new int[1];

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "[I")
	public static final int[] anIntArray719 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_153 = new Class216(0, -1);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILclient!bt;I)Lclient!bq;")
	public static Class31 method8784(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1255(arg1);
		return local13 == null ? null : new Class31(local13);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILclient!bn;B)Z")
	public static boolean method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11_Sub1 arg1) {
		@Pc(10) int local10 = arg1.method988(2);
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(110) int local110;
		@Pc(114) int local114;
		@Pc(120) int local120;
		if (local10 == 0) {
			if (arg1.method988(1) != 0) {
				method8785(arg0, arg1);
			}
			local34 = arg1.method988(6);
			local39 = arg1.method988(6);
			@Pc(51) boolean local51 = arg1.method988(1) == 1;
			if (local51) {
				Static170.anIntArray219[Static657.anInt10371++] = arg0;
			}
			if (Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(74) Class228 local74 = Static58.aClass228Array1[arg0];
			@Pc(82) Class3_Sub1_Sub2_Sub2_Sub1 local82 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[arg0] = new Class3_Sub1_Sub2_Sub2_Sub1();
			local82.anInt9961 = arg0;
			if (Static57.aClass4_Sub11Array1[arg0] != null) {
				local82.method3537(Static57.aClass4_Sub11Array1[arg0]);
			}
			local82.method8526(local74.anInt5579, true);
			local82.anInt9947 = local74.anInt5577;
			local110 = local74.anInt5578;
			local114 = local110 >> 28;
			local120 = local110 >> 14 & 0xFF;
			@Pc(124) int local124 = local110 & 0xFF;
			@Pc(132) int local132 = local34 + (local120 << 6) - Static445.anInt6949;
			@Pc(141) int local141 = (local124 << 6) + local39 - Static321.anInt5000;
			local82.aBoolean292 = local74.aBoolean421;
			local82.aBoolean291 = local74.aBoolean420;
			local82.aByteArray102[0] = Static175.aByteArray38[arg0];
			local82.aByte141 = local82.aByte142 = (byte) local114;
			if (Static547.method7286(local132, local141)) {
				local82.aByte142++;
			}
			local82.method3534(local132, local141);
			local82.aBoolean290 = false;
			Static58.aClass228Array1[arg0] = null;
			return true;
		} else if (local10 == 1) {
			local34 = arg1.method988(2);
			local39 = Static58.aClass228Array1[arg0].anInt5578;
			Static58.aClass228Array1[arg0].anInt5578 = (((local39 >> 28) + local34 & 0x3) << 28) + (local39 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(239) int local239;
			@Pc(244) int local244;
			@Pc(252) int local252;
			if (local10 != 2) {
				local34 = arg1.method988(18);
				local39 = local34 >> 16;
				local239 = local34 >> 8 & 0xFF;
				local244 = local34 & 0xFF;
				local252 = Static58.aClass228Array1[arg0].anInt5578;
				local110 = (local252 >> 28) + local39 & 0x3;
				local114 = local239 + (local252 >> 14) & 0xFF;
				local120 = local244 + local252 & 0xFF;
				Static58.aClass228Array1[arg0].anInt5578 = (local114 << 14) + ((local110 << 28) + local120);
				return false;
			}
			local34 = arg1.method988(5);
			local39 = local34 >> 3;
			local239 = local34 & 0x7;
			local244 = Static58.aClass228Array1[arg0].anInt5578;
			local252 = local39 + (local244 >> 28) & 0x3;
			local110 = local244 >> 14 & 0xFF;
			local114 = local244 & 0xFF;
			if (local239 == 0) {
				local114--;
				local110--;
			}
			if (local239 == 1) {
				local114--;
			}
			if (local239 == 2) {
				local110++;
				local114--;
			}
			if (local239 == 3) {
				local110--;
			}
			if (local239 == 4) {
				local110++;
			}
			if (local239 == 5) {
				local114++;
				local110--;
			}
			if (local239 == 6) {
				local114++;
			}
			if (local239 == 7) {
				local114++;
				local110++;
			}
			Static58.aClass228Array1[arg0].anInt5578 = local114 + (local252 << 28) + (local110 << 14);
			return false;
		}
	}
}
