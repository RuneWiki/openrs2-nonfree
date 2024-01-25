import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	public static int anInt6124;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
	public static int anInt6125;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!db;")
	public static final Class64 aClass64_299 = new Class64(18, -1);

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
	public static final int[] anIntArray509 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!st;)V")
	public static void method5201(@OriginalArg(1) Class10_Sub1_Sub2_Sub2 arg0) {
		@Pc(17) Class4_Sub51 local17 = (Class4_Sub51) Static518.aClass183_37.method4289((long) arg0.anInt8531);
		if (local17 == null) {
			Static91.method2092(null, arg0.aByte101, 0, arg0, null, arg0.anIntArray654[0], arg0.anIntArray653[0]);
		} else {
			local17.method7876();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILjava/lang/String;IIBI)V")
	public static void method5203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class26_Sub2 local12 = new Class26_Sub2();
		local12.aString23 = arg3;
		local12.anInt2974 = Static237.anInt7561 + arg0;
		local12.anInt2972 = arg1;
		local12.anInt2970 = arg5;
		local12.anInt2968 = arg4;
		local12.anInt2969 = arg6;
		local12.anInt2973 = arg2;
		Static385.aClass8_5.method109(local12);
	}
}
