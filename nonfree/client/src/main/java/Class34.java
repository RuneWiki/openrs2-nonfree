import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class34 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public final int anInt780;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class34(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt780 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
	public int method756() {
		return this.anInt780;
	}

	@OriginalMember(owner = "client!bk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
