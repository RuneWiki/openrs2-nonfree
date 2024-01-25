import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class99 {

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	public final int anInt2588;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(II)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2588 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
