import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class148 {

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	public final int anInt4058;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	public final int anInt4056;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "I")
	public final int anInt4062;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public final int anInt4060;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IIII)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4058 = arg2;
		this.anInt4056 = arg3;
		this.anInt4062 = arg0;
		this.anInt4060 = arg1;
	}

	@OriginalMember(owner = "client!io", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
