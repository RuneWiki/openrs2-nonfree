import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
	public int anInt8404;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
	public int anInt8405;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	public int anInt8406;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
	public int anInt8407;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
	public int anInt8408;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Z")
	public boolean aBoolean558 = false;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Z")
	public boolean method7226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean558) {
			return false;
		}
		@Pc(10) int local10 = this.anInt8406 - this.anInt8408;
		@Pc(16) int local16 = this.anInt8404 - this.anInt8405;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt8408 * local10 - this.anInt8405 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt8408 - arg0;
			local54 = this.anInt8405 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8407 * this.anInt8407;
		} else if (local42 > local24) {
			local49 = this.anInt8406 - arg0;
			local54 = this.anInt8404 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8407 * this.anInt8407;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt8408 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt8405 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8407 * this.anInt8407;
		}
	}
}
