import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class6_Sub41 extends Class6 {

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
	public int anInt6046 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public int anInt6050 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public int anInt6052 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public int anInt6049 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public int anInt6051 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
	public int anInt6054 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	public int anInt6048 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
	public int anInt6058 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!rr;")
	public final Class6_Sub35 aClass6_Sub35_1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!rr;)V")
	public Class6_Sub41(@OriginalArg(0) Class6_Sub35 arg0) {
		this.aClass6_Sub35_1 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
	public boolean method5462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6051 <= arg0 && this.anInt6054 >= arg0 && this.anInt6052 <= arg1 && this.anInt6058 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt6049 && this.anInt6048 >= arg0 && arg1 >= this.anInt6046 && this.anInt6050 >= arg1;
		}
	}
}
