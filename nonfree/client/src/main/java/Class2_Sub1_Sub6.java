import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public int anInt1014;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "I")
	public int anInt1016;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "I")
	public int anInt1018;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!og;)V")
	public void method791(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method218();
			if (local15 == 0) {
				return;
			}
			this.method797(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!og;II)V")
	private void method797(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1016 = arg0.method234();
			this.anInt1014 = arg0.method218();
			this.anInt1018 = arg0.method218();
		}
	}
}
