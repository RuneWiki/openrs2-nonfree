import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class76 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public final int anInt1930;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1930 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
