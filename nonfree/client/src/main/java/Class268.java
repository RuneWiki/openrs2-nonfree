import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class268 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public int anInt7825 = 2048;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "I")
	public int anInt7823 = 0;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public int anInt7829 = 2048;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "I")
	public int anInt7826 = 0;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!co;B)V")
	public void method6337(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method6339(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BILclient!co;)V")
	private void method6339(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt7823 = arg1.method4220();
		} else if (arg0 == 2) {
			this.anInt7829 = arg1.method4227();
		} else if (arg0 == 3) {
			this.anInt7825 = arg1.method4227();
		} else if (arg0 == 4) {
			this.anInt7826 = arg1.method4212();
		}
	}
}
