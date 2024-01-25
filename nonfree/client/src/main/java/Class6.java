import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class6 {

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
	public final int anInt116;

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
	private final int anInt117;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(II)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt116 = arg1;
		this.anInt117 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)I")
	public int method233() {
		return this.anInt117;
	}
}
