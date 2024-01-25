import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class63_Sub7 extends Class63 {

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	public int anInt6029;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public int anInt6030;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	public int anInt6031;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	public int anInt6032;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public int anInt6033;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
	public boolean method5374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean453) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6031 - this.anInt6032;
		@Pc(16) int local16 = this.anInt6029 - this.anInt6030;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6032 * local10 - this.anInt6030 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6032 - arg0;
			local54 = this.anInt6030 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6033 * this.anInt6033;
		} else if (local42 > local24) {
			local49 = this.anInt6031 - arg0;
			local54 = this.anInt6029 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6033 * this.anInt6033;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6032 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6030 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6033 * this.anInt6033;
		}
	}
}
