import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class376 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	public final int anInt10167;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
	public Class376(@OriginalArg(0) int arg0) {
		this.anInt10167 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
