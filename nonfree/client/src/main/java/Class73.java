import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class73 {

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
	public int anInt2613 = 0;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLclient!qh;)V")
	public void method2354(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3118();
			if (local13 == 0) {
				return;
			}
			this.method2355(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILclient!qh;)V")
	private void method2355(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt2613 = arg1.method3109();
		}
	}
}
