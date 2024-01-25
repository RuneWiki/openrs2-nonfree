import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class271 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
	public int anInt8333;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
	public int anInt8335;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
	public boolean aBoolean603;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	public int anInt8337;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
	public int anInt8340;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
	public int anInt8342;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
	public int anInt8343 = 8;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
	public int anInt8339 = 16777215;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!ps;IB)V")
	private void method6981(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8343 = arg0.method5229();
		} else if (arg1 == 2) {
			this.aBoolean603 = true;
		} else if (arg1 == 3) {
			this.anInt8337 = arg0.method5231();
			this.anInt8342 = arg0.method5231();
			this.anInt8333 = arg0.method5231();
		} else if (arg1 == 4) {
			this.anInt8340 = arg0.method5170();
		} else if (arg1 == 5) {
			this.anInt8335 = arg0.method5229();
		} else if (arg1 == 6) {
			this.anInt8339 = arg0.method5210();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!ps;)V")
	public void method6982(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5170();
			if (local5 == 0) {
				return;
			}
			this.method6981(arg0, local5);
		}
	}
}
