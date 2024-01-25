import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class122 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public final int anInt3616;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V")
	public Class122(@OriginalArg(0) int arg0) {
		this.anInt3616 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
