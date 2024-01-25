import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class40_Sub8 extends Class40 {

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	public int anInt5478;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
	public int anInt5479;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	public int anInt5480;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
	public int anInt5481;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
	public int anInt5482;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "Z")
	public boolean aBoolean362 = false;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Z")
	public boolean method4367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean362) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5482 - this.anInt5480;
		@Pc(16) int local16 = this.anInt5478 - this.anInt5479;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5480 * local10 - this.anInt5479 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5480 - arg0;
			local54 = this.anInt5479 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5481 * this.anInt5481;
		} else if (local42 > local24) {
			local49 = this.anInt5482 - arg0;
			local54 = this.anInt5478 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5481 * this.anInt5481;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5480 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5479 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5481 * this.anInt5481;
		}
	}
}
