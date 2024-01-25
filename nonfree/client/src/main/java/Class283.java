import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class283 {

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public final int anInt6971;

	static {
		new Class222("", 73);
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V")
	public Class283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6971 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
