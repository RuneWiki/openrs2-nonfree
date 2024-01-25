import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class215 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "I")
	public final int anInt6609;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(I)V")
	public Class215(@OriginalArg(0) int arg0) {
		this.anInt6609 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
