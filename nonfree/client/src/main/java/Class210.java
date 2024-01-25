import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class210 {

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public final int anInt5855;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V")
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5855 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
