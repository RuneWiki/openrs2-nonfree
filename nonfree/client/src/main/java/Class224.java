import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class224 {

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	public int anInt6015 = 0;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	public int anInt6018 = 2048;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
	public int anInt6022 = 2048;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
	public int anInt6017 = 0;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ha;IB)V")
	private void method5048(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6015 = arg0.method3111();
		} else if (arg1 == 2) {
			this.anInt6022 = arg0.method3108();
		} else if (arg1 == 3) {
			this.anInt6018 = arg0.method3108();
		} else if (arg1 == 4) {
			this.anInt6017 = arg0.method3103();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method5050(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3111();
			if (local13 == 0) {
				return;
			}
			this.method5048(arg0, local13);
		}
	}
}
