import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class33 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	public final int anInt788;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.anInt788 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
