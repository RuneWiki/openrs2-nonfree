import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class37 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
	public final int anInt1090;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public Class37(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		this.anInt1090 = arg3;
	}

	@OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
