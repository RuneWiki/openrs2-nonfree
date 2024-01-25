import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	public int anInt5396 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public int anInt5394 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public int anInt5393 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
	public int anInt5398 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public int anInt5390 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	public int anInt5399 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
	public int anInt5400 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
	public int anInt5401 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Lclient!hq;")
	public final Class2_Sub18 aClass2_Sub18_1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!hq;)V")
	public Class2_Sub33(@OriginalArg(0) Class2_Sub18 arg0) {
		this.aClass2_Sub18_1 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)Z")
	public boolean method4322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5398 <= arg0 && this.anInt5399 >= arg0 && arg1 >= this.anInt5401 && this.anInt5393 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt5400 && this.anInt5394 >= arg0 && arg1 >= this.anInt5390 && arg1 <= this.anInt5396;
		}
	}
}
