import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
	public int anInt2145 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method1513(@OriginalArg(0) Class2_Sub18 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2387();
			if (local9 == 0) {
				return;
			}
			this.method1515(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZLclient!oa;)V")
	private void method1515(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		if (arg0 == 5) {
			this.anInt2145 = arg1.method2353();
		}
	}
}
