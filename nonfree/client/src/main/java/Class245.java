import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class245 {

	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public final int anInt6985;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
	public Class245(@OriginalArg(0) int arg0) {
		this.anInt6985 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
