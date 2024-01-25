import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uca", name = "U", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!uca", name = "Y", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!uca", name = "B", descriptor = "[B")
	private byte[] aByteArray98 = new byte[512];

	@OriginalMember(owner = "client!uca", name = "D", descriptor = "I")
	public int anInt8692 = 4;

	@OriginalMember(owner = "client!uca", name = "M", descriptor = "Z")
	public boolean aBoolean635 = true;

	@OriginalMember(owner = "client!uca", name = "P", descriptor = "I")
	public int anInt8701 = 1638;

	@OriginalMember(owner = "client!uca", name = "N", descriptor = "I")
	public int anInt8699 = 0;

	@OriginalMember(owner = "client!uca", name = "T", descriptor = "I")
	public int anInt8704 = 4;

	@OriginalMember(owner = "client!uca", name = "R", descriptor = "I")
	public int anInt8703 = 4;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIII)I")
	private int method7171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg2 >> 12;
		@Pc(19) int local19 = local15 + 1;
		if (local19 >= arg4) {
			local19 = 0;
		}
		@Pc(28) int local28 = arg2 & 0xFFF;
		local15 &= 0xFF;
		local19 &= 0xFF;
		@Pc(40) int local40 = arg0 - 4096;
		@Pc(44) int local44 = local28 - 4096;
		@Pc(48) int local48 = InputStream_Sub1.anIntArray169[local28];
		@Pc(57) int local57 = this.aByteArray98[arg5 + local15] & 0x3;
		@Pc(76) int local76;
		if (local57 > 1) {
			local76 = local57 == 2 ? local28 - arg0 : -arg0 + -local28;
		} else {
			local76 = local57 == 0 ? local28 + arg0 : arg0 + -local28;
		}
		local57 = this.aByteArray98[arg5 + local19] & 0x3;
		@Pc(117) int local117;
		if (local57 > 1) {
			local117 = local57 == 2 ? local44 - arg0 : -arg0 + -local44;
		} else {
			local117 = local57 == 0 ? local44 + arg0 : -local44 + arg0;
		}
		@Pc(142) int local142 = local76 + ((local117 - local76) * local48 >> 12);
		local57 = this.aByteArray98[arg1 + local15] & 0x3;
		if (local57 <= 1) {
			local76 = local57 == 0 ? local40 + local28 : -local28 + local40;
		} else {
			local76 = local57 == 2 ? local28 - local40 : -local28 - local40;
		}
		local57 = this.aByteArray98[arg1 + local19] & 0x3;
		if (local57 > 1) {
			local117 = local57 == 2 ? local44 - local40 : -local44 - local40;
		} else {
			local117 = local57 == 0 ? local40 + local44 : -local44 + local40;
		}
		@Pc(238) int local238 = (local48 * (local117 - local76) >> 12) + local76;
		return (arg3 * (local238 - local142) >> 12) + local142;
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)V")
	private void method7174() {
		@Pc(31) int local31;
		if (this.anInt8701 > 0) {
			this.aShortArray110 = new short[this.anInt8704];
			this.aShortArray111 = new short[this.anInt8704];
			for (local31 = 0; local31 < this.anInt8704; local31++) {
				this.aShortArray110[local31] = (short) (Math.pow((double) ((float) this.anInt8701 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray111[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray110 != null && this.aShortArray110.length == this.anInt8704) {
			this.aShortArray111 = new short[this.anInt8704];
			for (local31 = 0; local31 < this.anInt8704; local31++) {
				this.aShortArray111[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.aBoolean635 = arg1.method4393() == 1;
		} else if (arg0 == 1) {
			this.anInt8704 = arg1.method4393();
		} else if (arg0 == 2) {
			this.anInt8701 = arg1.method4391();
			if (this.anInt8701 < 0) {
				this.aShortArray110 = new short[this.anInt8704];
				for (@Pc(82) int local82 = 0; local82 < this.anInt8704; local82++) {
					this.aShortArray110[local82] = (short) arg1.method4391();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt8692 = this.anInt8703 = arg1.method4393();
			return;
		} else if (arg0 == 4) {
			this.anInt8699 = arg1.method4393();
			return;
		} else if (arg0 == 5) {
			this.anInt8692 = arg1.method4393();
			return;
		} else if (arg0 == 6) {
			this.anInt8703 = arg1.method4393();
			return;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		this.aByteArray98 = Static237.method3851(this.anInt8699);
		this.method7174();
		for (@Pc(19) int local19 = this.anInt8704 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray110[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt8704--;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([III)V")
	public void method7177(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt8703 * Static337.anIntArray406[arg1];
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(42) int local42;
		@Pc(27) short local27;
		@Pc(107) int local107;
		@Pc(62) int local62;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(105) int local105;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(101) int local101;
		@Pc(92) int local92;
		if (this.anInt8704 == 1) {
			local27 = this.aShortArray110[0];
			local42 = this.aShortArray111[0] << 12;
			local49 = this.anInt8692 * local42 >> 12;
			local56 = local42 * this.anInt8703 >> 12;
			local62 = local42 * local18 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			@Pc(387) int local387 = local62 & 0xFFF;
			if (local70 >= local56) {
				local70 = 0;
			}
			local92 = this.aByteArray98[local70 & 0xFF] & 0xFF;
			local105 = InputStream_Sub1.anIntArray169[local387];
			local101 = this.aByteArray98[local66 & 0xFF] & 0xFF;
			if (this.aBoolean635) {
				for (local107 = 0; local107 < Static87.anInt1964; local107++) {
					local116 = this.anInt8692 * Static436.anIntArray506[local107];
					local130 = this.method7171(local387, local92, local116 * local42 >> 12, local105, local49, local101);
					@Pc(496) int local496 = local130 * local27 >> 12;
					arg0[local107] = (local496 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static87.anInt1964; local107++) {
					local116 = Static436.anIntArray506[local107] * this.anInt8692;
					local130 = this.method7171(local387, local92, local42 * local116 >> 12, local105, local49, local101);
					arg0[local107] = local27 * local130 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray110[0];
		if (local27 > 8 || local27 < -8) {
			local42 = this.aShortArray111[0] << 12;
			local49 = this.anInt8692 * local42 >> 12;
			local56 = this.anInt8703 * local42 >> 12;
			local62 = local18 * local42 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			local62 &= 0xFFF;
			if (local56 <= local70) {
				local70 = 0;
			}
			local92 = this.aByteArray98[local70 & 0xFF] & 0xFF;
			local101 = this.aByteArray98[local66 & 0xFF] & 0xFF;
			local105 = InputStream_Sub1.anIntArray169[local62];
			for (local107 = 0; local107 < Static87.anInt1964; local107++) {
				local116 = this.anInt8692 * Static436.anIntArray506[local107];
				local130 = this.method7171(local62, local92, local116 * local42 >> 12, local105, local49, local101);
				arg0[local107] = local27 * local130 >> 12;
			}
		}
		for (@Pc(148) int local148 = 1; local148 < this.anInt8704; local148++) {
			local27 = this.aShortArray110[local148];
			if (local27 > 8 || local27 < -8) {
				local42 = this.aShortArray111[local148] << 12;
				local62 = local18 * local42 >> 12;
				local56 = this.anInt8703 * local42 >> 12;
				local49 = this.anInt8692 * local42 >> 12;
				local66 = local62 >> 12;
				local70 = local66 + 1;
				if (local70 >= local56) {
					local70 = 0;
				}
				local62 &= 0xFFF;
				local92 = this.aByteArray98[local70 & 0xFF] & 0xFF;
				local105 = InputStream_Sub1.anIntArray169[local62];
				local101 = this.aByteArray98[local66 & 0xFF] & 0xFF;
				if (this.aBoolean635 && this.anInt8704 - 1 == local148) {
					for (local107 = 0; local107 < Static87.anInt1964; local107++) {
						local116 = Static436.anIntArray506[local107] * this.anInt8692;
						local130 = this.method7171(local62, local92, local42 * local116 >> 12, local105, local49, local101);
						local130 = (local130 * local27 >> 12) + arg0[local107];
						arg0[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static87.anInt1964; local107++) {
						local116 = this.anInt8692 * Static436.anIntArray506[local107];
						local130 = this.method7171(local62, local92, local116 * local42 >> 12, local105, local49, local101);
						arg0[local107] += local130 * local27 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			this.method7177(local14, arg0);
		}
		return local14;
	}
}
