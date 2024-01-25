import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class109 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	private final int anInt2324;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public final int anInt2321;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(II)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2324 = arg0;
		this.anInt2321 = arg1;
	}

	@OriginalMember(owner = "client!el", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	public int method2012() {
		return this.anInt2324;
	}
}
