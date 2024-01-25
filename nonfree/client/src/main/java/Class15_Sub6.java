import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class15_Sub6 extends Class15 {

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public int anInt2724;

	@OriginalMember(owner = "client!et", name = "l", descriptor = "I")
	public int anInt2725;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	public int anInt2726;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "I")
	public int anInt2727;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "Z")
	public boolean aBoolean200 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Z")
	public boolean method2536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean200) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2726 - this.anInt2727;
		@Pc(16) int local16 = this.anInt2725 - this.anInt2728;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2727 * local10 - this.anInt2728 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2727 - arg0;
			local54 = this.anInt2728 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2724 * this.anInt2724;
		} else if (local42 > local24) {
			local49 = this.anInt2726 - arg0;
			local54 = this.anInt2725 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2724 * this.anInt2724;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2727 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2728 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2724 * this.anInt2724;
		}
	}
}
