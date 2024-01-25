import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public final class Class320 {

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
	public final int anInt9515;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class320(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt9515 = arg1;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
	public int method7712() {
		return this.anInt9515;
	}

	@OriginalMember(owner = "client!uaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
