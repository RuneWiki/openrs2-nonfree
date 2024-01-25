import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt1550;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_46 = new Class123(39, 6);

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!or;")
	public static final Class244 aClass244_16 = new Class244();

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_25 = new Class287(50, 3);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
	public static void method1409(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static47.method1179(arg2);
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 - arg1;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(25) int local25 = arg2;
		@Pc(28) int local28 = -arg2;
		@Pc(30) int local30 = local19;
		@Pc(33) int local33 = -local19;
		@Pc(35) int local35 = -1;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(78) int local78;
		if (Static112.anInt2687 <= arg4 && arg4 <= Static333.anInt6022) {
			@Pc(45) int[] local45 = Static570.anIntArrayArray100[arg4];
			local54 = Static4.method56(arg0 - arg2, Static384.anInt6641, Static191.anInt4134);
			local62 = Static4.method56(arg0 + arg2, Static384.anInt6641, Static191.anInt4134);
			local70 = Static4.method56(arg0 - local19, Static384.anInt6641, Static191.anInt4134);
			local78 = Static4.method56(local19 + arg0, Static384.anInt6641, Static191.anInt4134);
			Static504.method6755(arg3, local70, local45, local54);
			Static504.method6755(arg5, local78, local45, local70);
			Static504.method6755(arg3, local62, local45, local78);
		}
		@Pc(100) int local100 = -1;
		while (local15 < local25) {
			local100 += 2;
			local35 += 2;
			local28 += local35;
			local33 += local100;
			if (local33 >= 0 && local30 >= 1) {
				local30--;
				local33 -= local30 << 1;
				Static33.anIntArray23[local30] = local15;
			}
			local15++;
			@Pc(247) int local247;
			@Pc(258) int local258;
			@Pc(269) int[] local269;
			@Pc(146) int local146;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				local146 = arg4 - local25;
				local54 = local25 + arg4;
				if (Static112.anInt2687 <= local54 && local146 <= Static333.anInt6022) {
					if (local19 <= local25) {
						local62 = Static4.method56(arg0 + local15, Static384.anInt6641, Static191.anInt4134);
						local70 = Static4.method56(arg0 - local15, Static384.anInt6641, Static191.anInt4134);
						if (local54 <= Static333.anInt6022) {
							Static504.method6755(arg3, local62, Static570.anIntArrayArray100[local54], local70);
						}
						if (local146 >= Static112.anInt2687) {
							Static504.method6755(arg3, local62, Static570.anIntArrayArray100[local146], local70);
						}
					} else {
						local62 = Static33.anIntArray23[local25];
						local70 = Static4.method56(arg0 + local15, Static384.anInt6641, Static191.anInt4134);
						local78 = Static4.method56(arg0 - local15, Static384.anInt6641, Static191.anInt4134);
						local247 = Static4.method56(arg0 + local62, Static384.anInt6641, Static191.anInt4134);
						local258 = Static4.method56(arg0 - local62, Static384.anInt6641, Static191.anInt4134);
						if (Static333.anInt6022 >= local54) {
							local269 = Static570.anIntArrayArray100[local54];
							Static504.method6755(arg3, local258, local269, local78);
							Static504.method6755(arg5, local247, local269, local258);
							Static504.method6755(arg3, local70, local269, local247);
						}
						if (local146 >= Static112.anInt2687) {
							local269 = Static570.anIntArrayArray100[local146];
							Static504.method6755(arg3, local258, local269, local78);
							Static504.method6755(arg5, local247, local269, local258);
							Static504.method6755(arg3, local70, local269, local247);
						}
					}
				}
			}
			local146 = arg4 - local15;
			local54 = arg4 + local15;
			if (local54 >= Static112.anInt2687 && Static333.anInt6022 >= local146) {
				local62 = arg0 + local25;
				local70 = arg0 - local25;
				if (local62 >= Static384.anInt6641 && Static191.anInt4134 >= local70) {
					local62 = Static4.method56(local62, Static384.anInt6641, Static191.anInt4134);
					local70 = Static4.method56(local70, Static384.anInt6641, Static191.anInt4134);
					if (local15 >= local19) {
						if (local54 <= Static333.anInt6022) {
							Static504.method6755(arg3, local62, Static570.anIntArrayArray100[local54], local70);
						}
						if (local146 >= Static112.anInt2687) {
							Static504.method6755(arg3, local62, Static570.anIntArrayArray100[local146], local70);
						}
					} else {
						local78 = local30 >= local15 ? local30 : Static33.anIntArray23[local15];
						local247 = Static4.method56(arg0 + local78, Static384.anInt6641, Static191.anInt4134);
						local258 = Static4.method56(arg0 - local78, Static384.anInt6641, Static191.anInt4134);
						if (Static333.anInt6022 >= local54) {
							local269 = Static570.anIntArrayArray100[local54];
							Static504.method6755(arg3, local258, local269, local70);
							Static504.method6755(arg5, local247, local269, local258);
							Static504.method6755(arg3, local62, local269, local247);
						}
						if (local146 >= Static112.anInt2687) {
							local269 = Static570.anIntArrayArray100[local146];
							Static504.method6755(arg3, local258, local269, local70);
							Static504.method6755(arg5, local247, local269, local258);
							Static504.method6755(arg3, local62, local269, local247);
						}
					}
				}
			}
		}
	}
}
