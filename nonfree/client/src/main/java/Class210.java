import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class210 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public final int anInt5497;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
	public final int anInt5501;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
	public final int anInt5498;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	public final int anInt5499;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIII)V")
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5497 = arg0;
		this.anInt5501 = arg3;
		this.anInt5498 = arg2;
		this.anInt5499 = arg1;
	}

	@OriginalMember(owner = "client!lj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
