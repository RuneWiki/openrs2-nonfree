import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ak", name = "Z", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
	public int anInt265 = 1638;

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "[B")
	private byte[] aByteArray7 = new byte[512];

	@OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
	public int anInt272 = 4;

	@OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
	public int anInt271 = 4;

	@OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
	public int anInt273 = 0;

	@OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
	public int anInt277 = 4;

	@OriginalMember(owner = "client!ak", name = "ab", descriptor = "Z")
	public boolean aBoolean14 = true;

	static {
		new Class106("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
		new Class106("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI[I)V")
	public void method316(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt272 * Static60.anIntArray122[arg0];
		@Pc(114) int local114;
		@Pc(128) int local128;
		@Pc(40) int local40;
		@Pc(27) short local27;
		@Pc(105) int local105;
		@Pc(53) int local53;
		@Pc(47) int local47;
		@Pc(60) int local60;
		@Pc(94) int local94;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(90) int local90;
		@Pc(103) int local103;
		if (this.anInt271 == 1) {
			local40 = this.aShortArray13[0] << 12;
			local27 = this.aShortArray12[0];
			local53 = local40 * local12 >> 12;
			local60 = this.anInt272 * local40 >> 12;
			local47 = local40 * this.anInt277 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			@Pc(377) int local377 = local53 & 0xFFF;
			if (local68 >= local60) {
				local68 = 0;
			}
			local90 = this.aByteArray7[local64 & 0xFF] & 0xFF;
			local103 = this.aByteArray7[local68 & 0xFF] & 0xFF;
			local94 = Class119.anIntArray271[local377];
			if (this.aBoolean14) {
				for (local105 = 0; local105 < Static85.anInt1910; local105++) {
					local114 = Static273.anIntArray414[local105] * this.anInt277;
					local128 = this.method319(local94, local103, local90, local377, local40 * local114 >> 12, local47);
					@Pc(480) int local480 = local128 * local27 >> 12;
					arg1[local105] = (local480 >> 1) + 2048;
				}
			} else {
				for (local105 = 0; local105 < Static85.anInt1910; local105++) {
					local114 = Static273.anIntArray414[local105] * this.anInt277;
					local128 = this.method319(local94, local103, local90, local377, local114 * local40 >> 12, local47);
					arg1[local105] = local27 * local128 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray12[0];
		if (local27 > 8 || local27 < -8) {
			local40 = this.aShortArray13[0] << 12;
			local47 = this.anInt277 * local40 >> 12;
			local53 = local12 * local40 >> 12;
			local60 = local40 * this.anInt272 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			local53 &= 0xFFF;
			if (local60 <= local68) {
				local68 = 0;
			}
			local90 = this.aByteArray7[local64 & 0xFF] & 0xFF;
			local94 = Class119.anIntArray271[local53];
			local103 = this.aByteArray7[local68 & 0xFF] & 0xFF;
			for (local105 = 0; local105 < Static85.anInt1910; local105++) {
				local114 = this.anInt277 * Static273.anIntArray414[local105];
				local128 = this.method319(local94, local103, local90, local53, local114 * local40 >> 12, local47);
				arg1[local105] = local27 * local128 >> 12;
			}
		}
		for (@Pc(142) int local142 = 1; local142 < this.anInt271; local142++) {
			local27 = this.aShortArray12[local142];
			if (local27 > 8 || local27 < -8) {
				local40 = this.aShortArray13[local142] << 12;
				local47 = local40 * this.anInt277 >> 12;
				local60 = local40 * this.anInt272 >> 12;
				local53 = local12 * local40 >> 12;
				local64 = local53 >> 12;
				local68 = local64 + 1;
				if (local60 <= local68) {
					local68 = 0;
				}
				local53 &= 0xFFF;
				local103 = this.aByteArray7[local68 & 0xFF] & 0xFF;
				local90 = this.aByteArray7[local64 & 0xFF] & 0xFF;
				local94 = Class119.anIntArray271[local53];
				if (this.aBoolean14 && local142 == this.anInt271 - 1) {
					for (local105 = 0; local105 < Static85.anInt1910; local105++) {
						local114 = Static273.anIntArray414[local105] * this.anInt277;
						local128 = this.method319(local94, local103, local90, local53, local114 * local40 >> 12, local47);
						local128 = (local27 * local128 >> 12) + arg1[local105];
						arg1[local105] = (local128 >> 1) + 2048;
					}
				} else {
					for (local105 = 0; local105 < Static85.anInt1910; local105++) {
						local114 = Static273.anIntArray414[local105] * this.anInt277;
						local128 = this.method319(local94, local103, local90, local53, local114 * local40 >> 12, local47);
						arg1[local105] += local27 * local128 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean14 = arg1.method2132() == 1;
		} else if (arg0 == 1) {
			this.anInt271 = arg1.method2132();
		} else if (arg0 == 2) {
			this.anInt265 = arg1.method2141();
			if (this.anInt265 < 0) {
				this.aShortArray12 = new short[this.anInt271];
				for (@Pc(71) int local71 = 0; local71 < this.anInt271; local71++) {
					this.aShortArray12[local71] = (short) arg1.method2141();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt277 = this.anInt272 = arg1.method2132();
			return;
		} else if (arg0 == 4) {
			this.anInt273 = arg1.method2132();
			return;
		} else if (arg0 == 5) {
			this.anInt277 = arg1.method2132();
			return;
		} else if (arg0 == 6) {
			this.anInt272 = arg1.method2132();
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		this.aByteArray7 = Static159.method2992(this.anInt273);
		this.method320();
		for (@Pc(24) int local24 = this.anInt271 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray12[local24];
			if (local31 > 8 || local31 < -8) {
				return;
			}
			this.anInt271--;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIBII)I")
	private int method319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg5) {
			local13 = 0;
		}
		@Pc(30) int local30 = arg4 & 0xFFF;
		@Pc(34) int local34 = local30 - 4096;
		@Pc(38) int local38 = arg3 - 4096;
		local13 &= 0xFF;
		@Pc(60) int local60 = this.aByteArray7[local17 + arg2] & 0x3;
		@Pc(64) int local64 = Class119.anIntArray271[local30];
		@Pc(79) int local79;
		if (local60 <= 1) {
			local79 = local60 == 0 ? local30 + arg3 : arg3 + -local30;
		} else {
			local79 = local60 == 2 ? local30 - arg3 : -local30 + -arg3;
		}
		local60 = this.aByteArray7[arg2 + local13] & 0x3;
		@Pc(119) int local119;
		if (local60 <= 1) {
			local119 = local60 == 0 ? arg3 + local34 : arg3 - local34;
		} else {
			local119 = local60 == 2 ? local34 - arg3 : -arg3 + -local34;
		}
		@Pc(145) int local145 = ((local119 - local79) * local64 >> 12) + local79;
		local60 = this.aByteArray7[arg1 + local17] & 0x3;
		if (local60 <= 1) {
			local79 = local60 == 0 ? local30 + local38 : local38 + -local30;
		} else {
			local79 = local60 == 2 ? local30 - local38 : -local30 - local38;
		}
		local60 = this.aByteArray7[local13 + arg1] & 0x3;
		if (local60 <= 1) {
			local119 = local60 == 0 ? local34 + local38 : -local34 + local38;
		} else {
			local119 = local60 == 2 ? local34 - local38 : -local38 + -local34;
		}
		@Pc(244) int local244 = (local64 * (local119 - local79) >> 12) + local79;
		return (arg0 * (local244 - local145) >> 12) + local145;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
	private void method320() {
		@Pc(36) int local36;
		if (this.anInt265 > 0) {
			this.aShortArray13 = new short[this.anInt271];
			this.aShortArray12 = new short[this.anInt271];
			for (local36 = 0; local36 < this.anInt271; local36++) {
				this.aShortArray12[local36] = (short) (Math.pow((double) ((float) this.anInt265 / 4096.0F), (double) local36) * 4096.0D);
				this.aShortArray13[local36] = (short) Math.pow(2.0D, (double) local36);
			}
		} else if (this.aShortArray12 != null && this.anInt271 == this.aShortArray12.length) {
			this.aShortArray13 = new short[this.anInt271];
			for (local36 = 0; local36 < this.anInt271; local36++) {
				this.aShortArray13[local36] = (short) Math.pow(2.0D, (double) local36);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			this.method316(arg0, local9);
		}
		return local9;
	}
}
