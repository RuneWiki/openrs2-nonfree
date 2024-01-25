import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class220 {

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
	public int anInt5984 = 1;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!jp;I)V")
	private void method5409(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static375.method5437(arg1.method8621());
		} else if (arg0 == 2) {
			this.anInt5984 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method5410(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method8632();
			if (local12 == 0) {
				return;
			}
			this.method5409(local12, arg0);
		}
	}
}
