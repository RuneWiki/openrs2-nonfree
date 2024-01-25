import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class213 implements Interface8 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
	public final int anInt5477;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class213(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5477 = arg1;
	}

	@OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
