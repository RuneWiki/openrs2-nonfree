import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class5_Sub31 extends Class5 {

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
	public int anInt4099 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
	public int anInt4104 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
	public int anInt4105 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
	public int anInt4110 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
	public int anInt4111 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
	public int anInt4109 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
	public int anInt4102 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
	public int anInt4112 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "Lclient!gk;")
	public final Class5_Sub18 aClass5_Sub18_1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class5_Sub31(@OriginalArg(0) Class5_Sub18 arg0) {
		this.aClass5_Sub18_1 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)Z")
	public boolean method3700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4104 <= arg0 && arg0 <= this.anInt4109 && this.anInt4102 <= arg1 && arg1 <= this.anInt4111) {
			return true;
		} else {
			return this.anInt4099 <= arg0 && arg0 <= this.anInt4105 && arg1 >= this.anInt4110 && this.anInt4112 >= arg1;
		}
	}
}
