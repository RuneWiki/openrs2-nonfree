import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class209 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	public final int anInt5938;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString50;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class209(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5938 = arg1;
		this.aString50 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
