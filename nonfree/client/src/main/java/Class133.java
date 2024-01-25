import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class133 {

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
	public int anInt3870;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
	public int anInt3873;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
	public int anInt3876;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
	public int anInt3877;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
	public int anInt3878;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
	public int anInt3879;

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
	public int anInt3880;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
	public int anInt3881;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
	public int anInt3874 = 128;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
	public int anInt3882 = 128;

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
	public int anInt3871;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(I)V")
	public Class133(@OriginalArg(0) int arg0) {
		this.anInt3871 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(IIIIII)V")
	private Class133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3874 = arg2;
		this.anInt3882 = arg1;
		this.anInt3878 = arg3;
		this.anInt3879 = arg4;
		this.anInt3871 = arg0;
		this.anInt3873 = arg5;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)Lclient!hga;")
	public Class133 method3404() {
		return new Class133(this.anInt3871, this.anInt3882, this.anInt3874, this.anInt3878, this.anInt3879, this.anInt3873);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!hga;I)V")
	public void method3406(@OriginalArg(0) Class133 arg0) {
		this.anInt3878 = arg0.anInt3878;
		this.anInt3874 = arg0.anInt3874;
		this.anInt3882 = arg0.anInt3882;
		this.anInt3871 = arg0.anInt3871;
		this.anInt3879 = arg0.anInt3879;
		this.anInt3873 = arg0.anInt3873;
	}
}
