import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class91 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
	public int anInt2432 = 1;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Z")
	public boolean aBoolean203 = false;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
	public int anInt2435 = 64;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
	public int anInt2439 = 2;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
	public int anInt2437 = -1;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
	public int anInt2441 = 64;

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "Z")
	public boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!md;IB)V")
	private void method1790(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt2437 = arg1.method3711();
			if (this.anInt2437 == 65535) {
				this.anInt2437 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2441 = arg1.method3711() + 1;
			this.anInt2435 = arg1.method3711() + 1;
		} else if (arg0 == 3) {
			arg1.method3693();
		} else if (arg0 == 4) {
			this.anInt2439 = arg1.method3737();
		} else if (arg0 == 5) {
			this.anInt2432 = arg1.method3737();
		} else if (arg0 == 6) {
			this.aBoolean205 = true;
		} else if (arg0 == 7) {
			this.aBoolean203 = true;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!md;IZ)V")
	public void method1791(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method3737();
			if (local9 == 0) {
				return;
			}
			this.method1790(local9, arg0, arg1);
		}
	}
}
