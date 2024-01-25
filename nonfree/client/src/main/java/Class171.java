import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class171 {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	public final int anInt4736;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
	public Class171(@OriginalArg(0) int arg0) {
		this.anInt4736 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
