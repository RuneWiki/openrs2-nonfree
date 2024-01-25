import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class11_Sub37 extends Class11 {

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	public int anInt5827 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
	public int anInt5828 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
	public int anInt5834 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
	public int anInt5833 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
	public int anInt5830 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
	public int anInt5832 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
	public int anInt5836 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
	public int anInt5838 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ss", name = "x", descriptor = "Lclient!co;")
	public final Class11_Sub8 aClass11_Sub8_1;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class11_Sub37(@OriginalArg(0) Class11_Sub8 arg0) {
		this.aClass11_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)Z")
	public boolean method4895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5827 <= arg0 && arg0 <= this.anInt5833 && arg1 >= this.anInt5830 && this.anInt5834 >= arg1) {
			return true;
		} else {
			return this.anInt5828 <= arg0 && arg0 <= this.anInt5832 && this.anInt5836 <= arg1 && this.anInt5838 >= arg1;
		}
	}
}
