import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class83 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
	public final int anInt2401;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
	public final int anInt2400;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public final int anInt2396;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
	public final int anInt2402;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIII)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2401 = arg2;
		this.anInt2400 = arg0;
		this.anInt2396 = arg3;
		this.anInt2402 = arg1;
	}

	@OriginalMember(owner = "client!fp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
