import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class306 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
	public final int anInt8854;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(I)V")
	public Class306(@OriginalArg(0) int arg0) {
		this.anInt8854 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
