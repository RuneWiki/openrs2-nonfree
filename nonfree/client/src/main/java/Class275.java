import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class275 implements Interface20 {

	@OriginalMember(owner = "client!op", name = "c", descriptor = "I")
	public final int anInt7438;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class275(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7438 = arg1;
	}

	@OriginalMember(owner = "client!op", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
