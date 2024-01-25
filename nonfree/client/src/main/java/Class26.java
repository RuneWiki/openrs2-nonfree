import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class26 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
	public int anInt854 = 1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!es;)V")
	private void method785(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static305.method4280(arg1.method8861());
		} else if (arg0 == 2) {
			this.anInt854 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!es;I)V")
	public void method786(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8865();
			if (local13 == 0) {
				return;
			}
			this.method785(local13, arg0);
		}
	}
}
