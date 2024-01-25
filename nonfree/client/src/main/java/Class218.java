import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class218 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public final int anInt6779;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6779 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
