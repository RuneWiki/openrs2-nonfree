import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	protected final int anInt9034;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	protected int anInt9035;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public final int anInt9038;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	protected int anInt9036;

	static {
		new Class88("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIII)V")
	protected Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9034 = arg1;
		this.anInt9035 = arg0;
		this.anInt9038 = arg3;
		this.anInt9036 = arg2;
	}
}
