import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class111 implements Interface4 {

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
	public final int anInt3326;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class111(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3326 = arg1;
	}

	@OriginalMember(owner = "client!ip", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
