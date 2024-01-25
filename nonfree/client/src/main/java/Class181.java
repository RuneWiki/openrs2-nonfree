import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class181 {

	@OriginalMember(owner = "client!im", name = "c", descriptor = "I")
	public final int anInt4848;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString62;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class181(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4848 = arg1;
		this.aString62 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
