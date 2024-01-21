import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!t", name = "H", descriptor = "I")
	public int anInt3781;

	@OriginalMember(owner = "client!t", name = "I", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "I")
	public int anInt3783;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ce;IZ)V")
	private void method2754(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3781 = arg0.method1642();
			this.anInt3782 = arg0.method1607();
			this.anInt3783 = arg0.method1607();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!ce;)V")
	public void method2756(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1607();
			if (local9 == 0) {
				return;
			}
			this.method2754(arg0, local9);
		}
	}
}
