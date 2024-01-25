import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mu", name = "F", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!mu", name = "N", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!mu", name = "I", descriptor = "I")
	public int anInt6675 = 0;

	@OriginalMember(owner = "client!mu", name = "J", descriptor = "Z")
	public boolean aBoolean483 = true;

	@OriginalMember(owner = "client!mu", name = "O", descriptor = "I")
	public int anInt6677 = 4;

	@OriginalMember(owner = "client!mu", name = "V", descriptor = "I")
	public int anInt6682 = 4;

	@OriginalMember(owner = "client!mu", name = "K", descriptor = "I")
	public int anInt6676 = 4;

	@OriginalMember(owner = "client!mu", name = "P", descriptor = "[B")
	private byte[] aByteArray59 = new byte[512];

	@OriginalMember(owner = "client!mu", name = "Q", descriptor = "I")
	public int anInt6678 = 1638;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		this.aByteArray59 = Static140.method2400(this.anInt6675);
		this.method5811();
		for (@Pc(21) int local21 = this.anInt6677 - 1; local21 >= 1; local21--) {
			@Pc(34) short local34 = this.aShortArray80[local21];
			if (local34 > 8 || local34 < -8) {
				return;
			}
			this.anInt6677--;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean483 = arg0.method5633() == 1;
		} else if (arg1 == 1) {
			this.anInt6677 = arg0.method5633();
		} else if (arg1 == 2) {
			this.anInt6678 = arg0.method5624();
			if (this.anInt6678 < 0) {
				this.aShortArray80 = new short[this.anInt6677];
				for (@Pc(65) int local65 = 0; local65 < this.anInt6677; local65++) {
					this.aShortArray80[local65] = (short) arg0.method5624();
				}
			}
		} else if (arg1 == 3) {
			this.anInt6676 = this.anInt6682 = arg0.method5633();
		} else if (arg1 == 4) {
			this.anInt6675 = arg0.method5633();
		} else if (arg1 == 5) {
			this.anInt6676 = arg0.method5633();
		} else if (arg1 == 6) {
			this.anInt6682 = arg0.method5633();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			this.method5810(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZIIIII)I")
	private int method5809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg4 & 0xFFF;
		@Pc(21) int local21 = local9 & 0xFF;
		if (local13 >= arg1) {
			local13 = 0;
		}
		local13 &= 0xFF;
		@Pc(38) int local38 = arg5 - 4096;
		@Pc(42) int local42 = local17 - 4096;
		@Pc(59) int local59 = this.aByteArray59[arg3 + local21] & 0x3;
		@Pc(63) int local63 = Class184.anIntArray298[local17];
		@Pc(84) int local84;
		if (local59 > 1) {
			local84 = local59 == 2 ? local17 - arg5 : -local17 + -arg5;
		} else {
			local84 = local59 == 0 ? arg5 + local17 : -local17 + arg5;
		}
		local59 = this.aByteArray59[arg3 + local13] & 0x3;
		@Pc(126) int local126;
		if (local59 <= 1) {
			local126 = local59 == 0 ? local42 + arg5 : -local42 + arg5;
		} else {
			local126 = local59 == 2 ? local42 - arg5 : -arg5 + -local42;
		}
		local59 = this.aByteArray59[local21 + arg2] & 0x3;
		@Pc(163) int local163 = local84 + ((local126 - local84) * local63 >> 12);
		if (local59 > 1) {
			local84 = local59 == 2 ? local17 - local38 : -local17 + -local38;
		} else {
			local84 = local59 == 0 ? local17 + local38 : local38 - local17;
		}
		local59 = this.aByteArray59[arg2 + local13] & 0x3;
		if (local59 <= 1) {
			local126 = local59 == 0 ? local38 + local42 : -local42 + local38;
		} else {
			local126 = local59 == 2 ? local42 - local38 : -local38 + -local42;
		}
		@Pc(248) int local248 = ((local126 - local84) * local63 >> 12) + local84;
		return local163 + (arg0 * (local248 - local163) >> 12);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[II)V")
	public void method5810(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt6682 * Static376.anIntArray665[arg1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(48) int local48;
		@Pc(31) short local31;
		@Pc(113) int local113;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(102) int local102;
		@Pc(72) int local72;
		@Pc(76) int local76;
		@Pc(111) int local111;
		@Pc(98) int local98;
		if (this.anInt6677 == 1) {
			local48 = this.aShortArray81[0] << 12;
			local31 = this.aShortArray80[0];
			local68 = this.anInt6682 * local48 >> 12;
			local54 = local12 * local48 >> 12;
			local61 = this.anInt6676 * local48 >> 12;
			local72 = local54 >> 12;
			local76 = local72 + 1;
			@Pc(391) int local391 = local54 & 0xFFF;
			if (local76 >= local68) {
				local76 = 0;
			}
			local111 = this.aByteArray59[local72 & 0xFF] & 0xFF;
			local102 = Class184.anIntArray298[local391];
			local98 = this.aByteArray59[local76 & 0xFF] & 0xFF;
			if (this.aBoolean483) {
				for (local113 = 0; local113 < Static201.anInt3738; local113++) {
					local122 = Static57.anIntArray536[local113] * this.anInt6676;
					local136 = this.method5809(local102, local61, local98, local111, local122 * local48 >> 12, local391);
					@Pc(490) int local490 = local31 * local136 >> 12;
					arg0[local113] = (local490 >> 1) + 2048;
				}
			} else {
				for (local113 = 0; local113 < Static201.anInt3738; local113++) {
					local122 = this.anInt6676 * Static57.anIntArray536[local113];
					local136 = this.method5809(local102, local61, local98, local111, local48 * local122 >> 12, local391);
					arg0[local113] = local136 * local31 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray80[0];
		if (local31 > 8 || local31 < -8) {
			local48 = this.aShortArray81[0] << 12;
			local54 = local48 * local12 >> 12;
			local61 = local48 * this.anInt6676 >> 12;
			local68 = local48 * this.anInt6682 >> 12;
			local72 = local54 >> 12;
			local76 = local72 + 1;
			if (local76 >= local68) {
				local76 = 0;
			}
			local54 &= 0xFFF;
			local98 = this.aByteArray59[local76 & 0xFF] & 0xFF;
			local102 = Class184.anIntArray298[local54];
			local111 = this.aByteArray59[local72 & 0xFF] & 0xFF;
			for (local113 = 0; local113 < Static201.anInt3738; local113++) {
				local122 = Static57.anIntArray536[local113] * this.anInt6676;
				local136 = this.method5809(local102, local61, local98, local111, local122 * local48 >> 12, local54);
				arg0[local113] = local31 * local136 >> 12;
			}
		}
		for (@Pc(154) int local154 = 1; local154 < this.anInt6677; local154++) {
			local31 = this.aShortArray80[local154];
			if (local31 > 8 || local31 < -8) {
				local48 = this.aShortArray81[local154] << 12;
				local68 = this.anInt6682 * local48 >> 12;
				local61 = this.anInt6676 * local48 >> 12;
				local54 = local12 * local48 >> 12;
				local72 = local54 >> 12;
				local76 = local72 + 1;
				local54 &= 0xFFF;
				if (local76 >= local68) {
					local76 = 0;
				}
				local98 = this.aByteArray59[local76 & 0xFF] & 0xFF;
				local102 = Class184.anIntArray298[local54];
				local111 = this.aByteArray59[local72 & 0xFF] & 0xFF;
				if (this.aBoolean483 && local154 == this.anInt6677 - 1) {
					for (local113 = 0; local113 < Static201.anInt3738; local113++) {
						local122 = this.anInt6676 * Static57.anIntArray536[local113];
						local136 = this.method5809(local102, local61, local98, local111, local122 * local48 >> 12, local54);
						local136 = (local136 * local31 >> 12) + arg0[local113];
						arg0[local113] = (local136 >> 1) + 2048;
					}
				} else {
					for (local113 = 0; local113 < Static201.anInt3738; local113++) {
						local122 = Static57.anIntArray536[local113] * this.anInt6676;
						local136 = this.method5809(local102, local61, local98, local111, local48 * local122 >> 12, local54);
						arg0[local113] += local31 * local136 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(Z)V")
	private void method5811() {
		@Pc(28) int local28;
		if (this.anInt6678 > 0) {
			this.aShortArray81 = new short[this.anInt6677];
			this.aShortArray80 = new short[this.anInt6677];
			for (local28 = 0; local28 < this.anInt6677; local28++) {
				this.aShortArray80[local28] = (short) (int) (Math.pow((double) ((float) this.anInt6678 / 4096.0F), (double) local28) * 4096.0D);
				this.aShortArray81[local28] = (short) (int) Math.pow(2.0D, (double) local28);
			}
		} else if (this.aShortArray80 != null && this.anInt6677 == this.aShortArray80.length) {
			this.aShortArray81 = new short[this.anInt6677];
			for (local28 = 0; local28 < this.anInt6677; local28++) {
				this.aShortArray81[local28] = (short) (int) Math.pow(2.0D, (double) local28);
			}
		}
	}
}
