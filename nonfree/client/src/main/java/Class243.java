import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class243 {

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	public int anInt6641 = 1;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!dh;)V")
	public void method5107(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4463();
			if (local10 == 0) {
				return;
			}
			this.method5108(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBLclient!dh;)V")
	private void method5108(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static276.method3514(arg1.method4452());
		} else if (arg0 == 2) {
			this.anInt6641 = 0;
		}
	}
}
