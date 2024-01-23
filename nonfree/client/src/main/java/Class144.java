import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class144 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public int anInt4443;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
	public int anInt4455;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
	private int anInt4456;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBLclient!p;)V")
	public void method3577(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1874();
			if (local5 == 0) {
				return;
			}
			this.method3578(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!p;II)V")
	private void method3578(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt4456 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt4455 = arg0.method1874();
			this.anInt4443 = arg0.method1874();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Lclient!af;")
	public Class4_Sub2_Sub1_Sub1 method3580() {
		@Pc(7) Class4_Sub2_Sub1_Sub1 local7 = (Class4_Sub2_Sub1_Sub1) Static219.aClass33_32.method841((long) this.anInt4456);
		if (local7 != null) {
			return local7;
		}
		local7 = Static236.method2951(this.anInt4456, Static155.aClass98_92);
		if (local7 != null) {
			Static219.aClass33_32.method845(local7, (long) this.anInt4456);
		}
		return local7;
	}
}
