import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class350 implements Interface10 {

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
	public final int anInt10371;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class350(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt10371 = arg1;
	}

	@OriginalMember(owner = "client!uw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
