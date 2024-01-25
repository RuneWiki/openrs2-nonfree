import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class313 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public final int anInt9428;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
	public Class313(@OriginalArg(0) int arg0) {
		this.anInt9428 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
