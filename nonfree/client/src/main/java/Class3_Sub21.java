import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
	public int anInt3732 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public int anInt3730 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public int anInt3728 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
	public int anInt3735 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
	public int anInt3734 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
	public int anInt3733 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	public int anInt3729 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	public int anInt3737 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Lclient!kt;")
	public final Class3_Sub33 aClass3_Sub33_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!kt;)V")
	public Class3_Sub21(@OriginalArg(0) Class3_Sub33 arg0) {
		this.aClass3_Sub33_1 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
	public boolean method3020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3734 <= arg0 && arg0 <= this.anInt3733 && this.anInt3728 <= arg1 && this.anInt3732 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt3730 && arg0 <= this.anInt3737 && this.anInt3729 <= arg1 && arg1 <= this.anInt3735;
		}
	}
}
