import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vr", name = "D", descriptor = "[I")
	public static int[] anIntArray722;

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
	public static int anInt7683;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "[I")
	public static final int[] anIntArray721 = new int[14];

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "[B")
	public static final byte[] aByteArray91 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "J")
	public static long aLong217 = 0L;

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "Lclient!ed;")
	public static final Class69 aClass69_1 = Static195.method3159();

	@OriginalMember(owner = "client!vr", name = "C", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_174 = new Class263(91, 4);

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(ZII)Z")
	public static boolean method5860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method5861(@OriginalArg(1) Class1_Sub19 arg0) {
		arg0.aBoolean499 = false;
		if (arg0.aClass1_Sub12_5 != null) {
			arg0.aClass1_Sub12_5.anInt4813 = 0;
		}
		for (@Pc(22) Class1_Sub19 local22 = arg0.method5807(); local22 != null; local22 = arg0.method5805()) {
			method5861(local22);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!ft;)V")
	public static void method5862(@OriginalArg(1) Class41_Sub2 arg0) {
		arg0.aClass30_Sub1_Sub1_1 = null;
		if (Static93.anInt6565 < 20) {
			Static156.aClass117_4.method2961(arg0);
			Static93.anInt6565++;
		}
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
	public static void method5864() {
		Static311.aClass74_1.method6077();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static221.aLongArray5[local14] = 0L;
		}
		for (@Pc(25) int local25 = 0; local25 < 32; local25++) {
			Static17.aLongArray1[local25] = 0L;
		}
		Static383.anInt6986 = 0;
	}
}
