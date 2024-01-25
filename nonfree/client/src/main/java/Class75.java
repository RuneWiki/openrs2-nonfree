import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class75 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public final int anInt1942;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class75(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1942 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)I")
	public int method1779() {
		return this.anInt1942;
	}
}
