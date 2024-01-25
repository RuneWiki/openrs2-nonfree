import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public static int anInt2928;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_87 = new Class160(38, 8);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B[B)Lclient!co;")
	public static Class14_Sub2_Sub6 method2648(@OriginalArg(1) byte[] arg0) {
		@Pc(7) Class14_Sub2_Sub6 local7 = new Class14_Sub2_Sub6();
		@Pc(12) Class14_Sub21 local12 = new Class14_Sub21(arg0);
		local12.anInt8936 = local12.aByteArray99.length - 2;
		@Pc(30) int local30 = local12.method7717(-1978450544);
		@Pc(41) int local41 = local12.aByteArray99.length - local30 - 16 - 2;
		local12.anInt8936 = local41;
		@Pc(48) int local48 = local12.method7748();
		local7.anInt1452 = local12.method7717(-1978450544);
		local7.anInt1447 = local12.method7717(-1978450544);
		local7.anInt1448 = local12.method7717(-1978450544);
		local7.anInt1450 = local12.method7717(-1978450544);
		local7.anInt1449 = local12.method7717(-1978450544);
		local7.anInt1451 = local12.method7717(-1978450544);
		@Pc(82) int local82 = local12.method7695(103);
		@Pc(90) int local90;
		@Pc(95) int local95;
		if (local82 > 0) {
			local7.aClass125Array1 = new Class125[local82];
			for (local90 = 0; local90 < local82; local90++) {
				local95 = local12.method7717(-1978450544);
				@Pc(102) Class125 local102 = new Class125(Static255.method4294(local95));
				local7.aClass125Array1[local90] = local102;
				while (local95-- > 0) {
					@Pc(112) int local112 = local12.method7748();
					@Pc(116) int local116 = local12.method7748();
					local102.method2626(new Class14_Sub30(local116), (long) local112);
				}
			}
		}
		local12.anInt8936 = 0;
		local7.aString27 = local12.method7706();
		local7.anIntArray78 = new int[local48];
		local90 = 0;
		while (local12.anInt8936 < local41) {
			local95 = local12.method7717(-1978450544);
			if (local95 == 3) {
				if (local7.aStringArray10 == null) {
					local7.aStringArray10 = new String[local48];
				}
				local7.aStringArray10[local90] = local12.method7703(0).intern();
			} else if (local95 == 54) {
				if (local7.aLongArray6 == null) {
					local7.aLongArray6 = new long[local48];
				}
				local7.aLongArray6[local90] = local12.method7729();
			} else {
				if (local7.anIntArray79 == null) {
					local7.anIntArray79 = new int[local48];
				}
				if (local95 >= 150 || local95 == 21 || local95 == 38 || local95 == 39) {
					local7.anIntArray79[local90] = local12.method7695(114);
				} else {
					local7.anIntArray79[local90] = local12.method7748();
				}
			}
			local7.anIntArray78[local90++] = local95;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
	public static int method2651() {
		return 15;
	}
}
