import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class176 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public final int anInt4801;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class176(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4801 = arg1;
		this.aString57 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
