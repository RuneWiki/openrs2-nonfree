import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	public int anInt7316 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public int anInt7315 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
	public int anInt7320 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
	public int anInt7319 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	public int anInt7318 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
	public int anInt7322 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
	public int anInt7321 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	public int anInt7324 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "Lclient!mo;")
	public final Class1_Sub28 aClass1_Sub28_1;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!mo;)V")
	public Class1_Sub43(@OriginalArg(0) Class1_Sub28 arg0) {
		this.aClass1_Sub28_1 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z")
	public boolean method5566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt7316 && arg1 <= this.anInt7320 && this.anInt7315 <= arg0 && this.anInt7324 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt7321 && this.anInt7319 >= arg1 && this.anInt7318 <= arg0 && arg0 <= this.anInt7322;
		}
	}
}
