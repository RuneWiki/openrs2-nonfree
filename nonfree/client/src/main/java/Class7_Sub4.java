import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public int anInt5258;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	public int anInt5259;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public int anInt5260;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public int anInt5261;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public int anInt5262;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
	public boolean aBoolean404 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Z")
	public boolean method4405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean404) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5262 - this.anInt5261;
		@Pc(16) int local16 = this.anInt5259 - this.anInt5260;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5261 * local10 - this.anInt5260 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5261 - arg0;
			local54 = this.anInt5260 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5258 * this.anInt5258;
		} else if (local42 > local24) {
			local49 = this.anInt5262 - arg0;
			local54 = this.anInt5259 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5258 * this.anInt5258;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5261 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5260 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5258 * this.anInt5258;
		}
	}
}
