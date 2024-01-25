import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class63 {

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	public final int anInt1655;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class63(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1655 = arg1;
		this.aString21 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
