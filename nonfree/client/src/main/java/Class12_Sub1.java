import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	public int anInt80;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	public int anInt83;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
	public int anInt84;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
	public boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Z")
	public boolean method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean6) {
			return false;
		}
		@Pc(10) int local10 = this.anInt84 - this.anInt80;
		@Pc(16) int local16 = this.anInt82 - this.anInt83;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt80 * local10 - this.anInt83 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt80 - arg0;
			local54 = this.anInt83 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt81 * this.anInt81;
		} else if (local42 > local24) {
			local49 = this.anInt84 - arg0;
			local54 = this.anInt82 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt81 * this.anInt81;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt80 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt83 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt81 * this.anInt81;
		}
	}
}
