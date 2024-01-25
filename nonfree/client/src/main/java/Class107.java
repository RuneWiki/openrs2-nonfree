import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class107 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public final int anInt3900;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class107(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3900 = arg1;
	}

	@OriginalMember(owner = "client!fh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
