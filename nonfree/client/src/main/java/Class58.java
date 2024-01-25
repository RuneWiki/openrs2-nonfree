import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class58 {

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public final int anInt1536;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.anInt1536 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
