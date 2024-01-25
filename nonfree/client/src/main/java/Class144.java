import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class144 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public final int anInt3624;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
	private final int anInt3627;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(II)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3624 = arg1;
		this.anInt3627 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I")
	public int method3286() {
		return this.anInt3627;
	}

	@OriginalMember(owner = "client!gs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
