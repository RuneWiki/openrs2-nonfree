import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class136 {

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	public int anInt4332 = 2048;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public int anInt4330 = 2048;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	public int anInt4335 = 0;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public int anInt4339 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!tq;I)V")
	public void method3637(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		while (true) {
			@Pc(7) int local7 = arg1.method2380();
			if (local7 == 0) {
				return;
			}
			this.method3638(arg0, local7, arg1);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILclient!tq;)V")
	private void method3638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt4339 = arg2.method2380();
		} else if (arg1 == 2) {
			this.anInt4332 = arg2.method2404();
		} else if (arg1 == 3) {
			this.anInt4330 = arg2.method2404();
		} else if (arg1 == 4) {
			this.anInt4335 = arg2.method2396();
		}
	}
}
