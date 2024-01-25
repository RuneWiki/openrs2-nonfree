import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class170 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public final int anInt4891;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class170(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4891 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)I")
	public int method3735() {
		return this.anInt4891;
	}

	@OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
