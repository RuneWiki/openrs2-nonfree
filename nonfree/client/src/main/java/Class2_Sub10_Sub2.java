import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "Z")
	public boolean aBoolean87 = true;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
	public int anInt1216 = 4;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
	public int anInt1220 = 4;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "[B")
	private byte[] aByteArray18 = new byte[512];

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
	public int anInt1224 = 1638;

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
	public int anInt1219 = 0;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
	public int anInt1223 = 4;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean87 = arg0.method6904() == 1;
		} else if (arg1 == 1) {
			this.anInt1216 = arg0.method6904();
		} else if (arg1 == 2) {
			this.anInt1224 = arg0.method6856();
			if (this.anInt1224 < 0) {
				this.aShortArray13 = new short[this.anInt1216];
				for (@Pc(68) int local68 = 0; local68 < this.anInt1216; local68++) {
					this.aShortArray13[local68] = (short) arg0.method6856();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt1223 = this.anInt1220 = arg0.method6904();
			return;
		} else if (arg1 == 4) {
			this.anInt1219 = arg0.method6904();
			return;
		} else if (arg1 == 5) {
			this.anInt1223 = arg0.method6904();
			return;
		} else if (arg1 == 6) {
			this.anInt1220 = arg0.method6904();
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			this.method1087(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		this.aByteArray18 = Static555.method7689(this.anInt1219);
		this.method1088();
		for (@Pc(22) int local22 = this.anInt1216 - 1; local22 >= 1; local22--) {
			@Pc(28) short local28 = this.aShortArray13[local22];
			if (local28 > 8) {
				return;
			}
			if (local28 < -8) {
				return;
			}
			this.anInt1216--;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[II)V")
	public void method1087(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(10) int local10 = this.anInt1220 * Static353.anIntArray424[arg0];
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(38) int local38;
		@Pc(23) short local23;
		@Pc(103) int local103;
		@Pc(51) int local51;
		@Pc(45) int local45;
		@Pc(58) int local58;
		@Pc(101) int local101;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(97) int local97;
		@Pc(88) int local88;
		if (this.anInt1216 == 1) {
			local23 = this.aShortArray13[0];
			local38 = this.aShortArray14[0] << 12;
			local51 = local10 * local38 >> 12;
			local58 = this.anInt1220 * local38 >> 12;
			local45 = local38 * this.anInt1223 >> 12;
			local62 = local51 >> 12;
			local66 = local62 + 1;
			if (local66 >= local58) {
				local66 = 0;
			}
			local51 &= 0xFFF;
			local101 = Class115.anIntArray257[local51];
			local88 = this.aByteArray18[local66 & 0xFF] & 0xFF;
			local97 = this.aByteArray18[local62 & 0xFF] & 0xFF;
			if (this.aBoolean87) {
				for (local103 = 0; local103 < Static93.anInt1862; local103++) {
					local111 = this.anInt1223 * Static561.anIntArray649[local103];
					local125 = this.method1089(local101, local45, local51, local97, local111 * local38 >> 12, local88);
					local125 = local125 * local23 >> 12;
					arg1[local103] = (local125 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static93.anInt1862; local103++) {
					local111 = Static561.anIntArray649[local103] * this.anInt1223;
					local125 = this.method1089(local101, local45, local51, local97, local38 * local111 >> 12, local88);
					arg1[local103] = local125 * local23 >> 12;
				}
			}
			return;
		}
		local23 = this.aShortArray13[0];
		if (local23 > 8 || local23 < -8) {
			local38 = this.aShortArray14[0] << 12;
			local45 = local38 * this.anInt1223 >> 12;
			local51 = local38 * local10 >> 12;
			local58 = this.anInt1220 * local38 >> 12;
			local62 = local51 >> 12;
			local66 = local62 + 1;
			if (local58 <= local66) {
				local66 = 0;
			}
			local51 &= 0xFFF;
			local88 = this.aByteArray18[local66 & 0xFF] & 0xFF;
			local97 = this.aByteArray18[local62 & 0xFF] & 0xFF;
			local101 = Class115.anIntArray257[local51];
			for (local103 = 0; local103 < Static93.anInt1862; local103++) {
				local111 = this.anInt1223 * Static561.anIntArray649[local103];
				local125 = this.method1089(local101, local45, local51, local97, local38 * local111 >> 12, local88);
				arg1[local103] = local125 * local23 >> 12;
			}
		}
		for (@Pc(143) int local143 = 1; local143 < this.anInt1216; local143++) {
			local23 = this.aShortArray13[local143];
			if (local23 > 8 || local23 < -8) {
				local38 = this.aShortArray14[local143] << 12;
				local51 = local10 * local38 >> 12;
				local58 = local38 * this.anInt1220 >> 12;
				local45 = this.anInt1223 * local38 >> 12;
				local62 = local51 >> 12;
				local66 = local62 + 1;
				if (local66 >= local58) {
					local66 = 0;
				}
				local51 &= 0xFFF;
				local101 = Class115.anIntArray257[local51];
				local88 = this.aByteArray18[local66 & 0xFF] & 0xFF;
				local97 = this.aByteArray18[local62 & 0xFF] & 0xFF;
				if (this.aBoolean87 && this.anInt1216 - 1 == local143) {
					for (local103 = 0; local103 < Static93.anInt1862; local103++) {
						local111 = Static561.anIntArray649[local103] * this.anInt1223;
						local125 = this.method1089(local101, local45, local51, local97, local111 * local38 >> 12, local88);
						local125 = arg1[local103] + (local23 * local125 >> 12);
						arg1[local103] = (local125 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static93.anInt1862; local103++) {
						local111 = this.anInt1223 * Static561.anIntArray649[local103];
						local125 = this.method1089(local101, local45, local51, local97, local38 * local111 >> 12, local88);
						arg1[local103] += local125 * local23 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V")
	private void method1088() {
		@Pc(21) int local21;
		if (this.anInt1224 > 0) {
			this.aShortArray13 = new short[this.anInt1216];
			this.aShortArray14 = new short[this.anInt1216];
			for (local21 = 0; local21 < this.anInt1216; local21++) {
				this.aShortArray13[local21] = (short) (Math.pow((double) ((float) this.anInt1224 / 4096.0F), (double) local21) * 4096.0D);
				this.aShortArray14[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		} else if (this.aShortArray13 != null && this.anInt1216 == this.aShortArray13.length) {
			this.aShortArray14 = new short[this.anInt1216];
			for (local21 = 0; local21 < this.anInt1216; local21++) {
				this.aShortArray14[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIIII)I")
	private int method1089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 >> 12;
		@Pc(19) int local19 = local7 + 1;
		@Pc(23) int local23 = local7 & 0xFF;
		if (local19 >= arg1) {
			local19 = 0;
		}
		@Pc(32) int local32 = arg4 & 0xFFF;
		@Pc(36) int local36 = local32 - 4096;
		@Pc(40) int local40 = arg2 - 4096;
		local19 &= 0xFF;
		@Pc(53) int local53 = this.aByteArray18[arg3 + local23] & 0x3;
		@Pc(57) int local57 = Class115.anIntArray257[local32];
		@Pc(71) int local71;
		if (local53 <= 1) {
			local71 = local53 == 0 ? local32 + arg2 : arg2 + -local32;
		} else {
			local71 = local53 == 2 ? local32 - arg2 : -arg2 + -local32;
		}
		local53 = this.aByteArray18[arg3 + local19] & 0x3;
		@Pc(112) int local112;
		if (local53 > 1) {
			local112 = local53 == 2 ? local36 - arg2 : -arg2 + -local36;
		} else {
			local112 = local53 == 0 ? local36 + arg2 : arg2 - local36;
		}
		@Pc(137) int local137 = local71 + ((local112 - local71) * local57 >> 12);
		local53 = this.aByteArray18[local23 + arg5] & 0x3;
		if (local53 <= 1) {
			local71 = local53 == 0 ? local32 + local40 : local40 + -local32;
		} else {
			local71 = local53 == 2 ? local32 - local40 : -local40 + -local32;
		}
		local53 = this.aByteArray18[arg5 + local19] & 0x3;
		if (local53 > 1) {
			local112 = local53 == 2 ? local36 - local40 : -local36 + -local40;
		} else {
			local112 = local53 == 0 ? local40 + local36 : -local36 + local40;
		}
		@Pc(234) int local234 = (local57 * (local112 - local71) >> 12) + local71;
		return local137 + (arg0 * (local234 - local137) >> 12);
	}
}
