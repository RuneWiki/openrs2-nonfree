import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class327 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
	public final int anInt9117;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(I)V")
	public Class327(@OriginalArg(0) int arg0) {
		this.anInt9117 = arg0;
	}

	@OriginalMember(owner = "client!sw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
