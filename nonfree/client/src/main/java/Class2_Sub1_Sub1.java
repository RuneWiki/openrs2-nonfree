import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
	public int anInt97;

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
	public int anInt98;

	@OriginalMember(owner = "client!aa", name = "jb", descriptor = "I")
	public int anInt104;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!pd;)V")
	private void method82(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt98 = arg1.method627();
			this.anInt97 = arg1.method665();
			this.anInt104 = arg1.method665();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!pd;I)V")
	public void method84(@OriginalArg(0) Class2_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method665();
			if (local5 == 0) {
				return;
			}
			this.method82(local5, arg0);
		}
	}
}
