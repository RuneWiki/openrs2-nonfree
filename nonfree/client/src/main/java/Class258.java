import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class258 {

	@OriginalMember(owner = "client!os", name = "e", descriptor = "I")
	public final int anInt6855;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(II)V")
	public Class258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6855 = arg1;
	}

	@OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
