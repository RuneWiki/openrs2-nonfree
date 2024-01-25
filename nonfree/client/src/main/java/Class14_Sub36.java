import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class14_Sub36 extends Class14 {

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
	public int anInt6342 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	public int anInt6343 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	public int anInt6345 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
	public int anInt6350 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	public int anInt6340 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	public int anInt6347 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
	public int anInt6351 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
	public int anInt6353 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!br;")
	public final Class14_Sub5 aClass14_Sub5_1;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!br;)V")
	public Class14_Sub36(@OriginalArg(0) Class14_Sub5 arg0) {
		this.aClass14_Sub5_1 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Z")
	public boolean method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6340 <= arg0 && arg0 <= this.anInt6342 && arg1 >= this.anInt6343 && arg1 <= this.anInt6345) {
			return true;
		} else {
			return arg0 >= this.anInt6350 && arg0 <= this.anInt6353 && this.anInt6347 <= arg1 && this.anInt6351 >= arg1;
		}
	}
}
