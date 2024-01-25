import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class179 {

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public final int anInt4220;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class179(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4220 = arg1;
	}

	@OriginalMember(owner = "client!ij", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)I")
	public int method3821() {
		return this.anInt4220;
	}
}
