import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class317 {

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
	public int anInt8767 = 1;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!eh;Z)V")
	public void method7206(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6015();
			if (local5 == 0) {
				return;
			}
			this.method7209(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BILclient!eh;)V")
	private void method7209(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static413.method5932(arg1.method6021());
		} else if (arg0 == 2) {
			this.anInt8767 = 0;
		}
	}
}
