import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!p", name = "N", descriptor = "I")
	private int anInt3530;

	@OriginalMember(owner = "client!p", name = "X", descriptor = "Lclient!sc;")
	public Class107 aClass107_943;

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
	public int anInt3535;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!vf;)V")
	public void method2599(@OriginalArg(1) Class1_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2945();
			if (local9 == 0) {
				return;
			}
			this.method2602(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)Z")
	public boolean method2601() {
		return this.anInt3530 == 115;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!vf;I)V")
	private void method2602(@OriginalArg(1) Class1_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3530 = arg0.method2945();
		} else if (arg1 == 2) {
			this.anInt3535 = arg0.method2958();
			return;
		} else if (arg1 == 5) {
			this.aClass107_943 = arg0.method2978();
			return;
		}
	}
}
