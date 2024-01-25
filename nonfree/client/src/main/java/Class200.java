import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class200 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public final int anInt6064;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I)V")
	public Class200(@OriginalArg(0) int arg0) {
		this.anInt6064 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
