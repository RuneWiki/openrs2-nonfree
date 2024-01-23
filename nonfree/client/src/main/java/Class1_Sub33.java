import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	public int anInt5493 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public int anInt5497 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public int anInt5499 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	public int anInt5501 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
	public int anInt5504 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
	public int anInt5498 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	public int anInt5500 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	public int anInt5505 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!bb;")
	public Class1_Sub5_Sub1 aClass1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!bb;)V")
	public Class1_Sub33(@OriginalArg(0) Class1_Sub5_Sub1 arg0) {
		this.aClass1_Sub5_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)Z")
	public boolean method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt5500 && this.anInt5505 >= arg0 && arg1 >= this.anInt5504 && this.anInt5501 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt5499 && arg0 <= this.anInt5498 && arg1 >= this.anInt5493 && this.anInt5497 >= arg1;
		}
	}
}
