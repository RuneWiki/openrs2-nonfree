import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class197 {

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
	public final int anInt4598;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
	public final int anInt4601;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
	public final int anInt4597;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
	public final int anInt4599;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIII)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4598 = arg2;
		this.anInt4601 = arg0;
		this.anInt4597 = arg1;
		this.anInt4599 = arg3;
	}

	@OriginalMember(owner = "client!ji", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
