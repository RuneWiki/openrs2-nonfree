import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class5_Sub34 extends Class5 {

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
	public int anInt5207 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
	public int anInt5211 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
	public int anInt5214 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
	public int anInt5210 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
	public int anInt5217 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
	public int anInt5209 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
	public int anInt5218 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
	public int anInt5219 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "Lclient!qg;")
	public final Class5_Sub32 aClass5_Sub32_1;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class5_Sub34(@OriginalArg(0) Class5_Sub32 arg0) {
		this.aClass5_Sub32_1 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)Z")
	public boolean method4666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5219 <= arg1 && this.anInt5218 >= arg1 && this.anInt5217 <= arg0 && arg0 <= this.anInt5210) {
			return true;
		} else {
			return arg1 >= this.anInt5214 && this.anInt5209 >= arg1 && arg0 >= this.anInt5211 && arg0 <= this.anInt5207;
		}
	}
}
