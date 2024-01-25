import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
	public int anInt316 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!lh;I)V")
	private void method292(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt316 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!lh;I)V")
	public void method293(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4130();
			if (local15 == 0) {
				return;
			}
			this.method292(arg0, local15);
		}
	}
}
