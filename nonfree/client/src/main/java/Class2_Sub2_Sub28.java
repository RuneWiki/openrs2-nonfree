import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class2_Sub2_Sub28 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
	public int anInt4643 = 4;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
	public int anInt4646 = 0;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "[B")
	private byte[] aByteArray56 = new byte[512];

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
	public int anInt4648 = 1638;

	@OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
	public int anInt4659 = 4;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Z")
	public boolean aBoolean424 = true;

	@OriginalMember(owner = "client!pf", name = "jb", descriptor = "I")
	public int anInt4660 = 4;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		this.aByteArray56 = Static208.method3729(this.anInt4646);
		this.method4171();
		for (@Pc(21) int local21 = this.anInt4660 - 1; local21 >= 1; local21--) {
			@Pc(28) short local28 = this.aShortArray75[local21];
			if (local28 > 8 || local28 < -8) {
				return;
			}
			this.anInt4660--;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			this.method4173(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(B)V")
	private void method4171() {
		@Pc(20) int local20;
		if (this.anInt4648 > 0) {
			this.aShortArray76 = new short[this.anInt4660];
			this.aShortArray75 = new short[this.anInt4660];
			for (local20 = 0; local20 < this.anInt4660; local20++) {
				this.aShortArray75[local20] = (short) (Math.pow((double) ((float) this.anInt4648 / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray76[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray75 != null && this.anInt4660 == this.aShortArray75.length) {
			this.aShortArray76 = new short[this.anInt4660];
			for (local20 = 0; local20 < this.anInt4660; local20++) {
				this.aShortArray76[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.aBoolean424 = arg1.method4421() == 1;
		} else if (arg0 == 1) {
			this.anInt4660 = arg1.method4421();
		} else if (arg0 == 2) {
			this.anInt4648 = arg1.method4460();
			if (this.anInt4648 < 0) {
				this.aShortArray75 = new short[this.anInt4660];
				for (@Pc(79) int local79 = 0; local79 < this.anInt4660; local79++) {
					this.aShortArray75[local79] = (short) arg1.method4460();
				}
			}
		} else if (arg0 == 3) {
			this.anInt4659 = this.anInt4643 = arg1.method4421();
		} else if (arg0 == 4) {
			this.anInt4646 = arg1.method4421();
		} else if (arg0 == 5) {
			this.anInt4659 = arg1.method4421();
		} else if (arg0 == 6) {
			this.anInt4643 = arg1.method4421();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([IBI)V")
	public void method4173(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt4643 * Class208.lb[arg1];
		@Pc(110) int local110;
		@Pc(124) int local124;
		@Pc(37) int local37;
		@Pc(30) short local30;
		@Pc(101) int local101;
		@Pc(57) int local57;
		@Pc(44) int local44;
		@Pc(51) int local51;
		@Pc(96) int local96;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(92) int local92;
		@Pc(83) int local83;
		if (this.anInt4660 == 1) {
			local30 = this.aShortArray75[0];
			local37 = this.aShortArray76[0] << 12;
			local44 = this.anInt4659 * local37 >> 12;
			local51 = this.anInt4643 * local37 >> 12;
			local57 = local12 * local37 >> 12;
			local61 = local57 >> 12;
			local65 = local61 + 1;
			local57 &= 0xFFF;
			if (local51 <= local65) {
				local65 = 0;
			}
			local83 = this.aByteArray56[local65 & 0xFF] & 0xFF;
			local92 = this.aByteArray56[local61 & 0xFF] & 0xFF;
			local96 = Class100.anIntArray266[local57];
			if (this.aBoolean424) {
				for (local101 = 0; local101 < Static339.anInt6735; local101++) {
					local110 = this.anInt4659 * Static212.anIntArray325[local101];
					local124 = this.method4174(local92, local83, local110 * local37 >> 12, local57, local44, local96);
					local124 = local124 * local30 >> 12;
					arg0[local101] = (local124 >> 1) + 2048;
				}
			} else {
				for (local101 = 0; local101 < Static339.anInt6735; local101++) {
					local110 = this.anInt4659 * Static212.anIntArray325[local101];
					local124 = this.method4174(local92, local83, local110 * local37 >> 12, local57, local44, local96);
					arg0[local101] = local30 * local124 >> 12;
				}
			}
			return;
		}
		local30 = this.aShortArray75[0];
		if (local30 > 8 || local30 < -8) {
			local37 = this.aShortArray76[0] << 12;
			local57 = local37 * local12 >> 12;
			local44 = local37 * this.anInt4659 >> 12;
			local51 = this.anInt4643 * local37 >> 12;
			local61 = local57 >> 12;
			local65 = local61 + 1;
			@Pc(233) int local233 = local57 & 0xFFF;
			if (local51 <= local65) {
				local65 = 0;
			}
			local92 = this.aByteArray56[local61 & 0xFF] & 0xFF;
			local83 = this.aByteArray56[local65 & 0xFF] & 0xFF;
			local96 = Class100.anIntArray266[local233];
			for (local101 = 0; local101 < Static339.anInt6735; local101++) {
				local110 = Static212.anIntArray325[local101] * this.anInt4659;
				local124 = this.method4174(local92, local83, local110 * local37 >> 12, local233, local44, local96);
				arg0[local101] = local30 * local124 >> 12;
			}
		}
		for (@Pc(303) int local303 = 1; local303 < this.anInt4660; local303++) {
			local30 = this.aShortArray75[local303];
			if (local30 > 8 || local30 < -8) {
				local37 = this.aShortArray76[local303] << 12;
				local57 = local12 * local37 >> 12;
				local51 = local37 * this.anInt4643 >> 12;
				local44 = local37 * this.anInt4659 >> 12;
				local61 = local57 >> 12;
				local65 = local61 + 1;
				local57 &= 0xFFF;
				if (local51 <= local65) {
					local65 = 0;
				}
				local96 = Class100.anIntArray266[local57];
				local92 = this.aByteArray56[local61 & 0xFF] & 0xFF;
				local83 = this.aByteArray56[local65 & 0xFF] & 0xFF;
				if (this.aBoolean424 && this.anInt4660 - 1 == local303) {
					for (local101 = 0; local101 < Static339.anInt6735; local101++) {
						local110 = this.anInt4659 * Static212.anIntArray325[local101];
						local124 = this.method4174(local92, local83, local37 * local110 >> 12, local57, local44, local96);
						local124 = (local124 * local30 >> 12) + arg0[local101];
						arg0[local101] = (local124 >> 1) + 2048;
					}
				} else {
					for (local101 = 0; local101 < Static339.anInt6735; local101++) {
						local110 = this.anInt4659 * Static212.anIntArray325[local101];
						local124 = this.method4174(local92, local83, local110 * local37 >> 12, local57, local44, local96);
						arg0[local101] += local124 * local30 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII)I")
	private int method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(22) int local22 = local9 & 0xFF;
		@Pc(26) int local26 = arg2 & 0xFFF;
		if (local13 >= arg4) {
			local13 = 0;
		}
		@Pc(39) int local39 = arg3 - 4096;
		local13 &= 0xFF;
		@Pc(47) int local47 = local26 - 4096;
		@Pc(51) int local51 = Class100.anIntArray266[local26];
		@Pc(60) int local60 = this.aByteArray56[local22 + arg0] & 0x3;
		@Pc(77) int local77;
		if (local60 <= 1) {
			local77 = local60 == 0 ? local26 + arg3 : arg3 - local26;
		} else {
			local77 = local60 == 2 ? local26 - arg3 : -arg3 + -local26;
		}
		local60 = this.aByteArray56[local13 + arg0] & 0x3;
		@Pc(120) int local120;
		if (local60 > 1) {
			local120 = local60 == 2 ? local47 - arg3 : -arg3 + -local47;
		} else {
			local120 = local60 == 0 ? local47 + arg3 : arg3 - local47;
		}
		@Pc(147) int local147 = ((local120 - local77) * local51 >> 12) + local77;
		local60 = this.aByteArray56[local22 + arg1] & 0x3;
		if (local60 > 1) {
			local77 = local60 == 2 ? local26 - local39 : -local26 + -local39;
		} else {
			local77 = local60 == 0 ? local26 + local39 : -local26 + local39;
		}
		local60 = this.aByteArray56[arg1 + local13] & 0x3;
		if (local60 <= 1) {
			local120 = local60 == 0 ? local47 + local39 : local39 + -local47;
		} else {
			local120 = local60 == 2 ? local47 - local39 : -local47 - local39;
		}
		@Pc(243) int local243 = ((local120 - local77) * local51 >> 12) + local77;
		return (arg5 * (local243 - local147) >> 12) + local147;
	}
}
