import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	public int anInt1269 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "I")
	public int anInt1271 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "I")
	public int anInt1270 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public int anInt1267 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	public int anInt1266 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!el", name = "y", descriptor = "I")
	public int anInt1273 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!el", name = "D", descriptor = "I")
	public int anInt1276 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public int anInt1263 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!el", name = "w", descriptor = "Lclient!vo;")
	public Class3_Sub4_Sub23 aClass3_Sub4_Sub23_1;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!vo;)V")
	public Class3_Sub9(@OriginalArg(0) Class3_Sub4_Sub23 arg0) {
		this.aClass3_Sub4_Sub23_1 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIB)Z")
	public boolean method1063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1263 <= arg1 && arg1 <= this.anInt1273 && this.anInt1276 <= arg0 && arg0 <= this.anInt1266) {
			return true;
		} else {
			return arg1 >= this.anInt1271 && arg1 <= this.anInt1269 && this.anInt1270 <= arg0 && this.anInt1267 >= arg0;
		}
	}
}
