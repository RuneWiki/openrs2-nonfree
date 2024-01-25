import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class158 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public final int anInt4417;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	public final int anInt4415;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public final int anInt4414;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
	public final int anInt4412;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIII)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4417 = arg3;
		this.anInt4415 = arg1;
		this.anInt4414 = arg0;
		this.anInt4412 = arg2;
	}

	@OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
