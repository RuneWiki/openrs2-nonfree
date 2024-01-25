import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class89 {

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	public final int anInt2489;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt2489 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
