import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)Z")
	public boolean method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean37) {
			return false;
		}
		@Pc(10) int local10 = this.anInt532 - this.anInt531;
		@Pc(16) int local16 = this.anInt529 - this.anInt528;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt531 * local10 - this.anInt528 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt531 - arg0;
			local54 = this.anInt528 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt530 * this.anInt530;
		} else if (local42 > local24) {
			local49 = this.anInt532 - arg0;
			local54 = this.anInt529 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt530 * this.anInt530;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt531 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt528 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt530 * this.anInt530;
		}
	}
}
