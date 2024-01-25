import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	public static int anInt6752 = 0;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt6753 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)I")
	public static int method5284(@OriginalArg(0) int arg0) {
		if (Static88.aClass251_2 != null) {
			Static88.aClass251_2.method5345();
			Static88.aClass251_2 = null;
		}
		Static186.anInt3732++;
		if (Static186.anInt3732 > 4) {
			Static301.anInt2466 = 0;
			Static186.anInt3732 = 0;
			return arg0;
		}
		if (Static192.anInt3847 == Static339.anInt5769) {
			Static192.anInt3847 = Static312.anInt5519;
		} else {
			Static192.anInt3847 = Static339.anInt5769;
		}
		Static301.anInt2466 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZII)I")
	public static int method5285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg0;
		@Pc(26) int local26 = ((arg2 & 0xFF00) * arg0 & 0xFF0000 | (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		return (((arg1 & 0xFF00) * local8 & 0xFF0000 | (arg1 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIBI)V")
	public static void method5286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) Class3_Sub4_Sub12 local19 = Static393.method5080(arg1, 10);
		local19.method3248();
		local19.anInt4063 = arg2;
		local19.anInt4062 = arg0;
		local19.anInt4060 = arg3;
	}
}
