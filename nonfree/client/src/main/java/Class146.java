import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class146 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	public final int anInt4596;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public final int anInt4602;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	public final int anInt4604;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public final int anInt4597;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIII)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4596 = arg1;
		this.anInt4602 = arg2;
		this.anInt4604 = arg3;
		this.anInt4597 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
