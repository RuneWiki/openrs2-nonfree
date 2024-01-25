import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class240 implements Interface14 {

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public final int anInt7524;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class240(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7524 = arg1;
	}

	@OriginalMember(owner = "client!oi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
