import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public final int anInt73;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString6;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt73 = arg1;
		this.aString6 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
