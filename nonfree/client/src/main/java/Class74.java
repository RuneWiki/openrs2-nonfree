import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class74 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public final int anInt2257;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public final int anInt2256;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	public final int anInt2261;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	public final int anInt2259;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIII)V")
	public Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2257 = arg2;
		this.anInt2256 = arg0;
		this.anInt2261 = arg1;
		this.anInt2259 = arg3;
	}

	@OriginalMember(owner = "client!dj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
