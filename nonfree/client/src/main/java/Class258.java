import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class258 {

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!br;")
	public Class28 aClass28_8;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public int anInt7303;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public int anInt7295 = 128;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public int anInt7301 = -1;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Z")
	public boolean aBoolean597 = true;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	public int anInt7300 = 16;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public int anInt7299 = -1;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Z")
	public boolean aBoolean598 = true;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	public int anInt7296 = 127;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public int anInt7291 = -1;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public int anInt7304 = 8;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public int anInt7302 = 0;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public int anInt7293 = 1190717;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Z")
	public boolean aBoolean599 = false;

	static {
		new Class151("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public void method5514() {
		this.anInt7304 = this.anInt7303 | this.anInt7304 << 8;
		if (this.anInt7301 == -1) {
			this.anInt7301 = this.anInt7299;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!dh;B)V")
	public void method5516(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4463();
			if (local16 == 0) {
				return;
			}
			this.method5517(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBLclient!dh;)V")
	private void method5517(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt7302 = Static321.method3568(arg1.method4493());
		} else if (arg0 == 2) {
			this.anInt7299 = arg1.method4463();
		} else if (arg0 == 3) {
			this.anInt7299 = arg1.method4485();
			if (this.anInt7299 == 65535) {
				this.anInt7299 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean598 = false;
		} else if (arg0 == 7) {
			this.anInt7291 = Static321.method3568(arg1.method4493());
		} else if (arg0 == 8) {
			this.aClass28_8.anInt713 = this.anInt7303;
		} else if (arg0 == 9) {
			this.anInt7295 = arg1.method4485() << 0;
		} else if (arg0 == 10) {
			this.aBoolean597 = false;
		} else if (arg0 == 11) {
			this.anInt7304 = arg1.method4463();
		} else if (arg0 == 12) {
			this.aBoolean599 = true;
		} else if (arg0 == 13) {
			this.anInt7293 = arg1.method4493();
		} else if (arg0 == 14) {
			this.anInt7300 = arg1.method4463();
		} else if (arg0 == 15) {
			this.anInt7301 = arg1.method4485();
			if (this.anInt7301 == 65535) {
				this.anInt7301 = -1;
				return;
			}
		} else if (arg0 == 16) {
			this.anInt7296 = arg1.method4463();
			return;
		} else {
			return;
		}
	}
}
