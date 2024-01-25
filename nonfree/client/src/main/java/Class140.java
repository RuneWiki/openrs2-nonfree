import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class140 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public int anInt3309;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
	public int anInt3313;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	public int anInt3316;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	public int anInt3310 = 128;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public int anInt3315 = 128;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
	public int anInt3308;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(I)V")
	public Class140(@OriginalArg(0) int arg0) {
		this.anInt3308 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIII)V")
	private Class140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3310 = arg1;
		this.anInt3308 = arg0;
		this.anInt3315 = arg2;
		this.anInt3313 = arg3;
		this.anInt3309 = arg4;
		this.anInt3316 = arg5;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!gs;Z)V")
	public void method3064(@OriginalArg(0) Class140 arg0) {
		this.anInt3308 = arg0.anInt3308;
		this.anInt3316 = arg0.anInt3316;
		this.anInt3315 = arg0.anInt3315;
		this.anInt3310 = arg0.anInt3310;
		this.anInt3313 = arg0.anInt3313;
		this.anInt3309 = arg0.anInt3309;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Lclient!gs;")
	public Class140 method3066() {
		return new Class140(this.anInt3308, this.anInt3310, this.anInt3315, this.anInt3313, this.anInt3309, this.anInt3316);
	}
}
