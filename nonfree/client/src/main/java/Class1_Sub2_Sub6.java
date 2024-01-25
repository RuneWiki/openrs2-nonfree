import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ci", name = "U", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!ci", name = "X", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
	public int anInt895 = 4;

	@OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
	public int anInt898 = 1638;

	@OriginalMember(owner = "client!ci", name = "N", descriptor = "Z")
	public boolean aBoolean77 = true;

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
	public int anInt897 = 0;

	@OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
	public int anInt905 = 4;

	@OriginalMember(owner = "client!ci", name = "S", descriptor = "[B")
	private byte[] aByteArray19 = new byte[512];

	@OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
	public int anInt906 = 4;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			this.method706(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.aBoolean77 = arg1.method5174() == 1;
		} else if (arg0 == 1) {
			this.anInt905 = arg1.method5174();
		} else if (arg0 == 2) {
			this.anInt898 = arg1.method5180();
			if (this.anInt898 < 0) {
				this.aShortArray28 = new short[this.anInt905];
				for (@Pc(82) int local82 = 0; local82 < this.anInt905; local82++) {
					this.aShortArray28[local82] = (short) arg1.method5180();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt906 = this.anInt895 = arg1.method5174();
			return;
		} else if (arg0 == 4) {
			this.anInt897 = arg1.method5174();
			return;
		} else if (arg0 == 5) {
			this.anInt906 = arg1.method5174();
			return;
		} else if (arg0 == 6) {
			this.anInt895 = arg1.method5174();
			return;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[I)V")
	public void method706(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt895 * Static394.anIntArray751[arg0];
		@Pc(117) int local117;
		@Pc(131) int local131;
		@Pc(43) int local43;
		@Pc(28) short local28;
		@Pc(108) int local108;
		@Pc(63) int local63;
		@Pc(57) int local57;
		@Pc(50) int local50;
		@Pc(97) int local97;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(93) int local93;
		@Pc(106) int local106;
		if (this.anInt905 == 1) {
			local43 = this.aShortArray29[0] << 12;
			local28 = this.aShortArray28[0];
			local50 = local43 * this.anInt895 >> 12;
			local57 = this.anInt906 * local43 >> 12;
			local63 = local12 * local43 >> 12;
			local67 = local63 >> 12;
			local71 = local67 + 1;
			@Pc(388) int local388 = local63 & 0xFFF;
			if (local50 <= local71) {
				local71 = 0;
			}
			local106 = this.aByteArray19[local71 & 0xFF] & 0xFF;
			local93 = this.aByteArray19[local67 & 0xFF] & 0xFF;
			local97 = Class187.anIntArray592[local388];
			if (this.aBoolean77) {
				for (local108 = 0; local108 < Static158.anInt2658; local108++) {
					local117 = this.anInt906 * Static87.anIntArray211[local108];
					local131 = this.method707(local388, local57, local106, local97, local93, local117 * local43 >> 12);
					@Pc(487) int local487 = local28 * local131 >> 12;
					arg1[local108] = (local487 >> 1) + 2048;
				}
			} else {
				for (local108 = 0; local108 < Static158.anInt2658; local108++) {
					local117 = this.anInt906 * Static87.anIntArray211[local108];
					local131 = this.method707(local388, local57, local106, local97, local93, local117 * local43 >> 12);
					arg1[local108] = local28 * local131 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray28[0];
		if (local28 > 8 || local28 < -8) {
			local43 = this.aShortArray29[0] << 12;
			local50 = local43 * this.anInt895 >> 12;
			local57 = local43 * this.anInt906 >> 12;
			local63 = local12 * local43 >> 12;
			local67 = local63 >> 12;
			local71 = local67 + 1;
			local63 &= 0xFFF;
			if (local71 >= local50) {
				local71 = 0;
			}
			local93 = this.aByteArray19[local67 & 0xFF] & 0xFF;
			local97 = Class187.anIntArray592[local63];
			local106 = this.aByteArray19[local71 & 0xFF] & 0xFF;
			for (local108 = 0; local108 < Static158.anInt2658; local108++) {
				local117 = this.anInt906 * Static87.anIntArray211[local108];
				local131 = this.method707(local63, local57, local106, local97, local93, local117 * local43 >> 12);
				arg1[local108] = local28 * local131 >> 12;
			}
		}
		for (@Pc(149) int local149 = 1; local149 < this.anInt905; local149++) {
			local28 = this.aShortArray28[local149];
			if (local28 > 8 || local28 < -8) {
				local43 = this.aShortArray29[local149] << 12;
				local63 = local43 * local12 >> 12;
				local50 = this.anInt895 * local43 >> 12;
				local57 = local43 * this.anInt906 >> 12;
				local67 = local63 >> 12;
				local71 = local67 + 1;
				local63 &= 0xFFF;
				if (local71 >= local50) {
					local71 = 0;
				}
				local93 = this.aByteArray19[local67 & 0xFF] & 0xFF;
				local97 = Class187.anIntArray592[local63];
				local106 = this.aByteArray19[local71 & 0xFF] & 0xFF;
				if (this.aBoolean77 && this.anInt905 - 1 == local149) {
					for (local108 = 0; local108 < Static158.anInt2658; local108++) {
						local117 = Static87.anIntArray211[local108] * this.anInt906;
						local131 = this.method707(local63, local57, local106, local97, local93, local117 * local43 >> 12);
						local131 = arg1[local108] + (local131 * local28 >> 12);
						arg1[local108] = (local131 >> 1) + 2048;
					}
				} else {
					for (local108 = 0; local108 < Static158.anInt2658; local108++) {
						local117 = Static87.anIntArray211[local108] * this.anInt906;
						local131 = this.method707(local63, local57, local106, local97, local93, local43 * local117 >> 12);
						arg1[local108] += local131 * local28 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIII)I")
	private int method707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg1 <= local13) {
			local13 = 0;
		}
		@Pc(31) int local31 = arg5 & 0xFFF;
		local9 &= 0xFF;
		local13 &= 0xFF;
		@Pc(43) int local43 = local31 - 4096;
		@Pc(47) int local47 = arg0 - 4096;
		@Pc(51) int local51 = Class187.anIntArray592[local31];
		@Pc(61) int local61 = this.aByteArray19[local9 + arg4] & 0x3;
		@Pc(81) int local81;
		if (local61 <= 1) {
			local81 = local61 == 0 ? local31 + arg0 : -local31 + arg0;
		} else {
			local81 = local61 == 2 ? local31 - arg0 : -local31 - arg0;
		}
		local61 = this.aByteArray19[local13 + arg4] & 0x3;
		@Pc(126) int local126;
		if (local61 > 1) {
			local126 = local61 == 2 ? local43 - arg0 : -local43 - arg0;
		} else {
			local126 = local61 == 0 ? local43 + arg0 : arg0 + -local43;
		}
		@Pc(153) int local153 = local81 + (local51 * (local126 - local81) >> 12);
		local61 = this.aByteArray19[local9 + arg2] & 0x3;
		if (local61 > 1) {
			local81 = local61 == 2 ? local31 - local47 : -local47 + -local31;
		} else {
			local81 = local61 == 0 ? local47 + local31 : local47 - local31;
		}
		local61 = this.aByteArray19[arg2 + local13] & 0x3;
		if (local61 <= 1) {
			local126 = local61 == 0 ? local43 + local47 : local47 - local43;
		} else {
			local126 = local61 == 2 ? local43 - local47 : -local43 - local47;
		}
		@Pc(241) int local241 = local81 + (local51 * (local126 - local81) >> 12);
		return ((local241 - local153) * arg3 >> 12) + local153;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		this.aByteArray19 = Static196.method2843(this.anInt897);
		this.method708();
		for (@Pc(25) int local25 = this.anInt905 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray28[local25];
			if (local32 > 8 || local32 < -8) {
				return;
			}
			this.anInt905--;
		}
	}

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)V")
	private void method708() {
		@Pc(20) int local20;
		if (this.anInt898 > 0) {
			this.aShortArray28 = new short[this.anInt905];
			this.aShortArray29 = new short[this.anInt905];
			for (local20 = 0; local20 < this.anInt905; local20++) {
				this.aShortArray28[local20] = (short) (Math.pow((double) ((float) this.anInt898 / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray29[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray28 != null && this.anInt905 == this.aShortArray28.length) {
			this.aShortArray29 = new short[this.anInt905];
			for (local20 = 0; local20 < this.anInt905; local20++) {
				this.aShortArray29[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}
}
