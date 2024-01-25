import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class2_Sub4_Sub26 extends Class2_Sub4 {

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!qq", name = "M", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
	public int anInt7126 = 0;

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
	public int anInt7130 = 1638;

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "[B")
	private byte[] aByteArray68 = new byte[512];

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
	public int anInt7134 = 4;

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
	public int anInt7135 = 4;

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
	public int anInt7133 = 4;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "Z")
	public boolean aBoolean586 = true;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean586 = arg1.method4464() == 1;
		} else if (arg0 == 1) {
			this.anInt7134 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt7130 = arg1.method4478();
			if (this.anInt7130 < 0) {
				this.aShortArray106 = new short[this.anInt7134];
				for (@Pc(73) int local73 = 0; local73 < this.anInt7134; local73++) {
					this.aShortArray106[local73] = (short) arg1.method4478();
				}
			}
		} else if (arg0 == 3) {
			this.anInt7135 = this.anInt7133 = arg1.method4464();
		} else if (arg0 == 4) {
			this.anInt7126 = arg1.method4464();
		} else if (arg0 == 5) {
			this.anInt7135 = arg1.method4464();
		} else if (arg0 == 6) {
			this.anInt7133 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIIIIII)I")
	private int method5822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg0 >> 12;
		@Pc(18) int local18 = local14 + 1;
		@Pc(22) int local22 = arg0 & 0xFFF;
		@Pc(26) int local26 = local14 & 0xFF;
		if (local18 >= arg5) {
			local18 = 0;
		}
		@Pc(35) int local35 = arg2 - 4096;
		@Pc(39) int local39 = local22 - 4096;
		local18 &= 0xFF;
		@Pc(47) int local47 = Class141.anIntArray243[local22];
		@Pc(56) int local56 = this.aByteArray68[arg1 + local26] & 0x3;
		@Pc(71) int local71;
		if (local56 <= 1) {
			local71 = local56 == 0 ? arg2 + local22 : arg2 - local22;
		} else {
			local71 = local56 == 2 ? local22 - arg2 : -local22 - arg2;
		}
		local56 = this.aByteArray68[local18 + arg1] & 0x3;
		@Pc(114) int local114;
		if (local56 > 1) {
			local114 = local56 == 2 ? local39 - arg2 : -arg2 + -local39;
		} else {
			local114 = local56 == 0 ? local39 + arg2 : arg2 - local39;
		}
		@Pc(140) int local140 = ((local114 - local71) * local47 >> 12) + local71;
		local56 = this.aByteArray68[arg3 + local26] & 0x3;
		if (local56 <= 1) {
			local71 = local56 == 0 ? local35 + local22 : local35 + -local22;
		} else {
			local71 = local56 == 2 ? local22 - local35 : -local22 + -local35;
		}
		local56 = this.aByteArray68[arg3 + local18] & 0x3;
		if (local56 <= 1) {
			local114 = local56 == 0 ? local39 + local35 : local35 + -local39;
		} else {
			local114 = local56 == 2 ? local39 - local35 : -local39 - local35;
		}
		@Pc(240) int local240 = local71 + ((local114 - local71) * local47 >> 12);
		return local140 + ((local240 - local140) * arg4 >> 12);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[II)V")
	public void method5823(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = Static13.anIntArray418[arg0] * this.anInt7133;
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(48) int local48;
		@Pc(31) short local31;
		@Pc(113) int local113;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(111) int local111;
		@Pc(72) int local72;
		@Pc(76) int local76;
		@Pc(107) int local107;
		@Pc(98) int local98;
		if (this.anInt7134 == 1) {
			local48 = this.aShortArray107[0] << 12;
			local31 = this.aShortArray106[0];
			local68 = this.anInt7133 * local48 >> 12;
			local54 = local12 * local48 >> 12;
			local61 = local48 * this.anInt7135 >> 12;
			local72 = local54 >> 12;
			local76 = local72 + 1;
			@Pc(395) int local395 = local54 & 0xFFF;
			if (local76 >= local68) {
				local76 = 0;
			}
			local107 = this.aByteArray68[local72 & 0xFF] & 0xFF;
			local98 = this.aByteArray68[local76 & 0xFF] & 0xFF;
			local111 = Class141.anIntArray243[local395];
			if (this.aBoolean586) {
				for (local113 = 0; local113 < Static143.anInt7434; local113++) {
					local122 = Static519.anIntArray155[local113] * this.anInt7135;
					local136 = this.method5822(local48 * local122 >> 12, local107, local395, local98, local111, local61);
					@Pc(498) int local498 = local136 * local31 >> 12;
					arg1[local113] = (local498 >> 1) + 2048;
				}
			} else {
				for (local113 = 0; local113 < Static143.anInt7434; local113++) {
					local122 = this.anInt7135 * Static519.anIntArray155[local113];
					local136 = this.method5822(local122 * local48 >> 12, local107, local395, local98, local111, local61);
					arg1[local113] = local136 * local31 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray106[0];
		if (local31 > 8 || local31 < -8) {
			local48 = this.aShortArray107[0] << 12;
			local54 = local48 * local12 >> 12;
			local61 = local48 * this.anInt7135 >> 12;
			local68 = local48 * this.anInt7133 >> 12;
			local72 = local54 >> 12;
			local76 = local72 + 1;
			if (local76 >= local68) {
				local76 = 0;
			}
			local54 &= 0xFFF;
			local98 = this.aByteArray68[local76 & 0xFF] & 0xFF;
			local107 = this.aByteArray68[local72 & 0xFF] & 0xFF;
			local111 = Class141.anIntArray243[local54];
			for (local113 = 0; local113 < Static143.anInt7434; local113++) {
				local122 = Static519.anIntArray155[local113] * this.anInt7135;
				local136 = this.method5822(local48 * local122 >> 12, local107, local54, local98, local111, local61);
				arg1[local113] = local31 * local136 >> 12;
			}
		}
		for (@Pc(154) int local154 = 1; local154 < this.anInt7134; local154++) {
			local31 = this.aShortArray106[local154];
			if (local31 > 8 || local31 < -8) {
				local48 = this.aShortArray107[local154] << 12;
				local61 = local48 * this.anInt7135 >> 12;
				local68 = local48 * this.anInt7133 >> 12;
				local54 = local12 * local48 >> 12;
				local72 = local54 >> 12;
				local76 = local72 + 1;
				if (local68 <= local76) {
					local76 = 0;
				}
				local54 &= 0xFFF;
				local111 = Class141.anIntArray243[local54];
				local107 = this.aByteArray68[local72 & 0xFF] & 0xFF;
				local98 = this.aByteArray68[local76 & 0xFF] & 0xFF;
				if (this.aBoolean586 && this.anInt7134 - 1 == local154) {
					for (local113 = 0; local113 < Static143.anInt7434; local113++) {
						local122 = this.anInt7135 * Static519.anIntArray155[local113];
						local136 = this.method5822(local48 * local122 >> 12, local107, local54, local98, local111, local61);
						local136 = arg1[local113] + (local136 * local31 >> 12);
						arg1[local113] = (local136 >> 1) + 2048;
					}
				} else {
					for (local113 = 0; local113 < Static143.anInt7434; local113++) {
						local122 = Static519.anIntArray155[local113] * this.anInt7135;
						local136 = this.method5822(local48 * local122 >> 12, local107, local54, local98, local111, local61);
						arg1[local113] += local31 * local136 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			this.method5823(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		this.aByteArray68 = Static244.method3479(this.anInt7126);
		this.method5824();
		for (@Pc(21) int local21 = this.anInt7134 - 1; local21 >= 1; local21--) {
			@Pc(28) short local28 = this.aShortArray106[local21];
			if (local28 > 8 || local28 < -8) {
				break;
			}
			this.anInt7134--;
		}
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
	private void method5824() {
		@Pc(24) int local24;
		if (this.anInt7130 > 0) {
			this.aShortArray106 = new short[this.anInt7134];
			this.aShortArray107 = new short[this.anInt7134];
			for (local24 = 0; local24 < this.anInt7134; local24++) {
				this.aShortArray106[local24] = (short) (Math.pow((double) ((float) this.anInt7130 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray107[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray106 != null && this.anInt7134 == this.aShortArray106.length) {
			this.aShortArray107 = new short[this.anInt7134];
			for (local24 = 0; local24 < this.anInt7134; local24++) {
				this.aShortArray107[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		}
	}
}
