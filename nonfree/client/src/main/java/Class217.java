import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class217 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public final int anInt6835;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class217(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6835 = arg1;
		this.aString71 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
