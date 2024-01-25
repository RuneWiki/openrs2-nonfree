import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class33 {

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	public final int anInt1080;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(II)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1080 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
