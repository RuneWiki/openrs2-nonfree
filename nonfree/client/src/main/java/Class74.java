import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public final class Class74 implements Interface17 {

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
	public final int anInt1562;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class74(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1562 = arg1;
	}

	@OriginalMember(owner = "client!dia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
