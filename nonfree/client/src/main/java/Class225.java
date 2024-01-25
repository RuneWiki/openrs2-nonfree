import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class225 {

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
	public final int anInt6763;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public final int anInt6759;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	public final int anInt6760;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	public final int anInt6765;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIII)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6763 = arg2;
		this.anInt6759 = arg3;
		this.anInt6760 = arg1;
		this.anInt6765 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
