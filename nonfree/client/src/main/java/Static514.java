import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static int anInt8545;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public static int anInt8546;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_303 = new Class179(2, 4);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLclient!laa;I)V")
	public static void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub4_Sub10 arg1, @OriginalArg(3) int arg2) {
		if (!Static277.aBoolean303) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(27) int local27;
		for (@Pc(21) Class6_Sub4_Sub12 local21 = (Class6_Sub4_Sub12) arg1.aClass384_11.method8910(); local21 != null; local21 = (Class6_Sub4_Sub12) arg1.aClass384_11.method8908()) {
			local27 = Static3.method1019(local21);
			if (local27 > local10) {
				local10 = local27;
			}
		}
		local10 += 8;
		Static494.anInt8391 = (Static292.aBoolean317 ? 26 : 22) + arg1.anInt5448 * 16;
		local27 = arg1.anInt5448 * 16 + 21;
		@Pc(63) int local63 = Static279.anInt4804 + Static643.anInt10391;
		if (Static449.anInt7506 < local10 + local63) {
			local63 = Static643.anInt10391 - local10;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(83) int local83 = Static292.aBoolean317 ? 33 : 31;
		@Pc(90) int local90 = arg0 + 13 - local83;
		if (Static348.anInt5935 < local90 + local27) {
			local90 = Static348.anInt5935 - local27;
		}
		Static347.anInt10656 = local63;
		if (local90 < 0) {
			local90 = 0;
		}
		Static166.anInt2811 = local90;
		Static314.anInt5338 = local10;
		Static275.aClass6_Sub4_Sub10_1 = arg1;
	}
}
