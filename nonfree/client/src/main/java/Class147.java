import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class147 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
	public int anInt4399 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLclient!nj;)V")
	private void method3765(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		if (arg0 == 5) {
			this.anInt4399 = arg1.method5715();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method3767(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5720();
			if (local13 == 0) {
				return;
			}
			this.method3765(local13, arg0);
		}
	}
}
