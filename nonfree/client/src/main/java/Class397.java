import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class397 {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	private final int anInt10977;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public final int anInt10976;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V")
	public Class397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10977 = arg0;
		this.anInt10976 = arg1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)I")
	public int method9308() {
		return this.anInt10977;
	}

	@OriginalMember(owner = "client!wc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
