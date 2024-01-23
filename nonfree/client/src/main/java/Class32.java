import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class32 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fd;B)V")
	public void method695(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4666();
			if (local15 == 0) {
				return;
			}
			this.method696(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void method696(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt787 = arg0.method4653();
			this.anInt794 = arg0.method4666();
			this.anInt795 = arg0.method4666();
		}
	}
}
