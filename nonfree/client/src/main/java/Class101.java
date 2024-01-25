import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class101 {

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	public final int anInt2587;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public final int anInt2586;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public final int anInt2582;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public final int anInt2585;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIII)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2587 = arg3;
		this.anInt2586 = arg0;
		this.anInt2582 = arg2;
		this.anInt2585 = arg1;
	}

	@OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
