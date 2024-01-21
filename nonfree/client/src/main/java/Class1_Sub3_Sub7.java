import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
	public int anInt1609;

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
	public int anInt1613;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
	public int anInt1614;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method1103(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3010();
			if (local9 == 0) {
				return;
			}
			this.method1104(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ka;ZI)V")
	private void method1104(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1614 = arg0.method3023();
			this.anInt1609 = arg0.method3010();
			this.anInt1613 = arg0.method3010();
		}
	}
}
