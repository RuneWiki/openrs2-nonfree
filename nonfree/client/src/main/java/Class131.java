import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class131 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
	public int anInt3745;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
	public int anInt3747;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
	public int anInt3752;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	public int anInt3750 = 128;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
	public int anInt3754 = 128;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
	public int anInt3746;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(I)V")
	public Class131(@OriginalArg(0) int arg0) {
		this.anInt3746 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIII)V")
	private Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3747 = arg4;
		this.anInt3754 = arg2;
		this.anInt3752 = arg3;
		this.anInt3750 = arg1;
		this.anInt3746 = arg0;
		this.anInt3745 = arg5;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!gv;I)V")
	public void method2950(@OriginalArg(0) Class131 arg0) {
		this.anInt3747 = arg0.anInt3747;
		this.anInt3745 = arg0.anInt3745;
		this.anInt3752 = arg0.anInt3752;
		this.anInt3750 = arg0.anInt3750;
		this.anInt3746 = arg0.anInt3746;
		this.anInt3754 = arg0.anInt3754;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Lclient!gv;")
	public Class131 method2952() {
		return new Class131(this.anInt3746, this.anInt3750, this.anInt3754, this.anInt3752, this.anInt3747, this.anInt3745);
	}
}
