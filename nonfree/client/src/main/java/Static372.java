import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_74 = new Class208(24, 7);

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
	public static void method7364() {
		@Pc(9) int local9 = Static636.anInt10648 * 512 + 256;
		@Pc(15) int local15 = Static16.anInt283 * 512 + 256;
		@Pc(23) int local23 = Static138.method2248(local9, Static175.anInt3636, local15) - Static542.anInt9328;
		if (Static551.anInt9406 < 100) {
			if (Static580.anInt9662 < local9) {
				Static580.anInt9662 += Static447.anInt8023 + (local9 - Static580.anInt9662) * Static551.anInt9406 / 1000;
				if (Static580.anInt9662 > local9) {
					Static580.anInt9662 = local9;
				}
			}
			if (Static580.anInt9662 > local9) {
				Static580.anInt9662 -= Static447.anInt8023 + (Static580.anInt9662 - local9) * Static551.anInt9406 / 1000;
				if (Static580.anInt9662 < local9) {
					Static580.anInt9662 = local9;
				}
			}
			if (local23 > Static428.anInt7788) {
				Static428.anInt7788 += Static551.anInt9406 * (local23 - Static428.anInt7788) / 1000 + Static447.anInt8023;
				if (Static428.anInt7788 > local23) {
					Static428.anInt7788 = local23;
				}
			}
			if (local23 < Static428.anInt7788) {
				Static428.anInt7788 -= (Static428.anInt7788 - local23) * Static551.anInt9406 / 1000 + Static447.anInt8023;
				if (Static428.anInt7788 < local23) {
					Static428.anInt7788 = local23;
				}
			}
			if (Static524.anInt9123 < local15) {
				Static524.anInt9123 += Static551.anInt9406 * (local15 - Static524.anInt9123) / 1000 + Static447.anInt8023;
				if (local15 < Static524.anInt9123) {
					Static524.anInt9123 = local15;
				}
			}
			if (local15 < Static524.anInt9123) {
				Static524.anInt9123 -= (Static524.anInt9123 - local15) * Static551.anInt9406 / 1000 + Static447.anInt8023;
				if (Static524.anInt9123 < local15) {
					Static524.anInt9123 = local15;
				}
			}
		} else {
			Static580.anInt9662 = Static636.anInt10648 * 512 + 256;
			Static524.anInt9123 = Static16.anInt283 * 512 + 256;
			Static428.anInt7788 = Static138.method2248(Static580.anInt9662, Static175.anInt3636, Static524.anInt9123) - Static542.anInt9328;
		}
		local15 = Static81.anInt1699 * 512 + 256;
		local9 = Static80.anInt1683 * 512 + 256;
		local23 = Static138.method2248(local9, Static175.anInt3636, local15) - Static26.anInt536;
		@Pc(219) int local219 = local9 - Static580.anInt9662;
		@Pc(224) int local224 = local23 - Static428.anInt7788;
		@Pc(229) int local229 = local15 - Static524.anInt9123;
		@Pc(240) int local240 = (int) Math.sqrt((double) (local229 * local229 + local219 * local219));
		@Pc(251) int local251 = (int) (Math.atan2((double) local224, (double) local240) * 2607.5945876176133D) & 0x3FFF;
		if (local251 < 1024) {
			local251 = 1024;
		}
		@Pc(274) int local274 = (int) (-2607.5945876176133D * Math.atan2((double) local219, (double) local229)) & 0x3FFF;
		if (local251 > 3072) {
			local251 = 3072;
		}
		if (Static263.anInt5239 < local251) {
			Static263.anInt5239 += Static358.anInt6653 + Static222.anInt4352 * (local251 - Static263.anInt5239 >> 3) / 1000 << 3;
			if (local251 < Static263.anInt5239) {
				Static263.anInt5239 = local251;
			}
		}
		if (Static263.anInt5239 > local251) {
			Static263.anInt5239 -= Static358.anInt6653 + (Static263.anInt5239 - local251 >> 3) * Static222.anInt4352 / 1000 << 3;
			if (Static263.anInt5239 < local251) {
				Static263.anInt5239 = local251;
			}
		}
		@Pc(337) int local337 = local274 - Static470.anInt8261;
		if (local337 > 8192) {
			local337 -= 16384;
		}
		if (local337 < -8192) {
			local337 += 16384;
		}
		local337 >>= 0x3;
		if (local337 > 0) {
			Static470.anInt8261 += Static222.anInt4352 * local337 / 1000 + Static358.anInt6653 << 3;
			Static470.anInt8261 &= 0x3FFF;
		}
		if (local337 < 0) {
			Static470.anInt8261 -= Static222.anInt4352 * -local337 / 1000 + Static358.anInt6653 << 3;
			Static470.anInt8261 &= 0x3FFF;
		}
		@Pc(397) int local397 = local274 - Static470.anInt8261;
		if (local397 > 8192) {
			local397 -= 16384;
		}
		if (local397 < -8192) {
			local397 += 16384;
		}
		Static9.anInt193 = 0;
		if (local397 < 0 && local337 > 0 || local397 > 0 && local337 < 0) {
			Static470.anInt8261 = local274;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method7365(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return arg0 && arg1 >= 0 ? Static202.method3548(arg0, arg1) : Integer.toString(arg1);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIZ)V")
	public static void method7366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static525.method7812(false, true, local35);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!vs;ZZ)V")
	public static void method7368(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean727 = arg1;
		if (Static101.aBoolean145) {
			Static322.aClass352Array1[Static322.aClass352Array1.length - 1].method8364(arg0);
		} else {
			Static242.method4189(arg0, Static424.aClass6_Sub1Array4);
		}
	}
}
