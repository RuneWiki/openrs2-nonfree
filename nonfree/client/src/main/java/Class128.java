import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class128 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public final int anInt3622;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class128(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString66 = arg0;
		this.anInt3622 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
