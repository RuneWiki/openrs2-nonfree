import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class79 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public final int anInt2048;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(I)V")
	public Class79(@OriginalArg(0) int arg0) {
		this.anInt2048 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
