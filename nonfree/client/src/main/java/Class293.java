import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class293 {

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public final int anInt7773;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(II)V")
	public Class293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7773 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
