import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
	public int anInt309 = 1638;

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
	public int anInt306 = 4;

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "Z")
	public boolean aBoolean18 = true;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "[B")
	private byte[] aByteArray3 = new byte[512];

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
	public int anInt315 = 4;

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
	public int anInt314 = 0;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
	public int anInt313 = 4;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIII)I")
	private int method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg1 <= local13) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg0 & 0xFFF;
		local9 &= 0xFF;
		@Pc(34) int local34 = local26 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = arg3 - 4096;
		@Pc(51) int local51 = this.aByteArray3[arg5 + local9] & 0x3;
		@Pc(55) int local55 = Class313.anIntArray811[local26];
		@Pc(71) int local71;
		if (local51 <= 1) {
			local71 = local51 == 0 ? local26 + arg3 : arg3 - local26;
		} else {
			local71 = local51 == 2 ? local26 - arg3 : -arg3 + -local26;
		}
		local51 = this.aByteArray3[local13 + arg5] & 0x3;
		@Pc(116) int local116;
		if (local51 <= 1) {
			local116 = local51 == 0 ? local34 + arg3 : arg3 + -local34;
		} else {
			local116 = local51 == 2 ? local34 - arg3 : -local34 - arg3;
		}
		local51 = this.aByteArray3[local9 + arg4] & 0x3;
		@Pc(157) int local157 = local71 + ((local116 - local71) * local55 >> 12);
		if (local51 > 1) {
			local71 = local51 == 2 ? local26 - local42 : -local26 - local42;
		} else {
			local71 = local51 == 0 ? local42 + local26 : local42 - local26;
		}
		local51 = this.aByteArray3[arg4 + local13] & 0x3;
		if (local51 > 1) {
			local116 = local51 == 2 ? local34 - local42 : -local34 - local42;
		} else {
			local116 = local51 == 0 ? local42 + local34 : local42 + -local34;
		}
		@Pc(235) int local235 = local71 + ((local116 - local71) * local55 >> 12);
		return (arg2 * (local235 - local157) >> 12) + local157;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.aBoolean18 = arg1.method4487() == 1;
		} else if (arg0 == 1) {
			this.anInt313 = arg1.method4487();
		} else if (arg0 == 2) {
			this.anInt309 = arg1.method4447();
			if (this.anInt309 < 0) {
				this.aShortArray2 = new short[this.anInt313];
				for (@Pc(78) int local78 = 0; local78 < this.anInt313; local78++) {
					this.aShortArray2[local78] = (short) arg1.method4447();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt315 = this.anInt306 = arg1.method4487();
			return;
		} else if (arg0 == 4) {
			this.anInt314 = arg1.method4487();
			return;
		} else if (arg0 == 5) {
			this.anInt315 = arg1.method4487();
			return;
		} else if (arg0 == 6) {
			this.anInt306 = arg1.method4487();
			return;
		}
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
	private void method508() {
		@Pc(23) int local23;
		if (this.anInt309 > 0) {
			this.aShortArray2 = new short[this.anInt313];
			this.aShortArray3 = new short[this.anInt313];
			for (local23 = 0; local23 < this.anInt313; local23++) {
				this.aShortArray2[local23] = (short) (Math.pow((double) ((float) this.anInt309 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray3[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray2 != null && this.anInt313 == this.aShortArray2.length) {
			this.aShortArray3 = new short[this.anInt313];
			for (local23 = 0; local23 < this.anInt313; local23++) {
				this.aShortArray3[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			this.method512(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		this.aByteArray3 = Static345.method5751(this.anInt314);
		this.method508();
		for (@Pc(19) int local19 = this.anInt313 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray2[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt313--;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([III)V")
	public void method512(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt306 * Static392.anIntArray673[arg1];
		@Pc(103) int local103;
		@Pc(119) int local119;
		@Pc(25) int local25;
		@Pc(30) short local30;
		@Pc(94) int local94;
		@Pc(36) int local36;
		@Pc(50) int local50;
		@Pc(43) int local43;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(89) int local89;
		@Pc(80) int local80;
		if (this.anInt313 == 1) {
			local25 = this.aShortArray3[0] << 12;
			local30 = this.aShortArray2[0];
			local36 = local12 * local25 >> 12;
			local43 = local25 * this.anInt306 >> 12;
			local50 = local25 * this.anInt315 >> 12;
			local54 = local36 >> 12;
			local58 = local54 + 1;
			if (local58 >= local43) {
				local58 = 0;
			}
			local36 &= 0xFFF;
			local71 = Class313.anIntArray811[local36];
			local80 = this.aByteArray3[local58 & 0xFF] & 0xFF;
			local89 = this.aByteArray3[local54 & 0xFF] & 0xFF;
			if (this.aBoolean18) {
				for (local94 = 0; local94 < Static254.anInt4973; local94++) {
					local103 = this.anInt315 * Static457.anIntArray732[local94];
					local119 = this.method507(local103 * local25 >> 12, local50, local71, local36, local80, local89);
					local119 = local119 * local30 >> 12;
					arg0[local94] = (local119 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Static254.anInt4973; local94++) {
					local103 = this.anInt315 * Static457.anIntArray732[local94];
					local119 = this.method507(local103 * local25 >> 12, local50, local71, local36, local80, local89);
					arg0[local94] = local119 * local30 >> 12;
				}
			}
			return;
		}
		local30 = this.aShortArray2[0];
		if (local30 > 8 || local30 < -8) {
			local25 = this.aShortArray3[0] << 12;
			local36 = local25 * local12 >> 12;
			local50 = this.anInt315 * local25 >> 12;
			local43 = local25 * this.anInt306 >> 12;
			local54 = local36 >> 12;
			local58 = local54 + 1;
			if (local43 <= local58) {
				local58 = 0;
			}
			local36 &= 0xFFF;
			local89 = this.aByteArray3[local54 & 0xFF] & 0xFF;
			local80 = this.aByteArray3[local58 & 0xFF] & 0xFF;
			local71 = Class313.anIntArray811[local36];
			for (local94 = 0; local94 < Static254.anInt4973; local94++) {
				local103 = this.anInt315 * Static457.anIntArray732[local94];
				local119 = this.method507(local25 * local103 >> 12, local50, local71, local36, local80, local89);
				arg0[local94] = local30 * local119 >> 12;
			}
		}
		for (@Pc(306) int local306 = 1; local306 < this.anInt313; local306++) {
			local30 = this.aShortArray2[local306];
			if (local30 > 8 || local30 < -8) {
				local25 = this.aShortArray3[local306] << 12;
				local43 = this.anInt306 * local25 >> 12;
				local50 = this.anInt315 * local25 >> 12;
				local36 = local25 * local12 >> 12;
				local54 = local36 >> 12;
				local58 = local54 + 1;
				if (local43 <= local58) {
					local58 = 0;
				}
				local36 &= 0xFFF;
				local89 = this.aByteArray3[local54 & 0xFF] & 0xFF;
				local80 = this.aByteArray3[local58 & 0xFF] & 0xFF;
				local71 = Class313.anIntArray811[local36];
				if (this.aBoolean18 && local306 == this.anInt313 - 1) {
					for (local94 = 0; local94 < Static254.anInt4973; local94++) {
						local103 = this.anInt315 * Static457.anIntArray732[local94];
						local119 = this.method507(local103 * local25 >> 12, local50, local71, local36, local80, local89);
						local119 = (local30 * local119 >> 12) + arg0[local94];
						arg0[local94] = (local119 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Static254.anInt4973; local94++) {
						local103 = this.anInt315 * Static457.anIntArray732[local94];
						local119 = this.method507(local25 * local103 >> 12, local50, local71, local36, local80, local89);
						arg0[local94] += local119 * local30 >> 12;
					}
				}
			}
		}
	}
}
