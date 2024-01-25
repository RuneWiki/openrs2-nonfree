import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class172 {

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public final int anInt4367;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class172(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4367 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I")
	public int method3470() {
		return this.anInt4367;
	}
}
