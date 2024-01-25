import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class73 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public final int anInt2981;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	private final int anInt2984;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V")
	public Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2981 = arg1;
		this.anInt2984 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
	public int method2522() {
		return this.anInt2984;
	}

	@OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
