import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class293 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	public int anInt7728;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
	public int anInt7729;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public int anInt7731;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public int anInt7732;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public int anInt7735;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "Z")
	public boolean aBoolean603;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
	public int anInt7730 = 16777215;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public int anInt7736 = 8;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!np;)V")
	public void method6429(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5175();
			if (local5 == 0) {
				return;
			}
			this.method6431(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!np;I)V")
	private void method6431(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt7736 = arg1.method5198();
		} else if (arg0 == 2) {
			this.aBoolean603 = true;
		} else if (arg0 == 3) {
			this.anInt7729 = arg1.method5231();
			this.anInt7735 = arg1.method5231();
			this.anInt7732 = arg1.method5231();
		} else if (arg0 == 4) {
			this.anInt7731 = arg1.method5175();
		} else if (arg0 == 5) {
			this.anInt7728 = arg1.method5198();
		} else if (arg0 == 6) {
			this.anInt7730 = arg1.method5230();
		}
	}
}
