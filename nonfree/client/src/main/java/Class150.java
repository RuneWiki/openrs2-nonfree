import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class150 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public final int anInt3682;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString43;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class150(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3682 = arg1;
		this.aString43 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
