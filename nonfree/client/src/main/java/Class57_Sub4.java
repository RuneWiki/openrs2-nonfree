import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class57_Sub4 extends Class57 {

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public int anInt2882;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public int anInt2884;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public int anInt2886;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Z")
	public boolean aBoolean273 = false;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Z")
	public boolean method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean273) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2883 - this.anInt2885;
		@Pc(16) int local16 = this.anInt2882 - this.anInt2886;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2885 * local10 - this.anInt2886 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2885 - arg0;
			local54 = this.anInt2886 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2884 * this.anInt2884;
		} else if (local42 > local24) {
			local49 = this.anInt2883 - arg0;
			local54 = this.anInt2882 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2884 * this.anInt2884;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2885 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2886 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2884 * this.anInt2884;
		}
	}
}
