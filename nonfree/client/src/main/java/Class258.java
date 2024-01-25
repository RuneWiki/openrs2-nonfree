import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class258 implements Interface26 {

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
	public final int anInt7564;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class258(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7564 = arg1;
	}

	@OriginalMember(owner = "client!nl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
