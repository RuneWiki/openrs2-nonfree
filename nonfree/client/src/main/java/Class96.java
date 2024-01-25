import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class96 {

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	public final int anInt1930;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public final int anInt1928;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
	public final int anInt1935;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public final int anInt1931;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(IIII)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1930 = arg2;
		this.anInt1928 = arg0;
		this.anInt1935 = arg3;
		this.anInt1931 = arg1;
	}

	@OriginalMember(owner = "client!dv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
