import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class267 {

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "[Lclient!ht;")
	public static final Class112[] aClass112Array1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "J")
	public long aLong219;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	public int anInt7245;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	public int anInt7249;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
	public int anInt7250;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public int anInt7251;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public int anInt7252;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public int anInt7253;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
	public int anInt7254;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt7255;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	public int anInt7256;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	private int anInt7258;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public int anInt7248 = 0;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public int anInt7244 = 0;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "Z")
	private boolean aBoolean478 = false;

	static {
		new Class209("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
		aClass112Array1 = new Class112[5];
		for (@Pc(13) int local13 = 0; local13 < aClass112Array1.length; local13++) {
			aClass112Array1[local13] = new Class112();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!si;I)V")
	private void method5723(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7258 = arg0.method5500();
		} else if (arg1 == 2) {
			arg0.method5495();
		} else if (arg1 == 3) {
			this.anInt7252 = arg0.method5508();
			this.anInt7251 = arg0.method5508();
			this.anInt7245 = arg0.method5508();
		} else if (arg1 == 4) {
			this.anInt7256 = arg0.method5495();
			this.anInt7249 = arg0.method5508();
		} else if (arg1 == 6) {
			this.anInt7254 = arg0.method5495();
		} else if (arg1 == 8) {
			this.anInt7244 = 1;
		} else if (arg1 == 9) {
			this.anInt7248 = 1;
		} else if (arg1 == 10) {
			this.aBoolean478 = true;
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public void method5724() {
		this.anInt7250 = Class162.anIntArray387[this.anInt7258 << 3];
		this.anInt7255 = (int) Math.sqrt((double) (this.anInt7245 * this.anInt7245 + this.anInt7252 * this.anInt7252 + this.anInt7251 * this.anInt7251));
		if (this.anInt7249 == 0) {
			this.anInt7249 = 1;
		}
		if (this.anInt7256 == 0) {
			this.aLong219 = 2147483647L;
		} else if (this.anInt7256 == 1) {
			this.aLong219 = this.anInt7255 * 8 / this.anInt7249;
			this.aLong219 *= this.aLong219;
		} else if (this.anInt7256 == 2) {
			this.aLong219 = this.anInt7255 * 8 / this.anInt7249;
		}
		if (this.aBoolean478) {
			this.anInt7255 *= -1;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLclient!si;)V")
	public void method5725(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5495();
			if (local17 == 0) {
				return;
			}
			this.method5723(arg0, local17);
		}
	}
}
