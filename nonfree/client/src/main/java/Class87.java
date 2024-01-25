import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class87 {

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public final int anInt2365;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
	public Class87(@OriginalArg(0) int arg0) {
		this.anInt2365 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
