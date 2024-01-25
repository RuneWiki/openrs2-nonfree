import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class318 implements Interface1 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public final int anInt8037;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class318(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8037 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
