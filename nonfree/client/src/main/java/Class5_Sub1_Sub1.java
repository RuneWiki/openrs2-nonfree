import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ib", name = "Ib", descriptor = "Lclient!ei;")
	public Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!ib", name = "Kb", descriptor = "Lclient!th;")
	public Class111 aClass111_2;

	@OriginalMember(owner = "client!ib", name = "Nb", descriptor = "I")
	public int anInt1937;

	@OriginalMember(owner = "client!ib", name = "Ob", descriptor = "I")
	public int anInt1938;

	@OriginalMember(owner = "client!ib", name = "Sb", descriptor = "I")
	public int anInt1942;

	@OriginalMember(owner = "client!ib", name = "Tb", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!ib", name = "gc", descriptor = "I")
	public int anInt1953;

	@OriginalMember(owner = "client!ib", name = "kc", descriptor = "I")
	public int anInt1957;

	@OriginalMember(owner = "client!ib", name = "pc", descriptor = "I")
	public int anInt1959;

	@OriginalMember(owner = "client!ib", name = "qc", descriptor = "Lclient!ia;")
	public Class51 aClass51_619;

	@OriginalMember(owner = "client!ib", name = "Xb", descriptor = "I")
	public int anInt1946 = 0;

	@OriginalMember(owner = "client!ib", name = "Rb", descriptor = "I")
	public int anInt1941 = 0;

	@OriginalMember(owner = "client!ib", name = "Wb", descriptor = "I")
	public int anInt1945 = 0;

	@OriginalMember(owner = "client!ib", name = "bc", descriptor = "I")
	public int anInt1950 = 0;

	@OriginalMember(owner = "client!ib", name = "cc", descriptor = "S")
	private short aShort8 = 0;

	@OriginalMember(owner = "client!ib", name = "Pb", descriptor = "I")
	public int anInt1939 = -1;

	@OriginalMember(owner = "client!ib", name = "Mb", descriptor = "S")
	private short aShort7 = 0;

	@OriginalMember(owner = "client!ib", name = "Vb", descriptor = "I")
	public int anInt1944 = -1;

	@OriginalMember(owner = "client!ib", name = "hc", descriptor = "I")
	public int anInt1954 = 0;

	@OriginalMember(owner = "client!ib", name = "ic", descriptor = "I")
	public int anInt1955 = -1;

	@OriginalMember(owner = "client!ib", name = "Qb", descriptor = "I")
	public int anInt1940 = -1;

	@OriginalMember(owner = "client!ib", name = "ec", descriptor = "I")
	public int anInt1952 = 0;

	@OriginalMember(owner = "client!ib", name = "mc", descriptor = "Z")
	public boolean aBoolean85 = false;

	@OriginalMember(owner = "client!ib", name = "oc", descriptor = "I")
	public int anInt1958 = -1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIBIILclient!ei;IIII)V")
	private void method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5_Sub2 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg5 * arg5 + arg3 * arg3;
		if (local11 < 16 || local11 > 360000) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg5) * 325.949D) & 0x7FF;
		@Pc(51) Class5_Sub2 local51 = Static166.method2844(super.anInt3598, local33, super.anInt3577, arg8, super.anInt3624, arg7);
		if (local51 != null) {
			local51.method3679(0, arg0, arg1, arg9, arg2, arg11, arg4, arg6, -1L);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass111_2 == null) {
			return;
		}
		@Pc(26) Class40 local26 = super.anInt3585 != -1 && super.anInt3599 == 0 ? Static32.method546(super.anInt3585) : null;
		@Pc(51) Class40 local51 = super.anInt3620 == -1 || this.aBoolean85 || super.anInt3618 == super.anInt3620 && local26 != null ? null : Static32.method546(super.anInt3620);
		@Pc(62) Class5_Sub2 local62 = this.aClass111_2.method3278(super.anInt3576, local51, super.anInt3632, local26);
		if (local62 == null) {
			return;
		}
		super.anInt3606 = local62.method3680();
		if (Static21.aBoolean22) {
			@Pc(101) Class5_Sub2 local101 = Static134.method2406(0, 160, 240, local51 == null ? local26 : local51, super.anInt3577, super.anInt3624, super.aBoolean167, local62, 0, 1, arg0, local51 == null ? super.anInt3576 : super.anInt3632, super.anInt3598);
			local101.method3679(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
		}
		@Pc(179) int local179;
		@Pc(169) int local169;
		@Pc(120) int local120;
		@Pc(233) int local233;
		if (Static73.aClass5_Sub1_Sub1_1 == this) {
			for (local120 = Static36.aClass104Array1.length - 1; local120 >= 0; local120--) {
				@Pc(126) Class104 local126 = Static36.aClass104Array1[local120];
				if (local126 != null && local126.anInt4015 != -1) {
					if (local126.anInt4003 == 1 && local126.anInt4001 >= 0 && local126.anInt4001 < Static168.aClass5_Sub1_Sub2Array1.length) {
						@Pc(156) Class5_Sub1_Sub2 local156 = Static168.aClass5_Sub1_Sub2Array1[local126.anInt4001];
						if (local156 != null) {
							local169 = local156.anInt3598 / 32 - Static73.aClass5_Sub1_Sub1_1.anInt3598 / 32;
							local179 = local156.anInt3624 / 32 - Static73.aClass5_Sub1_Sub1_1.anInt3624 / 32;
							this.method1459(arg1, arg2, arg4, local179, arg6, local169, arg7, local62, local126.anInt4015, arg3, arg0, arg5);
						}
					}
					if (local126.anInt4003 == 2) {
						local179 = (local126.anInt4014 - Static118.anInt2541) * 4 + 2 - Static73.aClass5_Sub1_Sub1_1.anInt3598 / 32;
						local233 = (local126.anInt4002 - Static198.anInt4217) * 4 + 2 - Static73.aClass5_Sub1_Sub1_1.anInt3624 / 32;
						this.method1459(arg1, arg2, arg4, local233, arg6, local179, arg7, local62, local126.anInt4015, arg3, arg0, arg5);
					}
					if (local126.anInt4003 == 10 && local126.anInt4001 >= 0 && local126.anInt4001 < Static191.aClass5_Sub1_Sub1Array1.length) {
						@Pc(273) Class5_Sub1_Sub1 local273 = Static191.aClass5_Sub1_Sub1Array1[local126.anInt4001];
						if (local273 != null) {
							local179 = local273.anInt3624 / 32 - Static73.aClass5_Sub1_Sub1_1.anInt3624 / 32;
							local169 = local273.anInt3598 / 32 - Static73.aClass5_Sub1_Sub1_1.anInt3598 / 32;
							this.method1459(arg1, arg2, arg4, local179, arg6, local169, arg7, local62, local126.anInt4015, arg3, arg0, arg5);
						}
					}
				}
			}
		}
		local120 = 0;
		@Pc(323) int local323 = 0;
		local233 = 0;
		if (this.aShort7 != 0 && this.aShort8 != 0) {
			local169 = Class94.anIntArray277[arg0];
			local179 = Class94.anIntArray278[arg0];
			@Pc(342) short local342 = this.aShort7;
			@Pc(345) short local345 = this.aShort8;
			@Pc(350) int local350 = -local342 / 2;
			@Pc(355) int local355 = -local345 / 2;
			@Pc(366) int local366 = local355 * local179 + local169 * local350 >> 16;
			@Pc(377) int local377 = local169 * local355 - local179 * local350 >> 16;
			@Pc(382) int local382 = -local345 / 2;
			@Pc(395) int local395 = Static26.method2454(Static197.anInt2422, super.anInt3598 + local377, local366 + super.anInt3624);
			@Pc(399) int local399 = local342 / 2;
			@Pc(410) int local410 = local169 * local382 - local179 * local399 >> 16;
			@Pc(420) int local420 = local169 * local399 + local382 * local179 >> 16;
			@Pc(425) int local425 = -local342 / 2;
			@Pc(429) int local429 = local345 / 2;
			@Pc(442) int local442 = Static26.method2454(Static197.anInt2422, super.anInt3598 + local410, super.anInt3624 - -local420);
			@Pc(453) int local453 = local169 * local429 - local179 * local425 >> 16;
			@Pc(457) int local457 = local345 / 2;
			@Pc(461) int local461 = local342 / 2;
			@Pc(472) int local472 = local169 * local457 - local179 * local461 >> 16;
			@Pc(482) int local482 = local169 * local461 + local457 * local179 >> 16;
			@Pc(492) int local492 = local429 * local179 + local169 * local425 >> 16;
			@Pc(499) int local499 = local395 < local442 ? local395 : local442;
			@Pc(511) int local511 = Static26.method2454(Static197.anInt2422, local453 + super.anInt3598, local492 + super.anInt3624);
			@Pc(524) int local524 = Static26.method2454(Static197.anInt2422, super.anInt3598 + local472, local482 + super.anInt3624);
			local233 = local524 + local395;
			@Pc(535) int local535 = local524 <= local442 ? local524 : local442;
			@Pc(546) int local546 = local511 >= local524 ? local524 : local511;
			@Pc(557) int local557 = local511 <= local395 ? local511 : local395;
			if (local511 + local442 < local233) {
				local233 = local511 + local442;
			}
			local120 = (int) (Math.atan2((double) (local499 - local546), (double) local345) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				local62.method2919(local120);
			}
			local323 = (int) (Math.atan2((double) (local557 - local535), (double) local342) * 325.95D) & 0x7FF;
			if (local323 != 0) {
				local62.method2927(local323);
			}
			local233 = (local233 >> 1) - super.anInt3577;
			if (local233 != 0) {
				local62.method2925(0, local233, 0);
			}
		}
		@Pc(627) Class5_Sub2 local627 = null;
		if (!this.aBoolean85 && super.anInt3622 != -1 && super.anInt3605 != -1) {
			@Pc(644) Class122 local644 = Static103.method3801(super.anInt3622);
			local627 = local644.method3608(super.anInt3605);
			if (local627 != null) {
				local627.method2925(0, -super.anInt3611, 0);
				if (local644.aBoolean209) {
					if (local120 != 0) {
						local627.method2919(local120);
					}
					if (local323 != 0) {
						local627.method2927(local323);
					}
					if (local233 != 0) {
						local627.method2925(0, local233, 0);
					}
				}
			}
		}
		@Pc(684) Class5_Sub2 local684 = null;
		if (!this.aBoolean85 && this.aClass5_Sub2_1 != null) {
			if (Static109.anInt2430 >= this.anInt1952) {
				this.aClass5_Sub2_1 = null;
			}
			if (Static109.anInt2430 >= this.anInt1954 && this.anInt1952 > Static109.anInt2430) {
				local684 = this.aClass5_Sub2_1;
				local684.method2925(this.anInt1942 - super.anInt3624, -super.anInt3577 + this.anInt1943, this.anInt1957 - super.anInt3598);
				if (super.anInt3581 == 512) {
					local684.method2924();
				} else if (super.anInt3581 == 1024) {
					local684.method2921();
				} else if (super.anInt3581 == 1536) {
					local684.method2928();
				}
			}
		}
		if (local627 != null) {
			local62 = ((Class5_Sub2_Sub1) local62).method2934(local627);
		}
		if (local684 != null) {
			local62 = ((Class5_Sub2_Sub1) local62).method2934(local684);
		}
		local62.aBoolean173 = true;
		local62.method3679(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local684 == null) {
			return;
		}
		if (super.anInt3581 == 512) {
			local684.method2928();
		} else if (super.anInt3581 == 1024) {
			local684.method2921();
		} else if (super.anInt3581 == 1536) {
			local684.method2924();
		}
		local684.method2925(super.anInt3624 - this.anInt1942, super.anInt3577 - this.anInt1943, super.anInt3598 - this.anInt1957);
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2793() {
		return this.aClass111_2 != null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!k;)V")
	public void method1460(@OriginalArg(1) Class1_Sub16 arg0) {
		arg0.anInt4860 = 0;
		@Pc(12) int local12 = arg0.method3793();
		if ((local12 & 0x2) == 2) {
			this.aShort7 = (short) (arg0.method3793() << 2);
			this.aShort8 = (short) (arg0.method3793() << 2);
		} else {
			this.aShort8 = 0;
			this.aShort7 = 0;
		}
		super.anInt3584 = (local12 >> 3) + 1;
		this.anInt1944 = arg0.method3802();
		@Pc(57) int local57 = local12 & 0x1;
		@Pc(68) boolean local68 = (local12 & 0x4) != 0;
		this.anInt1958 = arg0.method3802();
		@Pc(76) int[] local76 = new int[12];
		@Pc(78) int local78 = -1;
		this.anInt1945 = 0;
		@Pc(101) int local101;
		@Pc(107) int local107;
		@Pc(143) int local143;
		for (@Pc(83) int local83 = 0; local83 < 12; local83++) {
			@Pc(89) int local89 = arg0.method3793();
			if (local89 == 0) {
				local76[local83] = 0;
			} else {
				local101 = arg0.method3793();
				local107 = local101 + (local89 << 8);
				if (local83 == 0 && local107 == 65535) {
					local78 = arg0.method3805();
					break;
				}
				if (local107 >= 32768) {
					local107 = Static213.anIntArray342[local107 - 32768];
					local76[local83] = local107 | 0x40000000;
					local143 = Static36.method637(local107).anInt3666;
					if (local143 != 0) {
						this.anInt1945 = local143;
					}
				} else {
					local76[local83] = local107 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(168) int[] local168 = new int[5];
		for (local101 = 0; local101 < 5; local101++) {
			local107 = arg0.method3793();
			if (local107 < 0 || local107 >= Static212.aShortArrayArray6[local101].length) {
				local107 = 0;
			}
			local168[local101] = local107;
		}
		super.anInt3618 = arg0.method3805();
		if (super.anInt3618 == 65535) {
			super.anInt3618 = -1;
		}
		super.anInt3580 = arg0.method3805();
		if (super.anInt3580 == 65535) {
			super.anInt3580 = -1;
		}
		super.anInt3625 = super.anInt3580;
		super.anInt3600 = arg0.method3805();
		if (super.anInt3600 == 65535) {
			super.anInt3600 = -1;
		}
		super.anInt3604 = arg0.method3805();
		if (super.anInt3604 == 65535) {
			super.anInt3604 = -1;
		}
		super.anInt3629 = arg0.method3805();
		if (super.anInt3629 == 65535) {
			super.anInt3629 = -1;
		}
		super.anInt3623 = arg0.method3805();
		if (super.anInt3623 == 65535) {
			super.anInt3623 = -1;
		}
		super.anInt3591 = arg0.method3805();
		if (super.anInt3591 == 65535) {
			super.anInt3591 = -1;
		}
		this.aClass51_619 = Static202.method3323(arg0.method3791()).method1437();
		this.anInt1941 = arg0.method3793();
		if (local68) {
			this.anInt1946 = arg0.method3805();
		} else {
			this.anInt1946 = 0;
		}
		local107 = this.anInt1950;
		this.anInt1950 = arg0.method3793();
		if (this.anInt1950 == 0) {
			Static100.method1676(this);
		} else {
			local143 = this.anInt1939;
			@Pc(337) int local337 = this.anInt1940;
			@Pc(340) int local340 = this.anInt1955;
			this.anInt1939 = arg0.method3805();
			this.anInt1940 = arg0.method3805();
			this.anInt1955 = arg0.method3805();
			if (this.anInt1950 != local107 || this.anInt1939 != local143 || local337 != this.anInt1940 || local340 != this.anInt1955) {
				Static115.method1935(this);
			}
		}
		if (this.aClass111_2 == null) {
			this.aClass111_2 = new Class111();
		}
		this.aClass111_2.method3282(local78, local168, local76, local57 == 1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
	@Override
	public int method3680() {
		return super.anInt3606;
	}
}
