import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	public int anInt6297;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	public int anInt6298;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	public int anInt6299;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
	public int anInt6300;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
	public int anInt6301;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "Z")
	public boolean aBoolean461 = false;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
	public boolean method5357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean461) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6301 - this.anInt6297;
		@Pc(16) int local16 = this.anInt6300 - this.anInt6299;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6297 * local10 - this.anInt6299 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6297 - arg0;
			local54 = this.anInt6299 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6298 * this.anInt6298;
		} else if (local42 > local24) {
			local49 = this.anInt6301 - arg0;
			local54 = this.anInt6300 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6298 * this.anInt6298;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6297 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6299 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6298 * this.anInt6298;
		}
	}
}
