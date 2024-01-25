import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class35 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	public final int anInt776;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I)V")
	public Class35(@OriginalArg(0) int arg0) {
		this.anInt776 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
