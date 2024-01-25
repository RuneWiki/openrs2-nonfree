import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class165 {

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	public final int anInt4668;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
	public final int anInt4667;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
	public final int anInt4665;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
	public final int anInt4666;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(IIII)V")
	public Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4668 = arg1;
		this.anInt4667 = arg0;
		this.anInt4665 = arg3;
		this.anInt4666 = arg2;
	}

	@OriginalMember(owner = "client!mt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
