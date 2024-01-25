import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class186 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	public final int anInt4695;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public final int anInt4699;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
	public final int anInt4700;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public final int anInt4698;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIII)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4695 = arg2;
		this.anInt4699 = arg3;
		this.anInt4700 = arg0;
		this.anInt4698 = arg1;
	}

	@OriginalMember(owner = "client!kg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
