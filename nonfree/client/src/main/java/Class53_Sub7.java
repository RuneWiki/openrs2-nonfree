import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class53_Sub7 extends Class53 {

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "Lclient!ne;")
	private Class20_Sub3 aClass20_Sub3_7;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	private int anInt4576 = -32768;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	private int anInt4582 = 0;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
	private int anInt4587 = 0;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	private int anInt4572 = -1;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "Z")
	private boolean aBoolean320 = false;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "Z")
	private boolean aBoolean321 = true;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "Lclient!fe;")
	private Class56_Sub1 aClass56_Sub1_4 = null;

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
	private int anInt4595 = -1;

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	private int anInt4592 = 0;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	private int anInt4573;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
	private int anInt4570;

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
	private int anInt4594;

	@OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
	private int anInt4585;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	private int anInt4578;

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
	private int anInt4588;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	private int anInt4569;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	private int anInt4575;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
	private int anInt4591;

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
	private int anInt4581;

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "Lclient!eg;")
	private Class46 aClass46_3;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIIIZLclient!vc;)V")
	public Class53_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class53 arg8) {
		this.anInt4573 = arg1;
		this.anInt4570 = arg4;
		this.anInt4594 = arg5;
		this.anInt4585 = arg3;
		this.anInt4578 = arg2;
		this.anInt4588 = arg0;
		if (arg8 != null) {
			this.aBoolean319 = true;
			if (arg8 instanceof Class53_Sub7) {
				@Pc(96) Class53_Sub7 local96 = (Class53_Sub7) arg8;
				if (Static94.aBoolean138) {
					local96.method3769();
				}
				this.anInt4569 = local96.anInt4569;
				this.anInt4575 = local96.anInt4575;
				this.anInt4591 = local96.anInt4591;
				this.anInt4581 = local96.anInt4581;
				this.aClass46_3 = local96.aClass46_3;
			} else if (Static94.aBoolean138) {
				@Pc(65) Class184 local65 = Static6.method99(this.anInt4588);
				if (local65.anIntArray631 != null) {
					local65 = local65.method4490();
				}
				if (local65 != null) {
					Static76.method4629(this.anInt4570, 0, this.anInt4578, this.anInt4585, local65, 0, this.anInt4594, this.anInt4573);
				}
			}
		}
		if (this.aBoolean319) {
			this.method3767(arg6);
		}
		if (Static94.aBoolean138 && arg8 != null) {
			this.method3765(true);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class53 local5 = null;
		if (Static94.aBoolean138) {
			local5 = this.method3765(true);
		} else {
			this.method3768(arg4, arg3);
		}
		if (!this.aBoolean320) {
			if (local5 == null) {
				local5 = this.method3772();
			}
			if (local5 == null) {
				return;
			}
			this.method3774(local5);
		}
		if (this.aClass20_Sub3_7 != null) {
			this.aClass20_Sub3_7.method2962(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		@Pc(7) Class53 local7 = this.method3772();
		if (local7 != null) {
			this.method3774(local7);
			local7.method3842(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_7);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)Lclient!vc;")
	private Class53 method3765(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static243.anIntArrayArrayArray13 != Static259.anIntArrayArrayArray14;
		@Pc(17) Class184 local17 = Static6.method99(this.anInt4588);
		if (local17.anIntArray631 != null) {
			local17 = local17.method4490();
		}
		if (local17 == null) {
			if (Static94.aBoolean138 && !local12) {
				this.method3769();
			}
			this.anInt4595 = this.anInt4575;
			this.anInt4572 = -1;
			return null;
		}
		if (!this.aBoolean319 && local17.anInt5554 != this.anInt4572) {
			this.method3767(-1);
		}
		@Pc(63) int local63 = this.anInt4578 & 0x3;
		@Pc(80) int local80;
		@Pc(83) int local83;
		if (local63 == 1 || local63 == 3) {
			local80 = local17.anInt5517;
			local83 = local17.anInt5528;
		} else {
			local80 = local17.anInt5528;
			local83 = local17.anInt5517;
		}
		@Pc(98) int local98 = (local83 >> 1) + this.anInt4594;
		@Pc(107) int local107 = this.anInt4570 + (local80 + 1 >> 1);
		@Pc(114) int local114 = this.anInt4570 + (local80 >> 1);
		@Pc(124) int local124 = this.anInt4594 + (local83 + 1 >> 1);
		this.method3768(local98 * 128, local114 * 128);
		@Pc(176) boolean local176 = !local12 && local17.aBoolean373 && (this.anInt4572 != local17.anInt5554 || (this.anInt4575 != this.anInt4595 || this.aClass46_3 != null && (this.aClass46_3.aBoolean71 || Static269.aBoolean258) && this.anInt4575 != this.anInt4581) && Static114.anInt2298 >= 2);
		if (arg0 && !local176) {
			this.anInt4595 = this.anInt4575;
			this.anInt4572 = local17.anInt5554;
			return null;
		}
		@Pc(199) int local199 = (local80 << 6) + (this.anInt4570 << 7);
		@Pc(202) int[][] local202 = null;
		@Pc(212) int local212 = (this.anInt4594 << 7) + (local83 << 6);
		@Pc(217) int[][] local217 = Static243.anIntArrayArrayArray13[this.anInt4585];
		if (local12) {
			local202 = Static259.anIntArrayArrayArray14[0];
		} else if (this.anInt4585 < 3) {
			local202 = Static243.anIntArrayArrayArray13[this.anInt4585 + 1];
		}
		@Pc(267) int local267 = local217[local114][local98] + local217[local107][local98] + local217[local114][local124] + local217[local107][local124] >> 2;
		if (Static94.aBoolean138 && local176) {
			Static74.method1210(this.aClass56_Sub1_4, this.anInt4582, this.anInt4587, this.anInt4592);
		}
		@Pc(287) boolean local287 = this.aClass56_Sub1_4 == null;
		@Pc(321) Class97 local321;
		if (this.aClass46_3 == null) {
			local321 = local17.method4487(local199, false, this.anInt4573, local267, local217, local202, local176, this.anInt4578, local212, local287 ? Static47.aClass56_Sub1_1 : this.aClass56_Sub1_4);
		} else {
			local321 = local17.method4495(local199, local217, this.anInt4575, local212, local267, local176, this.anInt4578, this.anInt4573, this.anInt4569, local202, this.aClass46_3, local287 ? Static47.aClass56_Sub1_1 : this.aClass56_Sub1_4, this.anInt4581);
		}
		if (local321 == null) {
			this.anInt4595 = this.anInt4575;
			this.anInt4572 = local17.anInt5554;
			return null;
		}
		if (Static94.aBoolean138 && local176) {
			@Pc(363) int local363 = 0;
			if (local287) {
				Static47.aClass56_Sub1_1 = local321.aClass56_Sub1_3;
			}
			if (this.anInt4585 != 0) {
				@Pc(379) int[][] local379 = Static243.anIntArrayArrayArray13[0];
				local363 = local267 - (local379[local114][local98] + local379[local107][local98] + local379[local114][local124] + local379[local107][local124] >> 2);
			}
			@Pc(414) Class56_Sub1 local414 = local321.aClass56_Sub1_3;
			if (this.aBoolean321 && Static74.method1214(local414, local199, local363, local212)) {
				this.aBoolean321 = false;
			}
			if (!this.aBoolean321) {
				Static74.method1212(local414, local199, local363, local212);
				if (local287) {
					Static47.aClass56_Sub1_1 = null;
				}
				this.anInt4592 = local212;
				this.aClass56_Sub1_4 = local414;
				this.anInt4587 = local363;
				this.anInt4582 = local199;
			}
		}
		this.anInt4572 = local17.anInt5554;
		this.anInt4595 = this.anInt4575;
		return local321.aClass53_3;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	private void method3767(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(20) Class184 local20 = Static6.method99(this.anInt4588);
			@Pc(22) Class184 local22 = local20;
			if (local20.anIntArray631 != null) {
				local20 = local20.method4490();
			}
			if (local20 == null) {
				return;
			}
			if (local20 == local22) {
				local22 = null;
			}
			if (local20.anIntArray633 != null) {
				if (this.aClass46_3 != null && local20.method4502(this.aClass46_3.anInt1223)) {
					return;
				}
				local7 = local20.method4497();
				if (this.anInt4572 != local20.anInt5554) {
					local9 = local20.aBoolean381;
				}
			} else if (local20.anInt5524 == -1) {
				if (local22 != null && local22.anIntArray633 != null) {
					if (this.aClass46_3 != null && local22.method4502(this.aClass46_3.anInt1223)) {
						return;
					}
					local7 = local22.method4497();
					if (local22.anInt5554 != this.anInt4572) {
						local9 = local22.aBoolean381;
					}
				} else if (local22 != null && local22.anInt5524 != -1 && this.anInt4572 != local22.anInt5554) {
					local9 = local22.aBoolean381;
					local7 = local22.anInt5524;
				}
			} else if (this.anInt4572 != local20.anInt5554) {
				local9 = local20.aBoolean381;
				local7 = local20.anInt5524;
			}
		}
		if (local7 == -1) {
			this.aClass46_3 = null;
			return;
		}
		if (this.aClass46_3 == null || this.aClass46_3.anInt1223 != local7) {
			this.aClass46_3 = Static156.method2501(local7);
		} else if (this.aClass46_3.anInt1238 == 0) {
			return;
		}
		if (local9) {
			this.anInt4575 = (int) (Math.random() * (double) this.aClass46_3.anIntArray95.length);
			this.anInt4569 = (int) ((double) this.aClass46_3.anIntArray94[this.anInt4575] * Math.random()) + 1;
		} else {
			this.anInt4569 = 1;
			this.anInt4575 = 0;
		}
		this.anInt4581 = this.anInt4575 + 1;
		if (this.anInt4581 < 0 || this.aClass46_3.anIntArray95.length <= this.anInt4581) {
			this.anInt4581 = -1;
		}
		this.anInt4591 = Static50.anInt954 - this.anInt4569;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V")
	private void method3768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label85: while (true) {
			if (this.aClass46_3 == null) {
				if (this.aBoolean319) {
					return;
				}
				this.method3767(-1);
				if (this.aClass46_3 == null) {
					return;
				}
			}
			@Pc(35) int local35 = Static50.anInt954 - this.anInt4591;
			if (local35 > 100 && this.aClass46_3.anInt1242 > 0) {
				@Pc(53) int local53 = this.aClass46_3.anIntArray95.length - this.aClass46_3.anInt1242;
				while (this.anInt4575 < local53 && this.aClass46_3.anIntArray94[this.anInt4575] < local35) {
					local35 -= this.aClass46_3.anIntArray94[this.anInt4575];
					this.anInt4575++;
				}
				if (this.anInt4575 >= local53) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local53; local94 < this.aClass46_3.anIntArray95.length; local94++) {
						local92 += this.aClass46_3.anIntArray94[local94];
					}
					local35 %= local92;
				}
				this.anInt4581 = this.anInt4575 + 1;
				if (this.aClass46_3.anIntArray95.length <= this.anInt4581) {
					this.anInt4581 -= this.aClass46_3.anInt1242;
					if (this.anInt4581 < 0 || this.anInt4581 >= this.aClass46_3.anIntArray95.length) {
						this.anInt4581 = -1;
					}
				}
			}
			while (this.aClass46_3.anIntArray94[this.anInt4575] < local35) {
				Static213.method3474(this.aClass46_3, arg0, arg1, this.anInt4575, false);
				local35 -= this.aClass46_3.anIntArray94[this.anInt4575];
				this.anInt4575++;
				if (this.aClass46_3.anIntArray95.length <= this.anInt4575) {
					this.anInt4575 -= this.aClass46_3.anInt1242;
					if (this.anInt4575 < 0 || this.aClass46_3.anIntArray95.length <= this.anInt4575) {
						this.aClass46_3 = null;
						continue label85;
					}
				}
				this.anInt4581 = this.anInt4575 + 1;
				if (this.anInt4581 >= this.aClass46_3.anIntArray95.length) {
					this.anInt4581 -= this.aClass46_3.anInt1242;
					if (this.anInt4581 < 0 || this.aClass46_3.anIntArray95.length <= this.anInt4581) {
						this.anInt4581 = -1;
					}
				}
			}
			this.anInt4569 = local35;
			this.anInt4591 = Static50.anInt954 - local35;
			return;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public void method3769() {
		if (this.aClass56_Sub1_4 != null) {
			Static74.method1210(this.aClass56_Sub1_4, this.anInt4582, this.anInt4587, this.anInt4592);
			this.aClass56_Sub1_4 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)Lclient!vc;")
	public Class53 method3772() {
		return this.method3765(false);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
	@Override
	public int method3850() {
		return this.anInt4576;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLclient!vc;)V")
	private void method3774(@OriginalArg(1) Class53 arg0) {
		@Pc(28) Class184 local28;
		if (Static94.aBoolean138) {
			@Pc(70) Class53_Sub4_Sub2 local70 = (Class53_Sub4_Sub2) arg0;
			if ((this.aClass20_Sub3_7 == null || this.aClass20_Sub3_7.aBoolean250) && (local70.aClass161Array3 != null || local70.aClass170Array3 != null)) {
				local28 = Static6.method99(this.anInt4588);
				if (local28.anIntArray631 != null) {
					local28 = local28.method4490();
				}
				if (local28 != null) {
					this.aClass20_Sub3_7 = new Class20_Sub3(Static50.anInt954, local28.anInt5528, local28.anInt5517);
				}
			}
			if (this.aClass20_Sub3_7 != null) {
				this.aClass20_Sub3_7.method2980(local70.aClass161Array3, local70.aClass170Array3, false, local70.anIntArray507, local70.anIntArray504, local70.anIntArray502);
			}
		} else {
			@Pc(8) Class53_Sub4_Sub1 local8 = (Class53_Sub4_Sub1) arg0;
			if ((this.aClass20_Sub3_7 == null || this.aClass20_Sub3_7.aBoolean250) && (local8.aClass161Array2 != null || local8.aClass170Array2 != null)) {
				local28 = Static6.method99(this.anInt4588);
				if (local28.anIntArray631 != null) {
					local28 = local28.method4490();
				}
				if (local28 != null) {
					this.aClass20_Sub3_7 = new Class20_Sub3(Static50.anInt954, local28.anInt5528, local28.anInt5517);
				}
			}
			if (this.aClass20_Sub3_7 != null) {
				this.aClass20_Sub3_7.method2980(local8.aClass161Array2, local8.aClass170Array2, false, local8.anIntArray347, local8.anIntArray344, local8.anIntArray340);
			}
		}
		this.aBoolean320 = true;
	}

	@OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub3_7 != null) {
			this.aClass20_Sub3_7.method2971();
		}
	}
}
