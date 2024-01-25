import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class278 {

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
	public final int anInt7757;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
	public Class278(@OriginalArg(0) int arg0) {
		this.anInt7757 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
