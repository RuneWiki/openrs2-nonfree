import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class161 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public final int anInt4901;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
	public Class161(@OriginalArg(0) int arg0) {
		this.anInt4901 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
