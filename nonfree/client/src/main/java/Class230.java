import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class230 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public final int anInt7045;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
	private final int anInt7048;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(II)V")
	public Class230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7045 = arg1;
		this.anInt7048 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	public int method5858() {
		return this.anInt7048;
	}

	@OriginalMember(owner = "client!nj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
