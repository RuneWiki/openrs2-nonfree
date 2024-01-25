import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class Class3_Sub4_Sub5 extends Class3_Sub4 {

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
	public final int anInt5084;

	static {
		new Class189("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub4_Sub5(@OriginalArg(0) int arg0) {
		this.anInt5084 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method3898();

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)Z")
	public abstract boolean method3899();
}
