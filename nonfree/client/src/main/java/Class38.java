import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class38 {

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public final int anInt765;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class38(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString8 = arg0;
		this.anInt765 = arg1;
	}

	@OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
