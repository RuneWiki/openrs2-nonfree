import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class105 implements Interface7 {

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public final int anInt3173;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class105(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3173 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
