import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class2_Sub11_Sub8 extends Class2_Sub11 {

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
	public int anInt2650 = 1;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!dg;)V")
	public void method2579(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4421();
			if (local15 == 0) {
				return;
			}
			this.method2581(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!dg;I)V")
	private void method2581(@OriginalArg(1) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static194.method3503(arg0.method4436());
		} else if (arg1 == 2) {
			this.anInt2650 = 0;
		}
	}
}
