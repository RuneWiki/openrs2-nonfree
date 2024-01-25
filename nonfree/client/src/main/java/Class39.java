import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class39 {

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	public final int anInt1272;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(II)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1272 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
