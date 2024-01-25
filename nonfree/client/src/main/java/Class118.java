import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class118 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public final int anInt3562;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3562 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
