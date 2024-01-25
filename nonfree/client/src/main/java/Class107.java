import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class107 {

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	private final int anInt2909;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public final int anInt2908;

	static {
		new Class7("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(II)V")
	public Class107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2909 = arg0;
		this.anInt2908 = arg1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)I")
	public int method2508() {
		return this.anInt2909;
	}

	@OriginalMember(owner = "client!hn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
