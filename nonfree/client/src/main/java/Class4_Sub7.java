import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
	public int anInt8047;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
	public int anInt8048;

	@OriginalMember(owner = "client!sda", name = "p", descriptor = "I")
	public int anInt8049;

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
	public int anInt8050;

	@OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
	public int anInt8051;

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "Z")
	public boolean aBoolean573 = false;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Z")
	public boolean method6656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean573) {
			return false;
		}
		@Pc(10) int local10 = this.anInt8047 - this.anInt8049;
		@Pc(16) int local16 = this.anInt8051 - this.anInt8050;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt8049 * local10 - this.anInt8050 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt8049 - arg0;
			local54 = this.anInt8050 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8048 * this.anInt8048;
		} else if (local42 > local24) {
			local49 = this.anInt8047 - arg0;
			local54 = this.anInt8051 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8048 * this.anInt8048;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt8049 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt8050 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8048 * this.anInt8048;
		}
	}
}
