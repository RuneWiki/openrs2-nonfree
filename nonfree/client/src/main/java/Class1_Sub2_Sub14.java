import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
	public int anInt5444 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLclient!nj;)V")
	public void method4761(@OriginalArg(1) Class1_Sub21 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5720();
			if (local9 == 0) {
				return;
			}
			this.method4764(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!nj;B)V")
	private void method4764(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub21 arg1) {
		if (arg0 == 2) {
			this.anInt5444 = arg1.method5715();
		}
	}
}
