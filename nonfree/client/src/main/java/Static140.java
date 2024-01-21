import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[Lclient!ug;")
	public static Class84[] aClass84Array1;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public static int anInt3376 = 0;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1212 = Static146.method2172(":assistreq:");

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1213 = Static146.method2172("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6 = new byte[4][104][104];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method2332() {
		aClass77_1213 = null;
		anIntArrayArrayArray6 = null;
		aByteArrayArrayArray6 = null;
		aClass84Array1 = null;
		aClass77_1212 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Lclient!tc;")
	public static Class2_Sub2_Sub15 method2333(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub15 local6 = (Class2_Sub2_Sub15) Static81.aClass82_34.method2699((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static175.aClass43_43.method2205(arg0, 12);
		local6 = new Class2_Sub2_Sub15();
		if (local25 != null) {
			local6.method2593(new Class2_Sub18(local25));
		}
		local6.method2592();
		Static81.aClass82_34.method2701((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BILclient!ke;)Lclient!jd;")
	public static Class2_Sub12 method2334(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1) {
		@Pc(13) byte[] local13 = arg1.method2211(arg0);
		return local13 == null ? null : new Class2_Sub12(local13);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBI)V")
	public static void method2335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub13 local12 = (Class2_Sub13) Static3.aClass74_1.method2433((long) arg0);
		if (local12 == null) {
			local12 = new Class2_Sub13();
			Static3.aClass74_1.method2432((long) arg0, local12);
		}
		if (arg1 >= local12.anIntArray335.length) {
			@Pc(34) int[] local34 = new int[arg1 + 1];
			@Pc(39) int[] local39 = new int[arg1 + 1];
			for (@Pc(41) int local41 = 0; local41 < local12.anIntArray335.length; local41++) {
				local34[local41] = local12.anIntArray335[local41];
				local39[local41] = local12.anIntArray336[local41];
			}
			for (@Pc(67) int local67 = local12.anIntArray335.length; local67 < arg1; local67++) {
				local34[local67] = -1;
				local39[local67] = 0;
			}
			local12.anIntArray335 = local34;
			local12.anIntArray336 = local39;
		}
		local12.anIntArray335[arg1] = arg2;
		local12.anIntArray336[arg1] = arg3;
	}
}
