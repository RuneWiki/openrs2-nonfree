import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class270 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public int anInt7688 = 1;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!io;II)V")
	private void method6322(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static344.method5095(arg0.method4432());
		} else if (arg1 == 2) {
			this.anInt7688 = 0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!io;I)V")
	public void method6324(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4393();
			if (local13 == 0) {
				return;
			}
			this.method6322(arg0, local13);
		}
	}
}
