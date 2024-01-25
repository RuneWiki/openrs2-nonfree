import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class138 {

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
	public final int anInt4315;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString39;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class138(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4315 = arg1;
		this.aString39 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
