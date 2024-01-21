import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!t", name = "R", descriptor = "I")
	public int anInt3407 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!ff;)V")
	private void method2478(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		if (arg0 == 2) {
			this.anInt3407 = arg1.method1359();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!ff;)V")
	public void method2479(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1354();
			if (local15 == 0) {
				return;
			}
			this.method2478(local15, arg0);
		}
	}
}
