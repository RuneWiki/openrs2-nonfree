import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class359 {

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
	public int anInt9919 = 0;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
	public int anInt9922 = 0;

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
	public int anInt9926 = 2048;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
	public int anInt9921 = 2048;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZILclient!sl;)V")
	private void method8433(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt9922 = arg1.method2859();
		} else if (arg0 == 2) {
			this.anInt9926 = arg1.method2825();
		} else if (arg0 == 3) {
			this.anInt9921 = arg1.method2825();
		} else if (arg0 == 4) {
			this.anInt9919 = arg1.method2836();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!sl;)V")
	public void method8434(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2859();
			if (local5 == 0) {
				return;
			}
			this.method8433(local5, arg0);
		}
	}
}
