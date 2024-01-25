import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class356 {

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
	public final int anInt9084;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(I)V")
	public Class356(@OriginalArg(0) int arg0) {
		this.anInt9084 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
