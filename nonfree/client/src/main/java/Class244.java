import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class244 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	public int anInt7215 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILclient!os;)V")
	private void method6496(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 5) {
			this.anInt7215 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BLclient!os;)V")
	public void method6497(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method6496(local5, arg0);
		}
	}
}
