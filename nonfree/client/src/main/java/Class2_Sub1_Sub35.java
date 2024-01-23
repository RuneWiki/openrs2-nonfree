import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!vm", name = "jb", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "I")
	public int anInt5867 = 0;

	@OriginalMember(owner = "client!vm", name = "ab", descriptor = "Z")
	public boolean aBoolean473 = true;

	@OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
	public int anInt5865 = 4;

	@OriginalMember(owner = "client!vm", name = "X", descriptor = "I")
	public int anInt5868 = 4;

	@OriginalMember(owner = "client!vm", name = "fb", descriptor = "I")
	public int anInt5873 = 4;

	@OriginalMember(owner = "client!vm", name = "hb", descriptor = "I")
	public int anInt5875 = 1638;

	@OriginalMember(owner = "client!vm", name = "eb", descriptor = "[B")
	private byte[] aByteArray78 = new byte[512];

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		this.aByteArray78 = Static162.method2816(this.anInt5867);
		this.method4714();
		for (@Pc(32) int local32 = this.anInt5868 - 1; local32 >= 1; local32--) {
			@Pc(42) short local42 = this.aShortArray88[local32];
			if (local42 > 8 || local42 < -8) {
				break;
			}
			this.anInt5868--;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean473 = arg0.method4261() == 1;
		} else if (arg1 == 1) {
			this.anInt5868 = arg0.method4261();
		} else if (arg1 == 2) {
			this.anInt5875 = arg0.method4255();
			if (this.anInt5875 < 0) {
				this.aShortArray88 = new short[this.anInt5868];
				for (@Pc(84) int local84 = 0; local84 < this.anInt5868; local84++) {
					this.aShortArray88[local84] = (short) arg0.method4255();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5865 = this.anInt5873 = arg0.method4261();
		} else if (arg1 == 4) {
			this.anInt5867 = arg0.method4261();
		} else if (arg1 == 5) {
			this.anInt5865 = arg0.method4261();
		} else if (arg1 == 6) {
			this.anInt5873 = arg0.method4261();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[I)V")
	public void method4712(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static234.anIntArray435[arg0] * this.anInt5873;
		@Pc(117) int local117;
		@Pc(131) int local131;
		@Pc(29) int local29;
		@Pc(34) short local34;
		@Pc(103) int local103;
		@Pc(54) int local54;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(66) int local66;
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(98) int local98;
		if (this.anInt5868 == 1) {
			local29 = this.aShortArray87[0] << 12;
			local34 = this.aShortArray88[0];
			local41 = local29 * this.anInt5865 >> 12;
			local48 = local29 * this.anInt5873 >> 12;
			local54 = local29 * local12 >> 12;
			local58 = local54 >> 12;
			@Pc(62) int local62 = local54 & 0xFFF;
			local66 = Class2_Sub1_Sub30.anIntArray392[local62];
			local70 = local58 + 1;
			local79 = this.aByteArray78[local58 & 0xFF] & 0xFF;
			if (local70 >= local48) {
				local70 = 0;
			}
			local98 = this.aByteArray78[local70 & 0xFF] & 0xFF;
			if (this.aBoolean473) {
				for (local103 = 0; local103 < Static114.anInt1359; local103++) {
					local117 = Static281.anIntArray506[local103] * this.anInt5865;
					local131 = this.method4717(local66, local79, local62, local98, local29 * local117 >> 12, local41);
					@Pc(137) int local137 = local131 * local34 >> 12;
					arg1[local103] = (local137 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static114.anInt1359; local103++) {
					local117 = this.anInt5865 * Static281.anIntArray506[local103];
					local131 = this.method4717(local66, local79, local62, local98, local117 * local29 >> 12, local41);
					arg1[local103] = local34 * local131 >> 12;
				}
			}
			return;
		}
		local34 = this.aShortArray88[0];
		if (local34 > 8 || local34 < -8) {
			local29 = this.aShortArray87[0] << 12;
			local48 = this.anInt5873 * local29 >> 12;
			local54 = local29 * local12 >> 12;
			local41 = this.anInt5865 * local29 >> 12;
			local58 = local54 >> 12;
			local54 &= 0xFFF;
			local70 = local58 + 1;
			local66 = Class2_Sub1_Sub30.anIntArray392[local54];
			if (local70 >= local48) {
				local70 = 0;
			}
			local98 = this.aByteArray78[local70 & 0xFF] & 0xFF;
			local79 = this.aByteArray78[local58 & 0xFF] & 0xFF;
			for (local103 = 0; local103 < Static114.anInt1359; local103++) {
				local117 = this.anInt5865 * Static281.anIntArray506[local103];
				local131 = this.method4717(local66, local79, local54, local98, local117 * local29 >> 12, local41);
				arg1[local103] = local131 * local34 >> 12;
			}
		}
		for (@Pc(308) int local308 = 1; local308 < this.anInt5868; local308++) {
			local34 = this.aShortArray88[local308];
			if (local34 > 8 || local34 < -8) {
				local29 = this.aShortArray87[local308] << 12;
				local41 = this.anInt5865 * local29 >> 12;
				local54 = local12 * local29 >> 12;
				local48 = local29 * this.anInt5873 >> 12;
				local58 = local54 >> 12;
				local70 = local58 + 1;
				local54 &= 0xFFF;
				local79 = this.aByteArray78[local58 & 0xFF] & 0xFF;
				if (local48 <= local70) {
					local70 = 0;
				}
				local66 = Class2_Sub1_Sub30.anIntArray392[local54];
				local98 = this.aByteArray78[local70 & 0xFF] & 0xFF;
				if (this.aBoolean473 && local308 == this.anInt5868 - 1) {
					for (local103 = 0; local103 < Static114.anInt1359; local103++) {
						local117 = Static281.anIntArray506[local103] * this.anInt5865;
						local131 = this.method4717(local66, local79, local54, local98, local29 * local117 >> 12, local41);
						local131 = (local131 * local34 >> 12) + arg1[local103];
						arg1[local103] = (local131 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static114.anInt1359; local103++) {
						local117 = Static281.anIntArray506[local103] * this.anInt5865;
						local131 = this.method4717(local66, local79, local54, local98, local117 * local29 >> 12, local41);
						arg1[local103] += local34 * local131 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			this.method4712(arg0, local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(B)V")
	private void method4714() {
		@Pc(31) int local31;
		if (this.anInt5875 > 0) {
			this.aShortArray87 = new short[this.anInt5868];
			this.aShortArray88 = new short[this.anInt5868];
			for (local31 = 0; local31 < this.anInt5868; local31++) {
				this.aShortArray88[local31] = (short) (Math.pow((double) ((float) this.anInt5875 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray87[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray88 != null && this.aShortArray88.length == this.anInt5868) {
			this.aShortArray87 = new short[this.anInt5868];
			for (local31 = 0; local31 < this.anInt5868; local31++) {
				this.aShortArray87[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIBII)I")
	private int method4717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 - 4096;
		@Pc(13) int local13 = arg4 >> 12;
		@Pc(17) int local17 = local13 + 1;
		if (arg5 <= local17) {
			local17 = 0;
		}
		local17 &= 0xFF;
		@Pc(35) int local35 = arg4 & 0xFFF;
		local13 &= 0xFF;
		@Pc(43) int local43 = Class2_Sub1_Sub30.anIntArray392[local35];
		@Pc(52) int local52 = this.aByteArray78[local13 + arg1] & 0x3;
		@Pc(56) int local56 = local35 - 4096;
		@Pc(83) int local83;
		if (local52 > 1) {
			local83 = local52 == 2 ? local35 - arg2 : -local35 + -arg2;
		} else {
			local83 = local52 == 0 ? local35 + arg2 : arg2 - local35;
		}
		local52 = this.aByteArray78[local17 + arg1] & 0x3;
		@Pc(125) int local125;
		if (local52 > 1) {
			local125 = local52 == 2 ? local56 - arg2 : -local56 + -arg2;
		} else {
			local125 = local52 == 0 ? arg2 + local56 : -local56 + arg2;
		}
		@Pc(152) int local152 = (local43 * (local125 - local83) >> 12) + local83;
		local52 = this.aByteArray78[local13 + arg3] & 0x3;
		if (local52 <= 1) {
			local83 = local52 == 0 ? local9 + local35 : -local35 + local9;
		} else {
			local83 = local52 == 2 ? local35 - local9 : -local9 + -local35;
		}
		local52 = this.aByteArray78[arg3 + local17] & 0x3;
		if (local52 <= 1) {
			local125 = local52 == 0 ? local56 + local9 : local9 + -local56;
		} else {
			local125 = local52 == 2 ? local56 - local9 : -local9 + -local56;
		}
		@Pc(254) int local254 = local83 + ((local125 - local83) * local43 >> 12);
		return local152 + ((local254 - local152) * arg0 >> 12);
	}
}
