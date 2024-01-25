import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class92 {

	@OriginalMember(owner = "client!er", name = "b", descriptor = "I")
	public final int anInt2751;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class92(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2751 = arg1;
		this.aString18 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
