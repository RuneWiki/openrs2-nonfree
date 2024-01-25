import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class32_Sub8 extends Class32 {

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public int anInt6218;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public int anInt6219;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public int anInt6220;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	public int anInt6221;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
	public int anInt6222;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Z")
	public boolean aBoolean520 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Z")
	public boolean method5580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean520) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6222 - this.anInt6219;
		@Pc(16) int local16 = this.anInt6218 - this.anInt6220;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6219 * local10 - this.anInt6220 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6219 - arg0;
			local54 = this.anInt6220 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6221 * this.anInt6221;
		} else if (local42 > local24) {
			local49 = this.anInt6222 - arg0;
			local54 = this.anInt6218 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6221 * this.anInt6221;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6219 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6220 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6221 * this.anInt6221;
		}
	}
}
