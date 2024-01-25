import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public final class Class381 {

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
	public final int anInt10306;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(I)V")
	public Class381(@OriginalArg(0) int arg0) {
		this.anInt10306 = arg0;
	}

	@OriginalMember(owner = "client!wha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
