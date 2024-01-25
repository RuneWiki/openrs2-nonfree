import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class93 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public final int anInt2627;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class93(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2627 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
