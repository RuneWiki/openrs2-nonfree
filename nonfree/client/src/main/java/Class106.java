import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class106 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public final int anInt2627;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	public final int anInt2629;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public final int anInt2624;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	public final int anInt2626;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIII)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2627 = arg1;
		this.anInt2629 = arg3;
		this.anInt2624 = arg2;
		this.anInt2626 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
