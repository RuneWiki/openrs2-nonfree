import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class59 {

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	public final int anInt1121;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public Class59(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		this.anInt1121 = arg3;
	}

	@OriginalMember(owner = "client!cg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
