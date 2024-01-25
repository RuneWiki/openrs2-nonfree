import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class335 {

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString129;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public final int anInt9905;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class335(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString129 = arg0;
		this.anInt9905 = arg1;
	}

	@OriginalMember(owner = "client!vd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
