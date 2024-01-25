import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class82 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public int anInt1965;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public int anInt1966;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public int anInt1975;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!lh;B)V")
	private void method1650(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt1975 = arg1.method4093();
			this.anInt1966 = arg1.method4130();
			this.anInt1965 = arg1.method4130();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!lh;I)V")
	public void method1655(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4130();
			if (local9 == 0) {
				return;
			}
			this.method1650(local9, arg0);
		}
	}
}
