import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class134 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
	public int anInt3798;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
	public int anInt3802;

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
	public int anInt3803;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
	public int anInt3804;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "Z")
	public boolean aBoolean355;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
	public int anInt3808;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
	public int anInt3807 = 8;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
	public int anInt3805 = 16777215;

	static {
		new Class142("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
		new Class142("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method2987(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2915();
			if (local12 == 0) {
				return;
			}
			this.method2988(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!wm;II)V")
	private void method2988(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3807 = arg0.method2896();
		} else if (arg1 == 2) {
			this.aBoolean355 = true;
		} else if (arg1 == 3) {
			this.anInt3803 = arg0.method2929();
			this.anInt3808 = arg0.method2929();
			this.anInt3798 = arg0.method2929();
		} else if (arg1 == 4) {
			this.anInt3804 = arg0.method2915();
		} else if (arg1 == 5) {
			this.anInt3802 = arg0.method2896();
		} else if (arg1 == 6) {
			this.anInt3805 = arg0.method2881();
		}
	}
}
