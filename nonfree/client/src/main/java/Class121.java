import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class121 {

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	public final int anInt3555;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString30;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class121(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.anInt3555 = arg2;
		this.aString30 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
