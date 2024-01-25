import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class3_Sub6_Sub23 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
	public int anInt5587 = 1638;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
	public int anInt5592 = 4;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "[B")
	private byte[] aByteArray59 = new byte[512];

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
	public int anInt5597 = 4;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
	public int anInt5590 = 4;

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "Z")
	public boolean aBoolean404 = true;

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
	public int anInt5595 = 0;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
	private void method4771() {
		@Pc(28) int local28;
		if (this.anInt5587 > 0) {
			this.aShortArray90 = new short[this.anInt5597];
			this.aShortArray89 = new short[this.anInt5597];
			for (local28 = 0; local28 < this.anInt5597; local28++) {
				this.aShortArray89[local28] = (short) (Math.pow((double) ((float) this.anInt5587 / 4096.0F), (double) local28) * 4096.0D);
				this.aShortArray90[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		} else if (this.aShortArray89 != null && this.aShortArray89.length == this.anInt5597) {
			this.aShortArray90 = new short[this.anInt5597];
			for (local28 = 0; local28 < this.anInt5597; local28++) {
				this.aShortArray90[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)I")
	private int method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		@Pc(21) int local21 = arg2 & 0xFFF;
		if (local13 >= arg3) {
			local13 = 0;
		}
		@Pc(34) int local34 = local21 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = arg1 - 4096;
		@Pc(46) int local46 = Class355.anIntArray591[local21];
		@Pc(56) int local56 = this.aByteArray59[local17 + arg5] & 0x3;
		@Pc(72) int local72;
		if (local56 > 1) {
			local72 = local56 == 2 ? local21 - arg1 : -local21 - arg1;
		} else {
			local72 = local56 == 0 ? arg1 + local21 : arg1 - local21;
		}
		local56 = this.aByteArray59[arg5 + local13] & 0x3;
		@Pc(113) int local113;
		if (local56 <= 1) {
			local113 = local56 == 0 ? local34 + arg1 : -local34 + arg1;
		} else {
			local113 = local56 == 2 ? local34 - arg1 : -arg1 + -local34;
		}
		@Pc(139) int local139 = local72 + (local46 * (local113 - local72) >> 12);
		local56 = this.aByteArray59[local17 + arg0] & 0x3;
		if (local56 <= 1) {
			local72 = local56 == 0 ? local21 + local42 : -local21 + local42;
		} else {
			local72 = local56 == 2 ? local21 - local42 : -local21 - local42;
		}
		local56 = this.aByteArray59[arg0 + local13] & 0x3;
		if (local56 <= 1) {
			local113 = local56 == 0 ? local42 + local34 : local42 + -local34;
		} else {
			local113 = local56 == 2 ? local34 - local42 : -local34 - local42;
		}
		@Pc(243) int local243 = (local46 * (local113 - local72) >> 12) + local72;
		return local139 + (arg4 * (local243 - local139) >> 12);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[I)V")
	public void method4773(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static525.anIntArray553[arg0] * this.anInt5590;
		@Pc(120) int local120;
		@Pc(134) int local134;
		@Pc(43) int local43;
		@Pc(36) short local36;
		@Pc(111) int local111;
		@Pc(56) int local56;
		@Pc(50) int local50;
		@Pc(63) int local63;
		@Pc(97) int local97;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(106) int local106;
		@Pc(93) int local93;
		if (this.anInt5597 == 1) {
			local36 = this.aShortArray89[0];
			local43 = this.aShortArray90[0] << 12;
			local50 = this.anInt5592 * local43 >> 12;
			local56 = local43 * local12 >> 12;
			local63 = local43 * this.anInt5590 >> 12;
			local67 = local56 >> 12;
			local71 = local67 + 1;
			if (local71 >= local63) {
				local71 = 0;
			}
			local56 &= 0xFFF;
			local93 = this.aByteArray59[local71 & 0xFF] & 0xFF;
			local97 = Class355.anIntArray591[local56];
			local106 = this.aByteArray59[local67 & 0xFF] & 0xFF;
			if (this.aBoolean404) {
				for (local111 = 0; local111 < Static521.anInt8383; local111++) {
					local120 = this.anInt5592 * Static73.anIntArray76[local111];
					local134 = this.method4772(local93, local56, local43 * local120 >> 12, local50, local97, local106);
					local134 = local36 * local134 >> 12;
					arg1[local111] = (local134 >> 1) + 2048;
				}
			} else {
				for (local111 = 0; local111 < Static521.anInt8383; local111++) {
					local120 = Static73.anIntArray76[local111] * this.anInt5592;
					local134 = this.method4772(local93, local56, local43 * local120 >> 12, local50, local97, local106);
					arg1[local111] = local134 * local36 >> 12;
				}
			}
			return;
		}
		local36 = this.aShortArray89[0];
		if (local36 > 8 || local36 < -8) {
			local43 = this.aShortArray90[0] << 12;
			local63 = this.anInt5590 * local43 >> 12;
			local56 = local43 * local12 >> 12;
			local50 = local43 * this.anInt5592 >> 12;
			local67 = local56 >> 12;
			local71 = local67 + 1;
			if (local63 <= local71) {
				local71 = 0;
			}
			local56 &= 0xFFF;
			local93 = this.aByteArray59[local71 & 0xFF] & 0xFF;
			local97 = Class355.anIntArray591[local56];
			local106 = this.aByteArray59[local67 & 0xFF] & 0xFF;
			for (local111 = 0; local111 < Static521.anInt8383; local111++) {
				local120 = this.anInt5592 * Static73.anIntArray76[local111];
				local134 = this.method4772(local93, local56, local120 * local43 >> 12, local50, local97, local106);
				arg1[local111] = local36 * local134 >> 12;
			}
		}
		for (@Pc(315) int local315 = 1; local315 < this.anInt5597; local315++) {
			local36 = this.aShortArray89[local315];
			if (local36 > 8 || local36 < -8) {
				local43 = this.aShortArray90[local315] << 12;
				local56 = local43 * local12 >> 12;
				local63 = this.anInt5590 * local43 >> 12;
				local50 = this.anInt5592 * local43 >> 12;
				local67 = local56 >> 12;
				local71 = local67 + 1;
				local56 &= 0xFFF;
				if (local71 >= local63) {
					local71 = 0;
				}
				local93 = this.aByteArray59[local71 & 0xFF] & 0xFF;
				local97 = Class355.anIntArray591[local56];
				local106 = this.aByteArray59[local67 & 0xFF] & 0xFF;
				if (this.aBoolean404 && this.anInt5597 - 1 == local315) {
					for (local111 = 0; local111 < Static521.anInt8383; local111++) {
						local120 = Static73.anIntArray76[local111] * this.anInt5592;
						local134 = this.method4772(local93, local56, local43 * local120 >> 12, local50, local97, local106);
						local134 = arg1[local111] + (local36 * local134 >> 12);
						arg1[local111] = (local134 >> 1) + 2048;
					}
				} else {
					for (local111 = 0; local111 < Static521.anInt8383; local111++) {
						local120 = Static73.anIntArray76[local111] * this.anInt5592;
						local134 = this.method4772(local93, local56, local43 * local120 >> 12, local50, local97, local106);
						arg1[local111] += local36 * local134 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			this.method4773(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		this.aByteArray59 = Static595.method7947(this.anInt5595);
		this.method4771();
		for (@Pc(27) int local27 = this.anInt5597 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray89[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt5597--;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean404 = arg0.method5175() == 1;
		} else if (arg1 == 1) {
			this.anInt5597 = arg0.method5175();
		} else if (arg1 == 2) {
			this.anInt5587 = arg0.method5231();
			if (this.anInt5587 < 0) {
				this.aShortArray89 = new short[this.anInt5597];
				for (@Pc(77) int local77 = 0; local77 < this.anInt5597; local77++) {
					this.aShortArray89[local77] = (short) arg0.method5231();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5592 = this.anInt5590 = arg0.method5175();
		} else if (arg1 == 4) {
			this.anInt5595 = arg0.method5175();
		} else if (arg1 == 5) {
			this.anInt5592 = arg0.method5175();
		} else if (arg1 == 6) {
			this.anInt5590 = arg0.method5175();
		}
	}
}
