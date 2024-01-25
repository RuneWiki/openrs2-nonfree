import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!is", name = "l", descriptor = "[S")
	public static short[] aShortArray75;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "I")
	public static int anInt3763;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "I")
	public static int anInt3764;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "Lclient!fo;")
	public static final Class107 aClass107_6 = new Class107();

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([[BILclient!m;)V")
	public static void method3232(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class193_Sub1 arg1) {
		@Pc(8) int local8 = Static202.aByteArrayArray11.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static35.anIntArray45[local10] >> 8) * 64 - Static218.anInt3718;
				@Pc(40) int local40 = (Static35.anIntArray45[local10] & 0xFF) * 64 - Static167.anInt3048;
				Static11.method182();
				arg1.method4188(Static296.aClass295Array3, local40, Static176.aClass121_5, local29, local16);
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)V")
	public static void method3234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static235.anInt3970 <= arg1 - arg2 && arg1 + arg2 <= Static151.anInt2683 && Static134.anInt2364 <= arg3 - arg2 && Static60.anInt971 >= arg2 + arg3) {
			Static144.method2158(arg0, arg1, arg2, arg3);
		} else {
			Static289.method4065(arg0, arg3, arg2, arg1);
		}
	}
}
