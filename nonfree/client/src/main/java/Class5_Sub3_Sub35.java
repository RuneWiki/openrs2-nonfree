import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class5_Sub3_Sub35 extends Class5_Sub3 {

	@OriginalMember(owner = "client!un", name = "ab", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!un", name = "cb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!un", name = "R", descriptor = "I")
	public int anInt6328 = 4;

	@OriginalMember(owner = "client!un", name = "P", descriptor = "[B")
	private byte[] aByteArray92 = new byte[512];

	@OriginalMember(owner = "client!un", name = "W", descriptor = "I")
	public int anInt6332 = 4;

	@OriginalMember(owner = "client!un", name = "X", descriptor = "I")
	public int anInt6333 = 0;

	@OriginalMember(owner = "client!un", name = "V", descriptor = "Z")
	public boolean aBoolean528 = true;

	@OriginalMember(owner = "client!un", name = "db", descriptor = "I")
	public int anInt6337 = 1638;

	@OriginalMember(owner = "client!un", name = "U", descriptor = "I")
	public int anInt6331 = 4;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean528 = arg0.method5115() == 1;
		} else if (arg1 == 1) {
			this.anInt6332 = arg0.method5115();
		} else if (arg1 == 2) {
			this.anInt6337 = arg0.method5066();
			if (this.anInt6337 < 0) {
				this.aShortArray111 = new short[this.anInt6332];
				for (@Pc(75) int local75 = 0; local75 < this.anInt6332; local75++) {
					this.aShortArray111[local75] = (short) arg0.method5066();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt6328 = this.anInt6331 = arg0.method5115();
			return;
		} else if (arg1 == 4) {
			this.anInt6333 = arg0.method5115();
			return;
		} else if (arg1 == 5) {
			this.anInt6328 = arg0.method5115();
			return;
		} else if (arg1 == 6) {
			this.anInt6331 = arg0.method5115();
			return;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIII)I")
	private int method5655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg4) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg1 & 0xFFF;
		local9 &= 0xFF;
		local13 &= 0xFF;
		@Pc(38) int local38 = arg3 - 4096;
		@Pc(42) int local42 = local26 - 4096;
		@Pc(46) int local46 = Class39.anIntArray86[local26];
		@Pc(56) int local56 = this.aByteArray92[local9 + arg5] & 0x3;
		@Pc(70) int local70;
		if (local56 <= 1) {
			local70 = local56 == 0 ? arg3 + local26 : arg3 + -local26;
		} else {
			local70 = local56 == 2 ? local26 - arg3 : -local26 - arg3;
		}
		local56 = this.aByteArray92[local13 + arg5] & 0x3;
		@Pc(122) int local122;
		if (local56 > 1) {
			local122 = local56 == 2 ? local42 - arg3 : -arg3 + -local42;
		} else {
			local122 = local56 == 0 ? local42 + arg3 : arg3 - local42;
		}
		local56 = this.aByteArray92[local9 + arg2] & 0x3;
		@Pc(155) int local155 = (local46 * (local122 - local70) >> 12) + local70;
		if (local56 > 1) {
			local70 = local56 == 2 ? local26 - local38 : -local26 - local38;
		} else {
			local70 = local56 == 0 ? local26 + local38 : local38 - local26;
		}
		local56 = this.aByteArray92[local13 + arg2] & 0x3;
		if (local56 <= 1) {
			local122 = local56 == 0 ? local42 + local38 : -local42 + local38;
		} else {
			local122 = local56 == 2 ? local42 - local38 : -local42 - local38;
		}
		@Pc(242) int local242 = local70 + ((local122 - local70) * local46 >> 12);
		return local155 + (arg0 * (local242 - local155) >> 12);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		this.aByteArray92 = Static322.method549(this.anInt6333);
		this.method5656();
		for (@Pc(21) int local21 = this.anInt6332 - 1; local21 >= 1; local21--) {
			@Pc(28) short local28 = this.aShortArray111[local21];
			if (local28 > 8 || local28 < -8) {
				return;
			}
			this.anInt6332--;
		}
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V")
	private void method5656() {
		@Pc(23) int local23;
		if (this.anInt6337 > 0) {
			this.aShortArray110 = new short[this.anInt6332];
			this.aShortArray111 = new short[this.anInt6332];
			for (local23 = 0; local23 < this.anInt6332; local23++) {
				this.aShortArray111[local23] = (short) (Math.pow((double) ((float) this.anInt6337 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray110[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray111 != null && this.anInt6332 == this.aShortArray111.length) {
			this.aShortArray110 = new short[this.anInt6332];
			for (local23 = 0; local23 < this.anInt6332; local23++) {
				this.aShortArray110[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([III)V")
	public void method5658(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = Static345.anIntArray627[arg1] * this.anInt6331;
		@Pc(113) int local113;
		@Pc(129) int local129;
		@Pc(31) int local31;
		@Pc(36) short local36;
		@Pc(104) int local104;
		@Pc(42) int local42;
		@Pc(56) int local56;
		@Pc(49) int local49;
		@Pc(99) int local99;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(95) int local95;
		@Pc(86) int local86;
		if (this.anInt6332 == 1) {
			local31 = this.aShortArray110[0] << 12;
			local36 = this.aShortArray111[0];
			local42 = local31 * local18 >> 12;
			local49 = local31 * this.anInt6331 >> 12;
			local56 = local31 * this.anInt6328 >> 12;
			local60 = local42 >> 12;
			local64 = local60 + 1;
			local42 &= 0xFFF;
			if (local64 >= local49) {
				local64 = 0;
			}
			local86 = this.aByteArray92[local64 & 0xFF] & 0xFF;
			local95 = this.aByteArray92[local60 & 0xFF] & 0xFF;
			local99 = Class39.anIntArray86[local42];
			if (this.aBoolean528) {
				for (local104 = 0; local104 < Static7.anInt129; local104++) {
					local113 = Static164.anIntArray337[local104] * this.anInt6328;
					local129 = this.method5655(local99, local31 * local113 >> 12, local86, local42, local56, local95);
					local129 = local129 * local36 >> 12;
					arg0[local104] = (local129 >> 1) + 2048;
				}
			} else {
				for (local104 = 0; local104 < Static7.anInt129; local104++) {
					local113 = Static164.anIntArray337[local104] * this.anInt6328;
					local129 = this.method5655(local99, local113 * local31 >> 12, local86, local42, local56, local95);
					arg0[local104] = local36 * local129 >> 12;
				}
			}
			return;
		}
		local36 = this.aShortArray111[0];
		if (local36 > 8 || local36 < -8) {
			local31 = this.aShortArray110[0] << 12;
			local56 = this.anInt6328 * local31 >> 12;
			local49 = this.anInt6331 * local31 >> 12;
			local42 = local31 * local18 >> 12;
			local60 = local42 >> 12;
			local64 = local60 + 1;
			@Pc(242) int local242 = local42 & 0xFFF;
			if (local49 <= local64) {
				local64 = 0;
			}
			local86 = this.aByteArray92[local64 & 0xFF] & 0xFF;
			local95 = this.aByteArray92[local60 & 0xFF] & 0xFF;
			local99 = Class39.anIntArray86[local242];
			for (local104 = 0; local104 < Static7.anInt129; local104++) {
				local113 = Static164.anIntArray337[local104] * this.anInt6328;
				local129 = this.method5655(local99, local31 * local113 >> 12, local86, local242, local56, local95);
				arg0[local104] = local36 * local129 >> 12;
			}
		}
		for (@Pc(308) int local308 = 1; local308 < this.anInt6332; local308++) {
			local36 = this.aShortArray111[local308];
			if (local36 > 8 || local36 < -8) {
				local31 = this.aShortArray110[local308] << 12;
				local42 = local18 * local31 >> 12;
				local56 = local31 * this.anInt6328 >> 12;
				local49 = local31 * this.anInt6331 >> 12;
				local60 = local42 >> 12;
				local64 = local60 + 1;
				local42 &= 0xFFF;
				if (local49 <= local64) {
					local64 = 0;
				}
				local95 = this.aByteArray92[local60 & 0xFF] & 0xFF;
				local99 = Class39.anIntArray86[local42];
				local86 = this.aByteArray92[local64 & 0xFF] & 0xFF;
				if (this.aBoolean528 && local308 == this.anInt6332 - 1) {
					for (local104 = 0; local104 < Static7.anInt129; local104++) {
						local113 = Static164.anIntArray337[local104] * this.anInt6328;
						local129 = this.method5655(local99, local113 * local31 >> 12, local86, local42, local56, local95);
						local129 = (local129 * local36 >> 12) + arg0[local104];
						arg0[local104] = (local129 >> 1) + 2048;
					}
				} else {
					for (local104 = 0; local104 < Static7.anInt129; local104++) {
						local113 = Static164.anIntArray337[local104] * this.anInt6328;
						local129 = this.method5655(local99, local113 * local31 >> 12, local86, local42, local56, local95);
						arg0[local104] += local129 * local36 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			this.method5658(local9, arg0);
		}
		return local9;
	}
}
