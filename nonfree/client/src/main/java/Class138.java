import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class138 {

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	public final int anInt4988;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(II)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4988 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
