import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class383 {

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
	public int anInt10698 = 2048;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
	public int anInt10699 = 0;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	public int anInt10694 = 0;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
	public int anInt10696 = 2048;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!rg;BI)V")
	private void method8981(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10694 = arg0.method8604();
		} else if (arg1 == 2) {
			this.anInt10698 = arg0.method8571();
		} else if (arg1 == 3) {
			this.anInt10696 = arg0.method8571();
		} else if (arg1 == 4) {
			this.anInt10699 = arg0.method8615();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!rg;)V")
	public void method8983(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8604();
			if (local5 == 0) {
				return;
			}
			this.method8981(arg0, local5);
		}
	}
}
