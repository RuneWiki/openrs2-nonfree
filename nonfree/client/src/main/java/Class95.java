import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class95 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public int anInt2853 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!vt;IZ)V")
	private void method2286(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt2853 = arg0.method5753();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!vt;)V")
	public void method2291(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5732();
			if (local9 == 0) {
				return;
			}
			this.method2286(arg0, local9);
		}
	}
}
