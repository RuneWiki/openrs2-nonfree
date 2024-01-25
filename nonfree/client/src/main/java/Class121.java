import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class121 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	public int anInt3393;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
	public int anInt3398;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	public int anInt3399;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public int anInt3403;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	public int anInt3404;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	public int anInt3406;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int anInt3408;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public int anInt3409;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public int anInt3402 = 128;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
	public int anInt3400 = 128;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	public int anInt3405;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I)V")
	public Class121(@OriginalArg(0) int arg0) {
		this.anInt3405 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIII)V")
	private Class121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3400 = arg2;
		this.anInt3405 = arg0;
		this.anInt3409 = arg4;
		this.anInt3404 = arg3;
		this.anInt3402 = arg1;
		this.anInt3399 = arg5;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lclient!fk;")
	public Class121 method2970() {
		return new Class121(this.anInt3405, this.anInt3402, this.anInt3400, this.anInt3404, this.anInt3409, this.anInt3399);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!fk;B)V")
	public void method2975(@OriginalArg(0) Class121 arg0) {
		this.anInt3399 = arg0.anInt3399;
		this.anInt3400 = arg0.anInt3400;
		this.anInt3402 = arg0.anInt3402;
		this.anInt3405 = arg0.anInt3405;
		this.anInt3409 = arg0.anInt3409;
		this.anInt3404 = arg0.anInt3404;
	}
}
