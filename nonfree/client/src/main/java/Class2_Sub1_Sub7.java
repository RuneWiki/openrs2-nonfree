import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	public int anInt4086 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLclient!ol;)V")
	public void method3721(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5203();
			if (local5 == 0) {
				return;
			}
			this.method3723(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!ol;I)V")
	private void method3723(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt4086 = arg0.method5211();
		}
	}
}
