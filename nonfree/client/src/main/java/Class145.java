import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class145 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public final int anInt4448;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
	public Class145(@OriginalArg(0) int arg0) {
		this.anInt4448 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
