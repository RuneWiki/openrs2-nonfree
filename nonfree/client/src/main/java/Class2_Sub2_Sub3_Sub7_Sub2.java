import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub2_Sub3_Sub7_Sub2 extends Class2_Sub2_Sub3_Sub7 {

	@OriginalMember(owner = "client!u", name = "vc", descriptor = "I")
	public int anInt3586;

	@OriginalMember(owner = "client!u", name = "xc", descriptor = "I")
	public int anInt3587;

	@OriginalMember(owner = "client!u", name = "Cc", descriptor = "I")
	public int anInt3590;

	@OriginalMember(owner = "client!u", name = "Dc", descriptor = "Lclient!lf;")
	public Class49 aClass49_1606;

	@OriginalMember(owner = "client!u", name = "Ec", descriptor = "Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 aClass2_Sub2_Sub3_Sub4_1;

	@OriginalMember(owner = "client!u", name = "Gc", descriptor = "I")
	public int anInt3591;

	@OriginalMember(owner = "client!u", name = "Uc", descriptor = "I")
	public int anInt3597;

	@OriginalMember(owner = "client!u", name = "Zc", descriptor = "I")
	public int anInt3601;

	@OriginalMember(owner = "client!u", name = "ed", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!u", name = "id", descriptor = "Lclient!be;")
	public Class10 aClass10_2;

	@OriginalMember(owner = "client!u", name = "Mc", descriptor = "I")
	public int anInt3593 = -1;

	@OriginalMember(owner = "client!u", name = "Oc", descriptor = "I")
	public int anInt3594 = 0;

	@OriginalMember(owner = "client!u", name = "Fc", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!u", name = "Sc", descriptor = "S")
	private short aShort35 = 0;

	@OriginalMember(owner = "client!u", name = "Lc", descriptor = "I")
	public int anInt3592 = 0;

	@OriginalMember(owner = "client!u", name = "Tc", descriptor = "I")
	public int anInt3596 = -1;

	@OriginalMember(owner = "client!u", name = "Xc", descriptor = "I")
	public int anInt3599 = 0;

	@OriginalMember(owner = "client!u", name = "hd", descriptor = "I")
	public int anInt3608 = 0;

	@OriginalMember(owner = "client!u", name = "Vc", descriptor = "S")
	private short aShort36 = 0;

	@OriginalMember(owner = "client!u", name = "fd", descriptor = "I")
	public int anInt3606 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLclient!ja;)V")
	public void method2741(@OriginalArg(1) Class2_Sub13 arg0) {
		arg0.anInt3940 = 0;
		@Pc(12) int local12 = arg0.method2962();
		if ((local12 & 0x2) == 2) {
			this.aShort35 = (short) (arg0.method2962() << 2);
			this.aShort36 = (short) (arg0.method2962() << 2);
		} else {
			this.aShort35 = 0;
			this.aShort36 = 0;
		}
		@Pc(45) int local45 = local12 & 0x1;
		super.anInt3581 = (local12 >> 3) + 1;
		@Pc(60) boolean local60 = (local12 & 0x4) != 0;
		this.anInt3593 = arg0.method2948();
		@Pc(67) int local67 = -1;
		@Pc(70) int[] local70 = new int[12];
		this.anInt3596 = arg0.method2948();
		this.anInt3592 = 0;
		@Pc(101) int local101;
		@Pc(107) int local107;
		for (@Pc(80) int local80 = 0; local80 < 12; local80++) {
			@Pc(86) int local86 = arg0.method2962();
			if (local86 == 0) {
				local70[local80] = 0;
			} else {
				local101 = arg0.method2962();
				local107 = local101 + (local86 << 8);
				if (local80 == 0 && local107 == 65535) {
					local67 = arg0.method2933();
					break;
				}
				if (local107 >= 32768) {
					local107 = Static178.anIntArray365[local107 - 32768];
					local70[local80] = local107 | 0x40000000;
					@Pc(143) int local143 = Static113.method1913(local107).anInt1621;
					if (local143 != 0) {
						this.anInt3592 = local143;
					}
				} else {
					local70[local80] = local107 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(167) int[] local167 = new int[5];
		for (local101 = 0; local101 < 5; local101++) {
			local107 = arg0.method2962();
			if (local107 < 0 || Static75.aShortArrayArray3[local101].length <= local107) {
				local107 = 0;
			}
			local167[local101] = local107;
		}
		super.anInt3525 = arg0.method2933();
		if (super.anInt3525 == 65535) {
			super.anInt3525 = -1;
		}
		super.anInt3528 = arg0.method2933();
		if (super.anInt3528 == 65535) {
			super.anInt3528 = -1;
		}
		super.anInt3551 = super.anInt3528;
		super.anInt3585 = arg0.method2933();
		if (super.anInt3585 == 65535) {
			super.anInt3585 = -1;
		}
		super.anInt3539 = arg0.method2933();
		if (super.anInt3539 == 65535) {
			super.anInt3539 = -1;
		}
		super.anInt3547 = arg0.method2933();
		if (super.anInt3547 == 65535) {
			super.anInt3547 = -1;
		}
		super.anInt3573 = arg0.method2933();
		if (super.anInt3573 == 65535) {
			super.anInt3573 = -1;
		}
		super.anInt3560 = arg0.method2933();
		if (super.anInt3560 == 65535) {
			super.anInt3560 = -1;
		}
		this.aClass49_1606 = Static120.method2046(arg0.method2936()).method1677();
		this.anInt3599 = arg0.method2962();
		if (local60) {
			this.anInt3608 = arg0.method2933();
		}
		if (this.aClass10_2 == null) {
			this.aClass10_2 = new Class10();
		}
		this.aClass10_2.method212(local67, local45 == 1, local70, local167);
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2733() {
		return this.aClass10_2 != null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass10_2 == null) {
			return;
		}
		@Pc(27) Class2_Sub2_Sub4 local27 = super.anInt3568 != -1 && super.anInt3548 == 0 ? Static29.method543(super.anInt3568) : null;
		@Pc(48) Class2_Sub2_Sub4 local48 = super.anInt3554 == -1 || this.aBoolean151 || super.anInt3554 == super.anInt3525 && local27 != null ? null : Static29.method543(super.anInt3554);
		@Pc(59) Class2_Sub2_Sub3_Sub4 local59 = this.aClass10_2.method208(super.anInt3550, super.anInt3538, local27, local48);
		if (local59 == null) {
			return;
		}
		local59.method1042();
		super.aShort34 = local59.aShort34;
		if (this.aShort35 != 0 && this.aShort36 != 0) {
			@Pc(78) int local78 = Class2_Sub2_Sub2_Sub4.anIntArray217[arg0];
			@Pc(82) int local82 = Class2_Sub2_Sub2_Sub4.anIntArray218[arg0];
			@Pc(85) short local85 = this.aShort35;
			@Pc(88) short local88 = this.aShort36;
			@Pc(93) int local93 = -local88 / 2;
			@Pc(98) int local98 = -local85 / 2;
			@Pc(108) int local108 = local78 * local93 + local98 * local82 >> 16;
			@Pc(119) int local119 = local82 * local93 - local78 * local98 >> 16;
			@Pc(132) int local132 = Static18.method346(super.anInt3578 + local119, Static66.anInt1396, super.anInt3529 + local108);
			@Pc(136) int local136 = local85 / 2;
			@Pc(141) int local141 = -local88 / 2;
			@Pc(151) int local151 = local136 * local82 + local78 * local141 >> 16;
			@Pc(161) int local161 = local82 * local141 - local136 * local78 >> 16;
			@Pc(166) int local166 = -local85 / 2;
			@Pc(170) int local170 = local88 / 2;
			@Pc(183) int local183 = Static18.method346(super.anInt3578 + local161, Static66.anInt1396, super.anInt3529 + local151);
			@Pc(193) int local193 = local170 * local82 - local78 * local166 >> 16;
			@Pc(203) int local203 = local82 * local166 + local78 * local170 >> 16;
			@Pc(215) int local215 = Static18.method346(local193 + super.anInt3578, Static66.anInt1396, local203 + super.anInt3529);
			@Pc(219) int local219 = local85 / 2;
			@Pc(223) int local223 = local88 / 2;
			@Pc(234) int local234 = local223 * local78 + local219 * local82 >> 16;
			@Pc(244) int local244 = local82 * local223 - local219 * local78 >> 16;
			@Pc(257) int local257 = Static18.method346(local244 + super.anInt3578, Static66.anInt1396, super.anInt3529 + local234);
			@Pc(264) int local264 = local257 <= local183 ? local257 : local183;
			@Pc(275) int local275 = local183 > local132 ? local132 : local183;
			@Pc(286) int local286 = local132 >= local215 ? local215 : local132;
			@Pc(293) int local293 = local215 < local257 ? local215 : local257;
			@Pc(307) int local307 = (int) (Math.atan2((double) (local275 - local293), (double) local88) * 320.0D) & 0x7FF;
			local59.method1043(local307);
			@Pc(324) int local324 = (int) (Math.atan2((double) (local286 - local264), (double) local85) * 320.0D) & 0x7FF;
			local59.method1044(local324);
			@Pc(338) int local338 = (local275 + local293 + local264 + local286) / 4;
			local59.method1046(0, local338 - super.anInt3558, 0);
		}
		@Pc(349) Class2_Sub2_Sub3_Sub4 local349 = null;
		@Pc(351) Class2_Sub2_Sub3_Sub4 local351 = null;
		if (!this.aBoolean151 && super.anInt3557 != -1 && super.anInt3569 != -1) {
			local351 = Static170.method2831(super.anInt3557).method1698(super.anInt3569);
			if (local351 != null) {
				local351.method1046(0, -super.anInt3577, 0);
			}
		}
		if (!this.aBoolean151 && this.aClass2_Sub2_Sub3_Sub4_1 != null) {
			if (Static127.anInt2757 >= this.anInt3594) {
				this.aClass2_Sub2_Sub3_Sub4_1 = null;
			}
			if (this.anInt3606 <= Static127.anInt2757 && this.anInt3594 > Static127.anInt2757) {
				local349 = this.aClass2_Sub2_Sub3_Sub4_1;
				local349.method1046(this.anInt3590 - super.anInt3529, -super.anInt3558 + this.anInt3605, this.anInt3601 - super.anInt3578);
				if (super.anInt3571 == 512) {
					local349.method1053();
					local349.method1053();
					local349.method1053();
				} else if (super.anInt3571 == 1024) {
					local349.method1053();
					local349.method1053();
				} else if (super.anInt3571 == 1536) {
					local349.method1053();
				}
			}
		}
		if (local351 != null) {
			local59 = ((Class2_Sub2_Sub3_Sub4_Sub1) local59).method1064(local351);
		}
		if (local349 != null) {
			local59 = ((Class2_Sub2_Sub3_Sub4_Sub1) local59).method1064(local349);
		}
		local59.aBoolean52 = true;
		local59.method2726(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local349 == null) {
			return;
		}
		if (super.anInt3571 == 512) {
			local349.method1053();
		} else if (super.anInt3571 == 1024) {
			local349.method1053();
			local349.method1053();
		} else if (super.anInt3571 == 1536) {
			local349.method1053();
			local349.method1053();
			local349.method1053();
		}
		local349.method1046(super.anInt3529 - this.anInt3590, -this.anInt3605 + super.anInt3558, super.anInt3578 - this.anInt3601);
	}
}
