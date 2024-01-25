import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class17 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "I")
	public final int anInt420;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class17(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt420 = arg1;
		this.aString3 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
