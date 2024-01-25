import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class61 {

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public final int anInt1910;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString16;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class61(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1910 = arg1;
		this.aString16 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
