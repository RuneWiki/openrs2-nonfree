import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class168 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public int anInt5124;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public int anInt5128;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	public int anInt5130;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public int anInt5131;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Z")
	public boolean aBoolean428;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	public int anInt5134;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public int anInt5129 = 16777215;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public int anInt5127 = 8;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!rg;IZI)V")
	private void method4603(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5127 = arg0.method5106();
		} else if (arg1 == 2) {
			this.aBoolean428 = true;
		} else if (arg1 == 3) {
			this.anInt5128 = arg0.method5066();
			this.anInt5134 = arg0.method5066();
			this.anInt5124 = arg0.method5066();
		} else if (arg1 == 4) {
			this.anInt5131 = arg0.method5115();
		} else if (arg1 == 5) {
			this.anInt5130 = arg0.method5106();
		} else if (arg1 == 6) {
			this.anInt5129 = arg0.method5072();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!rg;II)V")
	public void method4605(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method5115();
			if (local9 == 0) {
				return;
			}
			this.method4603(arg0, local9, arg1);
		}
	}
}
