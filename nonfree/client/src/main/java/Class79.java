import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class79 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
	public final int anInt2185;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
	public Class79(@OriginalArg(0) int arg0) {
		this.anInt2185 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
