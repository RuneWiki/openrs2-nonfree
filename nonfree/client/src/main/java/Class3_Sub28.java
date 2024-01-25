import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public final class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!gha", name = "o", descriptor = "I")
	public int anInt3871 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gha", name = "r", descriptor = "I")
	public int anInt3874 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gha", name = "t", descriptor = "I")
	public int anInt3876 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gha", name = "s", descriptor = "I")
	public int anInt3875 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gha", name = "x", descriptor = "I")
	public int anInt3879 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gha", name = "u", descriptor = "I")
	public int anInt3877 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gha", name = "y", descriptor = "I")
	public int anInt3880 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gha", name = "w", descriptor = "I")
	public int anInt3878 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gha", name = "v", descriptor = "Lclient!dm;")
	public final Class3_Sub18 aClass3_Sub18_1;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!dm;)V")
	public Class3_Sub28(@OriginalArg(0) Class3_Sub18 arg0) {
		this.aClass3_Sub18_1 = arg0;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IBI)Z")
	public boolean method3547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt3877 && arg1 <= this.anInt3871 && this.anInt3878 <= arg0 && this.anInt3874 >= arg0) {
			return true;
		} else {
			return this.anInt3880 <= arg1 && arg1 <= this.anInt3875 && this.anInt3876 <= arg0 && this.anInt3879 >= arg0;
		}
	}
}
