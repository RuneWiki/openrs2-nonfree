import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "Lclient!in;")
	public static Class160 aClass160_36 = null;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Lclient!bda;")
	public static Class21 method6717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass21_4;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Lclient!hg;")
	public static Class133 method6719() {
		return new Class133(1, false);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIII)V")
	public static void method6720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static310.method4637(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(27) int local27 = -arg0;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static280.anIntArrayArray25[arg4];
		@Pc(45) int local45 = arg2 - local15;
		@Pc(50) int local50 = arg2 + local15;
		Static329.method4871(arg2 - arg0, local45, local40, arg1);
		Static329.method4871(local45, local50, local40, arg5);
		Static329.method4871(local50, arg2 + arg0, local40, arg1);
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				Static464.anIntArray523[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(128) int[] local128;
			@Pc(134) int[] local134;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(151) int local151;
			@Pc(155) int local155;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local15 > local24) {
					local128 = Static280.anIntArrayArray25[local24 + arg4];
					local134 = Static280.anIntArrayArray25[arg4 - local24];
					local138 = Static464.anIntArray523[local24];
					local142 = arg2 + local10;
					local147 = arg2 - local10;
					local151 = local138 + arg2;
					local155 = arg2 - local138;
					Static329.method4871(local147, local155, local128, arg1);
					Static329.method4871(local155, local151, local128, arg5);
					Static329.method4871(local151, local142, local128, arg1);
					Static329.method4871(local147, local155, local134, arg1);
					Static329.method4871(local155, local151, local134, arg5);
					Static329.method4871(local151, local142, local134, arg1);
				} else {
					local128 = Static280.anIntArrayArray25[local24 + arg4];
					local134 = Static280.anIntArrayArray25[arg4 - local24];
					local138 = local10 + arg2;
					local142 = arg2 - local10;
					Static329.method4871(local142, local138, local128, arg1);
					Static329.method4871(local142, local138, local134, arg1);
				}
			}
			local128 = Static280.anIntArrayArray25[local10 + arg4];
			local134 = Static280.anIntArrayArray25[arg4 - local10];
			local138 = arg2 + local24;
			local142 = arg2 - local24;
			if (local15 <= local10) {
				Static329.method4871(local142, local138, local128, arg1);
				Static329.method4871(local142, local138, local134, arg1);
			} else {
				local147 = local29 < local10 ? Static464.anIntArray523[local10] : local29;
				local151 = arg2 + local147;
				local155 = arg2 - local147;
				Static329.method4871(local142, local155, local128, arg1);
				Static329.method4871(local155, local151, local128, arg5);
				Static329.method4871(local151, local138, local128, arg1);
				Static329.method4871(local142, local155, local134, arg1);
				Static329.method4871(local155, local151, local134, arg5);
				Static329.method4871(local151, local138, local134, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!sea;II)Lclient!qea;")
	public static Class1_Sub8_Sub11 method6721(@OriginalArg(1) Class308 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class1_Sub3 local21 = new Class1_Sub3(arg0.method6569(arg1, arg2));
		@Pc(54) Class1_Sub8_Sub11 local54 = new Class1_Sub8_Sub11(arg2, local21.method7951(), local21.method7951(), local21.method7940(), local21.method7940(), local21.method7974() == 1, local21.method7974(), local21.method7974());
		@Pc(58) int local58 = local21.method7974();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local54.aClass111_47.method2552(new Class1_Sub17(local21.method7974(), local21.method7945(), local21.method7945(), local21.method7945(), local21.method7945(), local21.method7945(), local21.method7945(), local21.method7945(), local21.method7945()));
		}
		local54.method5975();
		return local54;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!sea;Lclient!sea;ILclient!sea;Lclient!sea;)V")
	public static void method6722(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(3) Class308 arg2, @OriginalArg(4) Class308 arg3) {
		Static370.aClass308_131 = arg0;
		Static297.aClass308_105 = arg2;
		Static123.aClass308_49 = arg1;
		Static115.aClass160ArrayArray1 = new Class160[Static123.aClass308_49.method6564()][];
		Static502.aBooleanArray32 = new boolean[Static123.aClass308_49.method6564()];
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZLjava/awt/Canvas;Lclient!fa;Lclient!sea;)Lclient!r;")
	public static Class78 method6723(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface9 arg2, @OriginalArg(4) Class308 arg3) {
		if (!Static128.method2263()) {
			throw new RuntimeException("");
		} else if (Static362.method5319("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg1, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class78_Sub1_Sub2 local58 = new Class78_Sub1_Sub2(local29, arg1, local39, arg2, arg3, arg0);
			local58.method6872();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}
}
