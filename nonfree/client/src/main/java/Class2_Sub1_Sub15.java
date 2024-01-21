import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
	public int anInt2862 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!na;I)V")
	private void method2059(@OriginalArg(1) Class2_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2862 = arg0.method632();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!na;I)V")
	public void method2061(@OriginalArg(0) Class2_Sub9 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method640();
			if (local14 == 0) {
				return;
			}
			this.method2059(arg0, local14);
		}
	}
}
