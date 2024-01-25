import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class121 {

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	public final int anInt3214;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public final int anInt3213;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	public final int anInt3217;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public final int anInt3215;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIII)V")
	public Class121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3214 = arg0;
		this.anInt3213 = arg2;
		this.anInt3217 = arg1;
		this.anInt3215 = arg3;
	}

	@OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
