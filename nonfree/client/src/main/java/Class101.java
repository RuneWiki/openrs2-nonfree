import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class101 implements Interface7 {

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	public final int anInt2705;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class101(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2705 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
