import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class70 {

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public int anInt1983 = 2048;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	public int anInt1986 = 2048;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public int anInt1981 = 0;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	public int anInt1984 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!fh;BI)V")
	private void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1981 = arg1.method1853();
		} else if (arg2 == 2) {
			this.anInt1986 = arg1.method1879();
		} else if (arg2 == 3) {
			this.anInt1983 = arg1.method1879();
		} else if (arg2 == 4) {
			this.anInt1984 = arg1.method1843();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!fh;IB)V")
	public void method1807(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1853();
			if (local9 == 0) {
				return;
			}
			this.method1806(arg1, arg0, local9);
		}
	}
}
