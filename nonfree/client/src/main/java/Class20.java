import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class20 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	private int anInt730;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!aj;IB)V")
	public void method504(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2334();
			if (local5 == 0) {
				return;
			}
			this.method508(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lclient!eg;")
	public Class8_Sub1_Sub7_Sub1 method505() {
		@Pc(17) Class8_Sub1_Sub7_Sub1 local17 = (Class8_Sub1_Sub7_Sub1) Static239.aClass61_45.method1384((long) this.anInt730);
		if (local17 != null) {
			return local17;
		}
		local17 = Static235.method3576(this.anInt730, Static124.aClass132_44);
		if (local17 != null) {
			Static239.aClass61_45.method1377((long) this.anInt730, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!aj;III)V")
	private void method508(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt730 = arg0.method2375();
		} else if (arg2 == 2) {
			this.anInt732 = arg0.method2334();
			this.anInt731 = arg0.method2334();
		}
	}
}
