import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!el;")
	public static Class87 aClass87_3;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	public static int anInt6080;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	public static int anInt6082;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_47 = new Class112();

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[5];

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt6081 = 0;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	public static int anInt6083 = 64;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLclient!wn;)V")
	public static void method5140(@OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub2 arg0) {
		@Pc(17) Class3_Sub18 local17 = (Class3_Sub18) Static173.aClass354_14.method7689((long) arg0.anInt9472);
		if (local17 == null) {
			return;
		}
		if (local17.aClass3_Sub4_Sub1_3 != null) {
			Static353.aClass3_Sub4_Sub2_1.method639(local17.aClass3_Sub4_Sub1_3);
			local17.aClass3_Sub4_Sub1_3 = null;
		}
		local17.method7825();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!wj;I)V")
	public static void method5142(@OriginalArg(0) Class41_Sub10 arg0) {
		arg0.aClass41_Sub2_1 = null;
		@Pc(12) int local12 = arg0.aClass41_Sub8Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass41_Sub8Array1[local14].aBoolean658 = false;
		}
		@Pc(28) Class178[] local28 = RuntimeException_Sub1.aClass178Array1;
		synchronized (RuntimeException_Sub1.aClass178Array1) {
			if (local12 < RuntimeException_Sub1.aClass178Array1.length && Static521.anIntArray541[local12] < 200) {
				RuntimeException_Sub1.aClass178Array1[local12].method4166(arg0);
				@Pc(49) int local49 = Static521.anIntArray541[local12]++;
			}
		}
	}
}
