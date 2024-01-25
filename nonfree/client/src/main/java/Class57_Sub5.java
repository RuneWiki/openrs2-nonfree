import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class57_Sub5 extends Class57 {

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public int anInt4037;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	public int anInt4039;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	public int anInt4040;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Z")
	public boolean aBoolean267 = false;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	public boolean method3355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean267) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4041 - this.anInt4037;
		@Pc(16) int local16 = this.anInt4040 - this.anInt4038;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4037 * local10 - this.anInt4038 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4037 - arg0;
			local54 = this.anInt4038 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4039 * this.anInt4039;
		} else if (local42 > local24) {
			local49 = this.anInt4041 - arg0;
			local54 = this.anInt4040 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4039 * this.anInt4039;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4037 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4038 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4039 * this.anInt4039;
		}
	}
}
