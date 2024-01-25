import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class120 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public int anInt3229 = 2048;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "I")
	public int anInt3231 = 0;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	public int anInt3227 = 0;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "I")
	public int anInt3234 = 2048;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZLclient!lh;)V")
	private void method2764(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt3231 = arg1.method4130();
		} else if (arg0 == 2) {
			this.anInt3229 = arg1.method4093();
		} else if (arg0 == 3) {
			this.anInt3234 = arg1.method4093();
			return;
		} else if (arg0 == 4) {
			this.anInt3227 = arg1.method4100();
			return;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!lh;)V")
	public void method2766(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method2764(local5, arg0);
		}
	}
}
