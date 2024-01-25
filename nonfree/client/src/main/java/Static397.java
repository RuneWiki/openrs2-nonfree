import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!mka", name = "f", descriptor = "I")
	public static int anInt7112;

	@OriginalMember(owner = "client!mka", name = "g", descriptor = "Lclient!lb;")
	public static Class221 aClass221_113;

	@OriginalMember(owner = "client!mka", name = "c", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_125 = new Class186(15, 8);

	@OriginalMember(owner = "client!mka", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(B)V")
	public static void method5964() {
		Static167.aClass400_1 = Static532.aClass400_2;
		Static293.anInt5245 = 1;
		Static707.anInt11053 = -1;
		@Pc(16) String local16 = null;
		if (Static12.aByteArray2 != null) {
			@Pc(23) Class3_Sub28 local23 = new Class3_Sub28(Static12.aByteArray2);
			local16 = Static479.method7005(local23.method5287());
			Static669.aLong366 = local23.method5287();
		}
		if (local16 == null) {
			Static422.method6222(35);
		} else {
			Static441.method6405(true, "", false, local16);
		}
	}
}
