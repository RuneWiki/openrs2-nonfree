import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class1_Sub46 extends Class1 {

	@OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
	public final int anInt8003;

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
	public final int anInt8002;

	static {
		new Class306("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(II)V")
	public Class1_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8003 = arg0;
		this.anInt8002 = arg1;
	}
}
