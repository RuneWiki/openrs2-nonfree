import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class8_Sub3_Sub1_Sub1 extends Class8_Sub3_Sub1 {

	@OriginalMember(owner = "client!rd", name = "Fc", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!rd", name = "Kc", descriptor = "I")
	public int anInt5653;

	@OriginalMember(owner = "client!rd", name = "Pc", descriptor = "Lclient!eb;")
	public Class60 aClass60_1;

	@OriginalMember(owner = "client!rd", name = "Rc", descriptor = "I")
	private int anInt5657;

	@OriginalMember(owner = "client!rd", name = "kd", descriptor = "I")
	public int anInt5674;

	@OriginalMember(owner = "client!rd", name = "sd", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!rd", name = "Bc", descriptor = "I")
	public int anInt5646 = 0;

	@OriginalMember(owner = "client!rd", name = "Tc", descriptor = "I")
	public int anInt5659 = -1;

	@OriginalMember(owner = "client!rd", name = "Qc", descriptor = "I")
	public int anInt5656 = -1;

	@OriginalMember(owner = "client!rd", name = "dd", descriptor = "I")
	public int anInt5667 = 0;

	@OriginalMember(owner = "client!rd", name = "Wc", descriptor = "B")
	private byte aByte88 = 0;

	@OriginalMember(owner = "client!rd", name = "Yc", descriptor = "I")
	public int anInt5662 = -1;

	@OriginalMember(owner = "client!rd", name = "Nc", descriptor = "I")
	public int anInt5655 = 255;

	@OriginalMember(owner = "client!rd", name = "Cc", descriptor = "I")
	public int anInt5647 = -1;

	@OriginalMember(owner = "client!rd", name = "ld", descriptor = "I")
	public int anInt5675 = -1;

	@OriginalMember(owner = "client!rd", name = "hd", descriptor = "I")
	public int anInt5671 = -1;

	@OriginalMember(owner = "client!rd", name = "id", descriptor = "I")
	public int anInt5672 = -1;

	@OriginalMember(owner = "client!rd", name = "Hc", descriptor = "I")
	public int anInt5651 = 0;

	@OriginalMember(owner = "client!rd", name = "od", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!rd", name = "bd", descriptor = "I")
	public int anInt5665 = 0;

	@OriginalMember(owner = "client!rd", name = "Mc", descriptor = "Z")
	public boolean aBoolean399 = false;

	@OriginalMember(owner = "client!rd", name = "vd", descriptor = "I")
	public int anInt5682 = 0;

	@OriginalMember(owner = "client!rd", name = "wd", descriptor = "B")
	private byte aByte90 = 0;

	@OriginalMember(owner = "client!rd", name = "xd", descriptor = "I")
	public int anInt5683 = -1;

	@OriginalMember(owner = "client!rd", name = "qd", descriptor = "B")
	private byte aByte89 = 0;

	@OriginalMember(owner = "client!rd", name = "Ad", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBBI)V")
	public void method4550(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7427 < 9) {
			super.anInt7427++;
		}
		for (@Pc(18) int local18 = super.anInt7427; local18 > 0; local18--) {
			super.anIntArray560[local18] = super.anIntArray560[local18 - 1];
			super.anIntArray559[local18] = super.anIntArray559[local18 - 1];
			super.aByteArray88[local18] = super.aByteArray88[local18 - 1];
		}
		super.anIntArray560[0] = arg0;
		super.aByteArray88[0] = arg1;
		super.anIntArray559[0] = arg2;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method4551() {
		@Pc(7) String local7 = "";
		if (Static63.aStringArray39 != null) {
			local7 = local7 + Static63.aStringArray39[this.aByte88];
		}
		@Pc(29) int[] local29;
		if (this.aByte89 == 1 && Static291.anIntArray387 != null) {
			local29 = Static291.anIntArray387;
		} else {
			local29 = Static373.anIntArray492;
		}
		if (local29 != null && local29[this.aByte88] != -1) {
			@Pc(49) Class233 local49 = Static294.aClass252_1.method5639(local29[this.aByte88]);
			if (local49.aChar4 == 's') {
				local7 = local7 + local49.method4914(this.aByte90 & 0xFF);
			} else {
				Static33.method448(new Throwable(), "gdn1");
				local29[this.aByte88] = -1;
			}
		}
		local7 = local7 + this.aString59;
		if (Static286.aStringArray32 != null) {
			local7 = local7 + Static286.aStringArray32[this.aByte88];
		}
		return local7;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)I")
	@Override
	public int method5882() {
		return super.anInt7357;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!fh;)V")
	public void method4554(@OriginalArg(1) Class4_Sub9 arg0) {
		arg0.anInt6207 = 0;
		@Pc(12) int local12 = arg0.method5007();
		this.aByte89 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(34) boolean local34 = (local12 & 0x4) != 0;
		@Pc(38) int local38 = super.method5894();
		this.method5901((local12 >> 3 & 0x7) + 1);
		this.aByte88 = (byte) (local12 >> 6 & 0x3);
		super.anInt7339 += this.method5894() - local38 << 6;
		super.anInt7343 += this.method5894() - local38 << 6;
		this.aByte90 = arg0.method5063();
		this.anInt5662 = arg0.method5063();
		this.anInt5675 = arg0.method5063();
		@Pc(99) int local99 = -1;
		this.anInt5665 = 0;
		@Pc(105) int[] local105 = new int[12];
		@Pc(125) int local125;
		@Pc(132) int local132;
		@Pc(173) int local173;
		for (@Pc(107) int local107 = 0; local107 < 12; local107++) {
			@Pc(113) int local113 = arg0.method5007();
			if (local113 == 0) {
				local105[local107] = 0;
			} else {
				local125 = arg0.method5007();
				local132 = (local113 << 8) + local125;
				if (local107 == 0 && local132 == 65535) {
					local99 = arg0.method5028();
					this.anInt5665 = arg0.method5007();
					break;
				}
				if (local132 >= 32768) {
					local132 = Static435.anIntArray545[local132 - 32768];
					local105[local107] = local132 | 0x40000000;
					local173 = Static416.aClass64_2.method1372(local132).anInt2014;
					if (local173 != 0) {
						this.anInt5665 = local173;
					}
				} else {
					local105[local107] = Integer.MIN_VALUE | local132 - 256;
				}
			}
		}
		@Pc(200) int[] local200 = new int[5];
		for (local125 = 0; local125 < 5; local125++) {
			local132 = arg0.method5007();
			if (local132 < 0 || local132 >= Static180.aShortArrayArray3[local125].length) {
				local132 = 0;
			}
			local200[local125] = local132;
		}
		this.anInt5657 = arg0.method5028();
		this.aString59 = arg0.method5038();
		if (local26) {
			this.aString60 = arg0.method5038();
		} else {
			this.aString60 = this.aString59;
		}
		this.anInt5682 = arg0.method5007();
		if (local34) {
			this.anInt5651 = arg0.method5028();
			this.anInt5646 = this.anInt5682;
			this.anInt5659 = -1;
		} else {
			this.anInt5651 = 0;
			this.anInt5646 = arg0.method5007();
			this.anInt5659 = arg0.method5007();
			if (this.anInt5659 == 255) {
				this.anInt5659 = -1;
			}
		}
		local132 = this.anInt5667;
		this.anInt5667 = arg0.method5007();
		@Pc(326) int local326;
		if (this.anInt5667 == 0) {
			Static222.method3017(this);
		} else {
			local173 = this.anInt5672;
			@Pc(323) int local323 = this.anInt5656;
			local326 = this.anInt5647;
			@Pc(329) int local329 = this.anInt5683;
			@Pc(332) int local332 = this.anInt5655;
			this.anInt5672 = arg0.method5028();
			this.anInt5656 = arg0.method5028();
			this.anInt5647 = arg0.method5028();
			this.anInt5683 = arg0.method5028();
			this.anInt5655 = arg0.method5007();
			if (this.anInt5667 != local132 || local173 != this.anInt5672 || local323 != this.anInt5656 || this.anInt5647 != local326 || this.anInt5683 != local329 || local332 != this.anInt5655) {
				Static127.method1764(this);
			}
		}
		if (this.aClass60_1 == null) {
			this.aClass60_1 = new Class60();
		}
		local173 = this.aClass60_1.anInt1637;
		@Pc(404) int[] local404 = this.aClass60_1.anIntArray122;
		this.aClass60_1.method1332(local99, this.method5900(), this.aByte89 == 1, local200, local105);
		if (local173 != local99) {
			super.anInt7339 = (super.anIntArray560[0] << 7) + (this.method5894() << 6);
			super.anInt7343 = (super.anIntArray559[0] << 7) + (this.method5894() << 6);
		}
		if (super.anInt7391 == Static12.anInt187 && local404 != null) {
			for (local326 = 0; local326 < local200.length; local326++) {
				if (local404[local326] != local200[local326]) {
					Static416.aClass64_2.method1367();
					break;
				}
			}
		}
		if (super.aClass20_Sub3_7 != null) {
			super.aClass20_Sub3_7.method2131();
		}
		if (super.anInt7389 == -1 || !super.aBoolean519) {
			return;
		}
		@Pc(507) Class42 local507 = this.method5892();
		if (!local507.method817(super.anInt7389)) {
			super.aBoolean519 = false;
			super.anInt7389 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!t;IIZLclient!ya;Lclient!c;)V")
	private void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5, @OriginalArg(7) Class35 arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg4 * arg4;
		if (local11 < 16384 || local11 > arg1) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg4, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Class116 local54 = Static239.method3206(super.anInt7420, local42, arg3, super.anInt7419, arg5, super.anInt7374);
		if (local54 != null) {
			arg5.method5336(false);
			local54.method3117(arg6, null, 0);
			arg5.method5336(true);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)V")
	public void method4558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt7428 = 0;
		super.anInt7426 = 0;
		super.anInt7427 = 0;
		super.anIntArray560[0] = arg1;
		super.anIntArray559[0] = arg0;
		@Pc(30) int local30 = this.method5894();
		super.anInt7343 = local30 * 64 + super.anIntArray559[0] * 128;
		super.anInt7339 = local30 * 64 + super.anIntArray560[0] * 128;
		if (Static401.aClass8_Sub3_Sub1_Sub1_2 == this) {
			Static458.method5376();
		}
		if (super.aClass20_Sub3_7 != null) {
			super.aClass20_Sub3_7.method2131();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method4559() {
		return this.aString60;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
		if (this.aClass60_1 != null && (super.aBoolean523 || this.method4560(arg0, 0))) {
			this.method5904(super.aBoolean523, super.aClass116Array3, arg0);
			super.aClass116Array3[0] = super.aClass116Array3[1] = super.aClass116Array3[2] = super.aClass116Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)I")
	@Override
	public int method5897() {
		return -1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ya;ZI)Z")
	private boolean method4560(@OriginalArg(0) Class135 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class42 local11 = this.method5892();
		@Pc(29) Class119 local29 = super.anInt7365 != -1 && super.anInt7359 == 0 ? Static170.aClass125_3.method2389(super.anInt7365) : null;
		@Pc(49) Class119 local49 = super.anInt7389 == -1 || this.aBoolean401 || super.aBoolean519 && local29 != null ? null : Static170.aClass125_3.method2389(super.anInt7389);
		@Pc(52) int local52 = local11.anInt1049;
		@Pc(55) int local55 = local11.anInt1016;
		if (local52 != 0 || local55 != 0 || local11.anInt1032 != 0 || local11.anInt1040 != 0) {
			arg1 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte103 != 0 && super.anInt7422 <= Static265.anInt4371 && Static265.anInt4371 < super.anInt7372;
		if (local100) {
			arg1 |= 0x80000;
		}
		@Pc(141) Class116 local141 = super.aClass116Array3[0] = this.aClass60_1.method1326(super.anInt7403, super.anInt7375, arg1, super.aClass39Array3, local49, super.anInt7382, arg0, super.anInt7390, local29, super.anInt7371, Static52.aClass81_1, Static120.aClass115_2, super.anInt7373, Static445.aClass1_1, Static170.aClass125_3, Static416.aClass64_2, Static116.aClass101_2);
		@Pc(144) int local144 = Static232.method3163();
		if (Static18.anInt296 < 96 && local144 > 50) {
			Static138.method1970();
		}
		@Pc(173) int local173;
		if (Static324.aClass178_18 != Static193.aClass178_9 && local144 < 50) {
			local173 = 50 - local144;
			while (local173 > Static31.anInt525) {
				Static184.aByteArrayArray8[Static31.anInt525] = new byte[102400];
				Static31.anInt525++;
			}
			while (local173 < Static31.anInt525) {
				Static31.anInt525--;
				Static184.aByteArrayArray8[Static31.anInt525] = null;
			}
		} else if (Static324.aClass178_18 != Static193.aClass178_9) {
			Static184.aByteArrayArray8 = new byte[50][];
			Static31.anInt525 = 0;
		}
		if (local141 == null) {
			return false;
		}
		super.anInt7357 = local141.MA();
		this.method5893(local141);
		local173 = super.aClass120_7.method2297();
		if (local52 == 0 && local55 == 0) {
			this.method5902(0, local173, this.method5894() << 7, this.method5894() << 7, 0);
		} else {
			this.method5902(local11.anInt1026, local173, local55, local52, local11.anInt1024);
			if (super.anInt7374 != 0) {
				local141.Z(super.anInt7374);
			}
			if (super.anInt7420 != 0) {
				local141.R(super.anInt7420);
			}
			if (super.anInt7419 != 0) {
				local141.JA(0, super.anInt7419, 0);
			}
		}
		if (local100) {
			local141.method3119(super.aByte101, super.aByte102, super.aByte100, super.aByte103 & 0xFF);
		}
		@Pc(322) Class172 local322;
		@Pc(342) boolean local342;
		@Pc(344) int local344;
		@Pc(387) Class116 local387;
		if (this.aBoolean401 || super.anInt7387 == -1 || super.anInt7367 == -1) {
			super.aClass116Array3[1] = null;
		} else {
			local322 = Static452.aClass246_2.method5323(super.anInt7387);
			local342 = local322.aByte72 == 3 && (local52 != 0 || local55 != 0);
			local344 = local7;
			if (local342) {
				local344 = local7 | 0x7;
			} else {
				if (super.anInt7401 != 0) {
					local344 = local7 | 0x5;
				}
				if (super.anInt7380 != 0) {
					local344 |= 0x2;
				}
			}
			local387 = super.aClass116Array3[1] = local322.method3245(Static170.aClass125_3, super.anInt7421, local344, super.anInt7386, arg0, super.anInt7367);
			if (local387 != null) {
				if (super.anInt7380 != 0) {
					local387.JA(0, -super.anInt7380 << 0, 0);
				}
				if (super.anInt7401 != 0) {
					local387.Q(super.anInt7401 * 2048);
				}
				if (local342) {
					if (super.anInt7374 != 0) {
						local387.Z(super.anInt7374);
					}
					if (super.anInt7420 != 0) {
						local387.R(super.anInt7420);
					}
					if (super.anInt7419 != 0) {
						local387.JA(0, super.anInt7419, 0);
					}
				}
			}
		}
		if (this.aBoolean401 || super.anInt7402 == -1 || super.anInt7384 == -1) {
			super.aClass116Array3[3] = null;
		} else {
			local322 = Static452.aClass246_2.method5323(super.anInt7402);
			local342 = local322.aByte72 == 3 && (local52 != 0 || local55 != 0);
			local344 = local7;
			if (local342) {
				local344 = local7 | 0x7;
			} else {
				if (super.anInt7383 != 0) {
					local344 = local7 | 0x5;
				}
				if (super.anInt7397 != 0) {
					local344 |= 0x2;
				}
			}
			local387 = super.aClass116Array3[3] = local322.method3240(local344, super.anInt7360, arg0, super.anInt7384, Static170.aClass125_3, super.anInt7377);
			if (local387 != null) {
				if (super.anInt7397 != 0) {
					local387.JA(0, -super.anInt7397 << 0, 0);
				}
				if (super.anInt7383 != 0) {
					local387.Q(super.anInt7383 * 2048);
				}
				if (local342) {
					if (super.anInt7374 != 0) {
						local387.Z(super.anInt7374);
					}
					if (super.anInt7420 != 0) {
						local387.R(super.anInt7420);
					}
					if (super.anInt7419 != 0) {
						local387.JA(0, super.anInt7419, 0);
					}
				}
			}
		}
		super.aClass116Array3[2] = null;
		if (!this.aBoolean401 && super.aClass4_Sub3_3 != null) {
			if (Static265.anInt4371 >= super.aClass4_Sub3_3.anInt156) {
				super.aClass4_Sub3_3 = null;
			} else if (Static265.anInt4371 >= super.aClass4_Sub3_3.anInt157) {
				@Pc(627) Class116 local627 = super.aClass4_Sub3_3.method131(arg0, local7 | 0x7);
				if (local627 != null) {
					local627.JA(-super.anInt7339 + super.aClass4_Sub3_3.anInt153, -super.anInt7341 + super.aClass4_Sub3_3.anInt148, -super.anInt7343 + super.aClass4_Sub3_3.anInt152);
					if (local173 != 0) {
						local627.Q(-local173 & 0x3FFF);
					}
					super.aClass116Array3[2] = local627;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)I")
	@Override
	public int method5894() {
		return this.aClass60_1 == null || this.aClass60_1.anInt1637 == -1 ? super.method5894() : Static120.aClass115_2.method2201(this.aClass60_1.anInt1637).anInt1885;
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(B)Z")
	public boolean method4562() {
		return this.aClass60_1 != null;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)I")
	@Override
	protected int method5900() {
		return this.anInt5657;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass60_1 == null || !this.method4560(arg0, 131072)) {
			return false;
		}
		@Pc(25) Class35 local25 = arg0.method5398();
		@Pc(30) int local30 = super.aClass120_7.method2297();
		local25.ra(local30);
		local25.o(super.anInt7339, super.anInt7341, super.anInt7343);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; super.aClass116Array3.length > local45; local45++) {
			if (super.aClass116Array3[local45] != null && super.aClass116Array3[local45].method3107(arg1, arg2, local25, true)) {
				local43 = true;
				break;
			}
		}
		super.aClass116Array3[0] = super.aClass116Array3[1] = super.aClass116Array3[2] = super.aClass116Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		if (this.aClass60_1 == null || !this.method4560(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class35 local19 = arg0.method5398();
		@Pc(24) int local24 = super.aClass120_7.method2297();
		local19.ra(local24);
		local19.o(super.anInt7339, super.anInt7341, super.anInt7343);
		@Pc(43) float local43 = arg0.W();
		@Pc(46) float local46 = arg0.xa();
		if (Static413.aClass49_Sub1_1.aBoolean231) {
			@Pc(53) Class42 local53 = this.method5892();
			if (local53.aBoolean59 && (this.aClass60_1.anInt1637 == -1 || Static120.aClass115_2.method2201(this.aClass60_1.anInt1637).aBoolean133)) {
				@Pc(84) Class119 local84 = super.anInt7365 != -1 && super.anInt7359 == 0 ? Static170.aClass125_3.method2389(super.anInt7365) : null;
				@Pc(105) Class119 local105 = super.anInt7389 == -1 || this.aBoolean401 || super.aBoolean519 && local84 != null ? null : Static170.aClass125_3.method2389(super.anInt7389);
				@Pc(139) Class116 local139 = Static342.method4555(super.anInt7419, arg0, local24, super.aClass116Array3[0], 0, super.aBoolean521, super.anInt7420, super.anInt7374, 240, local105 == null ? super.anInt7375 : super.anInt7371, 1, local105 == null ? local84 : local105, 160, 0);
				if (local139 != null) {
					arg0.g(local43, local46 - 128.0F);
					arg0.method5336(false);
					local139.method3117(local19, null, 0);
					arg0.method5336(true);
				}
			}
		}
		if (Static401.aClass8_Sub3_Sub1_Sub1_2 == this) {
			arg0.g(local43, local46 - 144.0F);
			local19.j(super.anInt7339, super.anInt7341, super.anInt7343);
			for (@Pc(180) int local180 = Static62.aClass133Array1.length - 1; local180 >= 0; local180--) {
				@Pc(186) Class133 local186 = Static62.aClass133Array1[local180];
				if (local186 != null && local186.anInt3336 != -1) {
					@Pc(225) int local225;
					@Pc(218) int local218;
					if (local186.anInt3345 == 1 && local186.anInt3347 >= 0 && local186.anInt3347 < Static367.aClass8_Sub3_Sub1_Sub2Array1.length) {
						@Pc(209) Class8_Sub3_Sub1_Sub2 local209 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local186.anInt3347];
						if (local209 != null) {
							local218 = local209.anInt7339 - Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339;
							local225 = local209.anInt7343 - Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343;
							this.method4557(local225, 5760000, super.aClass116Array3[0], local186.anInt3336, local218, arg0, local19);
						}
					}
					if (local186.anInt3345 == 2) {
						@Pc(251) int local251 = local186.anInt3344 + 64 - Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339;
						local218 = local186.anInt3340 + 64 - Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343;
						local225 = local186.anInt3341 << 7;
						local225 *= local225;
						this.method4557(local218, local225, super.aClass116Array3[0], local186.anInt3336, local251, arg0, local19);
					}
					if (local186.anInt3345 == 10 && local186.anInt3347 >= 0 && local186.anInt3347 < Static267.aClass8_Sub3_Sub1_Sub1Array1.length) {
						@Pc(302) Class8_Sub3_Sub1_Sub1 local302 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local186.anInt3347];
						if (local302 != null) {
							local218 = local302.anInt7339 - Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339;
							local225 = local302.anInt7343 - Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343;
							this.method4557(local225, 5760000, super.aClass116Array3[0], local186.anInt3336, local218, arg0, local19);
						}
					}
				}
			}
			local19.ra(local24);
			local19.o(super.anInt7339, super.anInt7341, super.anInt7343);
		}
		arg0.g(local43, local46);
		@Pc(359) Class20_Sub5 local359 = Static371.method4760(super.aClass116Array3.length);
		if (super.aClass20_Sub3_7 == null) {
			arg0.method5372(super.aClass116Array3, local19, local359.aClass20_Sub8Array1, Static401.aClass8_Sub3_Sub1_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(366) Class83 local366 = super.aClass20_Sub3_7.method2129();
			arg0.method5358(super.aClass116Array3, local366, local19, local359.aClass20_Sub8Array1, Static401.aClass8_Sub3_Sub1_Sub1_2 == this ? 1 : 0);
		}
		this.method5904(false, super.aClass116Array3, arg0);
		if (super.aClass116Array3[2] != null) {
			if (local24 != 0) {
				super.aClass116Array3[2].Q(local24);
			}
			super.aClass116Array3[2].JA(-super.aClass4_Sub3_3.anInt153 + super.anInt7339, super.anInt7341 - super.aClass4_Sub3_3.anInt148, super.anInt7343 - super.aClass4_Sub3_3.anInt152);
		}
		super.anInt7369 = Static129.anInt2333;
		super.aClass116Array3[0] = super.aClass116Array3[1] = super.aClass116Array3[2] = super.aClass116Array3[3] = null;
		return local359;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IBBI)V")
	public void method4563(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7365 != -1 && Static170.aClass125_3.method2389(super.anInt7365).anInt3007 == 1) {
			super.anInt7365 = -1;
		}
		@Pc(38) Class172 local38;
		if (super.anInt7387 != -1) {
			local38 = Static452.aClass246_2.method5323(super.anInt7387);
			if (local38.aBoolean302 && local38.anInt4088 != -1 && Static170.aClass125_3.method2389(local38.anInt4088).anInt3007 == 1) {
				super.anInt7387 = -1;
			}
		}
		if (super.anInt7402 != -1) {
			local38 = Static452.aClass246_2.method5323(super.anInt7402);
			if (local38.aBoolean302 && local38.anInt4088 != -1 && Static170.aClass125_3.method2389(local38.anInt4088).anInt3007 == 1) {
				super.anInt7402 = -1;
			}
		}
		this.anInt5671 = -1;
		if (arg2 < 0 || Static337.anInt5497 <= arg2 || arg0 < 0 || arg0 >= Static282.anInt4644) {
			this.method4558(arg0, arg2);
		} else if (super.anIntArray560[0] >= 0 && super.anIntArray560[0] < Static337.anInt5497 && super.anIntArray559[0] >= 0 && Static282.anInt4644 > super.anIntArray559[0]) {
			if (arg1 == 2) {
				Static241.method3219(this, arg0, arg2);
			}
			this.method4550(arg2, arg1, arg0);
		} else {
			this.method4558(arg0, arg2);
		}
	}
}
