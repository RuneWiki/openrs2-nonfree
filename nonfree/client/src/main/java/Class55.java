import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class55 {

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public int anInt1476 = -1;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	public int anInt1474 = 64;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public int anInt1473 = 1;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
	public int anInt1479 = 2;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
	public int anInt1480 = 64;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!es;II)V")
	public void method1030(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method4325();
			if (local5 == 0) {
				return;
			}
			this.method1031(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!es;III)V")
	private void method1031(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1476 = arg0.method4294();
			if (this.anInt1476 == 65535) {
				this.anInt1476 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt1474 = arg0.method4294() + 1;
			this.anInt1480 = arg0.method4294() + 1;
		} else if (arg1 == 3) {
			arg0.method4304();
		} else if (arg1 == 4) {
			this.anInt1479 = arg0.method4325();
		} else if (arg1 == 5) {
			this.anInt1473 = arg0.method4325();
		} else if (arg1 == 6) {
			this.aBoolean107 = true;
		} else if (arg1 == 7) {
			this.aBoolean108 = true;
		}
	}
}
