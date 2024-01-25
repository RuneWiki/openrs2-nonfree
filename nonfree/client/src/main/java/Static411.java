import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	public static int anInt6631;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!un", name = "C", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_201 = new Class107(41, 8);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!ic;III)V")
	public static void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub22 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) long local14 = (long) (arg2 << 14 | arg0 << 28 | arg3);
		@Pc(20) Class1_Sub25 local20 = (Class1_Sub25) Static129.aClass96_24.method2335(local14);
		if (local20 == null) {
			local20 = new Class1_Sub25();
			Static129.aClass96_24.method2341(local14, local20);
			local20.aClass181_29.method4102(arg1);
			return;
		}
		@Pc(43) Class152 local43 = Static165.aClass19_1.method560(arg1.anInt3023);
		@Pc(46) int local46 = local43.anInt4190;
		if (local43.anInt4185 == 1) {
			local46 *= arg1.anInt3025 + 1;
		}
		for (@Pc(70) Class1_Sub22 local70 = (Class1_Sub22) local20.aClass181_29.method4112(); local70 != null; local70 = (Class1_Sub22) local20.aClass181_29.method4104()) {
			local43 = Static165.aClass19_1.method560(local70.anInt3023);
			@Pc(80) int local80 = local43.anInt4190;
			if (local43.anInt4185 == 1) {
				local80 *= local70.anInt3025 + 1;
			}
			if (local80 < local46) {
				Static221.method2301(arg1, local70);
				return;
			}
		}
		local20.aClass181_29.method4102(arg1);
	}
}
