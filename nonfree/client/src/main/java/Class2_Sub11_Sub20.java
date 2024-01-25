import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class2_Sub11_Sub20 extends Class2_Sub11 {

	@OriginalMember(owner = "client!pi", name = "O", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
	public int anInt7851 = 4;

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "Z")
	public boolean aBoolean687 = true;

	@OriginalMember(owner = "client!pi", name = "U", descriptor = "[B")
	private byte[] aByteArray100 = new byte[512];

	@OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
	public int anInt7860 = 4;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
	public int anInt7859 = 1638;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
	public int anInt7854 = 4;

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
	public int anInt7849 = 0;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[II)V")
	public void method7010(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = Static137.anIntArray170[arg0] * this.anInt7851;
		@Pc(113) int local113;
		@Pc(129) int local129;
		@Pc(43) int local43;
		@Pc(26) short local26;
		@Pc(104) int local104;
		@Pc(49) int local49;
		@Pc(63) int local63;
		@Pc(56) int local56;
		@Pc(102) int local102;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(89) int local89;
		@Pc(98) int local98;
		if (this.anInt7854 == 1) {
			local43 = this.aShortArray129[0] << 12;
			local26 = this.aShortArray128[0];
			local49 = local43 * local12 >> 12;
			local63 = this.anInt7860 * local43 >> 12;
			local56 = local43 * this.anInt7851 >> 12;
			local67 = local49 >> 12;
			local71 = local67 + 1;
			@Pc(405) int local405 = local49 & 0xFFF;
			if (local71 >= local56) {
				local71 = 0;
			}
			local89 = this.aByteArray100[local67 & 0xFF] & 0xFF;
			local102 = Class281.anIntArray541[local405];
			local98 = this.aByteArray100[local71 & 0xFF] & 0xFF;
			if (this.aBoolean687) {
				for (local104 = 0; local104 < Static301.anInt10214; local104++) {
					local113 = this.anInt7860 * Static523.anIntArray461[local104];
					local129 = this.method7013(local43 * local113 >> 12, local98, local63, local102, local405, local89);
					local129 = local129 * local26 >> 12;
					arg1[local104] = (local129 >> 1) + 2048;
				}
			} else {
				for (local104 = 0; local104 < Static301.anInt10214; local104++) {
					local113 = Static523.anIntArray461[local104] * this.anInt7860;
					local129 = this.method7013(local113 * local43 >> 12, local98, local63, local102, local405, local89);
					arg1[local104] = local129 * local26 >> 12;
				}
			}
			return;
		}
		local26 = this.aShortArray128[0];
		if (local26 > 8 || local26 < -8) {
			local43 = this.aShortArray129[0] << 12;
			local49 = local12 * local43 >> 12;
			local56 = local43 * this.anInt7851 >> 12;
			local63 = local43 * this.anInt7860 >> 12;
			local67 = local49 >> 12;
			local71 = local67 + 1;
			if (local56 <= local71) {
				local71 = 0;
			}
			local49 &= 0xFFF;
			local89 = this.aByteArray100[local67 & 0xFF] & 0xFF;
			local98 = this.aByteArray100[local71 & 0xFF] & 0xFF;
			local102 = Class281.anIntArray541[local49];
			for (local104 = 0; local104 < Static301.anInt10214; local104++) {
				local113 = Static523.anIntArray461[local104] * this.anInt7860;
				local129 = this.method7013(local43 * local113 >> 12, local98, local63, local102, local49, local89);
				arg1[local104] = local129 * local26 >> 12;
			}
		}
		for (@Pc(147) int local147 = 1; local147 < this.anInt7854; local147++) {
			local26 = this.aShortArray128[local147];
			if (local26 > 8 || local26 < -8) {
				local43 = this.aShortArray129[local147] << 12;
				local63 = local43 * this.anInt7860 >> 12;
				local56 = this.anInt7851 * local43 >> 12;
				local49 = local12 * local43 >> 12;
				local67 = local49 >> 12;
				local71 = local67 + 1;
				local49 &= 0xFFF;
				if (local71 >= local56) {
					local71 = 0;
				}
				local102 = Class281.anIntArray541[local49];
				local89 = this.aByteArray100[local67 & 0xFF] & 0xFF;
				local98 = this.aByteArray100[local71 & 0xFF] & 0xFF;
				if (this.aBoolean687 && this.anInt7854 - 1 == local147) {
					for (local104 = 0; local104 < Static301.anInt10214; local104++) {
						local113 = Static523.anIntArray461[local104] * this.anInt7860;
						local129 = this.method7013(local43 * local113 >> 12, local98, local63, local102, local49, local89);
						local129 = (local129 * local26 >> 12) + arg1[local104];
						arg1[local104] = (local129 >> 1) + 2048;
					}
				} else {
					for (local104 = 0; local104 < Static301.anInt10214; local104++) {
						local113 = Static523.anIntArray461[local104] * this.anInt7860;
						local129 = this.method7013(local43 * local113 >> 12, local98, local63, local102, local49, local89);
						arg1[local104] += local26 * local129 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.aBoolean687 = arg1.method8581(-17416) == 1;
		} else if (arg0 == 1) {
			this.anInt7854 = arg1.method8581(-17416);
		} else if (arg0 == 2) {
			this.anInt7859 = arg1.method8598();
			if (this.anInt7859 < 0) {
				this.aShortArray128 = new short[this.anInt7854];
				for (@Pc(85) int local85 = 0; local85 < this.anInt7854; local85++) {
					this.aShortArray128[local85] = (short) arg1.method8598();
				}
			}
		} else if (arg0 == 3) {
			this.anInt7860 = this.anInt7851 = arg1.method8581(-17416);
		} else if (arg0 == 4) {
			this.anInt7849 = arg1.method8581(-17416);
		} else if (arg0 == 5) {
			this.anInt7860 = arg1.method8581(-17416);
		} else if (arg0 == 6) {
			this.anInt7851 = arg1.method8581(-17416);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)I")
	private int method7013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg0 >> 12;
		@Pc(19) int local19 = local15 + 1;
		@Pc(23) int local23 = arg0 & 0xFFF;
		@Pc(27) int local27 = local15 & 0xFF;
		if (local19 >= arg2) {
			local19 = 0;
		}
		@Pc(36) int local36 = arg4 - 4096;
		@Pc(40) int local40 = local23 - 4096;
		local19 &= 0xFF;
		@Pc(53) int local53 = this.aByteArray100[arg5 + local27] & 0x3;
		@Pc(57) int local57 = Class281.anIntArray541[local23];
		@Pc(77) int local77;
		if (local53 > 1) {
			local77 = local53 == 2 ? local23 - arg4 : -arg4 + -local23;
		} else {
			local77 = local53 == 0 ? local23 + arg4 : arg4 + -local23;
		}
		local53 = this.aByteArray100[arg5 + local19] & 0x3;
		@Pc(125) int local125;
		if (local53 <= 1) {
			local125 = local53 == 0 ? arg4 + local40 : -local40 + arg4;
		} else {
			local125 = local53 == 2 ? local40 - arg4 : -arg4 + -local40;
		}
		@Pc(156) int local156 = (local57 * (local125 - local77) >> 12) + local77;
		local53 = this.aByteArray100[local27 + arg1] & 0x3;
		if (local53 <= 1) {
			local77 = local53 == 0 ? local23 + local36 : local36 - local23;
		} else {
			local77 = local53 == 2 ? local23 - local36 : -local36 + -local23;
		}
		local53 = this.aByteArray100[local19 + arg1] & 0x3;
		if (local53 <= 1) {
			local125 = local53 == 0 ? local36 + local40 : -local40 + local36;
		} else {
			local125 = local53 == 2 ? local40 - local36 : -local40 - local36;
		}
		@Pc(261) int local261 = local77 + (local57 * (local125 - local77) >> 12);
		return local156 + ((local261 - local156) * arg3 >> 12);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			this.method7010(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		this.aByteArray100 = Static245.method3449(this.anInt7849);
		this.method7015();
		for (@Pc(19) int local19 = this.anInt7854 - 1; local19 >= 1; local19--) {
			@Pc(28) short local28 = this.aShortArray128[local19];
			if (local28 > 8 || local28 < -8) {
				break;
			}
			this.anInt7854--;
		}
		if (-89 != -89) {
			Static488.method7011((byte) 3);
		}
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
	private void method7015() {
		@Pc(31) int local31;
		if (this.anInt7859 > 0) {
			this.aShortArray128 = new short[this.anInt7854];
			this.aShortArray129 = new short[this.anInt7854];
			for (local31 = 0; local31 < this.anInt7854; local31++) {
				this.aShortArray128[local31] = (short) (int) (Math.pow((double) ((float) this.anInt7859 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray129[local31] = (short) (int) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray128 != null && this.aShortArray128.length == this.anInt7854) {
			this.aShortArray129 = new short[this.anInt7854];
			for (local31 = 0; local31 < this.anInt7854; local31++) {
				this.aShortArray129[local31] = (short) (int) Math.pow(2.0D, (double) local31);
			}
		}
	}
}
