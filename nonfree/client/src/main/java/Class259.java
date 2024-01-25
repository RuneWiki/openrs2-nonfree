import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class259 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Z")
	public boolean aBoolean484;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public int anInt7205;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public int anInt7207;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
	public int anInt7209;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public int anInt7210;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	public int anInt7211;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	public int anInt7204 = 16777215;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public int anInt7202 = 8;

	static {
		new Class55("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method5565(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3981();
			if (local5 == 0) {
				return;
			}
			this.method5567(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!gk;)V")
	private void method5567(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt7202 = arg1.method3943();
		} else if (arg0 == 2) {
			this.aBoolean484 = true;
		} else if (arg0 == 3) {
			this.anInt7210 = arg1.method3961();
			this.anInt7209 = arg1.method3961();
			this.anInt7207 = arg1.method3961();
		} else if (arg0 == 4) {
			this.anInt7211 = arg1.method3981();
		} else if (arg0 == 5) {
			this.anInt7205 = arg1.method3943();
		} else if (arg0 == 6) {
			this.anInt7204 = arg1.method3975();
		}
	}
}
