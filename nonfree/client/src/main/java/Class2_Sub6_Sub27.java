import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class2_Sub6_Sub27 extends Class2_Sub6 {

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!re", name = "J", descriptor = "I")
	public int anInt8025 = 1638;

	@OriginalMember(owner = "client!re", name = "R", descriptor = "[B")
	private byte[] aByteArray94 = new byte[512];

	@OriginalMember(owner = "client!re", name = "O", descriptor = "I")
	public int anInt8029 = 0;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "I")
	public int anInt8023 = 4;

	@OriginalMember(owner = "client!re", name = "V", descriptor = "I")
	public int anInt8031 = 4;

	@OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
	public int anInt8034 = 4;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
	public boolean aBoolean601 = true;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		this.aByteArray94 = Static198.method6948(this.anInt8029);
		this.method6813();
		for (@Pc(21) int local21 = this.anInt8031 - 1; local21 >= 1; local21--) {
			@Pc(28) short local28 = this.aShortArray109[local21];
			if (local28 > 8 || local28 < -8) {
				break;
			}
			this.anInt8031--;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			this.method6811(arg0, local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB[I)V")
	public void method6811(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt8034 * Static564.anIntArray630[arg0];
		@Pc(107) int local107;
		@Pc(121) int local121;
		@Pc(29) int local29;
		@Pc(34) short local34;
		@Pc(98) int local98;
		@Pc(54) int local54;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(84) int local84;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(93) int local93;
		@Pc(80) int local80;
		if (this.anInt8031 == 1) {
			local29 = this.aShortArray108[0] << 12;
			local34 = this.aShortArray109[0];
			local41 = this.anInt8023 * local29 >> 12;
			local48 = this.anInt8034 * local29 >> 12;
			local54 = local29 * local12 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			local54 &= 0xFFF;
			if (local48 <= local62) {
				local62 = 0;
			}
			local80 = this.aByteArray94[local62 & 0xFF] & 0xFF;
			local84 = Class2_Sub16.anIntArray217[local54];
			local93 = this.aByteArray94[local58 & 0xFF] & 0xFF;
			if (this.aBoolean601) {
				for (local98 = 0; local98 < Static51.anInt1085; local98++) {
					local107 = this.anInt8023 * Static586.anIntArray653[local98];
					local121 = this.method6812(local54, local93, local84, local41, local107 * local29 >> 12, local80);
					local121 = local121 * local34 >> 12;
					arg1[local98] = (local121 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static51.anInt1085; local98++) {
					local107 = Static586.anIntArray653[local98] * this.anInt8023;
					local121 = this.method6812(local54, local93, local84, local41, local29 * local107 >> 12, local80);
					arg1[local98] = local34 * local121 >> 12;
				}
			}
			return;
		}
		local34 = this.aShortArray109[0];
		if (local34 > 8 || local34 < -8) {
			local29 = this.aShortArray108[0] << 12;
			local54 = local29 * local12 >> 12;
			local41 = this.anInt8023 * local29 >> 12;
			local48 = this.anInt8034 * local29 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			@Pc(231) int local231 = local54 & 0xFFF;
			if (local62 >= local48) {
				local62 = 0;
			}
			local93 = this.aByteArray94[local58 & 0xFF] & 0xFF;
			local80 = this.aByteArray94[local62 & 0xFF] & 0xFF;
			local84 = Class2_Sub16.anIntArray217[local231];
			for (local98 = 0; local98 < Static51.anInt1085; local98++) {
				local107 = Static586.anIntArray653[local98] * this.anInt8023;
				local121 = this.method6812(local231, local93, local84, local41, local29 * local107 >> 12, local80);
				arg1[local98] = local34 * local121 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt8031; local301++) {
			local34 = this.aShortArray109[local301];
			if (local34 > 8 || local34 < -8) {
				local29 = this.aShortArray108[local301] << 12;
				local54 = local12 * local29 >> 12;
				local41 = this.anInt8023 * local29 >> 12;
				local48 = this.anInt8034 * local29 >> 12;
				local58 = local54 >> 12;
				local62 = local58 + 1;
				local54 &= 0xFFF;
				if (local62 >= local48) {
					local62 = 0;
				}
				local93 = this.aByteArray94[local58 & 0xFF] & 0xFF;
				local80 = this.aByteArray94[local62 & 0xFF] & 0xFF;
				local84 = Class2_Sub16.anIntArray217[local54];
				if (this.aBoolean601 && this.anInt8031 - 1 == local301) {
					for (local98 = 0; local98 < Static51.anInt1085; local98++) {
						local107 = Static586.anIntArray653[local98] * this.anInt8023;
						local121 = this.method6812(local54, local93, local84, local41, local29 * local107 >> 12, local80);
						local121 = (local34 * local121 >> 12) + arg1[local98];
						arg1[local98] = (local121 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static51.anInt1085; local98++) {
						local107 = Static586.anIntArray653[local98] * this.anInt8023;
						local121 = this.method6812(local54, local93, local84, local41, local107 * local29 >> 12, local80);
						arg1[local98] += local34 * local121 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)I")
	private int method6812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg3) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(31) int local31 = arg4 & 0xFFF;
		@Pc(35) int local35 = local31 - 4096;
		@Pc(39) int local39 = arg0 - 4096;
		local13 &= 0xFF;
		@Pc(53) int local53 = this.aByteArray94[local9 + arg1] & 0x3;
		@Pc(57) int local57 = Class2_Sub16.anIntArray217[local31];
		@Pc(74) int local74;
		if (local53 <= 1) {
			local74 = local53 == 0 ? local31 + arg0 : -local31 + arg0;
		} else {
			local74 = local53 == 2 ? local31 - arg0 : -local31 - arg0;
		}
		local53 = this.aByteArray94[local13 + arg1] & 0x3;
		@Pc(121) int local121;
		if (local53 <= 1) {
			local121 = local53 == 0 ? local35 + arg0 : -local35 + arg0;
		} else {
			local121 = local53 == 2 ? local35 - arg0 : -arg0 + -local35;
		}
		local53 = this.aByteArray94[local9 + arg5] & 0x3;
		@Pc(156) int local156 = local74 + ((local121 - local74) * local57 >> 12);
		if (local53 > 1) {
			local74 = local53 == 2 ? local31 - local39 : -local31 + -local39;
		} else {
			local74 = local53 == 0 ? local39 + local31 : -local31 + local39;
		}
		local53 = this.aByteArray94[arg5 + local13] & 0x3;
		if (local53 <= 1) {
			local121 = local53 == 0 ? local35 + local39 : -local35 + local39;
		} else {
			local121 = local53 == 2 ? local35 - local39 : -local35 + -local39;
		}
		@Pc(242) int local242 = local74 + (local57 * (local121 - local74) >> 12);
		return ((local242 - local156) * arg2 >> 12) + local156;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
	private void method6813() {
		@Pc(36) int local36;
		if (this.anInt8025 > 0) {
			this.aShortArray109 = new short[this.anInt8031];
			this.aShortArray108 = new short[this.anInt8031];
			for (local36 = 0; local36 < this.anInt8031; local36++) {
				this.aShortArray109[local36] = (short) (Math.pow((double) ((float) this.anInt8025 / 4096.0F), (double) local36) * 4096.0D);
				this.aShortArray108[local36] = (short) Math.pow(2.0D, (double) local36);
			}
		} else if (this.aShortArray109 != null && this.anInt8031 == this.aShortArray109.length) {
			this.aShortArray108 = new short[this.anInt8031];
			for (local36 = 0; local36 < this.anInt8031; local36++) {
				this.aShortArray108[local36] = (short) Math.pow(2.0D, (double) local36);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.aBoolean601 = arg1.method8547() == 1;
		} else if (arg0 == 1) {
			this.anInt8031 = arg1.method8547();
		} else if (arg0 == 2) {
			this.anInt8025 = arg1.method8526();
			if (this.anInt8025 < 0) {
				this.aShortArray109 = new short[this.anInt8031];
				for (@Pc(68) int local68 = 0; local68 < this.anInt8031; local68++) {
					this.aShortArray109[local68] = (short) arg1.method8526();
				}
			}
		} else if (arg0 == 3) {
			this.anInt8023 = this.anInt8034 = arg1.method8547();
		} else if (arg0 == 4) {
			this.anInt8029 = arg1.method8547();
		} else if (arg0 == 5) {
			this.anInt8023 = arg1.method8547();
		} else if (arg0 == 6) {
			this.anInt8034 = arg1.method8547();
		}
	}
}
