import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class55_Sub4 extends Class55 {

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public int anInt3333;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public int anInt3334;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public int anInt3335;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public int anInt3336;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public int anInt3337;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Z")
	public boolean method3090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean300) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3335 - this.anInt3333;
		@Pc(16) int local16 = this.anInt3337 - this.anInt3334;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3333 * local10 - this.anInt3334 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3333 - arg0;
			local54 = this.anInt3334 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3336 * this.anInt3336;
		} else if (local42 > local24) {
			local49 = this.anInt3335 - arg0;
			local54 = this.anInt3337 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3336 * this.anInt3336;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3333 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3334 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3336 * this.anInt3336;
		}
	}
}
