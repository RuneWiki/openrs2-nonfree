import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class127 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public final int anInt3829;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public final int anInt3831;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public final int anInt3832;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	public final int anInt3827;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIII)V")
	public Class127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3829 = arg3;
		this.anInt3831 = arg0;
		this.anInt3832 = arg2;
		this.anInt3827 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
