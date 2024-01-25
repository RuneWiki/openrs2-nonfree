import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
	public int anInt6922;

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
	public int anInt6923;

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
	public int anInt6924;

	@OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
	public int anInt6925;

	@OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
	public int anInt6926;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "Z")
	public boolean aBoolean539 = false;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)Z")
	public boolean method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean539) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6926 - this.anInt6925;
		@Pc(16) int local16 = this.anInt6923 - this.anInt6922;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6925 * local10 - this.anInt6922 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6925 - arg0;
			local54 = this.anInt6922 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6924 * this.anInt6924;
		} else if (local42 > local24) {
			local49 = this.anInt6926 - arg0;
			local54 = this.anInt6923 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6924 * this.anInt6924;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6925 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6922 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6924 * this.anInt6924;
		}
	}
}
