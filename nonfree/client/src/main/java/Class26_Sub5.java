import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class26_Sub5 extends Class26 {

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
	public int anInt6862;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
	public int anInt6863;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
	public int anInt6864;

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
	public int anInt6865;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
	public int anInt6866;

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "Z")
	public boolean aBoolean508 = false;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)Z")
	public boolean method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean508) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6863 - this.anInt6866;
		@Pc(16) int local16 = this.anInt6862 - this.anInt6865;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6866 * local10 - this.anInt6865 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6866 - arg0;
			local54 = this.anInt6865 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6864 * this.anInt6864;
		} else if (local42 > local24) {
			local49 = this.anInt6863 - arg0;
			local54 = this.anInt6862 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6864 * this.anInt6864;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6866 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6865 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6864 * this.anInt6864;
		}
	}
}
