import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class44 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	public final int anInt1139;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class44(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString10 = arg0;
		this.anInt1139 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
