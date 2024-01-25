import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class42 {

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
	public final int anInt771;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		this.anInt771 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
