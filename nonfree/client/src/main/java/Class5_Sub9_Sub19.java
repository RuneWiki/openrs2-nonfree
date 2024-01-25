import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class5_Sub9_Sub19 extends Class5_Sub9 {

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
	public int anInt4993 = 1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!bk;IZ)V")
	private void method4452(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static88.method1387(arg0.method1863());
		} else if (arg1 == 2) {
			this.anInt4993 = 0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!bk;)V")
	public void method4453(@OriginalArg(1) Class5_Sub1 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1832();
			if (local15 == 0) {
				return;
			}
			this.method4452(arg0, local15);
		}
	}
}
