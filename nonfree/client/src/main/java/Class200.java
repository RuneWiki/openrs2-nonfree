import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class200 {

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	public final int anInt5771;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString59;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class200(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5771 = arg1;
		this.aString59 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
