import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class276 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public final int anInt8148;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	public Class276(@OriginalArg(0) int arg0) {
		this.anInt8148 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
