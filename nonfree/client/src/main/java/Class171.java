import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class171 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public final int anInt4292;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class171(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4292 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
