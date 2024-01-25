import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class4_Sub43 extends Class4 {

	@OriginalMember(owner = "client!up", name = "o", descriptor = "I")
	public int anInt7312 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "I")
	public int anInt7314 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "I")
	public int anInt7315 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "I")
	public int anInt7317 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "I")
	public int anInt7313 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!up", name = "z", descriptor = "I")
	public int anInt7320 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!up", name = "y", descriptor = "I")
	public int anInt7319 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!up", name = "B", descriptor = "I")
	public int anInt7322 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!up", name = "v", descriptor = "Lclient!au;")
	public final Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!au;)V")
	public Class4_Sub43(@OriginalArg(0) Class4_Sub4 arg0) {
		this.aClass4_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZI)Z")
	public boolean method5879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7320 <= arg0 && arg0 <= this.anInt7313 && this.anInt7319 <= arg1 && arg1 <= this.anInt7322) {
			return true;
		} else {
			return arg0 >= this.anInt7312 && this.anInt7317 >= arg0 && this.anInt7315 <= arg1 && arg1 <= this.anInt7314;
		}
	}
}
