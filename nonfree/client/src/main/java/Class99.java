import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class99 {

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
	public int anInt2361 = 0;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!lh;)V")
	private void method1960(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 5) {
			this.anInt2361 = arg1.method4093();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!lh;)V")
	public void method1961(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4130();
			if (local13 == 0) {
				return;
			}
			this.method1960(local13, arg0);
		}
	}
}
