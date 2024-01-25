import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!r", name = "O", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "I")
	public int anInt5923 = 0;

	@OriginalMember(owner = "client!r", name = "R", descriptor = "I")
	public int anInt5922 = 4;

	@OriginalMember(owner = "client!r", name = "N", descriptor = "I")
	public int anInt5920 = 4;

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
	public int anInt5928 = 1638;

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "[B")
	private byte[] aByteArray162 = new byte[512];

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
	public int anInt5927 = 4;

	@OriginalMember(owner = "client!r", name = "db", descriptor = "Z")
	public boolean aBoolean520 = true;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.aBoolean520 = arg1.method3737() == 1;
		} else if (arg0 == 1) {
			this.anInt5922 = arg1.method3737();
		} else if (arg0 == 2) {
			this.anInt5928 = arg1.method3701();
			if (this.anInt5928 < 0) {
				this.aShortArray76 = new short[this.anInt5922];
				for (@Pc(80) int local80 = 0; local80 < this.anInt5922; local80++) {
					this.aShortArray76[local80] = (short) arg1.method3701();
				}
			}
		} else if (arg0 == 3) {
			this.anInt5927 = this.anInt5920 = arg1.method3737();
		} else if (arg0 == 4) {
			this.anInt5923 = arg1.method3737();
		} else if (arg0 == 5) {
			this.anInt5927 = arg1.method3737();
		} else if (arg0 == 6) {
			this.anInt5920 = arg1.method3737();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		this.aByteArray162 = Static28.method383(this.anInt5923);
		this.method4736();
		for (@Pc(19) int local19 = this.anInt5922 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray76[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt5922--;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIIIII)I")
	private int method4735(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg1) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(26) int local26 = arg4 & 0xFFF;
		@Pc(30) int local30 = arg5 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = local26 - 4096;
		@Pc(42) int local42 = Class2_Sub1_Sub19.anIntArray269[local26];
		@Pc(52) int local52 = this.aByteArray162[local9 + arg2] & 0x3;
		@Pc(67) int local67;
		if (local52 <= 1) {
			local67 = local52 == 0 ? local26 + arg5 : arg5 + -local26;
		} else {
			local67 = local52 == 2 ? local26 - arg5 : -local26 + -arg5;
		}
		local52 = this.aByteArray162[local13 + arg2] & 0x3;
		@Pc(111) int local111;
		if (local52 <= 1) {
			local111 = local52 == 0 ? local38 + arg5 : -local38 + arg5;
		} else {
			local111 = local52 == 2 ? local38 - arg5 : -local38 - arg5;
		}
		local52 = this.aByteArray162[arg3 + local9] & 0x3;
		@Pc(155) int local155 = (local42 * (local111 - local67) >> 12) + local67;
		if (local52 > 1) {
			local67 = local52 == 2 ? local26 - local30 : -local26 + -local30;
		} else {
			local67 = local52 == 0 ? local30 + local26 : -local26 + local30;
		}
		local52 = this.aByteArray162[local13 + arg3] & 0x3;
		if (local52 <= 1) {
			local111 = local52 == 0 ? local38 + local30 : -local38 + local30;
		} else {
			local111 = local52 == 2 ? local38 - local30 : -local38 + -local30;
		}
		@Pc(240) int local240 = local67 + ((local111 - local67) * local42 >> 12);
		return local155 + (arg0 * (local240 - local155) >> 12);
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	private void method4736() {
		@Pc(26) int local26;
		if (this.anInt5928 > 0) {
			this.aShortArray76 = new short[this.anInt5922];
			this.aShortArray77 = new short[this.anInt5922];
			for (local26 = 0; local26 < this.anInt5922; local26++) {
				this.aShortArray76[local26] = (short) (Math.pow((double) ((float) this.anInt5928 / 4096.0F), (double) local26) * 4096.0D);
				this.aShortArray77[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		} else if (this.aShortArray76 != null && this.anInt5922 == this.aShortArray76.length) {
			this.aShortArray77 = new short[this.anInt5922];
			for (local26 = 0; local26 < this.anInt5922; local26++) {
				this.aShortArray77[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			this.method4737(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([III)V")
	public void method4737(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt5920 * Static373.anIntArray55[arg1];
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(27) int local27;
		@Pc(32) short local32;
		@Pc(100) int local100;
		@Pc(52) int local52;
		@Pc(39) int local39;
		@Pc(46) int local46;
		@Pc(95) int local95;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(91) int local91;
		@Pc(82) int local82;
		if (this.anInt5922 == 1) {
			local27 = this.aShortArray77[0] << 12;
			local32 = this.aShortArray76[0];
			local39 = this.anInt5927 * local27 >> 12;
			local46 = local27 * this.anInt5920 >> 12;
			local52 = local27 * local12 >> 12;
			local56 = local52 >> 12;
			local60 = local56 + 1;
			if (local46 <= local60) {
				local60 = 0;
			}
			local52 &= 0xFFF;
			local82 = this.aByteArray162[local60 & 0xFF] & 0xFF;
			local91 = this.aByteArray162[local56 & 0xFF] & 0xFF;
			local95 = Class2_Sub1_Sub19.anIntArray269[local52];
			if (this.aBoolean520) {
				for (local100 = 0; local100 < Static131.anInt2581; local100++) {
					local109 = Static252.anIntArray323[local100] * this.anInt5927;
					local123 = this.method4735(local95, local39, local91, local82, local27 * local109 >> 12, local52);
					local123 = local123 * local32 >> 12;
					arg0[local100] = (local123 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static131.anInt2581; local100++) {
					local109 = Static252.anIntArray323[local100] * this.anInt5927;
					local123 = this.method4735(local95, local39, local91, local82, local109 * local27 >> 12, local52);
					arg0[local100] = local32 * local123 >> 12;
				}
			}
			return;
		}
		local32 = this.aShortArray76[0];
		if (local32 > 8 || local32 < -8) {
			local27 = this.aShortArray77[0] << 12;
			local39 = local27 * this.anInt5927 >> 12;
			local46 = this.anInt5920 * local27 >> 12;
			local52 = local12 * local27 >> 12;
			local56 = local52 >> 12;
			local60 = local56 + 1;
			@Pc(238) int local238 = local52 & 0xFFF;
			if (local60 >= local46) {
				local60 = 0;
			}
			local95 = Class2_Sub1_Sub19.anIntArray269[local238];
			local91 = this.aByteArray162[local56 & 0xFF] & 0xFF;
			local82 = this.aByteArray162[local60 & 0xFF] & 0xFF;
			for (local100 = 0; local100 < Static131.anInt2581; local100++) {
				local109 = this.anInt5927 * Static252.anIntArray323[local100];
				local123 = this.method4735(local95, local39, local91, local82, local109 * local27 >> 12, local238);
				arg0[local100] = local32 * local123 >> 12;
			}
		}
		for (@Pc(308) int local308 = 1; local308 < this.anInt5922; local308++) {
			local32 = this.aShortArray76[local308];
			if (local32 > 8 || local32 < -8) {
				local27 = this.aShortArray77[local308] << 12;
				local46 = local27 * this.anInt5920 >> 12;
				local52 = local27 * local12 >> 12;
				local39 = this.anInt5927 * local27 >> 12;
				local56 = local52 >> 12;
				local60 = local56 + 1;
				local52 &= 0xFFF;
				if (local60 >= local46) {
					local60 = 0;
				}
				local82 = this.aByteArray162[local60 & 0xFF] & 0xFF;
				local91 = this.aByteArray162[local56 & 0xFF] & 0xFF;
				local95 = Class2_Sub1_Sub19.anIntArray269[local52];
				if (this.aBoolean520 && this.anInt5922 - 1 == local308) {
					for (local100 = 0; local100 < Static131.anInt2581; local100++) {
						local109 = Static252.anIntArray323[local100] * this.anInt5927;
						local123 = this.method4735(local95, local39, local91, local82, local27 * local109 >> 12, local52);
						local123 = arg0[local100] + (local32 * local123 >> 12);
						arg0[local100] = (local123 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static131.anInt2581; local100++) {
						local109 = Static252.anIntArray323[local100] * this.anInt5927;
						local123 = this.method4735(local95, local39, local91, local82, local27 * local109 >> 12, local52);
						arg0[local100] += local32 * local123 >> 12;
					}
				}
			}
		}
	}
}
