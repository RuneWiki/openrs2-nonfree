import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class13_Sub8 extends Class13 {

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	public int anInt7177;

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
	public int anInt7178;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
	public int anInt7179;

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
	public int anInt7180;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
	public int anInt7181;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "Z")
	public boolean aBoolean591 = false;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z")
	public boolean method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean591) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7179 - this.anInt7180;
		@Pc(16) int local16 = this.anInt7177 - this.anInt7181;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7180 * local10 - this.anInt7181 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7180 - arg0;
			local54 = this.anInt7181 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7178 * this.anInt7178;
		} else if (local42 > local24) {
			local49 = this.anInt7179 - arg0;
			local54 = this.anInt7177 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7178 * this.anInt7178;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7180 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7181 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7178 * this.anInt7178;
		}
	}
}
