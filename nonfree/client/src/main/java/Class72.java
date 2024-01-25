import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class72 {

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public int anInt1707 = -1;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	public int anInt1708 = -1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLclient!nj;I)V")
	public void method1434(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5720();
			if (local5 == 0) {
				return;
			}
			this.method1435(arg1, arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!nj;I)V")
	private void method1435(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub21 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1708 = arg1.method5715();
		} else if (arg2 == 2) {
			this.anIntArray148 = new int[arg1.method5720()];
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray148.length; local38++) {
				this.anIntArray148[local38] = arg1.method5715();
			}
		} else if (arg2 == 3) {
			this.anInt1707 = arg1.method5720();
		}
	}
}
