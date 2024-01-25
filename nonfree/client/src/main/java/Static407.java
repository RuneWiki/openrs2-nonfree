import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
	public static int[] anIntArray453;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!ia;")
	public static Class107 aClass107_5;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_144 = new Class119(93, 6);

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
	public static int anInt6698 = 16777215;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "[I")
	public static final int[] anIntArray454 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
	public static int anInt6700 = 1;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_145 = new Class119(24, 3);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIB[BII[BI)V")
	public static void method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg2 >> 2);
		@Pc(19) int local19 = -(arg2 & 0x3);
		for (@Pc(22) int local22 = -arg1; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg5++;
				arg3[local30] += arg6[arg7++];
				@Pc(42) int local42 = arg5++;
				arg3[local42] += arg6[arg7++];
				@Pc(54) int local54 = arg5++;
				arg3[local54] += arg6[arg7++];
				@Pc(66) int local66 = arg5++;
				arg3[local66] += arg6[arg7++];
			}
			for (@Pc(81) int local81 = local19; local81 < 0; local81++) {
				local30 = arg5++;
				arg3[local30] += arg6[arg7++];
			}
			arg7 += arg4;
			arg5 += arg0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
	public static void method5243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 * Static374.aClass20_Sub1_1.anInt2341 >> 8;
		if (arg1 == -1 && !Static24.aBoolean64) {
			Static124.method5969();
		} else if (arg1 != -1 && (arg1 != Static120.anInt2586 || !Static282.method3508()) && local10 != 0 && !Static24.aBoolean64) {
			Static352.method4667(arg0, Static149.aClass32_43, arg1, local10);
		}
		Static120.anInt2586 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!en;I)Ljava/lang/String;")
	public static String method5245(@OriginalArg(0) Class3_Sub14 arg0) {
		return arg0.aString12 == null || arg0.aString12.length() <= 0 ? arg0.aString13 : arg0.aString13 + Static85.aClass189_67.method4262(Static53.anInt1454) + arg0.aString12;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Lclient!vr;")
	public static Class117_Sub1 method5246() {
		return Static57.aClass117_Sub1Array3.length > Static355.anInt6058 ? Static57.aClass117_Sub1Array3[Static355.anInt6058++] : null;
	}
}
