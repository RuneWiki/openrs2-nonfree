import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class145 {

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString32;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	public final int anInt4110;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class145(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString32 = arg0;
		this.anInt4110 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
