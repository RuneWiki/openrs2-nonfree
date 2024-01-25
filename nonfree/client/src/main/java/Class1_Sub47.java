import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class1_Sub47 extends Class1 {

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
	public int anInt8479 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
	public int anInt8477 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
	public int anInt8482 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
	public int anInt8484 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
	public int anInt8486 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
	public int anInt8485 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
	public int anInt8481 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
	public int anInt8487 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!lv;")
	public final Class1_Sub27 aClass1_Sub27_1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!lv;)V")
	public Class1_Sub47(@OriginalArg(0) Class1_Sub27 arg0) {
		this.aClass1_Sub27_1 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z")
	public boolean method7028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8477 <= arg1 && arg1 <= this.anInt8486 && this.anInt8482 <= arg0 && arg0 <= this.anInt8481) {
			return true;
		} else {
			return arg1 >= this.anInt8484 && arg1 <= this.anInt8485 && arg0 >= this.anInt8487 && this.anInt8479 >= arg0;
		}
	}
}
