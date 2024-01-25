import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class145 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
	public int anInt4307;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
	private int anInt4309;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
	public int anInt4313;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!nj;II)V")
	private void method3697(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4309 = arg0.method5715();
		} else if (arg2 == 2) {
			this.anInt4307 = arg0.method5720();
			this.anInt4313 = arg0.method5720();
			return;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)Lclient!up;")
	public Class201 method3700() {
		@Pc(11) Class201 local11 = (Class201) Static123.aClass37_81.method915((long) this.anInt4309);
		if (local11 != null) {
			return local11;
		}
		local11 = Static369.method5469(Static354.aClass134_155, this.anInt4309, 0);
		if (local11 != null) {
			Static123.aClass37_81.method922((long) this.anInt4309, local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!nj;Z)V")
	public void method3701(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub21 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method5720();
			if (local9 == 0) {
				return;
			}
			this.method3697(arg1, arg0, local9);
		}
	}
}
