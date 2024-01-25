import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class8_Sub3_Sub1_Sub2 extends Class8_Sub3_Sub1 {

	@OriginalMember(owner = "client!wg", name = "Hc", descriptor = "[F")
	public static final float[] aFloatArray33 = new float[16384];

	@OriginalMember(owner = "client!wg", name = "Ac", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[16384];

	@OriginalMember(owner = "client!wg", name = "Ec", descriptor = "Lclient!fb;")
	public Class78 aClass78_1;

	@OriginalMember(owner = "client!wg", name = "Dc", descriptor = "I")
	public int anInt7431 = -1;

	@OriginalMember(owner = "client!wg", name = "Pc", descriptor = "I")
	public int anInt7440 = -1;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray32[local11] = (float) Math.sin(local9 * (double) local11);
			aFloatArray33[local11] = (float) Math.cos(local9 * (double) local11);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IZIIII)V")
	public void method5905(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte99 = (byte) arg2;
		if (super.anInt7365 != -1 && Static170.aClass125_3.method2389(super.anInt7365).anInt3007 == 1) {
			super.anInt7365 = -1;
		}
		@Pc(39) Class172 local39;
		if (super.anInt7387 != -1) {
			local39 = Static452.aClass246_2.method5323(super.anInt7387);
			if (local39.aBoolean302 && local39.anInt4088 != -1 && Static170.aClass125_3.method2389(local39.anInt4088).anInt3007 == 1) {
				super.anInt7387 = -1;
			}
		}
		if (super.anInt7402 != -1) {
			local39 = Static452.aClass246_2.method5323(super.anInt7402);
			if (local39.aBoolean302 && local39.anInt4088 != -1 && Static170.aClass125_3.method2389(local39.anInt4088).anInt3007 == 1) {
				super.anInt7402 = -1;
			}
		}
		if (!arg0) {
			@Pc(104) int local104 = arg4 - super.anIntArray560[0];
			@Pc(112) int local112 = arg3 - super.anIntArray559[0];
			if (local104 >= -8 && local104 <= 8 && local112 >= -8 && local112 <= 8) {
				if (super.anInt7427 < 9) {
					super.anInt7427++;
				}
				for (@Pc(143) int local143 = super.anInt7427; local143 > 0; local143--) {
					super.anIntArray560[local143] = super.anIntArray560[local143 - 1];
					super.anIntArray559[local143] = super.anIntArray559[local143 - 1];
					super.aByteArray88[local143] = super.aByteArray88[local143 - 1];
				}
				super.anIntArray560[0] = arg4;
				super.aByteArray88[0] = 1;
				super.anIntArray559[0] = arg3;
				return;
			}
		}
		super.anInt7426 = 0;
		super.anInt7427 = 0;
		super.anInt7428 = 0;
		super.anIntArray560[0] = arg4;
		super.anIntArray559[0] = arg3;
		super.anInt7343 = (arg1 << 6) + (super.anIntArray559[0] << 7);
		super.anInt7339 = (arg1 << 6) + (super.anIntArray560[0] << 7);
		if (super.aClass20_Sub3_7 != null) {
			super.aClass20_Sub3_7.method2131();
		}
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(B)I")
	@Override
	public int method5897() {
		if (this.aClass78_1.anIntArray145 != null) {
			@Pc(18) Class78 local18 = this.aClass78_1.method1547(Static52.aClass81_1);
			if (local18 != null && local18.anInt1895 != -1) {
				return local18.anInt1895;
			}
		}
		return this.aClass78_1.anInt1895;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass78_1 == null || !this.method5909(131072, arg0)) {
			return false;
		}
		@Pc(24) Class35 local24 = arg0.method5398();
		@Pc(29) int local29 = super.aClass120_7.method2297();
		local24.ra(local29);
		local24.o(super.anInt7339, super.anInt7341, super.anInt7343);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass116Array3.length > local44; local44++) {
			if (super.aClass116Array3[local44] != null && super.aClass116Array3[local44].method3107(arg1, arg2, local24, this.aClass78_1.anInt1885 == 1)) {
				local42 = true;
				break;
			}
		}
		super.aClass116Array3[0] = super.aClass116Array3[1] = super.aClass116Array3[2] = super.aClass116Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
	@Override
	public int method5898() {
		if (this.aClass78_1.anIntArray145 != null) {
			@Pc(20) Class78 local20 = this.aClass78_1.method1547(Static52.aClass81_1);
			if (local20 != null && local20.anInt1912 != -1) {
				return local20.anInt1912;
			}
		}
		return this.aClass78_1.anInt1912 == -1 ? super.method5898() : this.aClass78_1.anInt1912;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!fb;)V")
	public void method5907(@OriginalArg(1) Class78 arg0) {
		this.aClass78_1 = arg0;
		if (super.aClass20_Sub3_7 != null) {
			super.aClass20_Sub3_7.method2131();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
	public void method5908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray560[0];
		@Pc(15) int local15 = super.anIntArray559[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local15++;
			local10++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local15--;
			local10++;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt7365 != -1 && Static170.aClass125_3.method2389(super.anInt7365).anInt3007 == 1) {
			super.anInt7365 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(91) Class172 local91;
		if (super.anInt7387 != -1) {
			local91 = Static452.aClass246_2.method5323(super.anInt7387);
			if (local91.aBoolean302 && local91.anInt4088 != -1 && Static170.aClass125_3.method2389(local91.anInt4088).anInt3007 == 1) {
				super.anInt7387 = -1;
			}
		}
		if (super.anInt7402 != -1) {
			local91 = Static452.aClass246_2.method5323(super.anInt7402);
			if (local91.aBoolean302 && local91.anInt4088 != -1 && Static170.aClass125_3.method2389(local91.anInt4088).anInt3007 == 1) {
				super.anInt7402 = -1;
			}
		}
		if (super.anInt7427 < 9) {
			super.anInt7427++;
		}
		for (@Pc(153) int local153 = super.anInt7427; local153 > 0; local153--) {
			super.anIntArray560[local153] = super.anIntArray560[local153 - 1];
			super.anIntArray559[local153] = super.anIntArray559[local153 - 1];
			super.aByteArray88[local153] = super.aByteArray88[local153 - 1];
		}
		super.anIntArray560[0] = local10;
		super.aByteArray88[0] = (byte) arg1;
		super.anIntArray559[0] = local15;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!ya;I)Z")
	private boolean method5909(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class42 local11 = this.method5892();
		@Pc(32) Class119 local32 = super.anInt7365 != -1 && super.anInt7359 == 0 ? Static170.aClass125_3.method2389(super.anInt7365) : null;
		@Pc(49) Class119 local49 = super.anInt7389 == -1 || super.aBoolean519 && local32 != null ? null : Static170.aClass125_3.method2389(super.anInt7389);
		@Pc(52) int local52 = local11.anInt1049;
		@Pc(55) int local55 = local11.anInt1016;
		if (local52 != 0 || local55 != 0 || local11.anInt1032 != 0 || local11.anInt1040 != 0) {
			arg0 |= 0x7;
		}
		@Pc(102) boolean local102 = super.aByte103 != 0 && Static265.anInt4371 >= super.anInt7422 && super.anInt7372 > Static265.anInt4371;
		if (local102) {
			arg0 |= 0x80000;
		}
		@Pc(139) Class116 local139 = super.aClass116Array3[0] = this.aClass78_1.method1548(local49, arg0, arg1, super.anInt7371, super.anInt7390, Static170.aClass125_3, super.anInt7373, Static445.aClass1_1, super.anInt7375, super.aClass39Array3, super.anInt7403, super.anInt7382, local32, Static52.aClass81_1);
		if (local139 == null) {
			return false;
		}
		super.anInt7357 = local139.MA();
		this.method5893(local139);
		@Pc(156) int local156 = super.aClass120_7.method2297();
		if (local52 == 0 && local55 == 0) {
			this.method5902(0, local156, this.method5894() << 7, this.method5894() << 7, 0);
		} else {
			this.method5902(local11.anInt1026, local156, local55, local52, local11.anInt1024);
			if (super.anInt7374 != 0) {
				super.aClass116Array3[0].Z(super.anInt7374);
			}
			if (super.anInt7420 != 0) {
				super.aClass116Array3[0].R(super.anInt7420);
			}
			if (super.anInt7419 != 0) {
				super.aClass116Array3[0].JA(0, super.anInt7419, 0);
			}
		}
		if (local102) {
			local139.method3119(super.aByte101, super.aByte102, super.aByte100, super.aByte103 & 0xFF);
		}
		@Pc(260) Class172 local260;
		@Pc(280) boolean local280;
		@Pc(282) int local282;
		@Pc(328) Class116 local328;
		if (super.anInt7387 == -1 || super.anInt7367 == -1) {
			super.aClass116Array3[1] = null;
		} else {
			local260 = Static452.aClass246_2.method5323(super.anInt7387);
			local280 = local260.aByte72 == 3 && (local52 != 0 || local55 != 0);
			local282 = local7;
			if (local280) {
				local282 = local7 | 0x7;
			} else {
				if (super.anInt7401 != 0) {
					local282 = local7 | 0x5;
				}
				if (super.anInt7380 != 0) {
					local282 |= 0x2;
				}
			}
			local328 = super.aClass116Array3[1] = local260.method3245(Static170.aClass125_3, super.anInt7421, local282, super.anInt7386, arg1, super.anInt7367);
			if (local328 != null) {
				if (super.anInt7380 != 0) {
					local328.JA(0, -super.anInt7380 << 0, 0);
				}
				if (super.anInt7401 != 0) {
					local328.Q(super.anInt7401 * 2048);
				}
				if (local280) {
					if (super.anInt7374 != 0) {
						local328.Z(super.anInt7374);
					}
					if (super.anInt7420 != 0) {
						local328.R(super.anInt7420);
					}
					if (super.anInt7419 != 0) {
						local328.JA(0, super.anInt7419, 0);
					}
				}
			}
		}
		if (super.anInt7402 == -1 || super.anInt7384 == -1) {
			super.aClass116Array3[3] = null;
		} else {
			local260 = Static452.aClass246_2.method5323(super.anInt7402);
			local280 = local260.aByte72 == 3 && (local52 != 0 || local55 != 0);
			local282 = local7;
			if (local280) {
				local282 = local7 | 0x7;
			} else {
				if (super.anInt7383 != 0) {
					local282 = local7 | 0x5;
				}
				if (super.anInt7397 != 0) {
					local282 |= 0x2;
				}
			}
			local328 = super.aClass116Array3[3] = local260.method3240(local282, super.anInt7360, arg1, super.anInt7384, Static170.aClass125_3, super.anInt7377);
			if (local328 != null) {
				if (super.anInt7397 != 0) {
					local328.JA(0, -super.anInt7397 << 0, 0);
				}
				if (super.anInt7383 != 0) {
					local328.Q(super.anInt7383 * 2048);
				}
				if (local280) {
					if (super.anInt7374 != 0) {
						local328.Z(super.anInt7374);
					}
					if (super.anInt7420 != 0) {
						local328.R(super.anInt7420);
					}
					if (super.anInt7419 != 0) {
						local328.JA(0, super.anInt7419, 0);
					}
				}
			}
		}
		super.aClass116Array3[2] = null;
		if (super.aClass4_Sub3_3 != null) {
			if (super.aClass4_Sub3_3.anInt156 <= Static265.anInt4371) {
				super.aClass4_Sub3_3 = null;
			} else if (Static265.anInt4371 >= super.aClass4_Sub3_3.anInt157) {
				@Pc(554) Class116 local554 = super.aClass4_Sub3_3.method131(arg1, local7 | 0x7);
				if (local554 != null) {
					local554.JA(super.aClass4_Sub3_3.anInt153 - super.anInt7339, super.aClass4_Sub3_3.anInt148 + -super.anInt7341, -super.anInt7343 + super.aClass4_Sub3_3.anInt152);
					if (local156 != 0) {
						local554.Q(local156);
					}
					super.aClass116Array3[2] = local554;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(B)Z")
	public boolean method5910() {
		return this.aClass78_1 != null;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)Z")
	private boolean method5911() {
		return this.aClass78_1.lb;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		if (this.aClass78_1 == null || !this.method5909(2048, arg0)) {
			return null;
		}
		@Pc(24) Class35 local24 = arg0.method5398();
		@Pc(29) int local29 = super.aClass120_7.method2297();
		local24.ra(local29);
		local24.o(super.anInt7339, super.anInt7341, super.anInt7343);
		@Pc(44) Class42 local44 = this.method5892();
		@Pc(57) Class78 local57 = this.aClass78_1.anIntArray145 == null ? this.aClass78_1 : this.aClass78_1.method1547(Static52.aClass81_1);
		if (Static413.aClass49_Sub1_1.aBoolean231 && local57.aBoolean133 && local44.aBoolean59) {
			@Pc(85) Class119 local85 = super.anInt7365 != -1 && super.anInt7359 == 0 ? Static170.aClass125_3.method2389(super.anInt7365) : null;
			@Pc(103) Class119 local103 = super.anInt7389 == -1 || super.aBoolean519 && local85 != null ? null : Static170.aClass125_3.method2389(super.anInt7389);
			@Pc(155) Class116 local155 = Static342.method4555(super.anInt7419, arg0, local29, super.aClass116Array3[0], this.aClass78_1.aShort33 & 0xFFFF, super.aBoolean521, super.anInt7420, super.anInt7374, this.aClass78_1.aByte40 & 0xFF, local103 == null ? super.anInt7375 : super.anInt7371, this.aClass78_1.anInt1885, local103 == null ? local85 : local103, this.aClass78_1.aByte39 & 0xFF, this.aClass78_1.aShort34 & 0xFFFF);
			if (local155 != null) {
				@Pc(160) float local160 = arg0.W();
				@Pc(163) float local163 = arg0.xa();
				arg0.method5336(false);
				arg0.g(local160, local163 - 150.0F);
				local155.method3117(local24, null, 0);
				arg0.g(local160, local163);
				arg0.method5336(true);
			}
		}
		@Pc(186) Class20_Sub5 local186 = null;
		if (this.method5911()) {
			local186 = Static371.method4760(super.aClass116Array3.length);
		}
		if (super.aClass20_Sub3_7 == null) {
			arg0.method5372(super.aClass116Array3, local24, local186 == null ? null : local186.aClass20_Sub8Array1, 0);
		} else {
			@Pc(217) Class83 local217 = super.aClass20_Sub3_7.method2129();
			arg0.method5358(super.aClass116Array3, local217, local24, local186 == null ? null : local186.aClass20_Sub8Array1, 0);
		}
		this.method5904(false, super.aClass116Array3, arg0);
		if (super.aClass116Array3[2] != null) {
			if (local29 != 0) {
				super.aClass116Array3[2].Q(local29);
			}
			super.aClass116Array3[2].JA(-super.aClass4_Sub3_3.anInt153 + super.anInt7339, -super.aClass4_Sub3_3.anInt148 + super.anInt7341, super.anInt7343 - super.aClass4_Sub3_3.anInt152);
		}
		super.aClass116Array3[0] = super.aClass116Array3[1] = super.aClass116Array3[2] = super.aClass116Array3[3] = null;
		super.anInt7369 = Static129.anInt2333;
		return local186;
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(B)I")
	@Override
	protected int method5900() {
		if (this.aClass78_1.anIntArray145 != null) {
			@Pc(15) Class78 local15 = this.aClass78_1.method1547(Static52.aClass81_1);
			if (local15 != null && local15.anInt1913 != -1) {
				return local15.anInt1913;
			}
		}
		return this.aClass78_1.anInt1913;
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)I")
	@Override
	public int method5882() {
		return super.anInt7357;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
		if (this.aClass78_1 != null && (super.aBoolean523 || this.method5909(0, arg0))) {
			this.method5904(super.aBoolean523, super.aClass116Array3, arg0);
			super.aClass116Array3[0] = super.aClass116Array3[1] = super.aClass116Array3[2] = super.aClass116Array3[3] = null;
		}
	}
}
