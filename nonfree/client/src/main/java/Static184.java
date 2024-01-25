import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt3919;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!gf;")
	public static final Class120 aClass120_3 = new Class120();

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Z")
	public static boolean aBoolean299 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3420(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(38) String local38;
		if (Static282.anInt5285 >= 200 && !Static268.aBoolean388 || Static282.anInt5285 >= 200) {
			Static160.method3167(Static275.aClass198_9.method4407(Static56.anInt953));
			local38 = Static275.aClass198_10.method4407(Static56.anInt953);
			if (local38 != null) {
				Static160.method3167(local38);
			}
			return;
		}
		local38 = Static488.method6774(arg0);
		if (local38 == null) {
			return;
		}
		@Pc(93) String local93;
		for (@Pc(54) int local54 = 0; local54 < Static282.anInt5285; local54++) {
			@Pc(62) String local62 = Static488.method6774(Static300.aStringArray26[local54]);
			if (local62 != null && local62.equals(local38)) {
				Static160.method3167(arg0 + Static275.aClass198_37.method4407(Static56.anInt953));
				return;
			}
			if (Static38.aStringArray3[local54] != null) {
				local93 = Static488.method6774(Static38.aStringArray3[local54]);
				if (local93 != null && local93.equals(local38)) {
					Static160.method3167(arg0 + Static275.aClass198_37.method4407(Static56.anInt953));
					return;
				}
			}
		}
		for (@Pc(120) int local120 = 0; local120 < Static286.anInt8741; local120++) {
			local93 = Static488.method6774(Static101.aStringArray5[local120]);
			if (local93 != null && local93.equals(local38)) {
				Static160.method3167(Static275.aClass198_42.method4407(Static56.anInt953) + arg0 + Static275.aClass198_43.method4407(Static56.anInt953));
				return;
			}
			if (Static550.aStringArray38[local120] != null) {
				@Pc(164) String local164 = Static488.method6774(Static550.aStringArray38[local120]);
				if (local164 != null && local164.equals(local38)) {
					Static160.method3167(Static275.aClass198_42.method4407(Static56.anInt953) + arg0 + Static275.aClass198_43.method4407(Static56.anInt953));
					return;
				}
			}
		}
		if (Static488.method6774(Static129.aClass10_Sub1_Sub2_Sub2_1.aString93).equals(local38)) {
			Static160.method3167(Static275.aClass198_40.method4407(Static56.anInt953));
		} else {
			@Pc(222) Class4_Sub41 local222 = Static128.method2707(Static570.aClass61_131, Class16_Sub3.lb);
			local222.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(arg0));
			local222.aClass4_Sub9_Sub1_3.method6000(arg0);
			Static551.method7603(local222);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!vj;)V")
	public static void method3421(@OriginalArg(1) Class10_Sub1_Sub2 arg0) {
		@Pc(9) boolean local9 = false;
		if (Static237.anInt7561 == arg0.anInt8509 || arg0.anInt8483 == -1 || arg0.anInt8510 != 0) {
			local9 = true;
		} else {
			@Pc(33) Class77 local33 = Static168.aClass327_2.method7326(arg0.anInt8483);
			if (local33.aBoolean206 || local33.anIntArray240[arg0.anInt8521] < arg0.anInt8468 + 1) {
				local9 = true;
			}
		}
		if (local9) {
			@Pc(65) int local65 = arg0.anInt8509 - arg0.anInt8462;
			@Pc(71) int local71 = Static237.anInt7561 - arg0.anInt8462;
			@Pc(82) int local82 = arg0.anInt8495 * 512 + arg0.method7021() * 256;
			@Pc(93) int local93 = arg0.anInt8485 * 512 + arg0.method7021() * 256;
			@Pc(104) int local104 = arg0.anInt8530 * 512 + arg0.method7021() * 256;
			@Pc(116) int local116 = arg0.anInt8503 * 512 + arg0.method7021() * 256;
			arg0.anInt8929 = (local116 * local71 + (local65 - local71) * local93) / local65;
			arg0.anInt8934 = (local82 * (local65 - local71) + local104 * local71) / local65;
		}
		arg0.anInt8538 = 0;
		if (arg0.anInt8525 == 0) {
			arg0.method7033(8192, false);
		}
		if (arg0.anInt8525 == 1) {
			arg0.method7033(12288, false);
		}
		if (arg0.anInt8525 == 2) {
			arg0.method7033(0, false);
		}
		if (arg0.anInt8525 == 3) {
			arg0.method7033(4096, false);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)J")
	public static synchronized long method3422() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static9.aLong271 > local5) {
			Static427.aLong212 += Static9.aLong271 - local5;
		}
		Static9.aLong271 = local5;
		return Static427.aLong212 + local5;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method3424() {
		if (Static233.aBoolean354) {
			return;
		}
		if (Static189.aClass4_Sub2_Sub1_1.aBoolean651) {
			Static477.aFloat164 = (int) Static477.aFloat164 - 65 & 0xFFFFFF80;
		} else {
			Static432.aFloat144 += (-24.0F - Static432.aFloat144) / 2.0F;
		}
		Static233.aBoolean354 = true;
		Static279.aBoolean393 = true;
	}
}
