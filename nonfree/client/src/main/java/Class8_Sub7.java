import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class8_Sub7 extends Class8 {

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	public int anInt6698;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	public int anInt6699;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	public int anInt6700;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public int anInt6701;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	public int anInt6702;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Z")
	public boolean aBoolean519 = false;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Z")
	public boolean method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean519) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6701 - this.anInt6699;
		@Pc(16) int local16 = this.anInt6702 - this.anInt6698;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6699 * local10 - this.anInt6698 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6699 - arg0;
			local54 = this.anInt6698 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6700 * this.anInt6700;
		} else if (local42 > local24) {
			local49 = this.anInt6701 - arg0;
			local54 = this.anInt6702 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6700 * this.anInt6700;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6699 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6698 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6700 * this.anInt6700;
		}
	}
}
