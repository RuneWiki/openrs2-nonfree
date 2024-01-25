import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class41_Sub9 extends Class41 {

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
	public int anInt8962;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
	public int anInt8963;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
	public int anInt8964;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
	public int anInt8965;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
	public int anInt8966;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Z")
	public boolean aBoolean648 = false;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
	public boolean method7548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean648) {
			return false;
		}
		@Pc(10) int local10 = this.anInt8964 - this.anInt8965;
		@Pc(16) int local16 = this.anInt8963 - this.anInt8966;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt8965 * local10 - this.anInt8966 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt8965 - arg0;
			local54 = this.anInt8966 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8962 * this.anInt8962;
		} else if (local42 > local24) {
			local49 = this.anInt8964 - arg0;
			local54 = this.anInt8963 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8962 * this.anInt8962;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt8965 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt8966 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8962 * this.anInt8962;
		}
	}
}
