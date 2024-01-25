import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class104 {

	@OriginalMember(owner = "client!et", name = "g", descriptor = "I")
	public final int anInt2988;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(I)V")
	public Class104(@OriginalArg(0) int arg0) {
		this.anInt2988 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
