import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
	public int anInt5418;

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
	public int anInt5419;

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
	public int anInt5420;

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "I")
	public int anInt5421;

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "Z")
	public boolean aBoolean411 = false;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Z")
	public boolean method4619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean411) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5421 - this.anInt5420;
		@Pc(16) int local16 = this.anInt5419 - this.anInt5417;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5420 * local10 - this.anInt5417 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5420 - arg0;
			local54 = this.anInt5417 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5418 * this.anInt5418;
		} else if (local42 > local24) {
			local49 = this.anInt5421 - arg0;
			local54 = this.anInt5419 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5418 * this.anInt5418;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5420 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5417 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5418 * this.anInt5418;
		}
	}
}
