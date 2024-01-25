import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class168 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	public final int anInt4957;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(I)V")
	public Class168(@OriginalArg(0) int arg0) {
		this.anInt4957 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
