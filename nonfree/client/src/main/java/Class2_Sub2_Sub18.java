import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
	public int anInt6383 = 0;

	static {
		new Class256("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILclient!md;)V")
	private void method5061(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 2) {
			this.anInt6383 = arg1.method3711();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!md;)V")
	public void method5063(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3737();
			if (local9 == 0) {
				return;
			}
			this.method5061(local9, arg0);
		}
	}
}
