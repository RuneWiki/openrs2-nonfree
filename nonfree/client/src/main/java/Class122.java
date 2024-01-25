import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class122 implements Interface18 {

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	public final int anInt4143;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class122(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4143 = arg1;
	}

	@OriginalMember(owner = "client!gm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
