import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class79 {

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	public final int anInt1885;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class79(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1885 = arg1;
	}

	@OriginalMember(owner = "client!du", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
	public int method1705() {
		return this.anInt1885;
	}
}
