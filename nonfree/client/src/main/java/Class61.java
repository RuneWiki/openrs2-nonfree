import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class61 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	public final int anInt2100;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public final int anInt2102;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public final int anInt2099;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public final int anInt2101;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIII)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2100 = arg0;
		this.anInt2102 = arg3;
		this.anInt2099 = arg1;
		this.anInt2101 = arg2;
	}

	@OriginalMember(owner = "client!ef", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
