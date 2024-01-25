import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!au", name = "f", descriptor = "I")
	public int anInt603;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	public int anInt604;

	@OriginalMember(owner = "client!au", name = "h", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "I")
	public int anInt606;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "I")
	public int anInt607;

	@OriginalMember(owner = "client!au", name = "i", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
	public boolean method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean48) {
			return false;
		}
		@Pc(10) int local10 = this.anInt605 - this.anInt603;
		@Pc(16) int local16 = this.anInt607 - this.anInt604;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt603 * local10 - this.anInt604 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt603 - arg0;
			local54 = this.anInt604 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt606 * this.anInt606;
		} else if (local42 > local24) {
			local49 = this.anInt605 - arg0;
			local54 = this.anInt607 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt606 * this.anInt606;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt603 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt604 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt606 * this.anInt606;
		}
	}
}
