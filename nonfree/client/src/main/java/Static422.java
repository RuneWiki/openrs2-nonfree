import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!nfa", name = "D", descriptor = "I")
	public static int anInt6874;

	@OriginalMember(owner = "client!nfa", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[200];

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "([II[I)V")
	public static void method6170(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static4.anIntArray26 = null;
			Static204.aByteArrayArrayArray2 = null;
			Static697.anIntArray743 = null;
			return;
		}
		Static4.anIntArray26 = arg1;
		Static697.anIntArray743 = new int[arg1.length];
		Static204.aByteArrayArrayArray2 = new byte[arg1.length][][];
		for (@Pc(39) int local39 = 0; local39 < Static4.anIntArray26.length; local39++) {
			Static204.aByteArrayArrayArray2[local39] = new byte[arg0[local39]][];
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IB)V")
	public static void method6171(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(11, (long) arg0);
		local14.method6245();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!tl;)V")
	public static void method6172(@OriginalArg(0) Class4_Sub2 arg0) {
		Static689.aClass145_16.H(arg0.anInt10229, arg0.anInt10234 + (arg0.method8977(0) >> 1), arg0.anInt10228, Static536.anIntArray603);
		arg0.anInt10236 = Static536.anIntArray603[0];
		arg0.anInt10232 = Static536.anIntArray603[1];
		arg0.anInt10233 = Static536.anIntArray603[2];
	}
}
