import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class253 {

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public int anInt6691 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IILclient!dt;)V")
	private void method5607(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 5) {
			this.anInt6691 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLclient!dt;)V")
	public void method5608(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7954();
			if (local14 == 0) {
				return;
			}
			this.method5607(local14, arg0);
		}
	}
}
