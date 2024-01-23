import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class182 {

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	public int anInt5891 = 0;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	public int anInt5896 = 2048;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
	public int anInt5897 = 2048;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public int anInt5892 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBLclient!qm;)V")
	public void method4531(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2199();
			if (local9 == 0) {
				return;
			}
			this.method4532(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILclient!qm;)V")
	private void method4532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub14 arg2) {
		if (arg1 == 1) {
			this.anInt5892 = arg2.method2199();
		} else if (arg1 == 2) {
			this.anInt5897 = arg2.method2244();
		} else if (arg1 == 3) {
			this.anInt5896 = arg2.method2244();
		} else if (arg1 == 4) {
			this.anInt5891 = arg2.method2248();
		}
	}
}
