import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class333 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
	public final int anInt9344;

	static {
		new Class26("", 76);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
	public Class333(@OriginalArg(0) int arg0) {
		this.anInt9344 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
