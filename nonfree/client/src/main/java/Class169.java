import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class169 {

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
	public final int anInt4406;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString61;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class169(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4406 = arg1;
		this.aString61 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
