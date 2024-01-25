import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class139 {

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
	public final int anInt3234;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(I)V")
	public Class139(@OriginalArg(0) int arg0) {
		this.anInt3234 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
