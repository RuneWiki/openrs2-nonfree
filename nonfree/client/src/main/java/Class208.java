import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class208 implements Interface25 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	public final int anInt5328;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class208(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5328 = arg1;
	}

	@OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
