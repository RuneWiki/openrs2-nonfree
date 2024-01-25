import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class21_Sub7 extends Class21 {

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	public int anInt5998;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
	public int anInt5999;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
	public int anInt6000;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
	public int anInt6001;

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
	public int anInt6002;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Z")
	public boolean aBoolean436 = false;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)Z")
	public boolean method4686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean436) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6000 - this.anInt5998;
		@Pc(16) int local16 = this.anInt6001 - this.anInt6002;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5998 * local10 - this.anInt6002 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5998 - arg0;
			local54 = this.anInt6002 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5999 * this.anInt5999;
		} else if (local42 > local24) {
			local49 = this.anInt6000 - arg0;
			local54 = this.anInt6001 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5999 * this.anInt5999;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5998 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6002 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5999 * this.anInt5999;
		}
	}
}
