import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
	public static int anInt4648;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public static int anInt4643 = 0;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_47 = new Class269(1, 8);

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt4647 = 0;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_26 = new Class238();

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!gs;III)V")
	public static void method3853(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class217 local12;
		if (arg2 < Static347.anInt6411) {
			local12 = Static440.aClass217ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass11_Sub1_Sub4_1 != null && local12.aClass11_Sub1_Sub4_1.method8313()) {
				arg0.method8316(Static312.anInt5690, Static328.aClass87_6, local12.aClass11_Sub1_Sub4_1, true, 0, 0);
			}
		}
		if (arg3 < Static347.anInt6411) {
			local12 = Static440.aClass217ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass11_Sub1_Sub4_1 != null && local12.aClass11_Sub1_Sub4_1.method8313()) {
				arg0.method8316(0, Static328.aClass87_6, local12.aClass11_Sub1_Sub4_1, true, 0, Static312.anInt5690);
			}
		}
		if (arg2 < Static347.anInt6411 && arg3 < Static191.anInt6006) {
			local12 = Static440.aClass217ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass11_Sub1_Sub4_1 != null && local12.aClass11_Sub1_Sub4_1.method8313()) {
				arg0.method8316(Static312.anInt5690, Static328.aClass87_6, local12.aClass11_Sub1_Sub4_1, true, 0, Static312.anInt5690);
			}
		}
		if (arg2 < Static347.anInt6411 && arg3 > 0) {
			local12 = Static440.aClass217ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass11_Sub1_Sub4_1 != null && local12.aClass11_Sub1_Sub4_1.method8313()) {
				arg0.method8316(Static312.anInt5690, Static328.aClass87_6, local12.aClass11_Sub1_Sub4_1, true, 0, -Static312.anInt5690);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)Z")
	public static boolean method3854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public static void method3855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 + Static451.anInt7933;
		@Pc(15) int local15 = arg2 + Static470.anInt8063;
		if (Static440.aClass217ArrayArrayArray3 == null || arg1 < 0 || arg2 < 0 || arg1 >= Static3.anInt46 || arg2 >= Static270.anInt5194 || Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 0 && arg0 != Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124) {
			return;
		}
		@Pc(60) long local60 = (long) (local15 << 14 | arg0 << 28 | local10);
		@Pc(66) Class2_Sub44 local66 = (Class2_Sub44) Static64.aClass222_5.method5468(local60);
		if (local66 == null) {
			Static346.method5399(arg0, arg1, arg2);
			return;
		}
		@Pc(80) Class2_Sub6 local80 = (Class2_Sub6) local66.aClass238_59.method5833();
		if (local80 == null) {
			Static346.method5399(arg0, arg1, arg2);
			return;
		}
		@Pc(94) Class11_Sub1_Sub5_Sub1 local94 = (Class11_Sub1_Sub5_Sub1) Static346.method5399(arg0, arg1, arg2);
		if (local94 == null) {
			local94 = new Class11_Sub1_Sub5_Sub1(arg1 << 9, Static331.aClass112Array3[arg0].method7819(arg2, arg1), arg2 << 9, arg0, arg0);
		} else {
			local94.anInt4485 = local94.anInt4499 = -1;
		}
		local94.anInt4495 = local80.anInt842;
		local94.anInt4493 = local80.anInt841;
		label56: while (true) {
			@Pc(137) Class2_Sub6 local137 = (Class2_Sub6) local66.aClass238_59.method5838();
			if (local137 == null) {
				break;
			}
			if (local137.anInt842 != local94.anInt4495) {
				local94.anInt4485 = local137.anInt842;
				local94.anInt4488 = local137.anInt841;
				while (true) {
					@Pc(162) Class2_Sub6 local162 = (Class2_Sub6) local66.aClass238_59.method5838();
					if (local162 == null) {
						break label56;
					}
					if (local162.anInt842 != local94.anInt4495 && local162.anInt842 != local94.anInt4485) {
						local94.anInt4499 = local162.anInt842;
						local94.lb = local162.anInt841;
					}
				}
			}
		}
		@Pc(210) int local210 = Static582.method8038(arg0, (arg1 << 9) + 256, (arg2 << 9) + 256);
		local94.anInt9929 = arg2 << 9;
		local94.aByte125 = (byte) arg0;
		local94.anInt9925 = arg1 << 9;
		local94.aByte124 = (byte) arg0;
		local94.anInt4491 = 0;
		local94.anInt9930 = local210;
		if (Static471.method6782(arg2, arg1)) {
			local94.aByte125++;
		}
		Static267.method6453(arg0, arg1, arg2, local210, local94);
	}
}
