import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class119 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public int anInt3891;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public int anInt3893;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "I")
	public int anInt3899;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!cg;)V")
	public void method3135(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method2690();
			if (local18 == 0) {
				return;
			}
			this.method3140(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!cg;II)V")
	private void method3140(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3891 = arg0.method2691();
			this.anInt3893 = arg0.method2690();
			this.anInt3899 = arg0.method2690();
		}
	}
}
