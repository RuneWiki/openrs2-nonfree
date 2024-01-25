import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class160 {

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public final int anInt4436;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	private final int anInt4437;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(II)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4436 = arg1;
		this.anInt4437 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)I")
	public int method3886() {
		return this.anInt4437;
	}
}
