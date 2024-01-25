import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class5_Sub1_Sub20 extends Class5_Sub1 {

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
	public int anInt3278 = 4;

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "[B")
	private byte[] aByteArray41 = new byte[512];

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
	public int anInt3283 = 4;

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "Z")
	public boolean aBoolean210 = true;

	@OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
	public int anInt3288 = 4;

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
	public int anInt3287 = 0;

	@OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
	public int anInt3289 = 1638;

	static {
		new Class198("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
	private void method2643() {
		@Pc(32) int local32;
		if (this.anInt3289 > 0) {
			this.aShortArray40 = new short[this.anInt3288];
			this.aShortArray39 = new short[this.anInt3288];
			for (local32 = 0; local32 < this.anInt3288; local32++) {
				this.aShortArray40[local32] = (short) (Math.pow((double) ((float) this.anInt3289 / 4096.0F), (double) local32) * 4096.0D);
				this.aShortArray39[local32] = (short) Math.pow(2.0D, (double) local32);
			}
		} else if (this.aShortArray40 != null && this.anInt3288 == this.aShortArray40.length) {
			this.aShortArray39 = new short[this.anInt3288];
			for (local32 = 0; local32 < this.anInt3288; local32++) {
				this.aShortArray39[local32] = (short) Math.pow(2.0D, (double) local32);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		this.aByteArray41 = Static215.method2846(this.anInt3287);
		this.method2643();
		for (@Pc(21) int local21 = this.anInt3288 - 1; local21 >= 1; local21--) {
			@Pc(33) short local33 = this.aShortArray40[local21];
			if (local33 > 8) {
				return;
			}
			if (local33 < -8) {
				return;
			}
			this.anInt3288--;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.aBoolean210 = arg1.method5539() == 1;
		} else if (arg0 == 1) {
			this.anInt3288 = arg1.method5539();
		} else if (arg0 == 2) {
			this.anInt3289 = arg1.method5586();
			if (this.anInt3289 < 0) {
				this.aShortArray40 = new short[this.anInt3288];
				for (@Pc(65) int local65 = 0; local65 < this.anInt3288; local65++) {
					this.aShortArray40[local65] = (short) arg1.method5586();
				}
			}
		} else if (arg0 == 3) {
			this.anInt3278 = this.anInt3283 = arg1.method5539();
		} else if (arg0 == 4) {
			this.anInt3287 = arg1.method5539();
		} else if (arg0 == 5) {
			this.anInt3278 = arg1.method5539();
		} else if (arg0 == 6) {
			this.anInt3283 = arg1.method5539();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			this.method2647(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZIIIII)I")
	private int method2645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg4 <= local13) {
			local13 = 0;
		}
		@Pc(32) int local32 = arg0 & 0xFFF;
		local9 &= 0xFF;
		@Pc(40) int local40 = arg2 - 4096;
		local13 &= 0xFF;
		@Pc(48) int local48 = local32 - 4096;
		@Pc(58) int local58 = this.aByteArray41[local9 + arg1] & 0x3;
		@Pc(62) int local62 = Class2_Sub4.anIntArray452[local32];
		@Pc(83) int local83;
		if (local58 > 1) {
			local83 = local58 == 2 ? local32 - arg2 : -arg2 + -local32;
		} else {
			local83 = local58 == 0 ? arg2 + local32 : arg2 + -local32;
		}
		local58 = this.aByteArray41[arg1 + local13] & 0x3;
		@Pc(129) int local129;
		if (local58 > 1) {
			local129 = local58 == 2 ? local48 - arg2 : -local48 + -arg2;
		} else {
			local129 = local58 == 0 ? arg2 + local48 : arg2 - local48;
		}
		local58 = this.aByteArray41[local9 + arg5] & 0x3;
		@Pc(165) int local165 = local83 + (local62 * (local129 - local83) >> 12);
		if (local58 > 1) {
			local83 = local58 == 2 ? local32 - local40 : -local40 + -local32;
		} else {
			local83 = local58 == 0 ? local40 + local32 : -local32 + local40;
		}
		local58 = this.aByteArray41[local13 + arg5] & 0x3;
		if (local58 <= 1) {
			local129 = local58 == 0 ? local48 + local40 : -local48 + local40;
		} else {
			local129 = local58 == 2 ? local48 - local40 : -local40 + -local48;
		}
		@Pc(253) int local253 = local83 + (local62 * (local129 - local83) >> 12);
		return (arg3 * (local253 - local165) >> 12) + local165;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIB)V")
	public void method2647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = Static346.anIntArray401[arg1] * this.anInt3283;
		@Pc(112) int local112;
		@Pc(126) int local126;
		@Pc(42) int local42;
		@Pc(27) short local27;
		@Pc(103) int local103;
		@Pc(62) int local62;
		@Pc(56) int local56;
		@Pc(49) int local49;
		@Pc(101) int local101;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(97) int local97;
		@Pc(88) int local88;
		if (this.anInt3288 == 1) {
			local27 = this.aShortArray40[0];
			local42 = this.aShortArray39[0] << 12;
			local49 = local42 * this.anInt3283 >> 12;
			local56 = local42 * this.anInt3278 >> 12;
			local62 = local12 * local42 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			if (local70 >= local49) {
				local70 = 0;
			}
			local62 &= 0xFFF;
			local101 = Class2_Sub4.anIntArray452[local62];
			local97 = this.aByteArray41[local66 & 0xFF] & 0xFF;
			local88 = this.aByteArray41[local70 & 0xFF] & 0xFF;
			if (this.aBoolean210) {
				for (local103 = 0; local103 < Static148.anInt2666; local103++) {
					local112 = Static224.anIntArray234[local103] * this.anInt3278;
					local126 = this.method2645(local42 * local112 >> 12, local97, local62, local101, local56, local88);
					local126 = local126 * local27 >> 12;
					arg0[local103] = (local126 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static148.anInt2666; local103++) {
					local112 = this.anInt3278 * Static224.anIntArray234[local103];
					local126 = this.method2645(local42 * local112 >> 12, local97, local62, local101, local56, local88);
					arg0[local103] = local27 * local126 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray40[0];
		if (local27 > 8 || local27 < -8) {
			local42 = this.aShortArray39[0] << 12;
			local49 = this.anInt3283 * local42 >> 12;
			local56 = this.anInt3278 * local42 >> 12;
			local62 = local12 * local42 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			if (local70 >= local49) {
				local70 = 0;
			}
			local62 &= 0xFFF;
			local88 = this.aByteArray41[local70 & 0xFF] & 0xFF;
			local97 = this.aByteArray41[local66 & 0xFF] & 0xFF;
			local101 = Class2_Sub4.anIntArray452[local62];
			for (local103 = 0; local103 < Static148.anInt2666; local103++) {
				local112 = Static224.anIntArray234[local103] * this.anInt3278;
				local126 = this.method2645(local112 * local42 >> 12, local97, local62, local101, local56, local88);
				arg0[local103] = local126 * local27 >> 12;
			}
		}
		for (@Pc(140) int local140 = 1; local140 < this.anInt3288; local140++) {
			local27 = this.aShortArray40[local140];
			if (local27 > 8 || local27 < -8) {
				local42 = this.aShortArray39[local140] << 12;
				local56 = this.anInt3278 * local42 >> 12;
				local49 = this.anInt3283 * local42 >> 12;
				local62 = local42 * local12 >> 12;
				local66 = local62 >> 12;
				local70 = local66 + 1;
				local62 &= 0xFFF;
				if (local70 >= local49) {
					local70 = 0;
				}
				local97 = this.aByteArray41[local66 & 0xFF] & 0xFF;
				local88 = this.aByteArray41[local70 & 0xFF] & 0xFF;
				local101 = Class2_Sub4.anIntArray452[local62];
				if (this.aBoolean210 && local140 == this.anInt3288 - 1) {
					for (local103 = 0; local103 < Static148.anInt2666; local103++) {
						local112 = this.anInt3278 * Static224.anIntArray234[local103];
						local126 = this.method2645(local42 * local112 >> 12, local97, local62, local101, local56, local88);
						local126 = (local126 * local27 >> 12) + arg0[local103];
						arg0[local103] = (local126 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static148.anInt2666; local103++) {
						local112 = Static224.anIntArray234[local103] * this.anInt3278;
						local126 = this.method2645(local42 * local112 >> 12, local97, local62, local101, local56, local88);
						arg0[local103] += local126 * local27 >> 12;
					}
				}
			}
		}
	}
}
