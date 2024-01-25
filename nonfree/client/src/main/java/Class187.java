import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class187 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public final int anInt5402;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
	public Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5402 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
