import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!la", name = "Lb", descriptor = "Lclient!tb;")
	public Class1_Sub2_Sub21 aClass1_Sub2_Sub21_1;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1894() {
		return this.aClass1_Sub2_Sub21_1 != null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass1_Sub2_Sub21_1 == null) {
			return;
		}
		@Pc(25) Class1_Sub2_Sub22 local25 = super.anInt2485 != -1 && super.anInt2472 == 0 ? Static85.method2622(super.anInt2485) : null;
		@Pc(43) Class1_Sub2_Sub22 local43 = super.anInt2504 == -1 || super.anInt2449 == super.anInt2504 && local25 != null ? null : Static85.method2622(super.anInt2504);
		@Pc(54) Class5_Sub1 local54 = this.aClass1_Sub2_Sub21_1.method3048(super.anInt2490, local25, super.anInt2493, local43);
		if (local54 == null) {
			return;
		}
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = 0;
		super.anInt2503 = local54.method3163();
		@Pc(67) int local67 = 0;
		if (this.aClass1_Sub2_Sub21_1.aShort19 != 0 && this.aClass1_Sub2_Sub21_1.aShort20 != 0) {
			@Pc(82) int local82 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg0];
			@Pc(86) int local86 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg0];
			@Pc(90) short local90 = this.aClass1_Sub2_Sub21_1.aShort20;
			@Pc(94) short local94 = this.aClass1_Sub2_Sub21_1.aShort19;
			@Pc(99) int local99 = -local94 / 2;
			@Pc(104) int local104 = -local90 / 2;
			@Pc(108) int local108 = local94 / 2;
			@Pc(113) int local113 = -local90 / 2;
			@Pc(123) int local123 = local82 * local104 + local86 * local99 >> 16;
			@Pc(133) int local133 = local82 * local113 + local86 * local108 >> 16;
			@Pc(144) int local144 = local86 * local113 - local82 * local108 >> 16;
			@Pc(155) int local155 = local104 * local86 - local99 * local82 >> 16;
			@Pc(167) int local167 = Static37.method699(local155 + super.anInt2448, Static170.anInt3799, local123 + super.anInt2501);
			@Pc(180) int local180 = Static37.method699(super.anInt2448 + local144, Static170.anInt3799, super.anInt2501 + local133);
			@Pc(185) int local185 = -local94 / 2;
			@Pc(189) int local189 = local90 / 2;
			@Pc(200) int local200 = local86 * local189 - local82 * local185 >> 16;
			@Pc(204) int local204 = local94 / 2;
			@Pc(208) int local208 = local90 / 2;
			@Pc(219) int local219 = local208 * local82 + local86 * local204 >> 16;
			@Pc(229) int local229 = local185 * local86 + local189 * local82 >> 16;
			@Pc(242) int local242 = Static37.method699(local200 + super.anInt2448, Static170.anInt3799, super.anInt2501 + local229);
			@Pc(253) int local253 = local86 * local208 - local82 * local204 >> 16;
			@Pc(260) int local260 = local180 <= local167 ? local180 : local167;
			@Pc(272) int local272 = Static37.method699(super.anInt2448 + local253, Static170.anInt3799, super.anInt2501 + local219);
			local67 = local167 + local272;
			@Pc(288) int local288 = local242 > local167 ? local167 : local242;
			@Pc(299) int local299 = local242 >= local272 ? local272 : local242;
			local59 = (int) (Math.atan2((double) (local260 - local299), (double) local90) * 325.95D) & 0x7FF;
			if (local59 != 0) {
				local54.method156(local59);
			}
			if (local180 + local242 < local67) {
				local67 = local180 + local242;
			}
			@Pc(343) int local343 = local180 >= local272 ? local272 : local180;
			local61 = (int) (Math.atan2((double) (local288 - local343), (double) local94) * 325.95D) & 0x7FF;
			if (local61 != 0) {
				local54.method165(local61);
			}
			local67 = (local67 >> 1) - super.anInt2459;
			if (local67 != 0) {
				local54.method160(0, local67, 0);
			}
		}
		@Pc(382) Class5_Sub1 local382 = null;
		if (super.anInt2458 != -1 && super.anInt2471 != -1) {
			@Pc(396) Class1_Sub2_Sub3 local396 = Static72.method1365(super.anInt2458);
			local382 = local396.method299(super.anInt2471);
			if (local382 != null) {
				local382.method160(0, -super.anInt2461, 0);
				if (local396.aBoolean13) {
					if (local59 != 0) {
						local382.method156(local59);
					}
					if (local61 != 0) {
						local382.method165(local61);
					}
					if (local67 != 0) {
						local382.method160(0, local67, 0);
					}
				}
			}
		}
		if (local382 != null) {
			local54 = ((Class5_Sub1_Sub1) local54).method178(local382);
		}
		if (this.aClass1_Sub2_Sub21_1.anInt3966 == 1) {
			local54.aBoolean6 = true;
		}
		local54.method3164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
	@Override
	public int method3163() {
		return super.anInt2503;
	}
}
