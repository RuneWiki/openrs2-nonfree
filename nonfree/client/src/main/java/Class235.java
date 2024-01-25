import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class235 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
	public final int anInt6378;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString101;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class235(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6378 = arg1;
		this.aString101 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
