import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public int anInt1435;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public int anInt1436;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	public int anInt1437;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Z")
	public boolean method1482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean109) {
			return false;
		}
		@Pc(10) int local10 = this.anInt1437 - this.anInt1433;
		@Pc(16) int local16 = this.anInt1434 - this.anInt1435;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt1433 * local10 - this.anInt1435 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt1433 - arg0;
			local54 = this.anInt1435 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt1436 * this.anInt1436;
		} else if (local42 > local24) {
			local49 = this.anInt1437 - arg0;
			local54 = this.anInt1434 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt1436 * this.anInt1436;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt1433 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt1435 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt1436 * this.anInt1436;
		}
	}
}
