import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class308 {

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
	public final int anInt9154;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(I)V")
	public Class308(@OriginalArg(0) int arg0) {
		this.anInt9154 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
