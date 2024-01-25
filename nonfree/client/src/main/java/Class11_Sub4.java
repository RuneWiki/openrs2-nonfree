import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	public int anInt2554;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	public int anInt2555;

	@OriginalMember(owner = "client!et", name = "l", descriptor = "I")
	public int anInt2556;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	public int anInt2557;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "I")
	public int anInt2558;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "Z")
	public boolean aBoolean195 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Z")
	public boolean method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean195) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2558 - this.anInt2556;
		@Pc(16) int local16 = this.anInt2557 - this.anInt2554;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2556 * local10 - this.anInt2554 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2556 - arg0;
			local54 = this.anInt2554 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2555 * this.anInt2555;
		} else if (local42 > local24) {
			local49 = this.anInt2558 - arg0;
			local54 = this.anInt2557 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2555 * this.anInt2555;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2556 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2554 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2555 * this.anInt2555;
		}
	}
}
