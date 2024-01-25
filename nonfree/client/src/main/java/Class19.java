import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class19 {

	@OriginalMember(owner = "client!al", name = "d", descriptor = "I")
	public final int anInt281;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
	public Class19(@OriginalArg(0) int arg0) {
		this.anInt281 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
