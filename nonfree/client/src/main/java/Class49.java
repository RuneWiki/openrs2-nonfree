import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class49 {

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public final int anInt1823;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
	public Class49(@OriginalArg(0) int arg0) {
		this.anInt1823 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
