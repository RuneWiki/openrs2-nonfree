import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class203 {

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
	public int anInt5696 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ug;B)V")
	public void method4491(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5337();
			if (local14 == 0) {
				return;
			}
			this.method4493(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ug;ZI)V")
	private void method4493(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt5696 = arg0.method5335();
		}
	}
}
