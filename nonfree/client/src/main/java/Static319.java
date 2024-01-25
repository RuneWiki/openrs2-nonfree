import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!f;")
	public static Class78 aClass78_18;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
	public static final int[] anIntArray439 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!tn;ZI)V")
	public static void method4586(@OriginalArg(0) Class229 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = arg0.lb == 0 ? arg0.anInt6905 : arg0.lb;
		@Pc(27) int local27 = arg0.anInt6884 == 0 ? arg0.anInt6895 : arg0.anInt6884;
		Static215.method3223(local15, arg1, local27, arg0.anInt6923, Static276.aClass229ArrayArray1[arg0.anInt6923 >> 16]);
		if (arg0.aClass229Array2 != null) {
			Static215.method3223(local15, arg1, local27, arg0.anInt6923, arg0.aClass229Array2);
		}
		@Pc(60) Class1_Sub38 local60 = (Class1_Sub38) Static81.aClass51_5.method930((long) arg0.anInt6923);
		if (local60 != null) {
			Static381.method368(local15, local60.anInt6527, arg1, local27);
		}
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public static void method4629() {
		@Pc(9) int local9 = (int) ((double) Static80.anInt6558 * 34.46D);
		local9 <<= 0x0;
		if (Static447.aClass121_11.method4582()) {
			local9 += 128;
		}
		Static447.aClass121_11.JA(50, local9);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;IIILclient!ci;Lclient!m;)Lclient!qa;")
	public static synchronized Class121 method4644(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3, @OriginalArg(5) Interface5 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static299.aBooleanArray18[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(52) Class121 local52;
		if (arg1 == 0) {
			local52 = Static251.method3597(local7, arg4, arg0);
		} else if (arg1 == 1) {
			local52 = Static278.method5796(local7, arg4, arg2, arg3, arg0);
		} else if (arg1 == 2) {
			local52 = Static446.method5947(arg4, arg3, local7, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static299.aBooleanArray18[local7] = true;
		return local52;
	}
}
