import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class230 {

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
	public final int anInt6313;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class230(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString65 = arg0;
		this.anInt6313 = arg1;
	}

	@OriginalMember(owner = "client!nq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
