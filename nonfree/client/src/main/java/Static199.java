import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public static int anInt8552;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	public static int anInt8568;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public static int anInt8569;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_86 = new Class94(73, -1);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "[I")
	public static final int[] anIntArray558 = new int[200];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBIII)V")
	public static void method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg3) {
			Static375.method3045(arg0, arg2, arg4, arg3);
		} else if (Static161.anInt7734 <= arg4 - arg3 && arg4 + arg3 <= Static38.anInt823 && Static380.anInt7421 <= arg0 - arg1 && Static237.anInt5159 >= arg0 + arg1) {
			Static260.method7058(arg2, arg4, arg0, arg1, arg3);
		} else {
			Static162.method3522(arg4, arg1, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)[B")
	public static byte[] method7267(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub6_Sub14 local17 = (Class2_Sub6_Sub14) Static98.aClass379_2.method9219((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static42.method1597(local52, local28);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local17 = new Class2_Sub6_Sub14(local22);
			Static98.aClass379_2.method9222((long) arg0, local17);
		}
		return local17.aByteArray89;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILclient!in;ILclient!d;Ljava/awt/Canvas;I)Lclient!ha;")
	public static synchronized Class20 method7295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) Canvas arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 0) {
			return Static143.method7502(arg1, arg2, arg5, arg4);
		} else if (arg6 == 2) {
			return Static640.method9214(arg1, arg4, arg5, arg2);
		} else if (arg6 == 1) {
			return Static571.method8529(arg0, arg5, arg4);
		} else if (arg6 == 5) {
			return Static334.method5734(arg5, arg4, arg3, arg0);
		} else if (arg6 == 3) {
			return Static651.method5824(arg0, arg4, arg3, arg5);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
