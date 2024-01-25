import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class30_Sub6 extends Class30 {

	@OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
	public int anInt6881;

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "I")
	public int anInt6882;

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
	public int anInt6883;

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
	public int anInt6884;

	@OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
	public int anInt6885;

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "Z")
	public boolean aBoolean481 = false;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)Z")
	public boolean method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean481) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6884 - this.anInt6882;
		@Pc(16) int local16 = this.anInt6883 - this.anInt6885;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6882 * local10 - this.anInt6885 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6882 - arg0;
			local54 = this.anInt6885 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6881 * this.anInt6881;
		} else if (local42 > local24) {
			local49 = this.anInt6884 - arg0;
			local54 = this.anInt6883 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6881 * this.anInt6881;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6882 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6885 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6881 * this.anInt6881;
		}
	}
}
