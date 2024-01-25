import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class28_Sub8 extends Class28 {

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "I")
	public int anInt9149;

	@OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
	public int anInt9150;

	@OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
	public int anInt9151;

	@OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
	public int anInt9152;

	@OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
	public int anInt9153;

	@OriginalMember(owner = "client!taa", name = "t", descriptor = "Z")
	public boolean aBoolean716 = false;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Z")
	public boolean method7998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean716) {
			return false;
		}
		@Pc(10) int local10 = this.anInt9153 - this.anInt9151;
		@Pc(16) int local16 = this.anInt9150 - this.anInt9152;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt9151 * local10 - this.anInt9152 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt9151 - arg0;
			local54 = this.anInt9152 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt9149 * this.anInt9149;
		} else if (local42 > local24) {
			local49 = this.anInt9153 - arg0;
			local54 = this.anInt9150 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt9149 * this.anInt9149;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt9151 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt9152 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt9149 * this.anInt9149;
		}
	}
}
