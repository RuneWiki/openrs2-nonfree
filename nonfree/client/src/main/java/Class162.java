import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class162 {

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	private int anInt4411;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public int anInt4412;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public int anInt4413;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "Lclient!hv;")
	public Class151 aClass151_2;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!so;)V")
	public void method3650(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method3652(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)Lclient!us;")
	public synchronized Class356 method3651() {
		@Pc(20) Class356 local20 = (Class356) this.aClass151_2.aClass264_27.method6367((long) this.anInt4411);
		if (local20 != null) {
			return local20;
		}
		local20 = Static688.method8619(this.aClass151_2.aClass386_57, this.anInt4411, 0);
		if (local20 != null) {
			this.aClass151_2.aClass264_27.method6364((long) this.anInt4411, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!so;IB)V")
	private void method3652(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4411 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt4412 = arg0.method5866();
			this.anInt4413 = arg0.method5866();
		}
	}
}
