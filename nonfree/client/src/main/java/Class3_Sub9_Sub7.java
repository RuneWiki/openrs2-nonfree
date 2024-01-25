import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class3_Sub9_Sub7 extends Class3_Sub9 {

	@OriginalMember(owner = "client!dka", name = "H", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!dka", name = "L", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!dka", name = "E", descriptor = "I")
	public int anInt2250 = 1638;

	@OriginalMember(owner = "client!dka", name = "K", descriptor = "I")
	public int anInt2253 = 4;

	@OriginalMember(owner = "client!dka", name = "J", descriptor = "I")
	public int anInt2252 = 4;

	@OriginalMember(owner = "client!dka", name = "I", descriptor = "I")
	public int anInt2251 = 0;

	@OriginalMember(owner = "client!dka", name = "X", descriptor = "[B")
	private byte[] aByteArray15 = new byte[512];

	@OriginalMember(owner = "client!dka", name = "D", descriptor = "Z")
	public boolean aBoolean186 = true;

	@OriginalMember(owner = "client!dka", name = "Y", descriptor = "I")
	public int anInt2261 = 4;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean186 = arg0.method8632() == 1;
		} else if (arg1 == 1) {
			this.anInt2253 = arg0.method8632();
		} else if (arg1 == 2) {
			this.anInt2250 = arg0.method8589();
			if (this.anInt2250 < 0) {
				this.aShortArray27 = new short[this.anInt2253];
				for (@Pc(76) int local76 = 0; local76 < this.anInt2253; local76++) {
					this.aShortArray27[local76] = (short) arg0.method8589();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2252 = this.anInt2261 = arg0.method8632();
		} else if (arg1 == 4) {
			this.anInt2251 = arg0.method8632();
		} else if (arg1 == 5) {
			this.anInt2252 = arg0.method8632();
		} else if (arg1 == 6) {
			this.anInt2261 = arg0.method8632();
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IIIZIII)I")
	private int method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg3 >> 12;
		@Pc(16) int local16 = local12 + 1;
		if (arg1 <= local16) {
			local16 = 0;
		}
		@Pc(29) int local29 = arg3 & 0xFFF;
		local12 &= 0xFF;
		@Pc(37) int local37 = arg5 - 4096;
		@Pc(41) int local41 = local29 - 4096;
		local16 &= 0xFF;
		@Pc(49) int local49 = Class6_Sub1.anIntArray10[local29];
		@Pc(59) int local59 = this.aByteArray15[local12 + arg4] & 0x3;
		@Pc(80) int local80;
		if (local59 > 1) {
			local80 = local59 == 2 ? local29 - arg5 : -arg5 + -local29;
		} else {
			local80 = local59 == 0 ? arg5 + local29 : -local29 + arg5;
		}
		local59 = this.aByteArray15[arg4 + local16] & 0x3;
		@Pc(125) int local125;
		if (local59 > 1) {
			local125 = local59 == 2 ? local41 - arg5 : -arg5 + -local41;
		} else {
			local125 = local59 == 0 ? local41 + arg5 : arg5 + -local41;
		}
		local59 = this.aByteArray15[arg2 + local12] & 0x3;
		@Pc(157) int local157 = local80 + (local49 * (local125 - local80) >> 12);
		if (local59 <= 1) {
			local80 = local59 == 0 ? local29 + local37 : -local29 + local37;
		} else {
			local80 = local59 == 2 ? local29 - local37 : -local37 + -local29;
		}
		local59 = this.aByteArray15[arg2 + local16] & 0x3;
		if (local59 <= 1) {
			local125 = local59 == 0 ? local37 + local41 : -local41 + local37;
		} else {
			local125 = local59 == 2 ? local41 - local37 : -local37 + -local41;
		}
		@Pc(240) int local240 = local80 + (local49 * (local125 - local80) >> 12);
		return (arg0 * (local240 - local157) >> 12) + local157;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(I[II)V")
	public void method2076(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2261 * Static147.anIntArray259[arg1];
		@Pc(106) int local106;
		@Pc(120) int local120;
		@Pc(34) int local34;
		@Pc(27) short local27;
		@Pc(98) int local98;
		@Pc(54) int local54;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(93) int local93;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt2253 == 1) {
			local27 = this.aShortArray27[0];
			local34 = this.aShortArray28[0] << 12;
			local41 = local34 * this.anInt2252 >> 12;
			local48 = this.anInt2261 * local34 >> 12;
			local54 = local10 * local34 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			if (local62 >= local48) {
				local62 = 0;
			}
			local54 &= 0xFFF;
			local80 = this.aByteArray15[local58 & 0xFF] & 0xFF;
			local89 = this.aByteArray15[local62 & 0xFF] & 0xFF;
			local93 = Class6_Sub1.anIntArray10[local54];
			if (this.aBoolean186) {
				for (local98 = 0; local98 < Static62.anInt1251; local98++) {
					local106 = Static239.anIntArray394[local98] * this.anInt2252;
					local120 = this.method2074(local93, local41, local89, local34 * local106 >> 12, local80, local54);
					local120 = local120 * local27 >> 12;
					arg0[local98] = (local120 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static62.anInt1251; local98++) {
					local106 = Static239.anIntArray394[local98] * this.anInt2252;
					local120 = this.method2074(local93, local41, local89, local106 * local34 >> 12, local80, local54);
					arg0[local98] = local120 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray27[0];
		if (local27 > 8 || local27 < -8) {
			local34 = this.aShortArray28[0] << 12;
			local54 = local10 * local34 >> 12;
			local41 = this.anInt2252 * local34 >> 12;
			local48 = this.anInt2261 * local34 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			if (local62 >= local48) {
				local62 = 0;
			}
			local54 &= 0xFFF;
			local93 = Class6_Sub1.anIntArray10[local54];
			local89 = this.aByteArray15[local62 & 0xFF] & 0xFF;
			local80 = this.aByteArray15[local58 & 0xFF] & 0xFF;
			for (local98 = 0; local98 < Static62.anInt1251; local98++) {
				local106 = this.anInt2252 * Static239.anIntArray394[local98];
				local120 = this.method2074(local93, local41, local89, local34 * local106 >> 12, local80, local54);
				arg0[local98] = local120 * local27 >> 12;
			}
		}
		for (@Pc(303) int local303 = 1; local303 < this.anInt2253; local303++) {
			local27 = this.aShortArray27[local303];
			if (local27 > 8 || local27 < -8) {
				local34 = this.aShortArray28[local303] << 12;
				local48 = this.anInt2261 * local34 >> 12;
				local54 = local34 * local10 >> 12;
				local41 = local34 * this.anInt2252 >> 12;
				local58 = local54 >> 12;
				local62 = local58 + 1;
				if (local48 <= local62) {
					local62 = 0;
				}
				local54 &= 0xFFF;
				local89 = this.aByteArray15[local62 & 0xFF] & 0xFF;
				local80 = this.aByteArray15[local58 & 0xFF] & 0xFF;
				local93 = Class6_Sub1.anIntArray10[local54];
				if (this.aBoolean186 && this.anInt2253 - 1 == local303) {
					for (local98 = 0; local98 < Static62.anInt1251; local98++) {
						local106 = this.anInt2252 * Static239.anIntArray394[local98];
						local120 = this.method2074(local93, local41, local89, local106 * local34 >> 12, local80, local54);
						local120 = arg0[local98] + (local120 * local27 >> 12);
						arg0[local98] = (local120 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static62.anInt1251; local98++) {
						local106 = this.anInt2252 * Static239.anIntArray394[local98];
						local120 = this.method2074(local93, local41, local89, local34 * local106 >> 12, local80, local54);
						arg0[local98] += local27 * local120 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)V")
	private void method2077() {
		@Pc(30) int local30;
		if (this.anInt2250 > 0) {
			this.aShortArray27 = new short[this.anInt2253];
			this.aShortArray28 = new short[this.anInt2253];
			for (local30 = 0; local30 < this.anInt2253; local30++) {
				this.aShortArray27[local30] = (short) (int) (Math.pow((double) ((float) this.anInt2250 / 4096.0F), (double) local30) * 4096.0D);
				this.aShortArray28[local30] = (short) (int) Math.pow(2.0D, (double) local30);
			}
		} else if (this.aShortArray27 != null && this.anInt2253 == this.aShortArray27.length) {
			this.aShortArray28 = new short[this.anInt2253];
			for (local30 = 0; local30 < this.anInt2253; local30++) {
				this.aShortArray28[local30] = (short) (int) Math.pow(2.0D, (double) local30);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			this.method2076(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		this.aByteArray15 = Static324.method4964(this.anInt2251);
		this.method2077();
		for (@Pc(17) int local17 = this.anInt2253 - 1; local17 >= 1; local17--) {
			@Pc(23) short local23 = this.aShortArray27[local17];
			if (local23 > 8 || local23 < -8) {
				break;
			}
			this.anInt2253--;
		}
	}
}
