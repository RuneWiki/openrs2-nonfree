import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class89 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public final int anInt2684;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	public final int anInt2687;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public final int anInt2685;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public final int anInt2681;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIII)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2684 = arg2;
		this.anInt2687 = arg3;
		this.anInt2685 = arg1;
		this.anInt2681 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
