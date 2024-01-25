import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class38_Sub4 extends Class38 {

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
	public int anInt2397;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
	public int anInt2398;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
	public int anInt2399;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
	public int anInt2400;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
	public int anInt2401;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Z")
	public boolean method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean201) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2401 - this.anInt2397;
		@Pc(16) int local16 = this.anInt2400 - this.anInt2399;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2397 * local10 - this.anInt2399 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2397 - arg0;
			local54 = this.anInt2399 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2398 * this.anInt2398;
		} else if (local42 > local24) {
			local49 = this.anInt2401 - arg0;
			local54 = this.anInt2400 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2398 * this.anInt2398;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2397 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2399 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2398 * this.anInt2398;
		}
	}
}
