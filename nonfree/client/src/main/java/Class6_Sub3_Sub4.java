import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class6_Sub3_Sub4 extends Class6_Sub3 {

	@OriginalMember(owner = "client!bea", name = "I", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!bea", name = "M", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bea", name = "G", descriptor = "I")
	public int anInt726 = 1638;

	@OriginalMember(owner = "client!bea", name = "H", descriptor = "I")
	public int anInt727 = 4;

	@OriginalMember(owner = "client!bea", name = "Q", descriptor = "[B")
	private byte[] aByteArray2 = new byte[512];

	@OriginalMember(owner = "client!bea", name = "N", descriptor = "I")
	public int anInt731 = 4;

	@OriginalMember(owner = "client!bea", name = "U", descriptor = "I")
	public int anInt736 = 0;

	@OriginalMember(owner = "client!bea", name = "T", descriptor = "Z")
	public boolean aBoolean49 = true;

	@OriginalMember(owner = "client!bea", name = "K", descriptor = "I")
	public int anInt729 = 4;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIII)I")
	private int method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17 = arg3 >> 12;
		@Pc(21) int local21 = local17 + 1;
		@Pc(25) int local25 = local17 & 0xFF;
		@Pc(29) int local29 = arg3 & 0xFFF;
		if (local21 >= arg4) {
			local21 = 0;
		}
		local21 &= 0xFF;
		@Pc(46) int local46 = local29 - 4096;
		@Pc(50) int local50 = arg2 - 4096;
		@Pc(54) int local54 = Class6_Sub5_Sub13.anIntArray455[local29];
		@Pc(64) int local64 = this.aByteArray2[local25 + arg5] & 0x3;
		@Pc(84) int local84;
		if (local64 > 1) {
			local84 = local64 == 2 ? local29 - arg2 : -arg2 + -local29;
		} else {
			local84 = local64 == 0 ? arg2 + local29 : arg2 + -local29;
		}
		local64 = this.aByteArray2[local21 + arg5] & 0x3;
		@Pc(125) int local125;
		if (local64 > 1) {
			local125 = local64 == 2 ? local46 - arg2 : -arg2 + -local46;
		} else {
			local125 = local64 == 0 ? local46 + arg2 : arg2 - local46;
		}
		@Pc(152) int local152 = (local54 * (local125 - local84) >> 12) + local84;
		local64 = this.aByteArray2[local25 + arg1] & 0x3;
		if (local64 > 1) {
			local84 = local64 == 2 ? local29 - local50 : -local29 - local50;
		} else {
			local84 = local64 == 0 ? local50 + local29 : -local29 + local50;
		}
		local64 = this.aByteArray2[local21 + arg1] & 0x3;
		if (local64 > 1) {
			local125 = local64 == 2 ? local46 - local50 : -local50 + -local46;
		} else {
			local125 = local64 == 0 ? local50 + local46 : local50 - local46;
		}
		@Pc(242) int local242 = (local54 * (local125 - local84) >> 12) + local84;
		return local152 + ((local242 - local152) * arg0 >> 12);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			this.method634(arg0, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		this.aByteArray2 = Static160.method2482(this.anInt736);
		this.method633();
		for (@Pc(25) int local25 = this.anInt731 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray5[local25];
			if (local32 > 8 || local32 < -8) {
				return;
			}
			this.anInt731--;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
	private void method633() {
		@Pc(23) int local23;
		if (this.anInt726 > 0) {
			this.aShortArray5 = new short[this.anInt731];
			this.aShortArray6 = new short[this.anInt731];
			for (local23 = 0; local23 < this.anInt731; local23++) {
				this.aShortArray5[local23] = (short) (Math.pow((double) ((float) this.anInt726 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray6[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray5 != null && this.anInt731 == this.aShortArray5.length) {
			this.aShortArray6 = new short[this.anInt731];
			for (local23 = 0; local23 < this.anInt731; local23++) {
				this.aShortArray6[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.aBoolean49 = arg1.method6019() == 1;
		} else if (arg0 == 1) {
			this.anInt731 = arg1.method6019();
		} else if (arg0 == 2) {
			this.anInt726 = arg1.method6023();
			if (this.anInt726 < 0) {
				this.aShortArray5 = new short[this.anInt731];
				for (@Pc(77) int local77 = 0; local77 < this.anInt731; local77++) {
					this.aShortArray5[local77] = (short) arg1.method6023();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt727 = this.anInt729 = arg1.method6019();
			return;
		} else if (arg0 == 4) {
			this.anInt736 = arg1.method6019();
			return;
		} else if (arg0 == 5) {
			this.anInt727 = arg1.method6019();
			return;
		} else if (arg0 == 6) {
			this.anInt729 = arg1.method6019();
			return;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II[I)V")
	public void method634(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt729 * Static77.anIntArray116[arg0];
		@Pc(121) int local121;
		@Pc(135) int local135;
		@Pc(47) int local47;
		@Pc(34) short local34;
		@Pc(112) int local112;
		@Pc(67) int local67;
		@Pc(61) int local61;
		@Pc(54) int local54;
		@Pc(110) int local110;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(106) int local106;
		@Pc(97) int local97;
		if (this.anInt731 == 1) {
			local34 = this.aShortArray5[0];
			local47 = this.aShortArray6[0] << 12;
			local67 = local47 * local12 >> 12;
			local54 = this.anInt729 * local47 >> 12;
			local61 = local47 * this.anInt727 >> 12;
			local71 = local67 >> 12;
			local75 = local71 + 1;
			@Pc(389) int local389 = local67 & 0xFFF;
			if (local54 <= local75) {
				local75 = 0;
			}
			local97 = this.aByteArray2[local75 & 0xFF] & 0xFF;
			local106 = this.aByteArray2[local71 & 0xFF] & 0xFF;
			local110 = Class6_Sub5_Sub13.anIntArray455[local389];
			if (this.aBoolean49) {
				for (local112 = 0; local112 < Static35.anInt670; local112++) {
					local121 = this.anInt727 * Static372.anIntArray481[local112];
					local135 = this.method632(local110, local97, local389, local47 * local121 >> 12, local61, local106);
					local135 = local34 * local135 >> 12;
					arg1[local112] = (local135 >> 1) + 2048;
				}
			} else {
				for (local112 = 0; local112 < Static35.anInt670; local112++) {
					local121 = Static372.anIntArray481[local112] * this.anInt727;
					local135 = this.method632(local110, local97, local389, local47 * local121 >> 12, local61, local106);
					arg1[local112] = local34 * local135 >> 12;
				}
			}
			return;
		}
		local34 = this.aShortArray5[0];
		if (local34 > 8 || local34 < -8) {
			local47 = this.aShortArray6[0] << 12;
			local54 = local47 * this.anInt729 >> 12;
			local61 = this.anInt727 * local47 >> 12;
			local67 = local47 * local12 >> 12;
			local71 = local67 >> 12;
			local75 = local71 + 1;
			if (local75 >= local54) {
				local75 = 0;
			}
			local67 &= 0xFFF;
			local97 = this.aByteArray2[local75 & 0xFF] & 0xFF;
			local106 = this.aByteArray2[local71 & 0xFF] & 0xFF;
			local110 = Class6_Sub5_Sub13.anIntArray455[local67];
			for (local112 = 0; local112 < Static35.anInt670; local112++) {
				local121 = this.anInt727 * Static372.anIntArray481[local112];
				local135 = this.method632(local110, local97, local67, local121 * local47 >> 12, local61, local106);
				arg1[local112] = local34 * local135 >> 12;
			}
		}
		for (@Pc(149) int local149 = 1; local149 < this.anInt731; local149++) {
			local34 = this.aShortArray5[local149];
			if (local34 > 8 || local34 < -8) {
				local47 = this.aShortArray6[local149] << 12;
				local61 = local47 * this.anInt727 >> 12;
				local67 = local12 * local47 >> 12;
				local54 = this.anInt729 * local47 >> 12;
				local71 = local67 >> 12;
				local75 = local71 + 1;
				if (local75 >= local54) {
					local75 = 0;
				}
				local67 &= 0xFFF;
				local110 = Class6_Sub5_Sub13.anIntArray455[local67];
				local106 = this.aByteArray2[local71 & 0xFF] & 0xFF;
				local97 = this.aByteArray2[local75 & 0xFF] & 0xFF;
				if (this.aBoolean49 && local149 == this.anInt731 - 1) {
					for (local112 = 0; local112 < Static35.anInt670; local112++) {
						local121 = this.anInt727 * Static372.anIntArray481[local112];
						local135 = this.method632(local110, local97, local67, local121 * local47 >> 12, local61, local106);
						local135 = arg1[local112] + (local34 * local135 >> 12);
						arg1[local112] = (local135 >> 1) + 2048;
					}
				} else {
					for (local112 = 0; local112 < Static35.anInt670; local112++) {
						local121 = this.anInt727 * Static372.anIntArray481[local112];
						local135 = this.method632(local110, local97, local67, local47 * local121 >> 12, local61, local106);
						arg1[local112] += local34 * local135 >> 12;
					}
				}
			}
		}
	}
}
