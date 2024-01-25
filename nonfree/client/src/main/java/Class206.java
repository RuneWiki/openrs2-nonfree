import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class206 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public final int anInt5575;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
	public Class206(@OriginalArg(0) int arg0) {
		this.anInt5575 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
