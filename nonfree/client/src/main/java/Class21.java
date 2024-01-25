import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public final class Class21 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
	public final int anInt787;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class21(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt787 = arg1;
	}

	@OriginalMember(owner = "client!bda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
