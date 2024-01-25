import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "[I")
	public static int[] anIntArray494 = new int[2];

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "[I")
	public static final int[] anIntArray496 = new int[500];

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_88 = new Class187(84, 15);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public static void method7611(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static290.method8315(local6.height, local6.width);
		if (Static634.anInt10113 == 1) {
			Static371.aClass143_7.method6261(arg0, Static275.anInt4317, Static584.anInt9612);
		} else {
			Static371.aClass143_7.method6261(arg0, Static630.anInt10065, Static622.anInt9017);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Z")
	public static boolean method7612(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	public static void method7613() {
		Static451.aClass265_50.method6573();
		Static493.aClass265_54.method6573();
		Static314.aClass265_31.method6573();
		Static667.aClass265_65.method6573();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!cb;Ljava/awt/Canvas;Lclient!d;II)Lclient!ha;")
	public static Class143 method7615(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		if (arg2 != null) {
			@Pc(17) Dimension local17 = arg2.getSize();
			local12 = local17.height;
			local10 = local17.width;
		}
		return Static208.method6193(local10, local12, arg0, arg2, arg4, arg1, arg3);
	}
}
