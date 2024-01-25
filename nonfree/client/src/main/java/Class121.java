import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class121 {

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public int anInt3843 = 0;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public int anInt3838 = 16;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public int anInt3840 = -1;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public int anInt3836 = 1190717;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Z")
	public boolean aBoolean299 = false;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "I")
	public int anInt3837 = -1;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	public int anInt3846 = 128;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	public int anInt3842 = -1;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Z")
	public boolean aBoolean301 = true;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	public int anInt3847 = 8;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Z")
	public boolean aBoolean300 = true;

	static {
		new Class159("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIILclient!lf;)V")
	private void method3485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt3843 = Static248.method4392(arg2.method3442());
		} else if (arg1 == 2) {
			this.anInt3837 = arg2.method3440();
			return;
		} else if (arg1 == 3) {
			this.anInt3837 = arg2.method3401();
			if (this.anInt3837 == 65535) {
				this.anInt3837 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean301 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt3840 = Static248.method4392(arg2.method3442());
			return;
		} else if (arg1 == 8) {
			Static129.anInt3040 = arg0;
			return;
		} else if (arg1 == 9) {
			this.anInt3846 = arg2.method3401();
			return;
		} else if (arg1 == 10) {
			this.aBoolean300 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt3847 = arg2.method3440();
			return;
		} else if (arg1 == 12) {
			this.aBoolean299 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt3836 = arg2.method3442();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt3838 = arg2.method3440();
			} else if (arg1 == 15) {
				this.anInt3842 = arg2.method3401();
				if (this.anInt3842 == 65535) {
					this.anInt3842 = -1;
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!lf;I)V")
	public void method3487(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3440();
			if (local5 == 0) {
				return;
			}
			this.method3485(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
	public void method3488(@OriginalArg(0) int arg0) {
		this.anInt3847 = this.anInt3847 << 8 | arg0;
		if (this.anInt3842 == -1) {
			this.anInt3842 = this.anInt3837;
		}
	}
}
