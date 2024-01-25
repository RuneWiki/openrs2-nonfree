import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class342 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public final int anInt9214;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	public final int anInt9218;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public final int anInt9216;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public final int anInt9219;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIII)V")
	public Class342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9214 = arg0;
		this.anInt9218 = arg3;
		this.anInt9216 = arg2;
		this.anInt9219 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
