import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class81 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
	public final int anInt2486;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(II)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2486 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
