import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class172 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public int anInt5186 = 0;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public int anInt5192 = 2048;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	public int anInt5193 = 2048;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public int anInt5194 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!tl;B)V")
	private void method3974(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			this.anInt5194 = arg1.method4864();
		} else if (arg0 == 2) {
			this.anInt5193 = arg1.method4877();
		} else if (arg0 == 3) {
			this.anInt5192 = arg1.method4877();
		} else if (arg0 == 4) {
			this.anInt5186 = arg1.method4889();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!tl;)V")
	public void method3976(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4864();
			if (local9 == 0) {
				return;
			}
			this.method3974(local9, arg0);
		}
	}
}
