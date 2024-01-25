import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public final class Class186 {

	@OriginalMember(owner = "client!jia", name = "g", descriptor = "I")
	public final int anInt5472;

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
	private final int anInt5467;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(II)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5472 = arg1;
		this.anInt5467 = arg0;
	}

	@OriginalMember(owner = "client!jia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)I")
	public int method4640() {
		return this.anInt5467;
	}
}
