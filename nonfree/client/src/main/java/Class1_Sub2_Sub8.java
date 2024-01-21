import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
	public int anInt938 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLclient!dc;)V")
	public void method757(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method672();
			if (local14 == 0) {
				return;
			}
			this.method758(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILclient!dc;)V")
	private void method758(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 5) {
			this.anInt938 = arg1.method651();
		}
	}
}
