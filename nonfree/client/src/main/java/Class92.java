import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class92 {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
	public final int anInt2893;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(II)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2893 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
