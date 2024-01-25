import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class250 {

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString182;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	public final int anInt7314;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class250(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString182 = arg0;
		this.anInt7314 = arg1;
	}

	@OriginalMember(owner = "client!re", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
