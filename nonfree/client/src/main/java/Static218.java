import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "Lclient!lp;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
	public static int anInt4636;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
	public static final int anInt4634 = 1338;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_53 = new Class181(51, 2);

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "Z")
	public static boolean aBoolean366 = false;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
	public static void method3984() {
		for (@Pc(15) Class6_Sub4_Sub18 local15 = (Class6_Sub4_Sub18) Static565.aClass211_73.method5183(); local15 != null; local15 = (Class6_Sub4_Sub18) Static565.aClass211_73.method5177()) {
			@Pc(20) Class11_Sub1_Sub5 local20 = local15.aClass11_Sub1_Sub5_1;
			if (local20.anInt5986 < Static508.anInt8998) {
				local15.method8151();
				local20.method5129();
			} else if (Static508.anInt8998 >= local20.anInt5983) {
				if (local20.anInt5984 > 0) {
					@Pc(60) Class6_Sub33 local60 = (Class6_Sub33) Static506.aClass305_36.method7447((long) (local20.anInt5984 - 1));
					if (local60 != null) {
						@Pc(65) Class11_Sub1_Sub1_Sub1 local65 = local60.aClass11_Sub1_Sub1_Sub1_2;
						if (local65.anInt7347 >= 0 && local65.anInt7347 < Static228.anInt4746 * 512 && local65.anInt7351 >= 0 && Static44.anInt1275 * 512 > local65.anInt7351) {
							local20.method5135(local65.anInt7347, Static508.anInt8998, Static482.method7333(local20.aByte77, local65.anInt7351, local65.anInt7347) - local20.anInt5999, local65.anInt7351);
						}
					}
				}
				if (local20.anInt5984 < 0) {
					@Pc(120) int local120 = -local20.anInt5984 - 1;
					@Pc(127) Class11_Sub1_Sub1_Sub2 local127;
					if (local120 == Static412.anInt7714) {
						local127 = Static350.aClass11_Sub1_Sub1_Sub2_4;
					} else {
						local127 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local120];
					}
					if (local127 != null && local127.anInt7347 >= 0 && Static228.anInt4746 * 512 > local127.anInt7347 && local127.anInt7351 >= 0 && local127.anInt7351 < Static44.anInt1275 * 512) {
						local20.method5135(local127.anInt7347, Static508.anInt8998, Static482.method7333(local20.aByte77, local127.anInt7351, local127.anInt7347) - local20.anInt5999, local127.anInt7351);
					}
				}
				local20.method5131(Static388.anInt7269);
				Static88.method1973(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
	public static void method3985() {
		@Pc(16) Class6_Sub4_Sub6 local16 = Static68.method1408(15, 0);
		local16.method3828();
	}
}
