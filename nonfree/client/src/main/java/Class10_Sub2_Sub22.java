import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class10_Sub2_Sub22 extends Class10_Sub2 {

	@OriginalMember(owner = "client!nt", name = "I", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!nt", name = "T", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!nt", name = "N", descriptor = "Z")
	public boolean aBoolean335 = true;

	@OriginalMember(owner = "client!nt", name = "K", descriptor = "I")
	public int anInt4910 = 1638;

	@OriginalMember(owner = "client!nt", name = "V", descriptor = "I")
	public int anInt4918 = 0;

	@OriginalMember(owner = "client!nt", name = "U", descriptor = "I")
	public int anInt4917 = 4;

	@OriginalMember(owner = "client!nt", name = "Q", descriptor = "[B")
	private byte[] aByteArray59 = new byte[512];

	@OriginalMember(owner = "client!nt", name = "S", descriptor = "I")
	public int anInt4916 = 4;

	@OriginalMember(owner = "client!nt", name = "Z", descriptor = "I")
	public int anInt4922 = 4;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([III)V")
	public void method3963(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt4916 * Static67.anIntArray106[arg1];
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(46) int local46;
		@Pc(31) short local31;
		@Pc(107) int local107;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(53) int local53;
		@Pc(87) int local87;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(96) int local96;
		@Pc(105) int local105;
		if (this.anInt4922 == 1) {
			local46 = this.aShortArray85[0] << 12;
			local31 = this.aShortArray86[0];
			local66 = local46 * this.anInt4917 >> 12;
			local59 = local20 * local46 >> 12;
			local53 = this.anInt4916 * local46 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			@Pc(373) int local373 = local59 & 0xFFF;
			if (local53 <= local74) {
				local74 = 0;
			}
			local96 = this.aByteArray59[local70 & 0xFF] & 0xFF;
			local105 = this.aByteArray59[local74 & 0xFF] & 0xFF;
			local87 = Class10_Sub2.anIntArray748[local373];
			if (this.aBoolean335) {
				for (local107 = 0; local107 < Static121.anInt2458; local107++) {
					local116 = this.anInt4917 * Static182.anIntArray374[local107];
					local130 = this.method3967(local46 * local116 >> 12, local96, local373, local87, local66, local105);
					@Pc(480) int local480 = local130 * local31 >> 12;
					arg0[local107] = (local480 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static121.anInt2458; local107++) {
					local116 = this.anInt4917 * Static182.anIntArray374[local107];
					local130 = this.method3967(local116 * local46 >> 12, local96, local373, local87, local66, local105);
					arg0[local107] = local130 * local31 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray86[0];
		if (local31 > 8 || local31 < -8) {
			local46 = this.aShortArray85[0] << 12;
			local53 = local46 * this.anInt4916 >> 12;
			local59 = local20 * local46 >> 12;
			local66 = local46 * this.anInt4917 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			local59 &= 0xFFF;
			if (local53 <= local74) {
				local74 = 0;
			}
			local87 = Class10_Sub2.anIntArray748[local59];
			local96 = this.aByteArray59[local70 & 0xFF] & 0xFF;
			local105 = this.aByteArray59[local74 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static121.anInt2458; local107++) {
				local116 = this.anInt4917 * Static182.anIntArray374[local107];
				local130 = this.method3967(local46 * local116 >> 12, local96, local59, local87, local66, local105);
				arg0[local107] = local31 * local130 >> 12;
			}
		}
		for (@Pc(144) int local144 = 1; local144 < this.anInt4922; local144++) {
			local31 = this.aShortArray86[local144];
			if (local31 > 8 || local31 < -8) {
				local46 = this.aShortArray85[local144] << 12;
				local59 = local20 * local46 >> 12;
				local66 = this.anInt4917 * local46 >> 12;
				local53 = this.anInt4916 * local46 >> 12;
				local70 = local59 >> 12;
				local74 = local70 + 1;
				local59 &= 0xFFF;
				if (local53 <= local74) {
					local74 = 0;
				}
				local105 = this.aByteArray59[local74 & 0xFF] & 0xFF;
				local96 = this.aByteArray59[local70 & 0xFF] & 0xFF;
				local87 = Class10_Sub2.anIntArray748[local59];
				if (this.aBoolean335 && this.anInt4922 - 1 == local144) {
					for (local107 = 0; local107 < Static121.anInt2458; local107++) {
						local116 = Static182.anIntArray374[local107] * this.anInt4917;
						local130 = this.method3967(local46 * local116 >> 12, local96, local59, local87, local66, local105);
						local130 = (local31 * local130 >> 12) + arg0[local107];
						arg0[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static121.anInt2458; local107++) {
						local116 = Static182.anIntArray374[local107] * this.anInt4917;
						local130 = this.method3967(local116 * local46 >> 12, local96, local59, local87, local66, local105);
						arg0[local107] += local31 * local130 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
	private void method3964() {
		@Pc(17) int local17;
		if (this.anInt4910 > 0) {
			this.aShortArray86 = new short[this.anInt4922];
			this.aShortArray85 = new short[this.anInt4922];
			for (local17 = 0; local17 < this.anInt4922; local17++) {
				this.aShortArray86[local17] = (short) (Math.pow((double) ((float) this.anInt4910 / 4096.0F), (double) local17) * 4096.0D);
				this.aShortArray85[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		} else if (this.aShortArray86 != null && this.aShortArray86.length == this.anInt4922) {
			this.aShortArray85 = new short[this.anInt4922];
			for (local17 = 0; local17 < this.anInt4922; local17++) {
				this.aShortArray85[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIZII)I")
	private int method3967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg4) {
			local13 = 0;
		}
		@Pc(22) int local22 = arg0 & 0xFFF;
		local9 &= 0xFF;
		@Pc(30) int local30 = arg2 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = local22 - 4096;
		@Pc(42) int local42 = Class10_Sub2.anIntArray748[local22];
		@Pc(51) int local51 = this.aByteArray59[arg1 + local9] & 0x3;
		@Pc(69) int local69;
		if (local51 > 1) {
			local69 = local51 == 2 ? local22 - arg2 : -local22 - arg2;
		} else {
			local69 = local51 == 0 ? arg2 + local22 : arg2 + -local22;
		}
		local51 = this.aByteArray59[local13 + arg1] & 0x3;
		@Pc(108) int local108;
		if (local51 <= 1) {
			local108 = local51 == 0 ? arg2 + local38 : -local38 + arg2;
		} else {
			local108 = local51 == 2 ? local38 - arg2 : -arg2 + -local38;
		}
		@Pc(134) int local134 = ((local108 - local69) * local42 >> 12) + local69;
		local51 = this.aByteArray59[local9 + arg5] & 0x3;
		if (local51 > 1) {
			local69 = local51 == 2 ? local22 - local30 : -local22 + -local30;
		} else {
			local69 = local51 == 0 ? local22 + local30 : -local22 + local30;
		}
		local51 = this.aByteArray59[local13 + arg5] & 0x3;
		if (local51 > 1) {
			local108 = local51 == 2 ? local38 - local30 : -local30 + -local38;
		} else {
			local108 = local51 == 0 ? local30 + local38 : -local38 + local30;
		}
		@Pc(240) int local240 = (local42 * (local108 - local69) >> 12) + local69;
		return ((local240 - local134) * arg3 >> 12) + local134;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			this.method3963(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		this.aByteArray59 = Static450.method5996(this.anInt4918);
		this.method3964();
		for (@Pc(19) int local19 = this.anInt4922 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray86[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt4922--;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean335 = arg1.method2502() == 1;
		} else if (arg0 == 1) {
			this.anInt4922 = arg1.method2502();
		} else if (arg0 == 2) {
			this.anInt4910 = arg1.method2492();
			if (this.anInt4910 < 0) {
				this.aShortArray86 = new short[this.anInt4922];
				for (@Pc(75) int local75 = 0; local75 < this.anInt4922; local75++) {
					this.aShortArray86[local75] = (short) arg1.method2492();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt4917 = this.anInt4916 = arg1.method2502();
			return;
		} else if (arg0 == 4) {
			this.anInt4918 = arg1.method2502();
			return;
		} else if (arg0 == 5) {
			this.anInt4917 = arg1.method2502();
			return;
		} else if (arg0 == 6) {
			this.anInt4916 = arg1.method2502();
			return;
		}
	}
}
