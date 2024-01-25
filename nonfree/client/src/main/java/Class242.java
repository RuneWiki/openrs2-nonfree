import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class242 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	private final int anInt6373;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(II)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6373 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)I")
	public int method5144() {
		return this.anInt6373;
	}
}
