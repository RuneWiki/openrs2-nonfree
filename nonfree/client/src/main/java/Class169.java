import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class169 {

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString83;

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
	public final int anInt4889;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class169(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.aString83 = arg0;
		this.anInt4889 = arg2;
	}

	@OriginalMember(owner = "client!iga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
