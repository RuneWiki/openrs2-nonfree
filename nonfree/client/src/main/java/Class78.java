import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class78 {

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
	public final int anInt1850;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(II)V")
	public Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1850 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
