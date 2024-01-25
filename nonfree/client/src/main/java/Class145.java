import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class145 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
	public final int anInt3787;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class145(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3787 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
