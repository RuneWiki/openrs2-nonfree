import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class10_Sub8 extends Class10 {

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
	public int anInt6379;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public int anInt6380;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	public int anInt6381;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public int anInt6382;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public int anInt6383;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Z")
	public boolean aBoolean415 = false;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)Z")
	public boolean method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean415) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6382 - this.anInt6379;
		@Pc(16) int local16 = this.anInt6381 - this.anInt6380;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6379 * local10 - this.anInt6380 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6379 - arg0;
			local54 = this.anInt6380 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6383 * this.anInt6383;
		} else if (local42 > local24) {
			local49 = this.anInt6382 - arg0;
			local54 = this.anInt6381 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6383 * this.anInt6383;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6379 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6380 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6383 * this.anInt6383;
		}
	}
}
