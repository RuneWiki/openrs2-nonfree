import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sj", name = "L", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
	public int anInt5194 = 4;

	@OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
	public int anInt5198 = 4;

	@OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
	public int anInt5196 = 4;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
	public int anInt5193 = 0;

	@OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
	public int anInt5199 = 1638;

	@OriginalMember(owner = "client!sj", name = "bb", descriptor = "[B")
	private byte[] aByteArray68 = new byte[512];

	@OriginalMember(owner = "client!sj", name = "cb", descriptor = "Z")
	public boolean aBoolean322 = true;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
	private void method3938() {
		@Pc(23) int local23;
		if (this.anInt5199 > 0) {
			this.aShortArray93 = new short[this.anInt5194];
			this.aShortArray92 = new short[this.anInt5194];
			for (local23 = 0; local23 < this.anInt5194; local23++) {
				this.aShortArray92[local23] = (short) (Math.pow((double) ((float) this.anInt5199 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray93[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray92 != null && this.anInt5194 == this.aShortArray92.length) {
			this.aShortArray93 = new short[this.anInt5194];
			for (local23 = 0; local23 < this.anInt5194; local23++) {
				this.aShortArray93[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean322 = arg0.method2199() == 1;
		} else if (arg1 == 1) {
			this.anInt5194 = arg0.method2199();
		} else if (arg1 == 2) {
			this.anInt5199 = arg0.method2248();
			if (this.anInt5199 < 0) {
				this.aShortArray92 = new short[this.anInt5194];
				for (@Pc(80) int local80 = 0; local80 < this.anInt5194; local80++) {
					this.aShortArray92[local80] = (short) arg0.method2248();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5196 = this.anInt5198 = arg0.method2199();
		} else if (arg1 == 4) {
			this.anInt5193 = arg0.method2199();
		} else if (arg1 == 5) {
			this.anInt5196 = arg0.method2199();
		} else if (arg1 == 6) {
			this.anInt5198 = arg0.method2199();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)I")
	private int method3940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 - 4096;
		@Pc(13) int local13 = arg0 >> 12;
		@Pc(17) int local17 = arg0 & 0xFFF;
		@Pc(21) int local21 = local17 - 4096;
		@Pc(25) int local25 = local13 + 1;
		@Pc(29) int local29 = Class34.anIntArray501[local17];
		if (arg3 <= local25) {
			local25 = 0;
		}
		local13 &= 0xFF;
		@Pc(48) int local48 = this.aByteArray68[local13 + arg2] & 0x3;
		local25 &= 0xFF;
		@Pc(71) int local71;
		if (local48 > 1) {
			local71 = local48 == 2 ? local17 - arg1 : -arg1 + -local17;
		} else {
			local71 = local48 == 0 ? local17 + arg1 : -local17 + arg1;
		}
		local48 = this.aByteArray68[local25 + arg2] & 0x3;
		@Pc(111) int local111;
		if (local48 <= 1) {
			local111 = local48 == 0 ? arg1 + local21 : -local21 + arg1;
		} else {
			local111 = local48 == 2 ? local21 - arg1 : -local21 + -arg1;
		}
		@Pc(140) int local140 = local71 + ((local111 - local71) * local29 >> 12);
		local48 = this.aByteArray68[arg4 + local13] & 0x3;
		if (local48 > 1) {
			local71 = local48 == 2 ? local17 - local9 : -local17 - local9;
		} else {
			local71 = local48 == 0 ? local17 + local9 : -local17 + local9;
		}
		local48 = this.aByteArray68[local25 + arg4] & 0x3;
		if (local48 <= 1) {
			local111 = local48 == 0 ? local9 + local21 : local9 + -local21;
		} else {
			local111 = local48 == 2 ? local21 - local9 : -local9 + -local21;
		}
		@Pc(237) int local237 = (local29 * (local111 - local71) >> 12) + local71;
		return ((local237 - local140) * arg5 >> 12) + local140;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		this.aByteArray68 = Static296.method4534(this.anInt5193);
		this.method3938();
		for (@Pc(23) int local23 = this.anInt5194 - 1; local23 >= 1; local23--) {
			@Pc(33) short local33 = this.aShortArray92[local23];
			if (local33 > 8 || local33 < -8) {
				break;
			}
			this.anInt5194--;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([IIB)V")
	public void method3941(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt5198 * Static256.anIntArray474[arg1];
		@Pc(123) int local123;
		@Pc(139) int local139;
		@Pc(44) int local44;
		@Pc(28) short local28;
		@Pc(109) int local109;
		@Pc(64) int local64;
		@Pc(58) int local58;
		@Pc(51) int local51;
		@Pc(85) int local85;
		@Pc(68) int local68;
		@Pc(89) int local89;
		@Pc(77) int local77;
		@Pc(107) int local107;
		if (this.anInt5194 == 1) {
			local44 = this.aShortArray93[0] << 12;
			local51 = this.anInt5198 * local44 >> 12;
			local28 = this.aShortArray92[0];
			local58 = this.anInt5196 * local44 >> 12;
			local64 = local12 * local44 >> 12;
			local68 = local64 >> 12;
			local64 &= 0xFFF;
			local85 = Class34.anIntArray501[local64];
			local77 = this.aByteArray68[local68 & 0xFF] & 0xFF;
			local89 = local68 + 1;
			if (local51 <= local89) {
				local89 = 0;
			}
			local107 = this.aByteArray68[local89 & 0xFF] & 0xFF;
			if (this.aBoolean322) {
				for (local109 = 0; local109 < Static62.anInt1350; local109++) {
					local123 = Static3.anIntArray3[local109] * this.anInt5196;
					local139 = this.method3940(local44 * local123 >> 12, local64, local77, local58, local107, local85);
					local139 = local139 * local28 >> 12;
					arg0[local109] = (local139 >> 1) + 2048;
				}
			} else {
				for (local109 = 0; local109 < Static62.anInt1350; local109++) {
					local123 = Static3.anIntArray3[local109] * this.anInt5196;
					local139 = this.method3940(local44 * local123 >> 12, local64, local77, local58, local107, local85);
					arg0[local109] = local28 * local139 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray92[0];
		if (local28 > 8 || local28 < -8) {
			local44 = this.aShortArray93[0] << 12;
			local51 = this.anInt5198 * local44 >> 12;
			local58 = this.anInt5196 * local44 >> 12;
			local64 = local44 * local12 >> 12;
			local68 = local64 >> 12;
			local77 = this.aByteArray68[local68 & 0xFF] & 0xFF;
			@Pc(81) int local81 = local64 & 0xFFF;
			local85 = Class34.anIntArray501[local81];
			local89 = local68 + 1;
			if (local89 >= local51) {
				local89 = 0;
			}
			local107 = this.aByteArray68[local89 & 0xFF] & 0xFF;
			for (local109 = 0; local109 < Static62.anInt1350; local109++) {
				local123 = this.anInt5196 * Static3.anIntArray3[local109];
				local139 = this.method3940(local44 * local123 >> 12, local81, local77, local58, local107, local85);
				arg0[local109] = local28 * local139 >> 12;
			}
		}
		for (@Pc(152) int local152 = 1; local152 < this.anInt5194; local152++) {
			local28 = this.aShortArray92[local152];
			if (local28 > 8 || local28 < -8) {
				local44 = this.aShortArray93[local152] << 12;
				local64 = local12 * local44 >> 12;
				local58 = this.anInt5196 * local44 >> 12;
				local68 = local64 >> 12;
				local51 = this.anInt5198 * local44 >> 12;
				local64 &= 0xFFF;
				local85 = Class34.anIntArray501[local64];
				local77 = this.aByteArray68[local68 & 0xFF] & 0xFF;
				local89 = local68 + 1;
				if (local51 <= local89) {
					local89 = 0;
				}
				local107 = this.aByteArray68[local89 & 0xFF] & 0xFF;
				if (this.aBoolean322 && local152 == this.anInt5194 - 1) {
					for (local109 = 0; local109 < Static62.anInt1350; local109++) {
						local123 = Static3.anIntArray3[local109] * this.anInt5196;
						local139 = this.method3940(local44 * local123 >> 12, local64, local77, local58, local107, local85);
						local139 = (local139 * local28 >> 12) + arg0[local109];
						arg0[local109] = (local139 >> 1) + 2048;
					}
				} else {
					for (local109 = 0; local109 < Static62.anInt1350; local109++) {
						local123 = this.anInt5196 * Static3.anIntArray3[local109];
						local139 = this.method3940(local123 * local44 >> 12, local64, local77, local58, local107, local85);
						arg0[local109] += local139 * local28 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			this.method3941(local9, arg0);
		}
		return local9;
	}
}
