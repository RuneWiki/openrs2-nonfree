import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class131 {

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public final int anInt3722;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	public final int anInt3721;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
	public final int anInt3716;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
	public final int anInt3720;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIII)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3722 = arg2;
		this.anInt3721 = arg1;
		this.anInt3716 = arg3;
		this.anInt3720 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)Lclient!kk;")
	public Class131 method3199(@OriginalArg(0) int arg0) {
		return new Class131(this.anInt3720, arg0, this.anInt3722, this.anInt3716);
	}
}
