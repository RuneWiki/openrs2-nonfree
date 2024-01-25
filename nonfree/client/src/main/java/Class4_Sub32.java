import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
	public int anInt4677 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	public int anInt4675 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
	public int anInt4682 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
	public int anInt4684 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
	public int anInt4683 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	public int anInt4678 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	public int anInt4676 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
	public int anInt4685 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "Lclient!dt;")
	public final Class4_Sub12 aClass4_Sub12_1;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class4_Sub32(@OriginalArg(0) Class4_Sub12 arg0) {
		this.aClass4_Sub12_1 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
	public boolean method3725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4677 <= arg1 && arg1 <= this.anInt4682 && this.anInt4683 <= arg0 && this.anInt4676 >= arg0) {
			return true;
		} else {
			return this.anInt4675 <= arg1 && this.anInt4684 >= arg1 && this.anInt4678 <= arg0 && this.anInt4685 >= arg0;
		}
	}
}
