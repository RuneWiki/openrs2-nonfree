import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public final class Class261 {

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	public final int anInt8160;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(I)V")
	public Class261(@OriginalArg(0) int arg0) {
		this.anInt8160 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
