import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
	public int anInt2680;

	@OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
	public int anInt2682;

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLclient!rc;)V")
	public void method1779(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method716();
			if (local3 == 0) {
				return;
			}
			this.method1780(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!rc;)V")
	private void method1780(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt2680 = arg1.method715();
			this.anInt2682 = arg1.method716();
			this.anInt2683 = arg1.method716();
		}
	}
}
