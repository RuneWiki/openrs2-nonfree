import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class145 {

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
	public final int anInt4029;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	private final int anInt4025;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(II)V")
	public Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4029 = arg1;
		this.anInt4025 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)I")
	public int method3506() {
		return this.anInt4025;
	}
}
