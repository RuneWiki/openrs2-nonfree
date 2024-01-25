import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class114 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public final int anInt3379;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class114(@OriginalArg(0) int arg0) {
		this.anInt3379 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
