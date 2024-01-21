import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
	public int anInt3038;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
	public int anInt3043;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
	public int anInt3044;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ja;I)V")
	public void method2360(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2962();
			if (local5 == 0) {
				return;
			}
			this.method2363(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!ja;)V")
	private void method2363(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt3038 = arg1.method2933();
			this.anInt3043 = arg1.method2962();
			this.anInt3044 = arg1.method2962();
		}
	}
}
