import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class44 {

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
	public final int anInt1187;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class44(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1187 = arg1;
		this.aString10 = arg0;
	}

	@OriginalMember(owner = "client!cda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
