import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class135 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	public final int anInt4001;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class135(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4001 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
