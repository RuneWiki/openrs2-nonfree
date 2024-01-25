import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class289 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public final int anInt8371;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
	public Class289(@OriginalArg(0) int arg0) {
		this.anInt8371 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
