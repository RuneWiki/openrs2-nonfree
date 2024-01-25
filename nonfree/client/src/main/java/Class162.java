import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class162 implements Interface26 {

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
	public final int anInt4564;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class162(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4564 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
