import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class2_Sub6_Sub39 extends Class2_Sub6 {

	@OriginalMember(owner = "client!vt", name = "K", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!vt", name = "T", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!vt", name = "P", descriptor = "Z")
	public boolean aBoolean492 = true;

	@OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
	public int anInt6593 = 4;

	@OriginalMember(owner = "client!vt", name = "S", descriptor = "I")
	public int anInt6599 = 1638;

	@OriginalMember(owner = "client!vt", name = "V", descriptor = "[B")
	private byte[] aByteArray100 = new byte[512];

	@OriginalMember(owner = "client!vt", name = "U", descriptor = "I")
	public int anInt6600 = 0;

	@OriginalMember(owner = "client!vt", name = "O", descriptor = "I")
	public int anInt6596 = 4;

	@OriginalMember(owner = "client!vt", name = "Y", descriptor = "I")
	public int anInt6602 = 4;

	static {
		new Class144("", 73);
		new Class221("clan_chat", "clanchat", "conversation_clan", "clan_chat");
		new Class221("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		this.aByteArray100 = Static343.method5242(this.anInt6600);
		this.method5651();
		for (@Pc(24) int local24 = this.anInt6602 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray116[local24];
			if (local31 > 8) {
				return;
			}
			if (local31 < -8) {
				return;
			}
			this.anInt6602--;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			this.method5645(arg0, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II[I)V")
	public void method5645(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt6596 * Static138.anIntArray291[arg0];
		@Pc(115) int local115;
		@Pc(129) int local129;
		@Pc(41) int local41;
		@Pc(28) short local28;
		@Pc(106) int local106;
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(104) int local104;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (this.anInt6602 == 1) {
			local28 = this.aShortArray116[0];
			local41 = this.aShortArray117[0] << 12;
			local54 = local41 * this.anInt6593 >> 12;
			local61 = this.anInt6596 * local41 >> 12;
			local47 = local41 * local12 >> 12;
			local65 = local47 >> 12;
			local69 = local65 + 1;
			if (local61 <= local69) {
				local69 = 0;
			}
			local47 &= 0xFFF;
			local100 = this.aByteArray100[local69 & 0xFF] & 0xFF;
			local104 = Class2_Sub29.anIntArray556[local47];
			local91 = this.aByteArray100[local65 & 0xFF] & 0xFF;
			if (this.aBoolean492) {
				for (local106 = 0; local106 < Static151.anInt2711; local106++) {
					local115 = Static160.anIntArray329[local106] * this.anInt6593;
					local129 = this.method5646(local47, local104, local91, local115 * local41 >> 12, local100, local54);
					local129 = local129 * local28 >> 12;
					arg1[local106] = (local129 >> 1) + 2048;
				}
			} else {
				for (local106 = 0; local106 < Static151.anInt2711; local106++) {
					local115 = Static160.anIntArray329[local106] * this.anInt6593;
					local129 = this.method5646(local47, local104, local91, local115 * local41 >> 12, local100, local54);
					arg1[local106] = local28 * local129 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray116[0];
		if (local28 > 8 || local28 < -8) {
			local41 = this.aShortArray117[0] << 12;
			local47 = local12 * local41 >> 12;
			local54 = local41 * this.anInt6593 >> 12;
			local61 = local41 * this.anInt6596 >> 12;
			local65 = local47 >> 12;
			local69 = local65 + 1;
			local47 &= 0xFFF;
			if (local69 >= local61) {
				local69 = 0;
			}
			local91 = this.aByteArray100[local65 & 0xFF] & 0xFF;
			local100 = this.aByteArray100[local69 & 0xFF] & 0xFF;
			local104 = Class2_Sub29.anIntArray556[local47];
			for (local106 = 0; local106 < Static151.anInt2711; local106++) {
				local115 = this.anInt6593 * Static160.anIntArray329[local106];
				local129 = this.method5646(local47, local104, local91, local41 * local115 >> 12, local100, local54);
				arg1[local106] = local129 * local28 >> 12;
			}
		}
		for (@Pc(143) int local143 = 1; local143 < this.anInt6602; local143++) {
			local28 = this.aShortArray116[local143];
			if (local28 > 8 || local28 < -8) {
				local41 = this.aShortArray117[local143] << 12;
				local47 = local41 * local12 >> 12;
				local61 = this.anInt6596 * local41 >> 12;
				local54 = local41 * this.anInt6593 >> 12;
				local65 = local47 >> 12;
				local69 = local65 + 1;
				local47 &= 0xFFF;
				if (local69 >= local61) {
					local69 = 0;
				}
				local100 = this.aByteArray100[local69 & 0xFF] & 0xFF;
				local104 = Class2_Sub29.anIntArray556[local47];
				local91 = this.aByteArray100[local65 & 0xFF] & 0xFF;
				if (this.aBoolean492 && local143 == this.anInt6602 - 1) {
					for (local106 = 0; local106 < Static151.anInt2711; local106++) {
						local115 = this.anInt6593 * Static160.anIntArray329[local106];
						local129 = this.method5646(local47, local104, local91, local41 * local115 >> 12, local100, local54);
						local129 = arg1[local106] + (local28 * local129 >> 12);
						arg1[local106] = (local129 >> 1) + 2048;
					}
				} else {
					for (local106 = 0; local106 < Static151.anInt2711; local106++) {
						local115 = Static160.anIntArray329[local106] * this.anInt6593;
						local129 = this.method5646(local47, local104, local91, local41 * local115 >> 12, local100, local54);
						arg1[local106] += local129 * local28 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IBIIIII)I")
	private int method5646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg5 <= local13) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg3 & 0xFFF;
		local9 &= 0xFF;
		local13 &= 0xFF;
		@Pc(38) int local38 = local26 - 4096;
		@Pc(42) int local42 = arg0 - 4096;
		@Pc(51) int local51 = this.aByteArray100[arg2 + local9] & 0x3;
		@Pc(55) int local55 = Class2_Sub29.anIntArray556[local26];
		@Pc(69) int local69;
		if (local51 <= 1) {
			local69 = local51 == 0 ? arg0 + local26 : -local26 + arg0;
		} else {
			local69 = local51 == 2 ? local26 - arg0 : -local26 - arg0;
		}
		local51 = this.aByteArray100[arg2 + local13] & 0x3;
		@Pc(109) int local109;
		if (local51 <= 1) {
			local109 = local51 == 0 ? arg0 + local38 : -local38 + arg0;
		} else {
			local109 = local51 == 2 ? local38 - arg0 : -local38 - arg0;
		}
		@Pc(143) int local143 = (local55 * (local109 - local69) >> 12) + local69;
		local51 = this.aByteArray100[local9 + arg4] & 0x3;
		if (local51 > 1) {
			local69 = local51 == 2 ? local26 - local42 : -local42 + -local26;
		} else {
			local69 = local51 == 0 ? local26 + local42 : local42 + -local26;
		}
		local51 = this.aByteArray100[arg4 + local13] & 0x3;
		if (local51 > 1) {
			local109 = local51 == 2 ? local38 - local42 : -local38 - local42;
		} else {
			local109 = local51 == 0 ? local42 + local38 : local42 + -local38;
		}
		@Pc(245) int local245 = (local55 * (local109 - local69) >> 12) + local69;
		return ((local245 - local143) * arg1 >> 12) + local143;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean492 = arg0.method4240() == 1;
		} else if (arg1 == 1) {
			this.anInt6602 = arg0.method4240();
		} else if (arg1 == 2) {
			this.anInt6599 = arg0.method4251();
			if (this.anInt6599 < 0) {
				this.aShortArray116 = new short[this.anInt6602];
				for (@Pc(68) int local68 = 0; local68 < this.anInt6602; local68++) {
					this.aShortArray116[local68] = (short) arg0.method4251();
				}
			}
		} else if (arg1 == 3) {
			this.anInt6593 = this.anInt6596 = arg0.method4240();
		} else if (arg1 == 4) {
			this.anInt6600 = arg0.method4240();
		} else if (arg1 == 5) {
			this.anInt6593 = arg0.method4240();
		} else if (arg1 == 6) {
			this.anInt6596 = arg0.method4240();
		}
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)V")
	private void method5651() {
		@Pc(29) int local29;
		if (this.anInt6599 > 0) {
			this.aShortArray116 = new short[this.anInt6602];
			this.aShortArray117 = new short[this.anInt6602];
			for (local29 = 0; local29 < this.anInt6602; local29++) {
				this.aShortArray116[local29] = (short) (Math.pow((double) ((float) this.anInt6599 / 4096.0F), (double) local29) * 4096.0D);
				this.aShortArray117[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		} else if (this.aShortArray116 != null && this.aShortArray116.length == this.anInt6602) {
			this.aShortArray117 = new short[this.anInt6602];
			for (local29 = 0; local29 < this.anInt6602; local29++) {
				this.aShortArray117[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		}
	}
}
