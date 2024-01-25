import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class306 {

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
	public final int anInt9063;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class306(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt9063 = arg1;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)I")
	public int method7572() {
		return this.anInt9063;
	}

	@OriginalMember(owner = "client!vv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
