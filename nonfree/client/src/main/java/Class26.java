import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class26 implements Interface6 {

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
	public final int anInt1011;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class26(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1011 = arg1;
	}

	@OriginalMember(owner = "client!bca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
