import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class14_Sub9 extends Class14 {

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public int anInt9894;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public int anInt9895;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	public int anInt9896;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
	public int anInt9897;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
	public int anInt9898;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Z")
	public boolean aBoolean809 = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Z")
	public boolean method8419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean809) {
			return false;
		}
		@Pc(10) int local10 = this.anInt9896 - this.anInt9898;
		@Pc(16) int local16 = this.anInt9894 - this.anInt9897;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt9898 * local10 - this.anInt9897 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt9898 - arg0;
			local54 = this.anInt9897 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt9895 * this.anInt9895;
		} else if (local42 > local24) {
			local49 = this.anInt9896 - arg0;
			local54 = this.anInt9894 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt9895 * this.anInt9895;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt9898 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt9897 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt9895 * this.anInt9895;
		}
	}
}
