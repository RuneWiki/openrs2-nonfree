import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class361 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public final int anInt9527;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
	public Class361(@OriginalArg(0) int arg0) {
		this.anInt9527 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
