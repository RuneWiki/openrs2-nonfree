import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class375 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	public final int anInt11029;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
	public Class375(@OriginalArg(0) int arg0) {
		this.anInt11029 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
