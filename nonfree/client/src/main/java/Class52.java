import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class52 {

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
	public int anInt1098;

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
	public int anInt1100;

	@OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
	public int anInt1102;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!mo;B)V")
	public void method1022(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5750();
			if (local9 == 0) {
				return;
			}
			this.method1023(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!mo;ZI)V")
	private void method1023(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1100 = arg0.method5771();
			this.anInt1098 = arg0.method5750();
			this.anInt1102 = arg0.method5750();
		}
	}
}
