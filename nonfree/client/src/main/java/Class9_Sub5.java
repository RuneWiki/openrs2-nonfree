import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class9_Sub5 extends Class9 {

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
	public int anInt5909;

	@OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
	public int anInt5910;

	@OriginalMember(owner = "client!kia", name = "l", descriptor = "I")
	public int anInt5911;

	@OriginalMember(owner = "client!kia", name = "m", descriptor = "I")
	public int anInt5912;

	@OriginalMember(owner = "client!kia", name = "n", descriptor = "I")
	public int anInt5913;

	@OriginalMember(owner = "client!kia", name = "j", descriptor = "Z")
	public boolean aBoolean433 = false;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)Z")
	public boolean method5103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean433) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5912 - this.anInt5910;
		@Pc(16) int local16 = this.anInt5911 - this.anInt5909;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5910 * local10 - this.anInt5909 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5910 - arg0;
			local54 = this.anInt5909 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5913 * this.anInt5913;
		} else if (local42 > local24) {
			local49 = this.anInt5912 - arg0;
			local54 = this.anInt5911 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5913 * this.anInt5913;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5910 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5909 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5913 * this.anInt5913;
		}
	}
}
