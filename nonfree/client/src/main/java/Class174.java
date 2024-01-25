import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class174 {

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString37;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	public final int anInt4124;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class174(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString37 = arg0;
		this.anInt4124 = arg1;
	}

	@OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
