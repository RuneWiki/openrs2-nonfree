import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class20_Sub1_Sub2 extends Class20_Sub1 {

	@OriginalMember(owner = "client!uh", name = "lc", descriptor = "Lclient!kc;")
	private Class170 aClass170_2;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) Class14_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!lea;Lclient!nj;IIII)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!lea;[Lclient!uh;)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class20_Sub1_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
	private void method7296(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass14_Sub1_15.anInt5826;
		@Pc(10) short local10 = super.aShortArray140[arg0];
		@Pc(15) short local15 = super.aShortArray138[arg0];
		@Pc(20) short local20 = super.aShortArray137[arg0];
		@Pc(25) int local25 = super.anIntArray659[local10];
		@Pc(30) int local30 = super.anIntArray659[local15];
		@Pc(35) int local35 = super.anIntArray659[local20];
		if (super.lb == null) {
			this.aClass170_2.anInt4929 = 0;
		} else {
			this.aClass170_2.anInt4929 = super.lb[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray656[0] = super.anIntArray675[local10];
			super.anIntArray661[0] = super.anIntArray667[local10];
			local1++;
			super.anIntArray670[0] = super.anIntArray652[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray687[local10];
			local93 = super.anIntArray664[local10];
			local100 = super.anIntArray652[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class20_Sub1.anIntArray686[local35 - local25];
				super.anIntArray656[0] = super.aClass44_6.anInt8342 + (local88 + ((super.anIntArray687[local20] - local88) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[0] = super.aClass44_6.anInt8341 + (local93 + ((super.anIntArray664[local20] - local93) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				local1++;
				super.anIntArray670[0] = local100 + (((super.anIntArray651[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class20_Sub1.anIntArray686[local30 - local25];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local88 + ((super.anIntArray687[local15] - local88) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local93 + ((super.anIntArray664[local15] - local93) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray670[local1++] = local100 + (((super.anIntArray668[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray656[local1] = super.anIntArray675[local15];
			super.anIntArray661[local1] = super.anIntArray667[local15];
			super.anIntArray670[local1++] = super.anIntArray668[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray687[local15];
			local93 = super.anIntArray664[local15];
			local100 = super.anIntArray668[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class20_Sub1.anIntArray686[local25 - local30];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local88 + ((super.anIntArray687[local10] - local88) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local93 + ((super.anIntArray664[local10] - local93) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray670[local1++] = local100 + (((super.anIntArray652[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class20_Sub1.anIntArray686[local35 - local30];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local88 + ((super.anIntArray687[local20] - local88) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local93 + ((super.anIntArray664[local20] - local93) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray670[local1++] = local100 + (((super.anIntArray651[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray656[local1] = super.anIntArray675[local20];
			super.anIntArray661[local1] = super.anIntArray667[local20];
			super.anIntArray670[local1++] = super.anIntArray651[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray687[local20];
			local93 = super.anIntArray664[local20];
			local100 = super.anIntArray651[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class20_Sub1.anIntArray686[local30 - local35];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local88 + ((super.anIntArray687[local15] - local88) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local93 + ((super.anIntArray664[local15] - local93) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray670[local1++] = local100 + (((super.anIntArray668[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class20_Sub1.anIntArray686[local25 - local35];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local88 + ((super.anIntArray687[local10] - local88) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local93 + ((super.anIntArray664[local10] - local93) * local113 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray670[local1++] = local100 + (((super.anIntArray652[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray656[0];
		local93 = super.anIntArray656[1];
		local100 = super.anIntArray656[2];
		local113 = super.anIntArray661[0];
		@Pc(725) int local725 = super.anIntArray661[1];
		@Pc(730) int local730 = super.anIntArray661[2];
		this.aClass170_2.aBoolean344 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass44_6.anInt8343 || local93 > super.aClass44_6.anInt8343 || local100 > super.aClass44_6.anInt8343) {
				this.aClass170_2.aBoolean344 = true;
			}
			if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
				if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray112[arg0] & 0xFF;
					local838 = super.anIntArray660[local833];
					local843 = super.anIntArray683[local833];
					local848 = super.anIntArray672[local833];
				}
				if (super.anIntArray651[arg0] == -1) {
					this.aClass170_2.method4263(local113, local725, local730, local88, local93, local100, super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local838], super.anIntArray687[local843], super.anIntArray687[local848], super.anIntArray664[local838], super.anIntArray664[local843], super.anIntArray664[local848], super.anIntArray659[local838], super.anIntArray659[local843], super.anIntArray659[local848], super.aShortArray143[arg0]);
				} else {
					this.aClass170_2.method4263(local113, local725, local730, local88, local93, local100, super.anIntArray670[0], super.anIntArray670[1], super.anIntArray670[2], super.anIntArray687[local838], super.anIntArray687[local843], super.anIntArray687[local848], super.anIntArray664[local838], super.anIntArray664[local843], super.anIntArray664[local848], super.anIntArray659[local838], super.anIntArray659[local843], super.anIntArray659[local848], super.aShortArray143[arg0]);
				}
			} else if (super.anIntArray651[arg0] == -1) {
				this.aClass170_2.method4274(local113, local725, local730, local88, local93, local100, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]);
			} else {
				this.aClass170_2.method4265(local113, local725, local730, local88, local93, local100, super.anIntArray670[0], super.anIntArray670[1], super.anIntArray670[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass44_6.anInt8343 || local93 > super.aClass44_6.anInt8343 || local100 > super.aClass44_6.anInt8343 || super.anIntArray656[3] < 0 || super.anIntArray656[3] > super.aClass44_6.anInt8343) {
			this.aClass170_2.aBoolean344 = true;
		}
		if (super.aShortArray143 == null || super.aShortArray143[arg0] == -1) {
			if (super.anIntArray651[arg0] == -1) {
				local838 = Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF];
				this.aClass170_2.method4274(local113, local725, local730, local88, local93, local100, local838);
				this.aClass170_2.method4274(local113, local730, super.anIntArray661[3], local88, local100, super.anIntArray656[3], local838);
				return;
			}
			this.aClass170_2.method4265(local113, local725, local730, local88, local93, local100, super.anIntArray670[0], super.anIntArray670[1], super.anIntArray670[2]);
			this.aClass170_2.method4265(local113, local730, super.anIntArray661[3], local88, local100, super.anIntArray656[3], super.anIntArray670[0], super.anIntArray670[2], super.anIntArray670[3]);
			return;
		}
		if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray112[arg0] & 0xFF;
			local838 = super.anIntArray660[local833];
			local843 = super.anIntArray683[local833];
			local848 = super.anIntArray672[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray143[arg0];
		if (super.anIntArray651[arg0] == -1) {
			this.aClass170_2.method4263(local113, local725, local730, local88, local93, local100, super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local838], super.anIntArray687[local843], super.anIntArray687[local848], super.anIntArray664[local838], super.anIntArray664[local843], super.anIntArray664[local848], super.anIntArray659[local838], super.anIntArray659[local843], super.anIntArray659[local848], local1168);
			this.aClass170_2.method4263(local113, local730, super.anIntArray661[3], local88, local100, super.anIntArray656[3], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local838], super.anIntArray687[local843], super.anIntArray687[local848], super.anIntArray664[local838], super.anIntArray664[local843], super.anIntArray664[local848], super.anIntArray659[local838], super.anIntArray659[local843], super.anIntArray659[local848], local1168);
			return;
		}
		this.aClass170_2.method4263(local113, local725, local730, local88, local93, local100, super.anIntArray670[0], super.anIntArray670[1], super.anIntArray670[2], super.anIntArray687[local838], super.anIntArray687[local843], super.anIntArray687[local848], super.anIntArray664[local838], super.anIntArray664[local843], super.anIntArray664[local848], super.anIntArray659[local838], super.anIntArray659[local843], super.anIntArray659[local848], local1168);
		this.aClass170_2.method4263(local113, local730, super.anIntArray661[3], local88, local100, super.anIntArray656[3], super.anIntArray670[0], super.anIntArray670[2], super.anIntArray670[3], super.anIntArray687[local838], super.anIntArray687[local843], super.anIntArray687[local848], super.anIntArray664[local838], super.anIntArray664[local843], super.anIntArray664[local848], super.anIntArray659[local838], super.anIntArray659[local843], super.anIntArray659[local848], local1168);
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
	private void method7297(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray38[arg0]) {
			this.method7296(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray140[arg0];
		@Pc(18) short local18 = super.aShortArray138[arg0];
		@Pc(23) short local23 = super.aShortArray137[arg0];
		this.aClass170_2.aBoolean344 = super.aBooleanArray39[arg0];
		if (super.lb == null) {
			this.aClass170_2.anInt4929 = 0;
		} else {
			this.aClass170_2.anInt4929 = super.lb[arg0] & 0xFF;
		}
		if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray112[arg0] & 0xFF;
				local165 = super.anIntArray660[local160];
				local170 = super.anIntArray683[local160];
				local175 = super.anIntArray672[local160];
			}
			if (super.anIntArray651[arg0] == -1) {
				this.aClass170_2.method4263(super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray667[local23], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray675[local23], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local165], super.anIntArray687[local170], super.anIntArray687[local175], super.anIntArray664[local165], super.anIntArray664[local170], super.anIntArray664[local175], super.anIntArray659[local165], super.anIntArray659[local170], super.anIntArray659[local175], super.aShortArray143[arg0]);
			} else {
				this.aClass170_2.method4263(super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray667[local23], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray675[local23], super.anIntArray652[arg0], super.anIntArray668[arg0], super.anIntArray651[arg0], super.anIntArray687[local165], super.anIntArray687[local170], super.anIntArray687[local175], super.anIntArray664[local165], super.anIntArray664[local170], super.anIntArray664[local175], super.anIntArray659[local165], super.anIntArray659[local170], super.anIntArray659[local175], super.aShortArray143[arg0]);
			}
		} else if (super.anIntArray651[arg0] == -1) {
			this.aClass170_2.method4274(super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray667[local23], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray675[local23], Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]);
		} else {
			this.aClass170_2.method4265(super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray667[local23], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray675[local23], super.anIntArray652[arg0] & 0xFFFF, super.anIntArray668[arg0] & 0xFFFF, super.anIntArray651[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "()V")
	@Override
	protected void method7278() {
		super.aClass44_6.anInt8343 = this.aClass170_2.anInt4928;
		super.aClass44_6.anInt8342 = this.aClass170_2.anInt4930;
		super.aClass44_6.anInt8341 = this.aClass170_2.anInt4927;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class20 method7264(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7285(Thread.currentThread());
		@Pc(11) Class20_Sub1 local11;
		@Pc(8) Class20_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass20_Sub1_58;
			local11 = super.aClass20_Sub1_57;
		} else if (arg0 == 2) {
			local8 = super.aClass20_Sub1_51;
			local11 = super.aClass20_Sub1_59;
		} else if (arg0 == 3) {
			local8 = super.aClass20_Sub1_54;
			local11 = super.aClass20_Sub1_53;
		} else if (arg0 == 4) {
			local8 = super.aClass20_Sub1_56;
			local11 = super.aClass20_Sub1_52;
		} else if (arg0 == 5) {
			local8 = super.aClass20_Sub1_60;
			local11 = super.aClass20_Sub1_55;
		} else {
			local11 = local8 = new Class20_Sub1_Sub2(super.aClass14_Sub1_15);
		}
		return this.method7290(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7279(@OriginalArg(0) Thread arg0) {
		super.method7279(arg0);
		@Pc(8) Class44_Sub2 local8 = (Class44_Sub2) super.aClass14_Sub1_15.method5048(arg0);
		this.aClass170_2 = local8.aClass170_1;
		super.anIntArray673 = local8.anIntArray633;
		super.anIntArray653 = local8.anIntArray631;
		super.anIntArrayArray82 = local8.anIntArrayArray76;
		super.anIntArray655 = local8.anIntArray636;
		super.anIntArrayArray78 = local8.anIntArrayArray74;
		super.anIntArray669 = local8.anIntArray634;
		super.anIntArrayArray77 = local8.anIntArrayArray75;
		super.anIntArray682 = local8.anIntArray635;
		super.anIntArray674 = local8.lb;
		super.anIntArray676 = local8.anIntArray632;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method7283(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12;
		if (arg3 + 2 > 2200) {
			local12 = Static564.method7583(arg3) + 1 - Static477.anInt8874;
			arg3 = (arg3 >> local12) + 2;
		} else {
			local12 = 0;
			arg3 += 2;
		}
		for (@Pc(24) int local24 = 0; local24 < 2200; local24++) {
			super.anIntArray653[local24] = 0;
		}
		@Pc(36) int local36 = 0;
		@Pc(41) int local41;
		if (super.aClass157Array3 != null) {
			local41 = 0;
			while (local41 < super.anInt8866) {
				@Pc(47) Class157 local47 = super.aClass157Array3[local41];
				super.anIntArray666[local47.anInt4740] = local41++;
			}
		}
		@Pc(87) int local87;
		@Pc(92) int local92;
		@Pc(97) int local97;
		@Pc(113) int local113;
		@Pc(123) int local123;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(143) int local143;
		@Pc(148) int local148;
		@Pc(153) int local153;
		@Pc(193) int local193;
		for (local41 = 0; local41 < super.anInt8879; local41++) {
			if (super.anIntArray651[local41] != -2) {
				@Pc(72) short local72 = super.aShortArray140[local41];
				@Pc(77) short local77 = super.aShortArray138[local41];
				@Pc(82) short local82 = super.aShortArray137[local41];
				local87 = super.anIntArray675[local72];
				local92 = super.anIntArray675[local77];
				local97 = super.anIntArray675[local82];
				@Pc(118) int local118;
				if (arg0 && (local87 == -5000 || local92 == -5000 || local97 == -5000)) {
					local113 = super.anIntArray687[local72];
					local118 = super.anIntArray687[local77];
					local123 = super.anIntArray687[local82];
					local128 = super.anIntArray664[local72];
					local133 = super.anIntArray664[local77];
					local138 = super.anIntArray664[local82];
					local143 = super.anIntArray659[local72];
					local148 = super.anIntArray659[local77];
					local153 = super.anIntArray659[local82];
					@Pc(157) int local157 = local113 - local118;
					@Pc(161) int local161 = local123 - local118;
					@Pc(165) int local165 = local128 - local133;
					@Pc(169) int local169 = local138 - local133;
					@Pc(173) int local173 = local143 - local148;
					@Pc(177) int local177 = local153 - local148;
					@Pc(185) int local185 = local165 * local177 - local173 * local169;
					local193 = local173 * local161 - local157 * local177;
					@Pc(201) int local201 = local157 * local169 - local165 * local161;
					if (local118 * local185 + local133 * local193 + local148 * local201 > 0) {
						super.aBooleanArray38[local41] = true;
						@Pc(237) int local237 = (super.anIntArray673[local72] + super.anIntArray673[local77] + super.anIntArray673[local82]) / 3 >> local12;
						if (super.anIntArray653[local237] < 64) {
							super.anIntArrayArray82[local237][super.anIntArray653[local237]++] = local41;
						} else {
							@Pc(264) int local264 = super.anIntArray653[local237];
							if (local264 == 64) {
								if (local36 == 512) {
									continue;
								}
								super.anIntArray655[local36] = 0;
								super.anIntArray653[local237] = local264 = local36++ + 65;
							}
							local264 -= 65;
							super.anIntArrayArray78[local264][super.anIntArray655[local264]++] = local41;
						}
					}
				} else if (super.anIntArray666[local41] != -1 || (local87 - local92) * (super.anIntArray667[local82] - super.anIntArray667[local77]) - (super.anIntArray667[local72] - super.anIntArray667[local77]) * (local97 - local92) > 0) {
					super.aBooleanArray38[local41] = false;
					if (local87 >= 0 && local92 >= 0 && local97 >= 0 && local87 <= super.aClass44_6.anInt8343 && local92 <= super.aClass44_6.anInt8343 && local97 <= super.aClass44_6.anInt8343) {
						super.aBooleanArray39[local41] = false;
					} else {
						super.aBooleanArray39[local41] = true;
					}
					local113 = (super.anIntArray673[local72] + super.anIntArray673[local77] + super.anIntArray673[local82]) / 3 >> local12;
					if (super.anIntArray653[local113] < 64) {
						super.anIntArrayArray82[local113][super.anIntArray653[local113]++] = local41;
					} else {
						local118 = super.anIntArray653[local113];
						if (local118 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray655[local36] = 0;
							super.anIntArray653[local113] = local118 = local36++ + 65;
						}
						local118 -= 65;
						super.anIntArrayArray78[local118][super.anIntArray655[local118]++] = local41;
					}
				}
			}
		}
		@Pc(467) int local467;
		@Pc(477) int local477;
		@Pc(513) int local513;
		if (arg4) {
			for (local467 = 0; local467 < arg5; local467++) {
				local477 = super.anIntArray658[local467] - arg2 >> local12;
				if (local477 >= 0 && local477 < 2200) {
					if (super.anIntArray653[local477] < 64) {
						super.anIntArrayArray82[local477][super.anIntArray653[local477]++] = local467 + 1 << 16;
					} else {
						local513 = super.anIntArray653[local477];
						if (local513 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray655[local36] = 0;
							super.anIntArray653[local477] = local513 = local36++ + 65;
						}
						local513 -= 65;
						super.anIntArrayArray78[local513][super.anIntArray655[local513]++] = local467 + 1 << 16;
					}
				}
			}
		}
		if (super.aByteArray113 == null) {
			@Pc(593) int[] local593;
			if (!arg4 && super.aClass157Array3 == null) {
				if (arg1) {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray653[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray82[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method7298(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray653[local467] - 64 - 1;
							local593 = super.anIntArrayArray78[local513];
							for (local92 = 0; local92 < super.anIntArray655[local513]; local92++) {
								this.method7298(local593[local92]);
							}
						}
					}
				} else {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray653[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray82[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method7297(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray653[local467] - 64 - 1;
							local593 = super.anIntArrayArray78[local513];
							for (local92 = 0; local92 < super.anIntArray655[local513]; local92++) {
								this.method7297(local593[local92]);
							}
						}
					}
				}
			} else if (arg1) {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray653[local467];
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray82[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray666[local97];
								if (local113 == -1 || !super.aClass157Array3[local113].aBoolean324) {
									this.method7298(local97);
								}
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray653[local467] - 64 - 1;
						local593 = super.anIntArrayArray78[local513];
						for (local92 = 0; local92 < super.anIntArray655[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray666[local97];
								if (local113 == -1 || !super.aClass157Array3[local113].aBoolean324) {
									this.method7298(local97);
								}
							}
						}
					}
				}
			} else {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray653[local467];
					@Pc(726) Class157 local726;
					@Pc(780) Class98_Sub1_Sub1 local780;
					@Pc(731) Class133 local731;
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray82[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray666[local97];
								if (local113 == -1) {
									this.method7297(local593[local92]);
								} else {
									local726 = super.aClass157Array3[local113];
									local731 = super.aClass133Array3[local113];
									if (!local726.aBoolean324) {
										this.method7297(local97);
									}
									super.aClass14_Sub1_15.method5054(local731.anInt3877, local731.anInt3881, local731.anInt3880, local731.anInt3876, local731.anInt3870, local731.anInt3873, local726.aShort43 & 0xFFFF, local731.anInt3871, local726.aByte38, local726.aByte39);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass98_Sub1_Sub1Array6[local113];
								local123 = super.anIntArray658[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass14_Sub1_15.method5059(local780, super.anIntArray681[local113], super.anIntArray677[local113], local123, (local780.anInt9516 * super.aClass14_Sub1_15.anInt5818 >> 12) / local123);
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray653[local467] - 64 - 1;
						local593 = super.anIntArrayArray78[local513];
						for (local92 = 0; local92 < super.anIntArray655[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray666[local97];
								if (local113 == -1) {
									this.method7297(local593[local92]);
								} else {
									local726 = super.aClass157Array3[local113];
									local731 = super.aClass133Array3[local113];
									if (!local726.aBoolean324) {
										this.method7297(local97);
									}
									super.aClass14_Sub1_15.method5054(local731.anInt3877, local731.anInt3881, local731.anInt3880, local731.anInt3876, local731.anInt3870, local731.anInt3873, local726.aShort43 & 0xFFFF, local731.anInt3871, local726.aByte38, local726.aByte39);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass98_Sub1_Sub1Array6[local113];
								local123 = super.anIntArray658[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass14_Sub1_15.method5059(local780, super.anIntArray681[local113], super.anIntArray677[local113], local123, (local780.anInt9516 * super.aClass14_Sub1_15.anInt5818 >> 12) / local123);
							}
						}
					}
				}
			}
			return;
		}
		for (local467 = 0; local467 < 12; local467++) {
			super.anIntArray669[local467] = 0;
			super.anIntArray676[local467] = 0;
		}
		@Pc(1143) int[] local1143;
		@Pc(1158) byte local1158;
		if (arg4) {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray653[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray82[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray113[local113];
							local123 = super.anIntArray669[local1158]++;
							super.anIntArrayArray77[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray676[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray682[local123] = local477;
							} else {
								super.anIntArray674[local123] = local477;
							}
						} else {
							local1158 = super.aClass98_Sub1_Sub1Array6[(local113 >> 16) - 1].aByte106;
							local123 = super.anIntArray669[local1158]++;
							super.anIntArrayArray77[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray676[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray682[local123] = local477;
							} else {
								super.anIntArray674[local123] = local477;
							}
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray653[local477] - 64 - 1;
					local1143 = super.anIntArrayArray78[local87];
					for (local97 = 0; local97 < super.anIntArray655[local87]; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray113[local113];
							local123 = super.anIntArray669[local1158]++;
							super.anIntArrayArray77[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray676[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray682[local123] = local477;
							} else {
								super.anIntArray674[local123] = local477;
							}
						} else {
							local1158 = super.aClass98_Sub1_Sub1Array6[(local113 >> 16) - 1].aByte106;
							local123 = super.anIntArray669[local1158]++;
							super.anIntArrayArray77[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray676[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray682[local123] = local477;
							} else {
								super.anIntArray674[local123] = local477;
							}
						}
					}
				}
			}
		} else {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray653[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray82[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray113[local113];
						local123 = super.anIntArray669[local1158]++;
						super.anIntArrayArray77[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray676[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray682[local123] = local477;
						} else {
							super.anIntArray674[local123] = local477;
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray653[local477] - 64 - 1;
					local1143 = super.anIntArrayArray78[local87];
					for (local97 = 0; local97 < super.anIntArray655[local87]; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray113[local113];
						local123 = super.anIntArray669[local1158]++;
						super.anIntArrayArray77[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray676[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray682[local123] = local477;
						} else {
							super.anIntArray674[local123] = local477;
						}
					}
				}
			}
		}
		local477 = 0;
		if (super.anIntArray669[1] > 0 || super.anIntArray669[2] > 0) {
			local477 = (super.anIntArray676[1] + super.anIntArray676[2]) / (super.anIntArray669[1] + super.anIntArray669[2]);
		}
		local513 = 0;
		if (super.anIntArray669[3] > 0 || super.anIntArray669[4] > 0) {
			local513 = (super.anIntArray676[3] + super.anIntArray676[4]) / (super.anIntArray669[3] + super.anIntArray669[4]);
		}
		local87 = 0;
		if (super.anIntArray669[6] > 0 || super.anIntArray669[8] > 0) {
			local87 = (super.anIntArray676[6] + super.anIntArray676[8]) / (super.anIntArray669[6] + super.anIntArray669[8]);
		}
		local97 = 0;
		local113 = super.anIntArray669[10];
		@Pc(1673) int[] local1673 = super.anIntArrayArray77[10];
		@Pc(1676) int[] local1676 = super.anIntArray682;
		if (local113 == 0) {
			local97 = 0;
			local113 = super.anIntArray669[11];
			local1673 = super.anIntArrayArray77[11];
			local1676 = super.anIntArray674;
		}
		if (local113 > 0) {
			local92 = local1676[0];
		} else {
			local92 = -1000;
		}
		@Pc(1928) Class157 local1928;
		@Pc(1980) Class98_Sub1_Sub1 local1980;
		@Pc(1933) Class133 local1933;
		for (local128 = 0; local128 < 10; local128++) {
			if (arg1) {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray666[local133];
						if (local138 == -1 || !super.aClass157Array3[local138].aBoolean324) {
							this.method7298(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
						local97 = 0;
						local113 = super.anIntArray669[11];
						local1673 = super.anIntArrayArray77[11];
						local1676 = super.anIntArray674;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray666[local133];
						if (local138 == -1 || !super.aClass157Array3[local138].aBoolean324) {
							this.method7298(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
						local97 = 0;
						local113 = super.anIntArray669[11];
						local1673 = super.anIntArrayArray77[11];
						local1676 = super.anIntArray674;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray666[local133];
						if (local138 == -1 || !super.aClass157Array3[local138].aBoolean324) {
							this.method7298(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
						local97 = 0;
						local113 = super.anIntArray669[11];
						local1673 = super.anIntArrayArray77[11];
						local1676 = super.anIntArray674;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray666[local133];
						if (local138 == -1) {
							this.method7297(local133);
						} else {
							local1928 = super.aClass157Array3[local138];
							local1933 = super.aClass133Array3[local138];
							if (!local1928.aBoolean324) {
								this.method7297(local133);
							}
							super.aClass14_Sub1_15.method5054(local1933.anInt3877, local1933.anInt3881, local1933.anInt3880, local1933.anInt3876, local1933.anInt3870, local1933.anInt3873, local1928.aShort43 & 0xFFFF, local1933.anInt3871, local1928.aByte38, local1928.aByte39);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass98_Sub1_Sub1Array6[local138];
						local148 = super.anIntArray658[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass14_Sub1_15.method5059(local1980, super.anIntArray681[local138], super.anIntArray677[local138], local148, (local1980.anInt9516 * super.aClass14_Sub1_15.anInt5818 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
						local97 = 0;
						local113 = super.anIntArray669[11];
						local1673 = super.anIntArrayArray77[11];
						local1676 = super.anIntArray674;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray666[local133];
						if (local138 == -1) {
							this.method7297(local133);
						} else {
							local1928 = super.aClass157Array3[local138];
							local1933 = super.aClass133Array3[local138];
							if (!local1928.aBoolean324) {
								this.method7297(local133);
							}
							super.aClass14_Sub1_15.method5054(local1933.anInt3877, local1933.anInt3881, local1933.anInt3880, local1933.anInt3876, local1933.anInt3870, local1933.anInt3873, local1928.aShort43 & 0xFFFF, local1933.anInt3871, local1928.aByte38, local1928.aByte39);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass98_Sub1_Sub1Array6[local138];
						local148 = super.anIntArray658[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass14_Sub1_15.method5059(local1980, super.anIntArray681[local138], super.anIntArray677[local138], local148, (local1980.anInt9516 * super.aClass14_Sub1_15.anInt5818 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
						local97 = 0;
						local113 = super.anIntArray669[11];
						local1673 = super.anIntArrayArray77[11];
						local1676 = super.anIntArray674;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray666[local133];
						if (local138 == -1) {
							this.method7297(local133);
						} else {
							local1928 = super.aClass157Array3[local138];
							local1933 = super.aClass133Array3[local138];
							if (!local1928.aBoolean324) {
								this.method7297(local133);
							}
							super.aClass14_Sub1_15.method5054(local1933.anInt3877, local1933.anInt3881, local1933.anInt3880, local1933.anInt3876, local1933.anInt3870, local1933.anInt3873, local1928.aShort43 & 0xFFFF, local1933.anInt3871, local1928.aByte38, local1928.aByte39);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass98_Sub1_Sub1Array6[local138];
						local148 = super.anIntArray658[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass14_Sub1_15.method5059(local1980, super.anIntArray681[local138], super.anIntArray677[local138], local148, (local1980.anInt9516 * super.aClass14_Sub1_15.anInt5818 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
						local97 = 0;
						local113 = super.anIntArray669[11];
						local1673 = super.anIntArrayArray77[11];
						local1676 = super.anIntArray674;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
			local133 = super.anIntArray669[local128];
			@Pc(2353) int[] local2353 = super.anIntArrayArray77[local128];
			if (!arg4 && super.aClass157Array3 == null) {
				if (arg1) {
					for (local143 = 0; local143 < local133; local143++) {
						this.method7298(local2353[local143]);
					}
				} else {
					for (local143 = 0; local143 < local133; local143++) {
						this.method7297(local2353[local143]);
					}
				}
			} else if (arg1) {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray666[local148];
						if (local153 == -1 || !super.aClass157Array3[local153].aBoolean324) {
							this.method7298(local148);
						}
					}
				}
			} else {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray666[local148];
						if (local153 == -1) {
							this.method7297(local148);
						} else {
							@Pc(2415) Class157 local2415 = super.aClass157Array3[local153];
							@Pc(2420) Class133 local2420 = super.aClass133Array3[local153];
							if (!local2415.aBoolean324) {
								this.method7297(local148);
							}
							super.aClass14_Sub1_15.method5054(local2420.anInt3877, local2420.anInt3881, local2420.anInt3880, local2420.anInt3876, local2420.anInt3870, local2420.anInt3873, local2415.aShort43 & 0xFFFF, local2420.anInt3871, local2415.aByte38, local2415.aByte39);
						}
					} else {
						local153 = (local148 >> 16) - 1;
						@Pc(2467) Class98_Sub1_Sub1 local2467 = super.aClass98_Sub1_Sub1Array6[local153];
						local193 = super.anIntArray658[local153];
						if (local193 == 0) {
							local193 = 1;
						}
						super.aClass14_Sub1_15.method5059(local2467, super.anIntArray681[local153], super.anIntArray677[local153], local193, (local2467.anInt9516 * super.aClass14_Sub1_15.anInt5818 >> 12) / local193);
					}
				}
			}
		}
		if (!arg4 && super.aClass157Array3 == null) {
			if (arg1) {
				while (local92 != -1000) {
					this.method7298(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray77[11];
						local113 = super.anIntArray669[11];
						local1676 = super.anIntArray674;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local92 != -1000) {
					this.method7297(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray77[11];
						local113 = super.anIntArray669[11];
						local1676 = super.anIntArray674;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
		} else if (arg1) {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray666[local133];
					if (local138 == -1 || !super.aClass157Array3[local138].aBoolean324) {
						this.method7298(local133);
					}
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray77[11];
					local113 = super.anIntArray669[11];
					local1676 = super.anIntArray674;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		} else {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray666[local133];
					if (local138 == -1) {
						this.method7297(local133);
					} else {
						local1928 = super.aClass157Array3[local138];
						local1933 = super.aClass133Array3[local138];
						if (!local1928.aBoolean324) {
							this.method7297(local133);
						}
						super.aClass14_Sub1_15.method5054(local1933.anInt3877, local1933.anInt3881, local1933.anInt3880, local1933.anInt3876, local1933.anInt3870, local1933.anInt3873, local1928.aShort43 & 0xFFFF, local1933.anInt3871, local1928.aByte38, local1928.aByte39);
					}
				} else {
					local138 = (local133 >> 16) - 1;
					local1980 = super.aClass98_Sub1_Sub1Array6[local138];
					local148 = super.anIntArray658[local138];
					if (local148 == 0) {
						local148 = 1;
					}
					super.aClass14_Sub1_15.method5059(local1980, super.anIntArray681[local138], super.anIntArray677[local138], local148, (local1980.anInt9516 * super.aClass14_Sub1_15.anInt5818 >> 12) / local148);
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray77[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray77[11];
					local113 = super.anIntArray669[11];
					local1676 = super.anIntArray674;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
	private void method7298(@OriginalArg(0) int arg0) {
		@Pc(8) short local8;
		@Pc(13) short local13;
		@Pc(18) short local18;
		@Pc(27) int local27;
		@Pc(46) int local46;
		@Pc(65) int local65;
		@Pc(81) int local81;
		@Pc(309) int local309;
		@Pc(314) int local314;
		@Pc(319) int local319;
		if (!super.aClass14_Sub1_15.aBoolean409) {
			local8 = super.aShortArray140[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray137[arg0];
			local27 = super.anIntArray680[local8] - super.aClass14_Sub1_15.anInt5845;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray680[local13] - super.aClass14_Sub1_15.anInt5845;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray680[local18] - super.aClass14_Sub1_15.anInt5845;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method7297(arg0);
				} else {
					if (super.lb == null) {
						this.aClass170_2.anInt4929 = 0;
					} else {
						this.aClass170_2.anInt4929 = super.lb[arg0] & 0xFF;
					}
					this.aClass170_2.aBoolean344 = super.aBooleanArray39[arg0];
					if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
						if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray112[arg0] & 0xFF;
							local309 = super.anIntArray660[local304];
							local314 = super.anIntArray683[local304];
							local319 = super.anIntArray672[local304];
						}
						if (super.anIntArray651[arg0] == -1) {
							this.aClass170_2.method4268(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.aClass14_Sub1_15.anInt5842, local27, local46, local65, super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local309], super.anIntArray687[local314], super.anIntArray687[local319], super.anIntArray664[local309], super.anIntArray664[local314], super.anIntArray664[local319], super.anIntArray659[local309], super.anIntArray659[local314], super.anIntArray659[local319], super.aShortArray143[arg0]);
						} else {
							this.aClass170_2.method4268(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.aClass14_Sub1_15.anInt5842, local27, local46, local65, super.anIntArray652[arg0], super.anIntArray668[arg0], super.anIntArray651[arg0], super.anIntArray687[local309], super.anIntArray687[local314], super.anIntArray687[local319], super.anIntArray664[local309], super.anIntArray664[local314], super.anIntArray664[local319], super.anIntArray659[local309], super.anIntArray659[local314], super.anIntArray659[local319], super.aShortArray143[arg0]);
						}
					} else if (super.anIntArray651[arg0] == -1) {
						this.aClass170_2.method4270(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], Static412.method5964(local27 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local46 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local65 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]));
					} else {
						this.aClass170_2.method4270(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], Static412.method5964(local27 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local46 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray668[arg0] & 0xFFFF]), Static412.method5964(local65 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray651[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray38[arg0]) {
			local8 = super.aShortArray140[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray137[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray662[local8] > super.aClass14_Sub1_15.anInt5828) {
				local27 = 255;
			} else if (super.anIntArray662[local8] > super.aClass14_Sub1_15.anInt5819) {
				local27 = (super.aClass14_Sub1_15.anInt5819 - super.anIntArray662[local8]) * 255 / (super.aClass14_Sub1_15.anInt5819 - super.aClass14_Sub1_15.anInt5828);
			}
			if (super.anIntArray662[local13] > super.aClass14_Sub1_15.anInt5828) {
				local46 = 255;
			} else if (super.anIntArray662[local13] > super.aClass14_Sub1_15.anInt5819) {
				local46 = (super.aClass14_Sub1_15.anInt5819 - super.anIntArray662[local13]) * 255 / (super.aClass14_Sub1_15.anInt5819 - super.aClass14_Sub1_15.anInt5828);
			}
			if (super.anIntArray662[local18] > super.aClass14_Sub1_15.anInt5828) {
				local65 = 255;
			} else if (super.anIntArray662[local18] > super.aClass14_Sub1_15.anInt5819) {
				local65 = (super.aClass14_Sub1_15.anInt5819 - super.anIntArray662[local18]) * 255 / (super.aClass14_Sub1_15.anInt5819 - super.aClass14_Sub1_15.anInt5828);
			}
			if (super.lb == null) {
				this.aClass170_2.anInt4929 = 0;
			} else {
				this.aClass170_2.anInt4929 = super.lb[arg0] & 0xFF;
			}
			this.aClass170_2.aBoolean344 = super.aBooleanArray39[arg0];
			if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
				if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray112[arg0] & 0xFF;
					local81 = super.anIntArray660[local319];
					local309 = super.anIntArray683[local319];
					local314 = super.anIntArray672[local319];
				}
				if (super.anIntArray651[arg0] == -1) {
					this.aClass170_2.method4268(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.aClass14_Sub1_15.anInt5842, local27, local46, local65, super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local81], super.anIntArray687[local309], super.anIntArray687[local314], super.anIntArray664[local81], super.anIntArray664[local309], super.anIntArray664[local314], super.anIntArray659[local81], super.anIntArray659[local309], super.anIntArray659[local314], super.aShortArray143[arg0]);
				} else {
					this.aClass170_2.method4268(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.aClass14_Sub1_15.anInt5842, local27, local46, local65, super.anIntArray652[arg0], super.anIntArray668[arg0], super.anIntArray651[arg0], super.anIntArray687[local81], super.anIntArray687[local309], super.anIntArray687[local314], super.anIntArray664[local81], super.anIntArray664[local309], super.anIntArray664[local314], super.anIntArray659[local81], super.anIntArray659[local309], super.anIntArray659[local314], super.aShortArray143[arg0]);
				}
			} else if (super.anIntArray651[arg0] == -1) {
				this.aClass170_2.method4270(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], Static412.method5964(local27 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local46 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local65 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]));
			} else {
				this.aClass170_2.method4270(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], Static412.method5964(local27 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local46 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray668[arg0] & 0xFFFF]), Static412.method5964(local65 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray651[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	@Override
	protected void method7292(@OriginalArg(0) int arg0) {
		this.aClass170_2.aBoolean345 = (arg0 & 0x1) == 0;
		this.aClass170_2.aBoolean347 = false;
	}

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "()V")
	@Override
	protected void method7281() {
		this.aClass170_2 = null;
	}
}
