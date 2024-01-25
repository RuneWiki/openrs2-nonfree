import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class343 implements Interface19 {

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
	public final int anInt9545;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class343(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt9545 = arg1;
	}

	@OriginalMember(owner = "client!tq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
