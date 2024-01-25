import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class208 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	private final int anInt5772;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	public final int anInt5774;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5772 = arg0;
		this.anInt5774 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
	public int method5104() {
		return this.anInt5772;
	}
}
