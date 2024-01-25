import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Class278 implements Interface3 {

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
	public final int anInt8445;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class278(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8445 = arg1;
	}

	@OriginalMember(owner = "client!rba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
