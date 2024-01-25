import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class171 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public final int anInt4927;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	public Class171(@OriginalArg(0) int arg0) {
		this.anInt4927 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
