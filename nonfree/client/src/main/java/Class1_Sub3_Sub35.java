import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class1_Sub3_Sub35 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sp", name = "P", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!sp", name = "ab", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "Z")
	public boolean aBoolean552 = true;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "[B")
	private byte[] aByteArray107 = new byte[512];

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
	public int anInt7689 = 1638;

	@OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
	public int anInt7686 = 0;

	@OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
	public int anInt7693 = 4;

	@OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
	public int anInt7691 = 4;

	@OriginalMember(owner = "client!sp", name = "X", descriptor = "I")
	public int anInt7700 = 4;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		this.aByteArray107 = Static187.method2922(this.anInt7686);
		this.method6403();
		for (@Pc(19) int local19 = this.anInt7691 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray127[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt7691--;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean552 = arg0.method3922() == 1;
		} else if (arg1 == 1) {
			this.anInt7691 = arg0.method3922();
		} else if (arg1 == 2) {
			this.anInt7689 = arg0.method3964();
			if (this.anInt7689 < 0) {
				this.aShortArray127 = new short[this.anInt7691];
				for (@Pc(68) int local68 = 0; local68 < this.anInt7691; local68++) {
					this.aShortArray127[local68] = (short) arg0.method3964();
				}
			}
		} else if (arg1 == 3) {
			this.anInt7700 = this.anInt7693 = arg0.method3922();
		} else if (arg1 == 4) {
			this.anInt7686 = arg0.method3922();
		} else if (arg1 == 5) {
			this.anInt7700 = arg0.method3922();
		} else if (arg1 == 6) {
			this.anInt7693 = arg0.method3922();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB[I)V")
	public void method6401(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(18) int local18 = Static7.anIntArray20[arg0] * this.anInt7693;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(31) int local31;
		@Pc(36) short local36;
		@Pc(100) int local100;
		@Pc(42) int local42;
		@Pc(56) int local56;
		@Pc(49) int local49;
		@Pc(86) int local86;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (this.anInt7691 == 1) {
			local31 = this.aShortArray126[0] << 12;
			local36 = this.aShortArray127[0];
			local42 = local31 * local18 >> 12;
			local49 = local31 * this.anInt7693 >> 12;
			local56 = this.anInt7700 * local31 >> 12;
			local60 = local42 >> 12;
			local64 = local60 + 1;
			local42 &= 0xFFF;
			if (local49 <= local64) {
				local64 = 0;
			}
			local82 = this.aByteArray107[local60 & 0xFF] & 0xFF;
			local86 = Class42.anIntArray724[local42];
			local95 = this.aByteArray107[local64 & 0xFF] & 0xFF;
			if (this.aBoolean552) {
				for (local100 = 0; local100 < Static452.anInt7734; local100++) {
					local109 = Static228.anIntArray442[local100] * this.anInt7700;
					local123 = this.method6402(local82, local42, local86, local56, local95, local109 * local31 >> 12);
					local123 = local123 * local36 >> 12;
					arg1[local100] = (local123 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static452.anInt7734; local100++) {
					local109 = Static228.anIntArray442[local100] * this.anInt7700;
					local123 = this.method6402(local82, local42, local86, local56, local95, local109 * local31 >> 12);
					arg1[local100] = local36 * local123 >> 12;
				}
			}
			return;
		}
		local36 = this.aShortArray127[0];
		if (local36 > 8 || local36 < -8) {
			local31 = this.aShortArray126[0] << 12;
			local56 = local31 * this.anInt7700 >> 12;
			local49 = local31 * this.anInt7693 >> 12;
			local42 = local18 * local31 >> 12;
			local60 = local42 >> 12;
			local64 = local60 + 1;
			@Pc(236) int local236 = local42 & 0xFFF;
			if (local49 <= local64) {
				local64 = 0;
			}
			local95 = this.aByteArray107[local64 & 0xFF] & 0xFF;
			local82 = this.aByteArray107[local60 & 0xFF] & 0xFF;
			local86 = Class42.anIntArray724[local236];
			for (local100 = 0; local100 < Static452.anInt7734; local100++) {
				local109 = Static228.anIntArray442[local100] * this.anInt7700;
				local123 = this.method6402(local82, local236, local86, local56, local95, local109 * local31 >> 12);
				arg1[local100] = local36 * local123 >> 12;
			}
		}
		for (@Pc(304) int local304 = 1; local304 < this.anInt7691; local304++) {
			local36 = this.aShortArray127[local304];
			if (local36 > 8 || local36 < -8) {
				local31 = this.aShortArray126[local304] << 12;
				local42 = local18 * local31 >> 12;
				local49 = this.anInt7693 * local31 >> 12;
				local56 = this.anInt7700 * local31 >> 12;
				local60 = local42 >> 12;
				local64 = local60 + 1;
				if (local49 <= local64) {
					local64 = 0;
				}
				local42 &= 0xFFF;
				local82 = this.aByteArray107[local60 & 0xFF] & 0xFF;
				local86 = Class42.anIntArray724[local42];
				local95 = this.aByteArray107[local64 & 0xFF] & 0xFF;
				if (this.aBoolean552 && local304 == this.anInt7691 - 1) {
					for (local100 = 0; local100 < Static452.anInt7734; local100++) {
						local109 = Static228.anIntArray442[local100] * this.anInt7700;
						local123 = this.method6402(local82, local42, local86, local56, local95, local109 * local31 >> 12);
						local123 = arg1[local100] + (local123 * local36 >> 12);
						arg1[local100] = (local123 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static452.anInt7734; local100++) {
						local109 = this.anInt7700 * Static228.anIntArray442[local100];
						local123 = this.method6402(local82, local42, local86, local56, local95, local31 * local109 >> 12);
						arg1[local100] += local36 * local123 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII)I")
	private int method6402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg5 & 0xFFF;
		if (arg3 <= local13) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(34) int local34 = arg1 - 4096;
		@Pc(38) int local38 = local17 - 4096;
		local13 &= 0xFF;
		@Pc(51) int local51 = this.aByteArray107[local9 + arg0] & 0x3;
		@Pc(55) int local55 = Class42.anIntArray724[local17];
		@Pc(74) int local74;
		if (local51 <= 1) {
			local74 = local51 == 0 ? arg1 + local17 : -local17 + arg1;
		} else {
			local74 = local51 == 2 ? local17 - arg1 : -arg1 + -local17;
		}
		local51 = this.aByteArray107[arg0 + local13] & 0x3;
		@Pc(114) int local114;
		if (local51 <= 1) {
			local114 = local51 == 0 ? local38 + arg1 : -local38 + arg1;
		} else {
			local114 = local51 == 2 ? local38 - arg1 : -arg1 + -local38;
		}
		@Pc(144) int local144 = local74 + ((local114 - local74) * local55 >> 12);
		local51 = this.aByteArray107[arg4 + local9] & 0x3;
		if (local51 > 1) {
			local74 = local51 == 2 ? local17 - local34 : -local17 - local34;
		} else {
			local74 = local51 == 0 ? local17 + local34 : local34 - local17;
		}
		local51 = this.aByteArray107[local13 + arg4] & 0x3;
		if (local51 <= 1) {
			local114 = local51 == 0 ? local38 + local34 : local34 - local38;
		} else {
			local114 = local51 == 2 ? local38 - local34 : -local34 + -local38;
		}
		@Pc(238) int local238 = local74 + (local55 * (local114 - local74) >> 12);
		return ((local238 - local144) * arg2 >> 12) + local144;
	}

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)V")
	private void method6403() {
		@Pc(16) int local16;
		if (this.anInt7689 > 0) {
			this.aShortArray127 = new short[this.anInt7691];
			this.aShortArray126 = new short[this.anInt7691];
			for (local16 = 0; local16 < this.anInt7691; local16++) {
				this.aShortArray127[local16] = (short) (Math.pow((double) ((float) this.anInt7689 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray126[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray127 != null && this.aShortArray127.length == this.anInt7691) {
			this.aShortArray126 = new short[this.anInt7691];
			for (local16 = 0; local16 < this.anInt7691; local16++) {
				this.aShortArray126[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			this.method6401(arg0, local9);
		}
		return local9;
	}
}
