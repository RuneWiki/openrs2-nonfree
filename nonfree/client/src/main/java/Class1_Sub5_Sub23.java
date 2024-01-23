import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class1_Sub5_Sub23 extends Class1_Sub5 {

	@OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
	public int anInt5408 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLclient!fh;)V")
	public void method4504(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1853();
			if (local13 == 0) {
				return;
			}
			this.method4506(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!fh;B)V")
	private void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (arg0 == 2) {
			this.anInt5408 = arg1.method1879();
		}
	}
}
