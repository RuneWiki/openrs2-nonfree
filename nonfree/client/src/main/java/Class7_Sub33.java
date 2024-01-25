import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class7_Sub33 extends Class7 {

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	public int anInt4896 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "I")
	public int anInt4897 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	public int anInt4900 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "I")
	public int anInt4901 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	public int anInt4895 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	public int anInt4898 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	public int anInt4903 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "I")
	public int anInt4905 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Lclient!cs;")
	public final Class7_Sub11 aClass7_Sub11_1;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!cs;)V")
	public Class7_Sub33(@OriginalArg(0) Class7_Sub11 arg0) {
		this.aClass7_Sub11_1 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)Z")
	public boolean method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt4901 && this.anInt4898 >= arg0 && this.anInt4897 <= arg1 && this.anInt4896 >= arg1) {
			return true;
		} else {
			return this.anInt4905 <= arg0 && arg0 <= this.anInt4903 && this.anInt4895 <= arg1 && this.anInt4900 >= arg1;
		}
	}
}
