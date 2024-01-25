import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_232 = new Class214(49, 15);

	@OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
	public static final int[] anIntArray395 = new int[32];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!me;)V")
	public static void method4921(@OriginalArg(1) Class20_Sub3_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt6062 - Static368.anInt6250;
		@Pc(21) int local21 = arg0.anInt6080 * 128 + arg0.method4678() * 64;
		@Pc(32) int local32 = arg0.anInt6034 * 128 + arg0.method4678() * 64;
		arg0.anInt6613 += (local21 - arg0.anInt6613) / local9;
		arg0.anInt6086 = 0;
		arg0.anInt6616 += (local32 - arg0.anInt6616) / local9;
		if (arg0.anInt6084 == 0) {
			arg0.method4685(8192);
		}
		if (arg0.anInt6084 == 1) {
			arg0.method4685(12288);
		}
		if (arg0.anInt6084 == 2) {
			arg0.method4685(0);
		}
		if (arg0.anInt6084 == 3) {
			arg0.method4685(4096);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!me;)I")
	public static int method4922(@OriginalArg(1) Class20_Sub3_Sub3 arg0) {
		if (arg0.anInt6082 == 0) {
			return 0;
		}
		@Pc(46) int local46;
		@Pc(53) int local53;
		if (arg0.anInt6012 != -1) {
			@Pc(14) Class20_Sub3_Sub3 local14 = null;
			if (arg0.anInt6012 < 32768) {
				local14 = Static98.aClass20_Sub3_Sub3_Sub2Array1[arg0.anInt6012];
			} else if (arg0.anInt6012 >= 32768) {
				local14 = Static73.aClass20_Sub3_Sub3_Sub1Array1[arg0.anInt6012 - 32768];
			}
			if (local14 != null) {
				local46 = arg0.anInt6613 - local14.anInt6613;
				local53 = arg0.anInt6616 - local14.anInt6616;
				if (local46 != 0 || local53 != 0) {
					arg0.method4685((int) (Math.atan2((double) local46, (double) local53) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class20_Sub3_Sub3_Sub1) {
			@Pc(155) Class20_Sub3_Sub3_Sub1 local155 = (Class20_Sub3_Sub3_Sub1) arg0;
			if (local155.anInt4972 != -1 && (local155.anInt6088 == 0 || local155.anInt6086 > 0)) {
				local155.method4685(local155.anInt4972);
				local155.anInt4972 = -1;
			}
		} else if (arg0 instanceof Class20_Sub3_Sub3_Sub2) {
			@Pc(82) Class20_Sub3_Sub3_Sub2 local82 = (Class20_Sub3_Sub3_Sub2) arg0;
			if (local82.anInt6098 != -1 && (local82.anInt6088 == 0 || local82.anInt6086 > 0)) {
				local46 = local82.anInt6613 - (local82.anInt6098 - Static101.anInt6646 - Static101.anInt6646) * 64;
				local53 = local82.anInt6616 - (local82.anInt6097 - Static278.anInt4392 - Static278.anInt4392) * 64;
				if (local46 != 0 || local53 != 0) {
					local82.method4685((int) (Math.atan2((double) local46, (double) local53) * 2607.5945876176133D) & 0x3FFF);
				}
				local82.anInt6098 = -1;
			}
		}
		return arg0.method4689();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public static void method4924(@OriginalArg(0) int arg0) {
		Static337.anInt1766 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static362.anInt6113; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static195.anInt3127; local6++) {
				if (Static159.aClass82ArrayArrayArray2[arg0][local3][local6] == null) {
					Static159.aClass82ArrayArrayArray2[arg0][local3][local6] = new Class82(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!nf;B)V")
	public static void method4925(@OriginalArg(0) Class13_Sub4 arg0) {
		arg0.aClass20_1 = null;
		@Pc(12) int local12 = arg0.aClass13_Sub8Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass13_Sub8Array1[local14].aBoolean591 = false;
		}
		@Pc(32) Class227[] local32 = Class20_Sub1_Sub2.aClass227Array1;
		synchronized (Class20_Sub1_Sub2.aClass227Array1) {
			if (Class20_Sub1_Sub2.aClass227Array1.length > local12 && Static339.anIntArray335[local12] < 200) {
				Class20_Sub1_Sub2.aClass227Array1[local12].method4832(arg0);
				@Pc(57) int local57 = Static339.anIntArray335[local12]++;
			}
		}
	}
}
