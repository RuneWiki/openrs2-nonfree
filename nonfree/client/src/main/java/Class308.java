import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class308 {

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString119;

	@OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
	public final int anInt7714;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class308(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString119 = arg0;
		this.anInt7714 = arg1;
	}

	@OriginalMember(owner = "client!sea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
