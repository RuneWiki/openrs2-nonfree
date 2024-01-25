import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class211 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	private final int anInt5748;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public final int anInt5746;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(II)V")
	public Class211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5748 = arg0;
		this.anInt5746 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)I")
	public int method4520() {
		return this.anInt5748;
	}
}
