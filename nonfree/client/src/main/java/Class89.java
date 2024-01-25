import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class89 {

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	public final int anInt3213;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString30;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class89(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3213 = arg1;
		this.aString30 = arg0;
	}

	@OriginalMember(owner = "client!gt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
