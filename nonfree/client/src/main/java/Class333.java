import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class333 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
	public int anInt8734 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!wq;B)V")
	public void method7503(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7291();
			if (local17 == 0) {
				return;
			}
			this.method7504(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBLclient!wq;)V")
	private void method7504(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 5) {
			this.anInt8734 = arg1.method7333();
		}
	}
}
