import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public int anInt97 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	public int anInt98 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
	public int anInt99 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public int anInt95 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
	public int anInt103 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	public int anInt102 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	public int anInt104 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	public int anInt107 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!su;")
	public final Class3_Sub46 aClass3_Sub46_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!su;)V")
	public Class3_Sub3(@OriginalArg(0) Class3_Sub46 arg0) {
		this.aClass3_Sub46_1 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
	public boolean method119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt99 <= arg0 && this.anInt103 >= arg0 && this.anInt104 <= arg1 && this.anInt95 >= arg1) {
			return true;
		} else {
			return this.anInt98 <= arg0 && this.anInt107 >= arg0 && arg1 >= this.anInt102 && arg1 <= this.anInt97;
		}
	}
}
