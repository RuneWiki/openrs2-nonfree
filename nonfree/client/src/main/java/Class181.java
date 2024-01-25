import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class181 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public int anInt5612 = 0;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public int anInt5615 = 2048;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int anInt5614 = 0;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int anInt5620 = 2048;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!nj;II)V")
	private void method4906(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub21 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt5614 = arg1.method5720();
		} else if (arg0 == 2) {
			this.anInt5620 = arg1.method5715();
		} else if (arg0 == 3) {
			this.anInt5615 = arg1.method5715();
			return;
		} else if (arg0 == 4) {
			this.anInt5612 = arg1.method5691();
			return;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!nj;II)V")
	public void method4907(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5720();
			if (local5 == 0) {
				return;
			}
			this.method4906(local5, arg0, arg1);
		}
	}
}
