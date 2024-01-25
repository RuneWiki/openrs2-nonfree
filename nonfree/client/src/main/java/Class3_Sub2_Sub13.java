import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "Z")
	public boolean aBoolean370 = true;

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
	public int anInt4345 = 4;

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
	public int anInt4340 = 4;

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
	public int anInt4346 = 4;

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
	public int anInt4343 = 1638;

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "[B")
	private byte[] aByteArray38 = new byte[512];

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
	public int anInt4349 = 0;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
	private void method3714() {
		@Pc(16) int local16;
		if (this.anInt4343 > 0) {
			this.aShortArray35 = new short[this.anInt4340];
			this.aShortArray36 = new short[this.anInt4340];
			for (local16 = 0; local16 < this.anInt4340; local16++) {
				this.aShortArray36[local16] = (short) (Math.pow((double) ((float) this.anInt4343 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray35[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray36 != null && this.aShortArray36.length == this.anInt4340) {
			this.aShortArray35 = new short[this.anInt4340];
			for (local16 = 0; local16 < this.anInt4340; local16++) {
				this.aShortArray35[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		this.aByteArray38 = Static141.method3157(this.anInt4349);
		this.method3714();
		for (@Pc(19) int local19 = this.anInt4340 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray36[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt4340--;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBIIII)I")
	private int method3715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg3) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(30) int local30 = arg5 & 0xFFF;
		@Pc(34) int local34 = local30 - 4096;
		@Pc(38) int local38 = arg1 - 4096;
		local13 &= 0xFF;
		@Pc(46) int local46 = Class42.anIntArray66[local30];
		@Pc(55) int local55 = this.aByteArray38[arg2 + local9] & 0x3;
		@Pc(73) int local73;
		if (local55 > 1) {
			local73 = local55 == 2 ? local30 - arg1 : -arg1 + -local30;
		} else {
			local73 = local55 == 0 ? arg1 + local30 : -local30 + arg1;
		}
		local55 = this.aByteArray38[local13 + arg2] & 0x3;
		@Pc(114) int local114;
		if (local55 > 1) {
			local114 = local55 == 2 ? local34 - arg1 : -arg1 + -local34;
		} else {
			local114 = local55 == 0 ? local34 + arg1 : -local34 + arg1;
		}
		@Pc(146) int local146 = local73 + ((local114 - local73) * local46 >> 12);
		local55 = this.aByteArray38[local9 + arg4] & 0x3;
		if (local55 <= 1) {
			local73 = local55 == 0 ? local30 + local38 : local38 + -local30;
		} else {
			local73 = local55 == 2 ? local30 - local38 : -local30 - local38;
		}
		local55 = this.aByteArray38[local13 + arg4] & 0x3;
		if (local55 > 1) {
			local114 = local55 == 2 ? local34 - local38 : -local34 - local38;
		} else {
			local114 = local55 == 0 ? local38 + local34 : local38 + -local34;
		}
		@Pc(240) int local240 = (local46 * (local114 - local73) >> 12) + local73;
		return local146 + (arg0 * (local240 - local146) >> 12);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.aBoolean370 = arg1.method8401() == 1;
		} else if (arg0 == 1) {
			this.anInt4340 = arg1.method8401();
		} else if (arg0 == 2) {
			this.anInt4343 = arg1.method8444();
			if (this.anInt4343 < 0) {
				this.aShortArray36 = new short[this.anInt4340];
				for (@Pc(72) int local72 = 0; local72 < this.anInt4340; local72++) {
					this.aShortArray36[local72] = (short) arg1.method8444();
				}
			}
		} else if (arg0 == 3) {
			this.anInt4346 = this.anInt4345 = arg1.method8401();
		} else if (arg0 == 4) {
			this.anInt4349 = arg1.method8401();
		} else if (arg0 == 5) {
			this.anInt4346 = arg1.method8401();
		} else if (arg0 == 6) {
			this.anInt4345 = arg1.method8401();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[II)V")
	public void method3716(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = this.anInt4345 * Static328.anIntArray387[arg0];
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(27) int local27;
		@Pc(32) short local32;
		@Pc(100) int local100;
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(39) int local39;
		@Pc(86) int local86;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (this.anInt4340 == 1) {
			local27 = this.aShortArray35[0] << 12;
			local32 = this.aShortArray36[0];
			local39 = this.anInt4345 * local27 >> 12;
			local45 = local27 * local12 >> 12;
			local52 = this.anInt4346 * local27 >> 12;
			local56 = local45 >> 12;
			local60 = local56 + 1;
			local45 &= 0xFFF;
			if (local60 >= local39) {
				local60 = 0;
			}
			local82 = this.aByteArray38[local56 & 0xFF] & 0xFF;
			local86 = Class42.anIntArray66[local45];
			local95 = this.aByteArray38[local60 & 0xFF] & 0xFF;
			if (this.aBoolean370) {
				for (local100 = 0; local100 < Static164.anInt8839; local100++) {
					local109 = Static352.anIntArray400[local100] * this.anInt4346;
					local123 = this.method3715(local86, local45, local82, local52, local95, local27 * local109 >> 12);
					local123 = local123 * local32 >> 12;
					arg1[local100] = (local123 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static164.anInt8839; local100++) {
					local109 = Static352.anIntArray400[local100] * this.anInt4346;
					local123 = this.method3715(local86, local45, local82, local52, local95, local109 * local27 >> 12);
					arg1[local100] = local123 * local32 >> 12;
				}
			}
			return;
		}
		local32 = this.aShortArray36[0];
		if (local32 > 8 || local32 < -8) {
			local27 = this.aShortArray35[0] << 12;
			local45 = local12 * local27 >> 12;
			local52 = this.anInt4346 * local27 >> 12;
			local39 = local27 * this.anInt4345 >> 12;
			local56 = local45 >> 12;
			local60 = local56 + 1;
			if (local60 >= local39) {
				local60 = 0;
			}
			local45 &= 0xFFF;
			local86 = Class42.anIntArray66[local45];
			local82 = this.aByteArray38[local56 & 0xFF] & 0xFF;
			local95 = this.aByteArray38[local60 & 0xFF] & 0xFF;
			for (local100 = 0; local100 < Static164.anInt8839; local100++) {
				local109 = Static352.anIntArray400[local100] * this.anInt4346;
				local123 = this.method3715(local86, local45, local82, local52, local95, local27 * local109 >> 12);
				arg1[local100] = local123 * local32 >> 12;
			}
		}
		for (@Pc(303) int local303 = 1; local303 < this.anInt4340; local303++) {
			local32 = this.aShortArray36[local303];
			if (local32 > 8 || local32 < -8) {
				local27 = this.aShortArray35[local303] << 12;
				local39 = local27 * this.anInt4345 >> 12;
				local52 = this.anInt4346 * local27 >> 12;
				local45 = local27 * local12 >> 12;
				local56 = local45 >> 12;
				local60 = local56 + 1;
				if (local60 >= local39) {
					local60 = 0;
				}
				local45 &= 0xFFF;
				local95 = this.aByteArray38[local60 & 0xFF] & 0xFF;
				local82 = this.aByteArray38[local56 & 0xFF] & 0xFF;
				local86 = Class42.anIntArray66[local45];
				if (this.aBoolean370 && this.anInt4340 - 1 == local303) {
					for (local100 = 0; local100 < Static164.anInt8839; local100++) {
						local109 = Static352.anIntArray400[local100] * this.anInt4346;
						local123 = this.method3715(local86, local45, local82, local52, local95, local109 * local27 >> 12);
						local123 = (local32 * local123 >> 12) + arg1[local100];
						arg1[local100] = (local123 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static164.anInt8839; local100++) {
						local109 = this.anInt4346 * Static352.anIntArray400[local100];
						local123 = this.method3715(local86, local45, local82, local52, local95, local27 * local109 >> 12);
						arg1[local100] += local123 * local32 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			this.method3716(arg0, local9);
		}
		return local9;
	}
}
