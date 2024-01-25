import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Lclient!jt;")
	public static final Class150 aClass150_4 = new Class150(2);

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
	public static int anInt3454 = -1;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_84 = new Class239(51, 8);

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "[I")
	public static final int[] anIntArray376 = new int[4096];

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "(I)V")
	public static void method3097() {
		Static273.method4342(Static72.aClass310_4);
		Static13.anInt304++;
		if (Static499.aBoolean632 && Static161.aBoolean238) {
			@Pc(35) int local35 = Static61.aClass214_1.method7241();
			@Pc(39) int local39 = Static61.aClass214_1.method7240();
			local39 -= Static376.anInt6978;
			local35 -= Static203.anInt3701;
			if (local35 < Static327.anInt6051) {
				local35 = Static327.anInt6051;
			}
			if (local35 + Static72.aClass310_4.anInt9163 > Static325.aClass310_15.anInt9163 + Static327.anInt6051) {
				local35 = Static327.anInt6051 + Static325.aClass310_15.anInt9163 - Static72.aClass310_4.anInt9163;
			}
			if (Static540.anInt9345 > local39) {
				local39 = Static540.anInt9345;
			}
			if (Static325.aClass310_15.anInt9198 + Static540.anInt9345 < local39 + Static72.aClass310_4.anInt9198) {
				local39 = Static325.aClass310_15.anInt9198 + Static540.anInt9345 - Static72.aClass310_4.anInt9198;
			}
			@Pc(104) int local104 = local35 + Static325.aClass310_15.anInt9230 - Static327.anInt6051;
			@Pc(112) int local112 = Static325.aClass310_15.anInt9227 + local39 - Static540.anInt9345;
			@Pc(127) Class2_Sub28 local127;
			if (Static61.aClass214_1.method7239()) {
				if (Static13.anInt304 > Static72.aClass310_4.anInt9231) {
					@Pc(209) int local209 = local35 - Static135.anInt2546;
					@Pc(214) int local214 = local39 - Static212.anInt3812;
					if (Static72.aClass310_4.anInt9237 < local209 || -Static72.aClass310_4.anInt9237 > local209 || Static72.aClass310_4.anInt9237 < local214 || -Static72.aClass310_4.anInt9237 > local214) {
						Static277.aBoolean382 = true;
					}
				}
				if (Static72.aClass310_4.anObjectArray18 != null && Static277.aBoolean382) {
					local127 = new Class2_Sub28();
					local127.anInt3743 = local104;
					local127.aClass310_8 = Static72.aClass310_4;
					local127.anObjectArray2 = Static72.aClass310_4.anObjectArray18;
					local127.anInt3744 = local112;
					Static258.method4037(local127);
				}
			} else {
				if (Static277.aBoolean382) {
					Static465.method7011();
					if (Static72.aClass310_4.anObjectArray15 != null) {
						local127 = new Class2_Sub28();
						local127.anInt3743 = local104;
						local127.anObjectArray2 = Static72.aClass310_4.anObjectArray15;
						local127.aClass310_8 = Static72.aClass310_4;
						local127.aClass310_9 = Static38.aClass310_1;
						local127.anInt3744 = local112;
						Static258.method4037(local127);
					}
					if (Static38.aClass310_1 != null && Static67.method1241(Static72.aClass310_4) != null) {
						Static471.method7073(Static38.aClass310_1, Static72.aClass310_4);
					}
				} else if ((Static539.anInt9337 == 1 || Static388.method6241()) && Static323.anInt6016 > 2) {
					Static42.method814(Static376.anInt6978 + Static212.anInt3812, Static203.anInt3701 + Static135.anInt2546);
				} else if (Static42.method809()) {
					Static42.method814(Static376.anInt6978 + Static212.anInt3812, Static135.anInt2546 + Static203.anInt3701);
				}
				Static72.aClass310_4 = null;
			}
		} else if (Static13.anInt304 > 1) {
			Static72.aClass310_4 = null;
		}
	}
}
