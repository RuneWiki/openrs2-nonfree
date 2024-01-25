import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public static int anInt8313;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!wl;")
	public static final Class377 aClass377_11 = new Class377();

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_20 = new Class244(2, 16);

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "[F")
	public static final float[] aFloatArray73 = new float[16];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!vd;Lclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class100 method7158(@OriginalArg(0) int arg0, @OriginalArg(2) Class353 arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static377.method7189()) {
			throw new RuntimeException("");
		} else if (Static96.method1571("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(55) Class100_Sub1_Sub2 local55 = new Class100_Sub1_Sub2(local24, arg3, local34, arg2, arg1, arg0);
			local55.method6069();
			return local55;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	public static void method7160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static10.method210(local7.aClass20_Sub2_Sub5_1);
			if (local7.aClass20_Sub2_Sub5_1 != null) {
				local7.aClass20_Sub2_Sub5_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)V")
	public static void method7161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class20_Sub2_Sub3 local13 = local7.aClass20_Sub2_Sub3_2;
		@Pc(16) Class20_Sub2_Sub3 local16 = local7.aClass20_Sub2_Sub3_1;
		if (local13 != null) {
			local13.aShort51 = (short) (local13.aShort51 * arg3 / (0x10 << Static643.anInt10682 - 7));
			local13.aShort50 = (short) (local13.aShort50 * arg3 / (0x10 << Static643.anInt10682 - 7));
		}
		if (local16 != null) {
			local16.aShort51 = (short) (local16.aShort51 * arg3 / (0x10 << Static643.anInt10682 - 7));
			local16.aShort50 = (short) (local16.aShort50 * arg3 / (0x10 << Static643.anInt10682 - 7));
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
	public static void method7165() {
		Static409.aClass166_38.method4811();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;BILclient!qq;ILclient!tl;Lclient!fo;II)V")
	public static void method7170(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class276 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub45 arg4, @OriginalArg(6) Class105 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg6 - arg7 / 2 - 5;
		@Pc(17) int local17 = arg3 + 2;
		if (arg5.anInt3390 != 0) {
			arg0.method8815(local13, arg5.anInt3390, arg7 + 10, local17, arg1 * arg2.method7128() + arg3 + 1 - local17);
		}
		if (arg5.anInt3387 != 0) {
			arg0.method8814(arg5.anInt3387, local13, local17, arg7 + 10, -local17 + 1 + arg3 + arg1 * arg2.method7128());
		}
		@Pc(77) int local77 = arg5.anInt3404;
		if (arg4.aBoolean642 && arg5.anInt3385 != -1) {
			local77 = arg5.anInt3385;
		}
		for (@Pc(90) int local90 = 0; local90 < arg1; local90++) {
			@Pc(96) String local96 = Static174.aStringArray30[local90];
			if (arg1 - 1 > local90) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg2.method7124(arg0, local96, arg6, arg3, local77);
			arg3 += arg2.method7128();
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)I")
	public static int method7171() {
		return Static200.anInt4040;
	}
}
