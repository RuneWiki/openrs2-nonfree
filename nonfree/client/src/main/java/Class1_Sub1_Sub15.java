import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
	public int anInt2429;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
	public int anInt2434;

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ka;I)V")
	private void method1678(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt2437 = arg1.method1199();
			this.anInt2429 = arg1.method1186();
			this.anInt2434 = arg1.method1186();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLclient!ka;)V")
	public void method1679(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1186();
			if (local7 == 0) {
				return;
			}
			this.method1678(local7, arg0);
		}
	}
}
