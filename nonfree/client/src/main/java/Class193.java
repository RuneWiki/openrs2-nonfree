import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class193 implements Interface2 {

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	public final int anInt4907;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class193(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4907 = arg1;
	}

	@OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
