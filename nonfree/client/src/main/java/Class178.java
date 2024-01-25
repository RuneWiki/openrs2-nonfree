import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public final class Class178 {

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
	public final int anInt5665;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class178(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5665 = arg1;
	}

	@OriginalMember(owner = "client!kga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)I")
	public int method4367() {
		return this.anInt5665;
	}
}
