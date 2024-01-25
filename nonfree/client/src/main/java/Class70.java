import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class70 {

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
	public final int anInt1944;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(I)V")
	public Class70(@OriginalArg(0) int arg0) {
		this.anInt1944 = arg0;
	}

	@OriginalMember(owner = "client!daa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
