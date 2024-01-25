import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
	public static int anInt4292 = 0;

	@OriginalMember(owner = "client!hr", name = "T", descriptor = "[I")
	public static final int[] anIntArray400 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_36 = new Class71();

	@OriginalMember(owner = "client!hr", name = "Z", descriptor = "[I")
	public static int[] anIntArray401 = new int[2];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIII)V")
	public static void method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static498.method7193(arg3);
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg3 - arg5;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(25) int local25 = arg3;
		@Pc(28) int local28 = -arg3;
		@Pc(30) int local30 = local19;
		@Pc(33) int local33 = -local19;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (Static269.anInt5577 <= arg2 && arg2 <= Static81.anInt1788) {
			@Pc(55) int[] local55 = Static68.anIntArrayArray24[arg2];
			local64 = Static73.method7829(arg4 - arg3, Static190.anInt4314, Static145.anInt2941);
			local72 = Static73.method7829(arg3 + arg4, Static190.anInt4314, Static145.anInt2941);
			local81 = Static73.method7829(arg4 - local19, Static190.anInt4314, Static145.anInt2941);
			local90 = Static73.method7829(arg4 + local19, Static190.anInt4314, Static145.anInt2941);
			Static257.method4540(local55, arg1, local64, local81);
			Static257.method4540(local55, arg0, local81, local90);
			Static257.method4540(local55, arg1, local90, local72);
		}
		while (local25 > local15) {
			local35 += 2;
			local37 += 2;
			local33 += local37;
			local28 += local35;
			if (local33 >= 0 && local30 >= 1) {
				local30--;
				Static24.anIntArray128[local30] = local15;
				local33 -= local30 << 1;
			}
			local15++;
			@Pc(205) int local205;
			@Pc(214) int local214;
			@Pc(225) int[] local225;
			@Pc(155) int local155;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				local155 = arg2 - local25;
				local64 = local25 + arg2;
				if (Static269.anInt5577 <= local64 && Static81.anInt1788 >= local155) {
					if (local19 > local25) {
						local72 = Static24.anIntArray128[local25];
						local81 = Static73.method7829(arg4 + local15, Static190.anInt4314, Static145.anInt2941);
						local90 = Static73.method7829(arg4 - local15, Static190.anInt4314, Static145.anInt2941);
						local205 = Static73.method7829(local72 + arg4, Static190.anInt4314, Static145.anInt2941);
						local214 = Static73.method7829(arg4 - local72, Static190.anInt4314, Static145.anInt2941);
						if (Static81.anInt1788 >= local64) {
							local225 = Static68.anIntArrayArray24[local64];
							Static257.method4540(local225, arg1, local90, local214);
							Static257.method4540(local225, arg0, local214, local205);
							Static257.method4540(local225, arg1, local205, local81);
						}
						if (Static269.anInt5577 <= local155) {
							local225 = Static68.anIntArrayArray24[local155];
							Static257.method4540(local225, arg1, local90, local214);
							Static257.method4540(local225, arg0, local214, local205);
							Static257.method4540(local225, arg1, local205, local81);
						}
					} else {
						local72 = Static73.method7829(local15 + arg4, Static190.anInt4314, Static145.anInt2941);
						local81 = Static73.method7829(arg4 - local15, Static190.anInt4314, Static145.anInt2941);
						if (Static81.anInt1788 >= local64) {
							Static257.method4540(Static68.anIntArrayArray24[local64], arg1, local81, local72);
						}
						if (Static269.anInt5577 <= local155) {
							Static257.method4540(Static68.anIntArrayArray24[local155], arg1, local81, local72);
						}
					}
				}
			}
			local155 = arg2 - local15;
			local64 = local15 + arg2;
			if (local64 >= Static269.anInt5577 && local155 <= Static81.anInt1788) {
				local72 = local25 + arg4;
				local81 = arg4 - local25;
				if (local72 >= Static190.anInt4314 && Static145.anInt2941 >= local81) {
					local72 = Static73.method7829(local72, Static190.anInt4314, Static145.anInt2941);
					local81 = Static73.method7829(local81, Static190.anInt4314, Static145.anInt2941);
					if (local19 <= local15) {
						if (Static81.anInt1788 >= local64) {
							Static257.method4540(Static68.anIntArrayArray24[local64], arg1, local81, local72);
						}
						if (Static269.anInt5577 <= local155) {
							Static257.method4540(Static68.anIntArrayArray24[local155], arg1, local81, local72);
						}
					} else {
						local90 = local30 >= local15 ? local30 : Static24.anIntArray128[local15];
						local205 = Static73.method7829(local90 + arg4, Static190.anInt4314, Static145.anInt2941);
						local214 = Static73.method7829(arg4 - local90, Static190.anInt4314, Static145.anInt2941);
						if (local64 <= Static81.anInt1788) {
							local225 = Static68.anIntArrayArray24[local64];
							Static257.method4540(local225, arg1, local81, local214);
							Static257.method4540(local225, arg0, local214, local205);
							Static257.method4540(local225, arg1, local205, local72);
						}
						if (Static269.anInt5577 <= local155) {
							local225 = Static68.anIntArrayArray24[local155];
							Static257.method4540(local225, arg1, local81, local214);
							Static257.method4540(local225, arg0, local214, local205);
							Static257.method4540(local225, arg1, local205, local72);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ad;IZLjava/lang/String;)Lclient!jm;")
	public static Class150 method3551(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(3) String arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static426.anIntArray671, 0);
		if (Static426.anIntArray671[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class150(arg0, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Z")
	public static boolean method3553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
