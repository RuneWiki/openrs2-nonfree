import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	public int anInt114;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Lclient!i;")
	public Class41 aClass41_38;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)Z")
	public boolean method78() {
		return this.anInt112 == 115;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!ea;B)V")
	public void method82(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method209();
			if (local9 == 0) {
				return;
			}
			this.method83(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ea;I)V")
	private void method83(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt112 = arg1.method209();
		} else if (arg0 == 2) {
			this.anInt114 = arg1.method185();
		} else if (arg0 == 5) {
			this.aClass41_38 = arg1.method160();
		}
	}
}
