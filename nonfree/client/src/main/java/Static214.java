import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "[[[Lclient!nt;")
	public static Class164[][][] aClass164ArrayArrayArray4;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_178 = new Class22(36, 12);

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_79 = new Class83("K", "T", "K", "K");

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public static void method3224() {
		for (@Pc(14) Class4_Sub39 local14 = (Class4_Sub39) Static206.aClass183_28.method4140(); local14 != null; local14 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
			if (Static444.method5641(local14.anInt5699)) {
				Static176.method2841(local14);
			}
		}
		if (Static407.anInt6710 == 1) {
			Static234.aBoolean411 = false;
			Static302.method4103(Static310.anInt5424, Static112.anInt2392, Static173.anInt3370, Static172.anInt3367);
			return;
		}
		Static302.method4103(Static310.anInt5424, Static112.anInt2392, Static173.anInt3370, Static172.anInt3367);
		@Pc(57) int local57 = Static118.aClass89_5.method2340(Static391.aClass83_133.method2267(Static178.anInt3423));
		for (@Pc(62) Class4_Sub39 local62 = (Class4_Sub39) Static206.aClass183_28.method4140(); local62 != null; local62 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
			@Pc(68) int local68 = Static210.method3197(local62);
			if (local57 < local68) {
				local57 = local68;
			}
		}
		Static173.anInt3370 = local57 + 8;
		Static112.anInt2392 = (Static299.aBoolean481 ? 26 : 22) + Static407.anInt6710 * 16;
	}
}
