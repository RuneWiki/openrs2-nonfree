import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class214 {

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	private final int anInt5672;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	public final int anInt5673;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5672 = arg0;
		this.anInt5673 = arg1;
	}

	@OriginalMember(owner = "client!ri", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
	public int method4416() {
		return this.anInt5672;
	}
}
