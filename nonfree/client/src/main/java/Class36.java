import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class36 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
	public int anInt837 = 0;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	public int anInt841 = 2048;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	public int anInt840 = 0;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
	public int anInt843 = 2048;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!daa;)V")
	public void method847(@OriginalArg(1) Class12_Sub8 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5216();
			if (local12 == 0) {
				return;
			}
			this.method848(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLclient!daa;I)V")
	private void method848(@OriginalArg(1) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt837 = arg0.method5216();
		} else if (arg1 == 2) {
			this.anInt843 = arg0.method5199();
		} else if (arg1 == 3) {
			this.anInt841 = arg0.method5199();
		} else if (arg1 == 4) {
			this.anInt840 = arg0.method5217();
		}
	}
}
