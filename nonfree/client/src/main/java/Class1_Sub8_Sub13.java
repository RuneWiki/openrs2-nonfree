import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class1_Sub8_Sub13 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qs", name = "A", descriptor = "I")
	public int anInt7757 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!ac;)V")
	public void method6194(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7974();
			if (local5 == 0) {
				return;
			}
			this.method6197(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!ac;)V")
	private void method6197(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 2) {
			this.anInt7757 = arg1.method7945();
		}
	}
}
