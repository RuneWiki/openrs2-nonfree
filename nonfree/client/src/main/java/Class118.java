import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public final class Class118 {

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString33;

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "I")
	public final int anInt3893;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class118(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.aString33 = arg0;
		this.anInt3893 = arg2;
	}

	@OriginalMember(owner = "client!gia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
