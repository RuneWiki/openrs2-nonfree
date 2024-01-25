import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class23_Sub6 extends Class23 {

	@OriginalMember(owner = "client!st", name = "l", descriptor = "I")
	public int anInt6474;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	public int anInt6475;

	@OriginalMember(owner = "client!st", name = "o", descriptor = "I")
	public int anInt6476;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	public int anInt6477;

	@OriginalMember(owner = "client!st", name = "q", descriptor = "I")
	public int anInt6478;

	@OriginalMember(owner = "client!st", name = "n", descriptor = "Z")
	public boolean aBoolean442 = false;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)Z")
	public boolean method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean442) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6478 - this.anInt6475;
		@Pc(16) int local16 = this.anInt6474 - this.anInt6476;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6475 * local10 - this.anInt6476 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6475 - arg0;
			local54 = this.anInt6476 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6477 * this.anInt6477;
		} else if (local42 > local24) {
			local49 = this.anInt6478 - arg0;
			local54 = this.anInt6474 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6477 * this.anInt6477;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6475 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6476 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6477 * this.anInt6477;
		}
	}
}
