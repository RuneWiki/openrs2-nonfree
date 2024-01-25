import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_164 = new Class12(66, 7);

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[I")
	public static final int[] anIntArray426 = new int[13];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIB)Z")
	public static boolean method5017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!ts;)V")
	public static void method5018(@OriginalArg(1) Class239 arg0) {
		Static453.aClass239_1 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)Z")
	public static boolean method5019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static160.method2326(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static215.anInt4460;
			@Pc(14) int local14 = arg2 << Static215.anInt4460;
			return Static409.method5278(local10 + 1, Static94.aClass157Array1[arg0].ua(arg1, arg2) + arg3, local14 + 1) && Static409.method5278(local10 + Static5.anInt78 - 1, Static94.aClass157Array1[arg0].ua(arg1 + 1, arg2) + arg3, local14 + 1) && Static409.method5278(local10 + Static5.anInt78 - 1, Static94.aClass157Array1[arg0].ua(arg1 + 1, arg2 + 1) + arg3, local14 + Static5.anInt78 - 1) && Static409.method5278(local10 + 1, Static94.aClass157Array1[arg0].ua(arg1, arg2 + 1) + arg3, local14 + Static5.anInt78 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method5020() {
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static448.aClass227_54.method4967(); local10 != null; local10 = (Class1_Sub10) Static448.aClass227_54.method4973()) {
			if (local10.aBoolean98) {
				local10.method834();
			}
		}
		for (@Pc(30) Class1_Sub10 local30 = (Class1_Sub10) Static361.aClass227_37.method4967(); local30 != null; local30 = (Class1_Sub10) Static361.aClass227_37.method4973()) {
			if (local30.aBoolean98) {
				local30.method834();
			}
		}
	}
}
