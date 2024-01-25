import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public final class Class307 {

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
	public final int anInt8423;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(II)V")
	public Class307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8423 = arg1;
	}

	@OriginalMember(owner = "client!tca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
