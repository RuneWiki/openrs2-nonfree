import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
	public static int anInt906 = -1;

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_8 = new Class83(64);

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!iu;IB)V")
	public static void method778(@OriginalArg(0) Class4_Sub20_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = arg0.method3245(1) == 1;
		if (local15) {
			Static401.anIntArray572[Static239.anInt4701++] = arg1;
		}
		@Pc(30) int local30 = arg0.method3245(2);
		@Pc(34) Class11_Sub5_Sub2_Sub1 local34 = Static39.aClass11_Sub5_Sub2_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(151) int local151;
			@Pc(156) int local156;
			@Pc(161) int local161;
			if (local30 == 1) {
				local151 = arg0.method3245(3);
				local156 = local34.anIntArray523[0];
				local161 = local34.anIntArray524[0];
				if (local151 == 0) {
					local156--;
					local161--;
				} else if (local151 == 1) {
					local161--;
				} else if (local151 == 2) {
					local161--;
					local156++;
				} else if (local151 == 3) {
					local156--;
				} else if (local151 == 4) {
					local156++;
				} else if (local151 == 5) {
					local161++;
					local156--;
				} else if (local151 == 6) {
					local161++;
				} else if (local151 == 7) {
					local156++;
					local161++;
				}
				if (local15) {
					local34.anInt4165 = local161;
					local34.anInt4171 = local156;
					local34.aBoolean263 = true;
				} else {
					local34.method3621(Static326.aByteArray82[arg1], local161, local156);
				}
			} else if (local30 == 2) {
				local151 = arg0.method3245(4);
				local156 = local34.anIntArray523[0];
				local161 = local34.anIntArray524[0];
				if (local151 == 0) {
					local161 -= 2;
					local156 -= 2;
				} else if (local151 == 1) {
					local156--;
					local161 -= 2;
				} else if (local151 == 2) {
					local161 -= 2;
				} else if (local151 == 3) {
					local156++;
					local161 -= 2;
				} else if (local151 == 4) {
					local161 -= 2;
					local156 += 2;
				} else if (local151 == 5) {
					local161--;
					local156 -= 2;
				} else if (local151 == 6) {
					local161--;
					local156 += 2;
				} else if (local151 == 7) {
					local156 -= 2;
				} else if (local151 == 8) {
					local156 += 2;
				} else if (local151 == 9) {
					local156 -= 2;
					local161++;
				} else if (local151 == 10) {
					local161++;
					local156 += 2;
				} else if (local151 == 11) {
					local156 -= 2;
					local161 += 2;
				} else if (local151 == 12) {
					local161 += 2;
					local156--;
				} else if (local151 == 13) {
					local161 += 2;
				} else if (local151 == 14) {
					local161 += 2;
					local156++;
				} else if (local151 == 15) {
					local156 += 2;
					local161 += 2;
				}
				if (local15) {
					local34.aBoolean263 = true;
					local34.anInt4171 = local156;
					local34.anInt4165 = local161;
				} else {
					local34.method3621(Static326.aByteArray82[arg1], local161, local156);
				}
			} else {
				local151 = arg0.method3245(1);
				@Pc(427) int local427;
				@Pc(437) int local437;
				@Pc(450) int local450;
				@Pc(457) int local457;
				if (local151 == 0) {
					local156 = arg0.method3245(12);
					local161 = local156 >> 10;
					local427 = local156 >> 5 & 0x1F;
					if (local427 > 15) {
						local427 -= 32;
					}
					local437 = local156 & 0x1F;
					if (local437 > 15) {
						local437 -= 32;
					}
					local450 = local427 + local34.anIntArray523[0];
					local457 = local437 + local34.anIntArray524[0];
					if (local15) {
						local34.aBoolean263 = true;
						local34.anInt4171 = local450;
						local34.anInt4165 = local457;
					} else {
						local34.method3621(Static326.aByteArray82[arg1], local457, local450);
					}
					local34.aByte100 = (byte) (local34.aByte100 + local161 & 0x3);
					if (Static147.anInt3062 == arg1) {
						Static59.anInt1472 = local34.aByte100;
					}
				} else {
					local156 = arg0.method3245(30);
					local161 = local156 >> 28;
					local427 = local156 >> 14 & 0x3FFF;
					local437 = local156 & 0x3FFF;
					local450 = (Static426.anInt7325 + local34.anIntArray523[0] + local427 & 0x3FFF) - Static426.anInt7325;
					local457 = (local34.anIntArray524[0] + Static72.anInt1776 + local437 & 0x3FFF) - Static72.anInt1776;
					if (local15) {
						local34.anInt4165 = local457;
						local34.aBoolean263 = true;
						local34.anInt4171 = local450;
					} else {
						local34.method3621(Static326.aByteArray82[arg1], local457, local450);
					}
					local34.aByte100 = (byte) (local34.aByte100 + local161 & 0x3);
					if (Static147.anInt3062 == arg1) {
						Static59.anInt1472 = local34.aByte100;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean263 = false;
		} else if (arg1 == Static147.anInt3062) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(65) Class112 local65 = Static228.aClass112Array1[arg1] = new Class112();
			local65.anInt3431 = (local34.anIntArray524[0] + Static72.anInt1776 >> 6) + (Static426.anInt7325 + local34.anIntArray523[0] >> 6 << 14) + (local34.aByte100 << 28);
			if (local34.anInt4185 == -1) {
				local65.anInt3432 = local34.aClass102_7.method2899();
			} else {
				local65.anInt3432 = local34.anInt4185;
			}
			local65.anInt3433 = local34.anInt6495;
			local65.aBoolean229 = local34.aBoolean262;
			if (local34.anInt4195 > 0) {
				Static72.method1585(local34);
			}
			Static39.aClass11_Sub5_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method3245(1) != 0) {
				Static237.method3991(arg1, arg0);
			}
		}
	}
}
