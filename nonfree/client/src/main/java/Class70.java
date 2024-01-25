import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class70 {

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	public final int anInt1961;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public final int anInt1956;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
	public final int anInt1950;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
	public final int anInt1957;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIII)V")
	public Class70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1961 = arg0;
		this.anInt1956 = arg2;
		this.anInt1950 = arg3;
		this.anInt1957 = arg1;
	}

	@OriginalMember(owner = "client!fg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
