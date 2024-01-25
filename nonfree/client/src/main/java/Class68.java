import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class68 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public final int anInt2256;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public final int anInt2258;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public final int anInt2254;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	public final int anInt2253;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIII)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2256 = arg0;
		this.anInt2258 = arg3;
		this.anInt2254 = arg1;
		this.anInt2253 = arg2;
	}

	@OriginalMember(owner = "client!dc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
