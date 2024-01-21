import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
	public int anInt3790;

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
	public int anInt3791;

	@OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
	public int anInt3795;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ff;BI)V")
	private void method2689(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3791 = arg0.method1359();
			this.anInt3790 = arg0.method1354();
			this.anInt3795 = arg0.method1354();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!ff;)V")
	public void method2690(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1354();
			if (local5 == 0) {
				return;
			}
			this.method2689(arg0, local5);
		}
	}
}
