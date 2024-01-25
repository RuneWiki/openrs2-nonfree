import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class93 implements Interface3 {

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	public final int anInt2619;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class93(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2619 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
