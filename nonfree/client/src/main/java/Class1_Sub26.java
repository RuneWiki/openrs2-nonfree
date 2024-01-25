import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	public int anInt3459;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	private Class1_Sub26() {
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
	public Class1_Sub26(@OriginalArg(0) int arg0) {
		this.anInt3459 = arg0;
	}
}
