import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class123 {

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public final int anInt3588;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
	public Class123(@OriginalArg(0) int arg0) {
		this.anInt3588 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
