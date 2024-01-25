import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class147 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
	public final int anInt4151;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString34;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class147(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4151 = arg1;
		this.aString34 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
