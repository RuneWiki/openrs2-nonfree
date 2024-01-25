import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class297 {

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public final int anInt8136;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(I)V")
	public Class297(@OriginalArg(0) int arg0) {
		this.anInt8136 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
