import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class1_Sub3_Sub26 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!nq", name = "V", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
	public int anInt4524 = 1638;

	@OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
	public int anInt4532 = 4;

	@OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
	public int anInt4529 = 4;

	@OriginalMember(owner = "client!nq", name = "Y", descriptor = "Z")
	public boolean aBoolean430 = true;

	@OriginalMember(owner = "client!nq", name = "W", descriptor = "[B")
	private byte[] aByteArray75 = new byte[512];

	@OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
	public int anInt4533 = 0;

	@OriginalMember(owner = "client!nq", name = "ab", descriptor = "I")
	public int anInt4534 = 4;

	static {
		new Class34("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean430 = arg1.method4532() == 1;
		} else if (arg0 == 1) {
			this.anInt4534 = arg1.method4532();
		} else if (arg0 == 2) {
			this.anInt4524 = arg1.method4551();
			if (this.anInt4524 < 0) {
				this.aShortArray101 = new short[this.anInt4534];
				for (@Pc(68) int local68 = 0; local68 < this.anInt4534; local68++) {
					this.aShortArray101[local68] = (short) arg1.method4551();
				}
			}
		} else if (arg0 == 3) {
			this.anInt4529 = this.anInt4532 = arg1.method4532();
		} else if (arg0 == 4) {
			this.anInt4533 = arg1.method4532();
		} else if (arg0 == 5) {
			this.anInt4529 = arg1.method4532();
		} else if (arg0 == 6) {
			this.anInt4532 = arg1.method4532();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([IBI)V")
	public void method4080(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static266.anIntArray454[arg1] * this.anInt4532;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(38) int local38;
		@Pc(25) short local25;
		@Pc(99) int local99;
		@Pc(58) int local58;
		@Pc(52) int local52;
		@Pc(45) int local45;
		@Pc(79) int local79;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(97) int local97;
		@Pc(88) int local88;
		if (this.anInt4534 == 1) {
			local38 = this.aShortArray100[0] << 12;
			local25 = this.aShortArray101[0];
			local58 = local12 * local38 >> 12;
			local45 = this.anInt4532 * local38 >> 12;
			local52 = local38 * this.anInt4529 >> 12;
			local62 = local58 >> 12;
			local66 = local62 + 1;
			if (local45 <= local66) {
				local66 = 0;
			}
			local58 &= 0xFFF;
			local88 = this.aByteArray75[local66 & 0xFF] & 0xFF;
			local79 = Class17_Sub1_Sub1.anIntArray433[local58];
			local97 = this.aByteArray75[local62 & 0xFF] & 0xFF;
			if (this.aBoolean430) {
				for (local99 = 0; local99 < Static153.anInt3378; local99++) {
					local108 = Static107.anIntArray234[local99] * this.anInt4529;
					local122 = this.method4082(local52, local79, local38 * local108 >> 12, local88, local58, local97);
					@Pc(482) int local482 = local122 * local25 >> 12;
					arg0[local99] = (local482 >> 1) + 2048;
				}
			} else {
				for (local99 = 0; local99 < Static153.anInt3378; local99++) {
					local108 = this.anInt4529 * Static107.anIntArray234[local99];
					local122 = this.method4082(local52, local79, local38 * local108 >> 12, local88, local58, local97);
					arg0[local99] = local122 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray101[0];
		if (local25 > 8 || local25 < -8) {
			local38 = this.aShortArray100[0] << 12;
			local45 = local38 * this.anInt4532 >> 12;
			local52 = local38 * this.anInt4529 >> 12;
			local58 = local38 * local12 >> 12;
			local62 = local58 >> 12;
			local66 = local62 + 1;
			local58 &= 0xFFF;
			if (local66 >= local45) {
				local66 = 0;
			}
			local79 = Class17_Sub1_Sub1.anIntArray433[local58];
			local88 = this.aByteArray75[local66 & 0xFF] & 0xFF;
			local97 = this.aByteArray75[local62 & 0xFF] & 0xFF;
			for (local99 = 0; local99 < Static153.anInt3378; local99++) {
				local108 = Static107.anIntArray234[local99] * this.anInt4529;
				local122 = this.method4082(local52, local79, local38 * local108 >> 12, local88, local58, local97);
				arg0[local99] = local25 * local122 >> 12;
			}
		}
		for (@Pc(140) int local140 = 1; local140 < this.anInt4534; local140++) {
			local25 = this.aShortArray101[local140];
			if (local25 > 8 || local25 < -8) {
				local38 = this.aShortArray100[local140] << 12;
				local52 = this.anInt4529 * local38 >> 12;
				local45 = local38 * this.anInt4532 >> 12;
				local58 = local12 * local38 >> 12;
				local62 = local58 >> 12;
				local66 = local62 + 1;
				if (local45 <= local66) {
					local66 = 0;
				}
				local58 &= 0xFFF;
				local88 = this.aByteArray75[local66 & 0xFF] & 0xFF;
				local97 = this.aByteArray75[local62 & 0xFF] & 0xFF;
				local79 = Class17_Sub1_Sub1.anIntArray433[local58];
				if (this.aBoolean430 && this.anInt4534 - 1 == local140) {
					for (local99 = 0; local99 < Static153.anInt3378; local99++) {
						local108 = Static107.anIntArray234[local99] * this.anInt4529;
						local122 = this.method4082(local52, local79, local108 * local38 >> 12, local88, local58, local97);
						local122 = (local25 * local122 >> 12) + arg0[local99];
						arg0[local99] = (local122 >> 1) + 2048;
					}
				} else {
					for (local99 = 0; local99 < Static153.anInt3378; local99++) {
						local108 = Static107.anIntArray234[local99] * this.anInt4529;
						local122 = this.method4082(local52, local79, local38 * local108 >> 12, local88, local58, local97);
						arg0[local99] += local25 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			this.method4080(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)I")
	private int method4082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg2 >> 12;
		@Pc(19) int local19 = local15 + 1;
		@Pc(23) int local23 = local15 & 0xFF;
		if (local19 >= arg0) {
			local19 = 0;
		}
		@Pc(36) int local36 = arg2 & 0xFFF;
		@Pc(40) int local40 = arg4 - 4096;
		local19 &= 0xFF;
		@Pc(48) int local48 = local36 - 4096;
		@Pc(57) int local57 = this.aByteArray75[arg5 + local23] & 0x3;
		@Pc(61) int local61 = Class17_Sub1_Sub1.anIntArray433[local36];
		@Pc(81) int local81;
		if (local57 > 1) {
			local81 = local57 == 2 ? local36 - arg4 : -arg4 + -local36;
		} else {
			local81 = local57 == 0 ? arg4 + local36 : -local36 + arg4;
		}
		local57 = this.aByteArray75[local19 + arg5] & 0x3;
		@Pc(116) int local116;
		if (local57 <= 1) {
			local116 = local57 == 0 ? local48 + arg4 : arg4 - local48;
		} else {
			local116 = local57 == 2 ? local48 - arg4 : -arg4 + -local48;
		}
		@Pc(144) int local144 = local81 + ((local116 - local81) * local61 >> 12);
		local57 = this.aByteArray75[local23 + arg3] & 0x3;
		if (local57 <= 1) {
			local81 = local57 == 0 ? local40 + local36 : -local36 + local40;
		} else {
			local81 = local57 == 2 ? local36 - local40 : -local40 + -local36;
		}
		local57 = this.aByteArray75[arg3 + local19] & 0x3;
		if (local57 <= 1) {
			local116 = local57 == 0 ? local48 + local40 : local40 + -local48;
		} else {
			local116 = local57 == 2 ? local48 - local40 : -local48 + -local40;
		}
		@Pc(244) int local244 = local81 + (local61 * (local116 - local81) >> 12);
		return (arg1 * (local244 - local144) >> 12) + local144;
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		this.aByteArray75 = Static252.method4575(this.anInt4533);
		this.method4084();
		for (@Pc(27) int local27 = this.anInt4534 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray101[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt4534--;
		}
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V")
	private void method4084() {
		@Pc(29) int local29;
		if (this.anInt4524 > 0) {
			this.aShortArray101 = new short[this.anInt4534];
			this.aShortArray100 = new short[this.anInt4534];
			for (local29 = 0; local29 < this.anInt4534; local29++) {
				this.aShortArray101[local29] = (short) (Math.pow((double) ((float) this.anInt4524 / 4096.0F), (double) local29) * 4096.0D);
				this.aShortArray100[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		} else if (this.aShortArray101 != null && this.aShortArray101.length == this.anInt4534) {
			this.aShortArray100 = new short[this.anInt4534];
			for (local29 = 0; local29 < this.anInt4534; local29++) {
				this.aShortArray100[local29] = (short) Math.pow(2.0D, (double) local29);
			}
			return;
		}
	}
}
