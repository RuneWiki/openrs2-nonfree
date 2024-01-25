import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class189 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public final int anInt4729;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
	public Class189(@OriginalArg(0) int arg0) {
		this.anInt4729 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
