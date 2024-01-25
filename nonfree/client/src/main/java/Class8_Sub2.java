import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	public int anInt254;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
	public boolean method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean22) {
			return false;
		}
		@Pc(10) int local10 = this.anInt253 - this.anInt255;
		@Pc(16) int local16 = this.anInt256 - this.anInt254;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt255 * local10 - this.anInt254 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt255 - arg0;
			local54 = this.anInt254 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt257 * this.anInt257;
		} else if (local42 > local24) {
			local49 = this.anInt253 - arg0;
			local54 = this.anInt256 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt257 * this.anInt257;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt255 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt254 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt257 * this.anInt257;
		}
	}
}
