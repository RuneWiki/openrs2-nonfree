import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public final class Class260 implements Interface21 {

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
	public final int anInt6560;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class260(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6560 = arg1;
	}

	@OriginalMember(owner = "client!ow", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
