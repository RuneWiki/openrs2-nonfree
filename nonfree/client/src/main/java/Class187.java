import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public final class Class187 {

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
	public final int anInt4412;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	private final int anInt4415;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(II)V")
	public Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4412 = arg1;
		this.anInt4415 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)I")
	public int method3900() {
		return this.anInt4415;
	}
}
