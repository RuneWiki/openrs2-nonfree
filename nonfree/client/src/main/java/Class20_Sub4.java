import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
	public int anInt2367;

	@OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
	public int anInt2368;

	@OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
	public int anInt2369;

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
	public int anInt2370;

	@OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
	public int anInt2371;

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)Z")
	public boolean method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean175) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2370 - this.anInt2369;
		@Pc(16) int local16 = this.anInt2371 - this.anInt2368;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2369 * local10 - this.anInt2368 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2369 - arg0;
			local54 = this.anInt2368 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2367 * this.anInt2367;
		} else if (local42 > local24) {
			local49 = this.anInt2370 - arg0;
			local54 = this.anInt2371 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2367 * this.anInt2367;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2369 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2368 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2367 * this.anInt2367;
		}
	}
}
