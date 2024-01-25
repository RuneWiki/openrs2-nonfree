import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class239 {

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
	public final int anInt7598;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	private final int anInt7593;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(II)V")
	public Class239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7598 = arg1;
		this.anInt7593 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)I")
	public int method6359() {
		return this.anInt7593;
	}
}
