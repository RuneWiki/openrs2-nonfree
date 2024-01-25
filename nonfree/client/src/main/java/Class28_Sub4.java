import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class28_Sub4 extends Class28 {

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public int anInt3687;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	public int anInt3688;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public int anInt3689;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
	public int anInt3690;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
	public int anInt3691;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Z")
	public boolean method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean246) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3689 - this.anInt3690;
		@Pc(16) int local16 = this.anInt3691 - this.anInt3687;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3690 * local10 - this.anInt3687 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3690 - arg0;
			local54 = this.anInt3687 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3688 * this.anInt3688;
		} else if (local42 > local24) {
			local49 = this.anInt3689 - arg0;
			local54 = this.anInt3691 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3688 * this.anInt3688;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3690 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3687 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3688 * this.anInt3688;
		}
	}
}
