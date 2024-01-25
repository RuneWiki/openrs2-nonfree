import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public final class Class158 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public final int anInt4464;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public final int anInt4463;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public final int anInt4466;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public final int anInt4461;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIII)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4464 = arg3;
		this.anInt4463 = arg2;
		this.anInt4466 = arg1;
		this.anInt4461 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
