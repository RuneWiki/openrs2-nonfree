import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "Z")
	public static boolean aBoolean268;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_97 = new Class381(11, 3);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIJLclient!mj;IILclient!aa;)V")
	public static void method3546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) Class238 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg6 * arg6;
		if ((long) local11 > arg3) {
			return;
		}
		@Pc(42) int local42 = Math.min(arg4.anInt5985 / 2, arg4.anInt5973 / 2);
		if (local11 <= local42 * local42) {
			Static301.method4698(Static415.aClass155Array17[arg1], arg6, arg0, arg5, arg7, arg4, arg2);
			return;
		}
		local42 -= 10;
		@Pc(64) int local64;
		if (Static426.anInt7111 == 4) {
			local64 = (int) Static243.aFloat117 & 0x3FFF;
		} else {
			local64 = Static271.anInt4907 + (int) Static243.aFloat117 & 0x3FFF;
		}
		@Pc(75) int local75 = Class42.anIntArray51[local64];
		@Pc(79) int local79 = Class42.anIntArray52[local64];
		if (Static426.anInt7111 != 4) {
			local79 = local79 * 256 / (Static283.anInt5029 + 256);
			local75 = local75 * 256 / (Static283.anInt5029 + 256);
		}
		@Pc(108) int local108 = arg2 * local79 + arg6 * local75 >> 14;
		@Pc(119) int local119 = local79 * arg6 - local75 * arg2 >> 14;
		@Pc(125) double local125 = Math.atan2((double) local108, (double) local119);
		@Pc(132) int local132 = (int) ((double) local42 * Math.sin(local125));
		@Pc(139) int local139 = (int) (Math.cos(local125) * (double) local42);
		Static438.aClass155Array18[arg1].method7211((float) local132 + (float) arg0 + (float) arg4.anInt5985 / 2.0F, (float) arg5 + (float) arg4.anInt5973 / 2.0F - (float) local139, 4096, (int) (-local125 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIB)Z")
	public static boolean method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static414.method6096(arg1, arg0)) {
			return (arg0 & 0x9000) != 0 | Static575.method7727(arg0, arg1) | Static207.method3390(arg1, arg0) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static368.method5497(arg1, arg0) | Static536.method7358(arg1, arg0));
		} else {
			return false;
		}
	}
}
