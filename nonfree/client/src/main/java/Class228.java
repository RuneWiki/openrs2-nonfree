import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class228 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
	public int anInt6777 = 0;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
	public int anInt6780 = 0;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
	public int anInt6778 = 2048;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
	public int anInt6782 = 2048;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!bt;B)V")
	public void method5313(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6053();
			if (local9 == 0) {
				return;
			}
			this.method5314(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method5314(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6780 = arg0.method6053();
		} else if (arg1 == 2) {
			this.anInt6778 = arg0.method6004();
		} else if (arg1 == 3) {
			this.anInt6782 = arg0.method6004();
		} else if (arg1 == 4) {
			this.anInt6777 = arg0.method6039();
			return;
		}
	}
}
