import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class11_Sub4_Sub5 extends Class11_Sub4 {

	@OriginalMember(owner = "client!el", name = "z", descriptor = "I")
	public int anInt1407 = 0;

	static {
		new Class117("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!kh;I)V")
	public void method1138(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5185();
			if (local9 == 0) {
				return;
			}
			this.method1143(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!kh;)V")
	private void method1143(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub25 arg1) {
		if (arg0 == 2) {
			this.anInt1407 = arg1.method5187();
		}
	}
}
