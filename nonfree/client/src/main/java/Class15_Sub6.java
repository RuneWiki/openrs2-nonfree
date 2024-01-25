import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class15_Sub6 extends Class15 {

	@OriginalMember(owner = "client!im", name = "i", descriptor = "I")
	public int anInt5262;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "I")
	public int anInt5263;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "I")
	public int anInt5264;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "I")
	public int anInt5265;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "I")
	public int anInt5266;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
	public boolean aBoolean394 = false;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Z")
	public boolean method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean394) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5262 - this.anInt5263;
		@Pc(16) int local16 = this.anInt5266 - this.anInt5265;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5263 * local10 - this.anInt5265 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5263 - arg0;
			local54 = this.anInt5265 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5264 * this.anInt5264;
		} else if (local42 > local24) {
			local49 = this.anInt5262 - arg0;
			local54 = this.anInt5266 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5264 * this.anInt5264;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5263 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5265 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5264 * this.anInt5264;
		}
	}
}
