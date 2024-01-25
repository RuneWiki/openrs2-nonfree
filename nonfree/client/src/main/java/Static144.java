import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fca", name = "U", descriptor = "Lclient!qia;")
	public static Class274 aClass274_1;

	@OriginalMember(owner = "client!fca", name = "J", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_36 = new Class71(105, 6);

	@OriginalMember(owner = "client!fca", name = "S", descriptor = "Lclient!jt;")
	public static final Class165 aClass165_1 = new Class165("", 18);

	@OriginalMember(owner = "client!fca", name = "V", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[6][];

	@OriginalMember(owner = "client!fca", name = "W", descriptor = "[I")
	public static final int[] anIntArray188 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILclient!wp;)I")
	public static int method3001(@OriginalArg(1) Class8_Sub8_Sub2 arg0) {
		@Pc(12) int local12 = arg0.method8586(2);
		@Pc(27) int local27;
		if (local12 == 0) {
			local27 = 0;
		} else if (local12 == 1) {
			local27 = arg0.method8586(5);
		} else if (local12 == 2) {
			local27 = arg0.method8586(8);
		} else {
			local27 = arg0.method8586(11);
		}
		return local27;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(27) int local27;
		if (Static498.method7246(arg2)) {
			local27 = 0;
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = 0;
			if (Static513.aBoolean642) {
				local27 = Static348.anInt6739;
				local44 = Static19.anInt3645;
				local42 = Static111.anInt2920;
				local48 = Static109.anInt2865;
				local46 = Static624.anInt10429;
				Static109.anInt2865 = 1;
			}
			if (Static21.aClass331ArrayArray1[arg2] == null) {
				Static446.method6493(arg3, arg5, arg7, arg0 < 0, arg6, arg0, arg1, arg4, -1, Static368.aClass331ArrayArray2[arg2]);
			} else {
				Static446.method6493(arg3, arg5, arg7, arg0 < 0, arg6, arg0, arg1, arg4, -1, Static21.aClass331ArrayArray1[arg2]);
			}
			if (Static513.aBoolean642) {
				if (arg0 >= 0 && Static109.anInt2865 == 2) {
					Static460.method6945(Static111.anInt2920, Static624.anInt10429, Static348.anInt6739, Static19.anInt3645);
				}
				Static624.anInt10429 = local46;
				Static111.anInt2920 = local42;
				Static19.anInt3645 = local44;
				Static348.anInt6739 = local27;
				Static109.anInt2865 = local48;
			}
		} else if (arg0 == -1) {
			for (local27 = 0; local27 < 100; local27++) {
				Static620.aBooleanArray29[local27] = true;
			}
		} else {
			Static620.aBooleanArray29[arg0] = true;
		}
	}
}
