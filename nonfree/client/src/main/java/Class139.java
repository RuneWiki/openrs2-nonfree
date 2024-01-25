import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class139 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	public int anInt3370 = 64;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	public int anInt3375 = 64;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	public int anInt3376 = 1;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public int anInt3373 = 2;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public int anInt3374 = -1;

	static {
		new Class151(" days.", " Tage.", " jours.", " dias.");
		new Class151("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!dh;I)V")
	public void method2812(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4463();
			if (local9 == 0) {
				return;
			}
			this.method2814(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!dh;III)V")
	private void method2814(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt3374 = arg0.method4485();
			if (this.anInt3374 == 65535) {
				this.anInt3374 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt3370 = arg0.method4485() + 1;
			this.anInt3375 = arg0.method4485() + 1;
		} else if (arg1 == 3) {
			arg0.method4452();
		} else if (arg1 == 4) {
			this.anInt3373 = arg0.method4463();
		} else if (arg1 == 5) {
			this.anInt3376 = arg0.method4463();
		} else if (arg1 == 6) {
			this.aBoolean257 = true;
			return;
		} else if (arg1 == 7) {
			this.aBoolean256 = true;
			return;
		}
	}
}
