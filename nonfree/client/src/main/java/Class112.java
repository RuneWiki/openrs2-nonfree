import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class112 {

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
	public final int anInt3348;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
	public final int anInt3350;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
	public final int anInt3347;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	public final int anInt3346;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIII)V")
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3348 = arg1;
		this.anInt3350 = arg2;
		this.anInt3347 = arg0;
		this.anInt3346 = arg3;
	}

	@OriginalMember(owner = "client!fv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
