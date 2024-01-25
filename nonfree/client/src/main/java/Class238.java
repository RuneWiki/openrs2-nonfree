import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class238 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	public final int anInt7405;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V")
	public Class238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7405 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
