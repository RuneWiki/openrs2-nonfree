import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class253 {

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	public int anInt7335 = 1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!os;I)V")
	private void method6575(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static253.method4580(arg1.method4482());
		} else if (arg0 == 2) {
			this.anInt7335 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!os;B)V")
	public void method6578(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4487();
			if (local13 == 0) {
				return;
			}
			this.method6575(local13, arg0);
		}
	}
}
