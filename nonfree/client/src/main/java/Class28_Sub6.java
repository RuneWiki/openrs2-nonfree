import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class28_Sub6 extends Class28 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	public int anInt5224;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public int anInt5225;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	public int anInt5226;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public int anInt5227;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	public int anInt5228;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Z")
	public boolean aBoolean336 = false;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Z")
	public boolean method4213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean336) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5224 - this.anInt5225;
		@Pc(16) int local16 = this.anInt5227 - this.anInt5228;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5225 * local10 - this.anInt5228 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5225 - arg0;
			local54 = this.anInt5228 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5226 * this.anInt5226;
		} else if (local42 > local24) {
			local49 = this.anInt5224 - arg0;
			local54 = this.anInt5227 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5226 * this.anInt5226;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5225 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5228 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5226 * this.anInt5226;
		}
	}
}
