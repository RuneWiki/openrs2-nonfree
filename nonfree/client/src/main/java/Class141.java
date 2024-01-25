import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class141 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public int anInt3909;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
	public int anInt3914;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
	public int anInt3912 = 128;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public int anInt3911 = 128;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
	public Class141(@OriginalArg(0) int arg0) {
		this.anInt3915 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIII)V")
	private Class141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3912 = arg2;
		this.anInt3915 = arg0;
		this.anInt3909 = arg3;
		this.anInt3914 = arg4;
		this.anInt3908 = arg5;
		this.anInt3911 = arg1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Lclient!gr;")
	public Class141 method3327() {
		return new Class141(this.anInt3915, this.anInt3911, this.anInt3912, this.anInt3909, this.anInt3914, this.anInt3908);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!gr;)V")
	public void method3328(@OriginalArg(1) Class141 arg0) {
		this.anInt3914 = arg0.anInt3914;
		this.anInt3911 = arg0.anInt3911;
		this.anInt3908 = arg0.anInt3908;
		this.anInt3915 = arg0.anInt3915;
		this.anInt3909 = arg0.anInt3909;
		this.anInt3912 = arg0.anInt3912;
	}
}
