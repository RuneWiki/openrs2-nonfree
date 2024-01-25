import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class223 {

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
	public final int anInt5604;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(I)V")
	public Class223(@OriginalArg(0) int arg0) {
		this.anInt5604 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
