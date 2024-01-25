import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
	public int anInt6178;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
	public int anInt6179;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
	public int anInt6180;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
	public int anInt6181;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "Z")
	public boolean aBoolean456 = false;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
	public boolean method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean456) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6178 - this.anInt6180;
		@Pc(16) int local16 = this.anInt6179 - this.anInt6177;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6180 * local10 - this.anInt6177 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6180 - arg0;
			local54 = this.anInt6177 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6181 * this.anInt6181;
		} else if (local42 > local24) {
			local49 = this.anInt6178 - arg0;
			local54 = this.anInt6179 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6181 * this.anInt6181;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6180 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6177 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6181 * this.anInt6181;
		}
	}
}
