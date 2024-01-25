import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	public int anInt5208 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	public int anInt5219 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
	public int anInt5215 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public int anInt5207 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	public int anInt5210 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public int anInt5212 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
	public int anInt5220 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
	public int anInt5221 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "Lclient!pd;")
	public final Class1_Sub27 aClass1_Sub27_1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!pd;)V")
	public Class1_Sub28(@OriginalArg(0) Class1_Sub27 arg0) {
		this.aClass1_Sub27_1 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)Z")
	public boolean method4574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5210 <= arg0 && arg0 <= this.anInt5212 && this.anInt5208 <= arg1 && arg1 <= this.anInt5220) {
			return true;
		} else {
			return arg0 >= this.anInt5207 && arg0 <= this.anInt5219 && this.anInt5221 <= arg1 && arg1 <= this.anInt5215;
		}
	}
}
