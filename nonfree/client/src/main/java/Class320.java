import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class320 {

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
	public final int anInt9380;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class320(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt9380 = arg1;
	}

	@OriginalMember(owner = "client!wu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
