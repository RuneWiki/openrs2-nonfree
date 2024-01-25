import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class97 {

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public final int anInt2351;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	public final int anInt2348;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	public final int anInt2350;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	public final int anInt2352;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIII)V")
	public Class97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2351 = arg1;
		this.anInt2348 = arg2;
		this.anInt2350 = arg0;
		this.anInt2352 = arg3;
	}

	@OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
