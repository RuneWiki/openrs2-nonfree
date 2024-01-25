import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class20_Sub8 extends Class20 {

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	public int anInt5625;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public int anInt5626;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
	public int anInt5627;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	public int anInt5628;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	public int anInt5629;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "Z")
	public boolean aBoolean384 = false;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z")
	public boolean method5104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean384) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5629 - this.anInt5628;
		@Pc(16) int local16 = this.anInt5625 - this.anInt5626;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5628 * local10 - this.anInt5626 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5628 - arg0;
			local54 = this.anInt5626 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5627 * this.anInt5627;
		} else if (local42 > local24) {
			local49 = this.anInt5629 - arg0;
			local54 = this.anInt5625 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5627 * this.anInt5627;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5628 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5626 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5627 * this.anInt5627;
		}
	}
}
