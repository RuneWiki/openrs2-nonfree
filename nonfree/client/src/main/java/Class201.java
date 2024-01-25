import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class201 {

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public final int anInt5473;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	public final int anInt5474;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	public final int anInt5471;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	public final int anInt5472;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIII)V")
	public Class201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5473 = arg3;
		this.anInt5474 = arg2;
		this.anInt5471 = arg1;
		this.anInt5472 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
