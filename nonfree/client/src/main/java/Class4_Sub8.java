import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
	public int anInt7125;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
	public int anInt7126;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
	public int anInt7127;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
	public int anInt7128;

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	public int anInt7129;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "Z")
	public boolean aBoolean779 = false;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Z")
	public boolean method5573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean779) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7125 - this.anInt7128;
		@Pc(16) int local16 = this.anInt7129 - this.anInt7127;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7128 * local10 - this.anInt7127 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7128 - arg0;
			local54 = this.anInt7127 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7126 * this.anInt7126;
		} else if (local42 > local24) {
			local49 = this.anInt7125 - arg0;
			local54 = this.anInt7129 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7126 * this.anInt7126;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7128 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7127 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7126 * this.anInt7126;
		}
	}
}
