import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class5_Sub9_Sub1 extends Class5_Sub9 {

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "Z")
	public boolean aBoolean52;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "Z")
	public boolean aBoolean53;

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
	private int anInt720;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
	public int anInt722;

	static {
		new Class85("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	private Class5_Sub9_Sub1() {
		if (Static136.anIntArray264 == null) {
			Static335.method5823();
		}
		this.method633();
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class5_Sub9_Sub1(@OriginalArg(0) Class5_Sub12 arg0) {
		if (Static136.anIntArray264 == null) {
			Static335.method5823();
		}
		this.anInt722 = arg0.method5115();
		this.aBoolean53 = (this.anInt722 & 0x8) != 0;
		this.aBoolean52 = (this.anInt722 & 0x10) != 0;
		this.anInt722 &= 0x7;
		super.anInt703 = arg0.method5106();
		super.anInt708 = arg0.method5106();
		super.anInt704 = arg0.method5106();
		super.anInt705 = arg0.method5115();
		@Pc(65) int local65 = super.anInt705 * 2 + 1;
		this.aShortArray7 = new short[local65];
		for (@Pc(71) int local71 = 0; local71 < this.aShortArray7.length; local71++) {
			@Pc(78) short local78 = (short) arg0.method5106();
			@Pc(82) int local82 = local78 >>> 8;
			if (local82 >= local65) {
				local82 = local65 - 1;
			}
			@Pc(93) int local93 = local78 & 0xFF;
			if (local65 - local82 < local93) {
				local93 = local65 - local82;
			}
			this.aShortArray7[local71] = (short) (local93 | local82 << 8);
		}
		super.anInt705 = (super.anInt705 << 7) + 64;
		if (Static203.anIntArray488 == null) {
			super.anInt702 = Static230.anIntArray424[Static162.method2852(arg0.method5106()) & 0xFFFF];
		} else {
			super.anInt702 = Static203.anIntArray488[arg0.method5106()];
		}
		@Pc(162) int local162 = arg0.method5115();
		this.anInt718 = local162 & 0x1F;
		this.anInt711 = (local162 & 0xE0) << 3;
		if (this.anInt718 != 31) {
			this.method633();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZ)V")
	public void method630(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(54) int local54;
		if (arg1) {
			local54 = 2048;
		} else {
			@Pc(20) int local20 = this.anInt711 + arg0 * this.anInt715 / 50 & 0x7FF;
			@Pc(23) int local23 = this.anInt720;
			if (local23 == 1) {
				local54 = (Class187.anIntArray571[local20 << 3] >> 5) + 1024;
			} else if (local23 == 3) {
				local54 = Static136.anIntArray264[local20] >> 1;
			} else if (local23 == 4) {
				local54 = local20 >> 10 << 11;
			} else if (local23 == 2) {
				local54 = local20;
			} else if (local23 == 5) {
				local54 = (local20 < 1024 ? local20 : 2048 - local20) << 1;
			} else {
				local54 = 2048;
			}
		}
		super.aFloat8 = (float) ((local54 * this.anInt717 >> 11) + this.anInt719) / 2048.0F;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	private void method633() {
		@Pc(15) int local15 = this.anInt718;
		if (local15 == 2) {
			this.anInt719 = 0;
			this.anInt717 = 2048;
			this.anInt715 = 2048;
			this.anInt720 = 1;
		} else if (local15 == 3) {
			this.anInt715 = 4096;
			this.anInt719 = 0;
			this.anInt717 = 2048;
			this.anInt720 = 1;
		} else if (local15 == 4) {
			this.anInt719 = 0;
			this.anInt720 = 4;
			this.anInt717 = 2048;
			this.anInt715 = 2048;
		} else if (local15 == 5) {
			this.anInt717 = 2048;
			this.anInt715 = 8192;
			this.anInt720 = 4;
			this.anInt719 = 0;
		} else if (local15 == 12) {
			this.anInt717 = 2048;
			this.anInt720 = 2;
			this.anInt719 = 0;
			this.anInt715 = 2048;
		} else if (local15 == 13) {
			this.anInt719 = 0;
			this.anInt720 = 2;
			this.anInt717 = 2048;
			this.anInt715 = 8192;
		} else if (local15 == 10) {
			this.anInt720 = 3;
			this.anInt717 = 512;
			this.anInt719 = 1536;
			this.anInt715 = 2048;
		} else if (local15 == 11) {
			this.anInt717 = 512;
			this.anInt720 = 3;
			this.anInt715 = 4096;
			this.anInt719 = 1536;
		} else if (local15 == 6) {
			this.anInt720 = 3;
			this.anInt717 = 768;
			this.anInt715 = 2048;
			this.anInt719 = 1280;
		} else if (local15 == 7) {
			this.anInt719 = 1280;
			this.anInt715 = 4096;
			this.anInt717 = 768;
			this.anInt720 = 3;
		} else if (local15 == 8) {
			this.anInt719 = 1024;
			this.anInt720 = 3;
			this.anInt715 = 2048;
			this.anInt717 = 1024;
		} else if (local15 == 9) {
			this.anInt720 = 3;
			this.anInt715 = 4096;
			this.anInt719 = 1024;
			this.anInt717 = 1024;
		} else if (local15 == 14) {
			this.anInt719 = 1280;
			this.anInt720 = 1;
			this.anInt717 = 768;
			this.anInt715 = 2048;
		} else if (local15 == 15) {
			this.anInt719 = 1536;
			this.anInt717 = 512;
			this.anInt715 = 4096;
			this.anInt720 = 1;
		} else if (local15 == 16) {
			this.anInt719 = 1792;
			this.anInt717 = 256;
			this.anInt715 = 8192;
			this.anInt720 = 1;
		} else {
			this.anInt719 = 0;
			this.anInt715 = 2048;
			this.anInt717 = 2048;
			this.anInt720 = 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
	public void method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt719 = arg1;
		this.anInt715 = arg3;
		this.anInt717 = arg0;
		this.anInt720 = arg2;
	}
}
