import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class174 {

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
	public int anInt5074 = 1;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!ol;I)V")
	public void method4578(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5203();
			if (local7 == 0) {
				return;
			}
			this.method4579(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!ol;II)V")
	private void method4579(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static386.method6507(arg0.method5175());
		} else if (arg1 == 2) {
			this.anInt5074 = 0;
		}
	}
}
