import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class258 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public final int anInt7113;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class258(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7113 = arg1;
	}

	@OriginalMember(owner = "client!pk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
