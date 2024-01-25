import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class24 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public final int anInt490;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		this.anInt490 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
