import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!df;")
	public static Class49 aClass49_27;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "J")
	public static long aLong194;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_136 = new Class256("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public static void method5250() {
		Static33.aClass76_1 = null;
		Static445.aClass76_22 = null;
		Static312.aClass76_8 = null;
		Static344.aClass76_15 = null;
		Static348.aClass76_16 = null;
		Static48.aClass76_5 = null;
		Static423.aClass76_21 = null;
		Static39.aClass76_4 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ii;ILclient!ii;ZIZB)I")
	public static int method5251(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(15) int local15 = Static72.method2772(arg4, arg0, arg2, arg5);
		if (local15 != 0) {
			return arg5 ? -local15 : local15;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static72.method2772(arg1, arg0, arg2, arg3);
			return arg3 ? -local39 : local39;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
	public static void method5252(@OriginalArg(0) int arg0) {
		if (Static447.anIntArray321 == null || arg0 > Static447.anIntArray321.length) {
			Static447.anIntArray321 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!cr;Lclient!cr;)V")
	public static void method5254(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class41 arg1) {
		Static448.method6059(Static451.aClass44_22);
		Static98.aClass2_Sub20_Sub1_1.method3713(arg0.anInt1613);
		Static98.aClass2_Sub20_Sub1_1.method3713(arg1.anInt1613);
		Static98.aClass2_Sub20_Sub1_1.method3697(arg0.anInt1671);
		Static98.aClass2_Sub20_Sub1_1.method3745(arg1.anInt1671);
		Static98.aClass2_Sub20_Sub1_1.method3740(arg0.anInt1683);
		Static98.aClass2_Sub20_Sub1_1.method3687(arg1.anInt1683);
	}
}
