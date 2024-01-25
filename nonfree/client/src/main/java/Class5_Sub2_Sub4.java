import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bq", name = "T", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!bq", name = "Y", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
	public int anInt832 = 4;

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "[B")
	private byte[] aByteArray14 = new byte[512];

	@OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
	public int anInt834 = 0;

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
	public int anInt830 = 1638;

	@OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
	public int anInt833 = 4;

	@OriginalMember(owner = "client!bq", name = "R", descriptor = "I")
	public int anInt835 = 4;

	@OriginalMember(owner = "client!bq", name = "S", descriptor = "Z")
	public boolean aBoolean59 = true;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I[II)V")
	public void method731(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt835 * Static369.anIntArray377[arg1];
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(27) int local27;
		@Pc(32) short local32;
		@Pc(100) int local100;
		@Pc(38) int local38;
		@Pc(52) int local52;
		@Pc(45) int local45;
		@Pc(86) int local86;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (this.anInt832 == 1) {
			local27 = this.aShortArray17[0] << 12;
			local32 = this.aShortArray18[0];
			local38 = local27 * local10 >> 12;
			local45 = local27 * this.anInt835 >> 12;
			local52 = local27 * this.anInt833 >> 12;
			local56 = local38 >> 12;
			local60 = local56 + 1;
			if (local45 <= local60) {
				local60 = 0;
			}
			local38 &= 0xFFF;
			local82 = this.aByteArray14[local56 & 0xFF] & 0xFF;
			local86 = Class106.anIntArray130[local38];
			local95 = this.aByteArray14[local60 & 0xFF] & 0xFF;
			if (this.aBoolean59) {
				for (local100 = 0; local100 < Static195.anInt3759; local100++) {
					local108 = Static554.anIntArray510[local100] * this.anInt833;
					local122 = this.method734(local86, local52, local108 * local27 >> 12, local82, local95, local38);
					local122 = local122 * local32 >> 12;
					arg0[local100] = (local122 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static195.anInt3759; local100++) {
					local108 = this.anInt833 * Static554.anIntArray510[local100];
					local122 = this.method734(local86, local52, local108 * local27 >> 12, local82, local95, local38);
					arg0[local100] = local122 * local32 >> 12;
				}
			}
			return;
		}
		local32 = this.aShortArray18[0];
		if (local32 > 8 || local32 < -8) {
			local27 = this.aShortArray17[0] << 12;
			local52 = local27 * this.anInt833 >> 12;
			local38 = local10 * local27 >> 12;
			local45 = this.anInt835 * local27 >> 12;
			local56 = local38 >> 12;
			local60 = local56 + 1;
			if (local45 <= local60) {
				local60 = 0;
			}
			local38 &= 0xFFF;
			local82 = this.aByteArray14[local56 & 0xFF] & 0xFF;
			local95 = this.aByteArray14[local60 & 0xFF] & 0xFF;
			local86 = Class106.anIntArray130[local38];
			for (local100 = 0; local100 < Static195.anInt3759; local100++) {
				local108 = Static554.anIntArray510[local100] * this.anInt833;
				local122 = this.method734(local86, local52, local108 * local27 >> 12, local82, local95, local38);
				arg0[local100] = local122 * local32 >> 12;
			}
		}
		for (@Pc(308) int local308 = 1; local308 < this.anInt832; local308++) {
			local32 = this.aShortArray18[local308];
			if (local32 > 8 || local32 < -8) {
				local27 = this.aShortArray17[local308] << 12;
				local38 = local27 * local10 >> 12;
				local45 = this.anInt835 * local27 >> 12;
				local52 = this.anInt833 * local27 >> 12;
				local56 = local38 >> 12;
				local60 = local56 + 1;
				local38 &= 0xFFF;
				if (local60 >= local45) {
					local60 = 0;
				}
				local86 = Class106.anIntArray130[local38];
				local95 = this.aByteArray14[local60 & 0xFF] & 0xFF;
				local82 = this.aByteArray14[local56 & 0xFF] & 0xFF;
				if (this.aBoolean59 && this.anInt832 - 1 == local308) {
					for (local100 = 0; local100 < Static195.anInt3759; local100++) {
						local108 = this.anInt833 * Static554.anIntArray510[local100];
						local122 = this.method734(local86, local52, local108 * local27 >> 12, local82, local95, local38);
						local122 = (local122 * local32 >> 12) + arg0[local100];
						arg0[local100] = (local122 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static195.anInt3759; local100++) {
						local108 = this.anInt833 * Static554.anIntArray510[local100];
						local122 = this.method734(local86, local52, local108 * local27 >> 12, local82, local95, local38);
						arg0[local100] += local32 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(22) int[] local22 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			this.method731(local22, arg0);
		}
		return local22;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		this.aByteArray14 = Static353.method5334(this.anInt834);
		this.method735();
		for (@Pc(17) int local17 = this.anInt832 - 1; local17 >= 1; local17--) {
			@Pc(23) short local23 = this.aShortArray18[local17];
			if (local23 > 8 || local23 < -8) {
				break;
			}
			this.anInt832--;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIIB)I")
	private int method734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int local13 = arg2 >> 12;
		@Pc(17) int local17 = local13 + 1;
		if (local17 >= arg1) {
			local17 = 0;
		}
		@Pc(30) int local30 = arg2 & 0xFFF;
		local13 &= 0xFF;
		@Pc(38) int local38 = local30 - 4096;
		local17 &= 0xFF;
		@Pc(46) int local46 = arg5 - 4096;
		@Pc(55) int local55 = this.aByteArray14[arg3 + local13] & 0x3;
		@Pc(59) int local59 = Class106.anIntArray130[local30];
		@Pc(76) int local76;
		if (local55 <= 1) {
			local76 = local55 == 0 ? arg5 + local30 : -local30 + arg5;
		} else {
			local76 = local55 == 2 ? local30 - arg5 : -arg5 + -local30;
		}
		local55 = this.aByteArray14[local17 + arg3] & 0x3;
		@Pc(120) int local120;
		if (local55 > 1) {
			local120 = local55 == 2 ? local38 - arg5 : -local38 + -arg5;
		} else {
			local120 = local55 == 0 ? arg5 + local38 : arg5 - local38;
		}
		local55 = this.aByteArray14[arg4 + local13] & 0x3;
		@Pc(151) int local151 = ((local120 - local76) * local59 >> 12) + local76;
		if (local55 > 1) {
			local76 = local55 == 2 ? local30 - local46 : -local46 + -local30;
		} else {
			local76 = local55 == 0 ? local46 + local30 : -local30 + local46;
		}
		local55 = this.aByteArray14[arg4 + local17] & 0x3;
		if (local55 <= 1) {
			local120 = local55 == 0 ? local46 + local38 : -local38 + local46;
		} else {
			local120 = local55 == 2 ? local38 - local46 : -local46 + -local38;
		}
		@Pc(236) int local236 = local76 + ((local120 - local76) * local59 >> 12);
		return local151 + (arg0 * (local236 - local151) >> 12);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean59 = arg0.method7816() == 1;
		} else if (arg1 == 1) {
			this.anInt832 = arg0.method7816();
		} else if (arg1 == 2) {
			this.anInt830 = arg0.method7849();
			if (this.anInt830 < 0) {
				this.aShortArray18 = new short[this.anInt832];
				for (@Pc(76) int local76 = 0; local76 < this.anInt832; local76++) {
					this.aShortArray18[local76] = (short) arg0.method7849();
				}
			}
		} else if (arg1 == 3) {
			this.anInt833 = this.anInt835 = arg0.method7816();
		} else if (arg1 == 4) {
			this.anInt834 = arg0.method7816();
		} else if (arg1 == 5) {
			this.anInt833 = arg0.method7816();
		} else if (arg1 == 6) {
			this.anInt835 = arg0.method7816();
		}
	}

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)V")
	private void method735() {
		@Pc(35) int local35;
		if (this.anInt830 > 0) {
			this.aShortArray18 = new short[this.anInt832];
			this.aShortArray17 = new short[this.anInt832];
			for (local35 = 0; local35 < this.anInt832; local35++) {
				this.aShortArray18[local35] = (short) (int) (Math.pow((double) ((float) this.anInt830 / 4096.0F), (double) local35) * 4096.0D);
				this.aShortArray17[local35] = (short) (int) Math.pow(2.0D, (double) local35);
			}
		} else if (this.aShortArray18 != null && this.anInt832 == this.aShortArray18.length) {
			this.aShortArray17 = new short[this.anInt832];
			for (local35 = 0; local35 < this.anInt832; local35++) {
				this.aShortArray17[local35] = (short) (int) Math.pow(2.0D, (double) local35);
			}
			return;
		}
	}
}
