import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class113 {

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
	public final int anInt3360;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class113(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString40 = arg0;
		this.anInt3360 = arg1;
	}

	@OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
