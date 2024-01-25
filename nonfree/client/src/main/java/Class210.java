import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class210 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	public final int anInt5224;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(II)V")
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5224 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
