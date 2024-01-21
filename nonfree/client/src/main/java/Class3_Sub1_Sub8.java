import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
	public int anInt1714;

	@OriginalMember(owner = "client!nd", name = "sb", descriptor = "I")
	public int anInt1716;

	@OriginalMember(owner = "client!nd", name = "vb", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!gb;I)V")
	public void method1154(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method446();
			if (local5 == 0) {
				return;
			}
			this.method1156(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!gb;I)V")
	private void method1156(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt1714 = arg1.method459();
			this.anInt1716 = arg1.method446();
			this.anInt1719 = arg1.method446();
		}
	}
}
