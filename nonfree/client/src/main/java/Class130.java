import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class130 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
	public int anInt3332;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
	public int anInt3333;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
	public int anInt3335;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	public int anInt3338;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	public int anInt3339;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
	public int anInt3342;

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
	public int anInt3344;

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
	public int anInt3345;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
	public int anInt3334 = 128;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
	public int anInt3341 = 128;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
	public int anInt3340;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(I)V")
	public Class130(@OriginalArg(0) int arg0) {
		this.anInt3340 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIII)V")
	private Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3345 = arg4;
		this.anInt3339 = arg5;
		this.anInt3335 = arg3;
		this.anInt3340 = arg0;
		this.anInt3334 = arg1;
		this.anInt3341 = arg2;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLclient!gv;)V")
	public void method2803(@OriginalArg(1) Class130 arg0) {
		this.anInt3345 = arg0.anInt3345;
		this.anInt3335 = arg0.anInt3335;
		this.anInt3341 = arg0.anInt3341;
		this.anInt3334 = arg0.anInt3334;
		this.anInt3340 = arg0.anInt3340;
		this.anInt3339 = arg0.anInt3339;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Lclient!gv;")
	public Class130 method2807() {
		return new Class130(this.anInt3340, this.anInt3334, this.anInt3341, this.anInt3335, this.anInt3345, this.anInt3339);
	}
}
