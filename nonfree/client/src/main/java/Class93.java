import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class93 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public final int anInt2270;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public final int anInt2273;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public final int anInt2272;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public final int anInt2269;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIII)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2270 = arg0;
		this.anInt2273 = arg3;
		this.anInt2272 = arg1;
		this.anInt2269 = arg2;
	}

	@OriginalMember(owner = "client!ed", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
