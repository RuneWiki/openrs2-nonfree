import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class168 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public int anInt4039 = 1;

	static {
		new Class32("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method3715(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5350();
			if (local5 == 0) {
				return;
			}
			this.method3718(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!kk;)V")
	private void method3718(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static294.method4424(arg1.method5330());
		} else if (arg0 == 2) {
			this.anInt4039 = 0;
		}
	}
}
