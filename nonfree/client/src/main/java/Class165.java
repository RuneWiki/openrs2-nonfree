import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class165 implements Interface10 {

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
	public final int anInt5652;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class165(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5652 = arg1;
	}

	@OriginalMember(owner = "client!jt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
