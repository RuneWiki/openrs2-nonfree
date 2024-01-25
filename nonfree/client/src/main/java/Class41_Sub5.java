import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class41_Sub5 extends Class41 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	public int anInt5234;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	public int anInt5235;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
	public int anInt5236;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public int anInt5237;

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Z")
	public boolean aBoolean494 = false;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z")
	public boolean method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean494) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5238 - this.anInt5236;
		@Pc(16) int local16 = this.anInt5237 - this.anInt5235;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5236 * local10 - this.anInt5235 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5236 - arg0;
			local54 = this.anInt5235 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5234 * this.anInt5234;
		} else if (local42 > local24) {
			local49 = this.anInt5238 - arg0;
			local54 = this.anInt5237 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5234 * this.anInt5234;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5236 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5235 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5234 * this.anInt5234;
		}
	}
}
