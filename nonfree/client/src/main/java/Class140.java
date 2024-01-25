import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class140 {

	@OriginalMember(owner = "client!im", name = "f", descriptor = "I")
	public final int anInt4070;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "I")
	private final int anInt4066;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(II)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4070 = arg1;
		this.anInt4066 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)I")
	public int method3563() {
		return this.anInt4066;
	}

	@OriginalMember(owner = "client!im", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
