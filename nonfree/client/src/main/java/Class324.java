import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class324 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public int anInt9057;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public int anInt9060;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
	public int anInt9061;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!ofa;)V")
	private void method7826(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt9061 = arg1.method5968();
			this.anInt9060 = arg1.method5966();
			this.anInt9057 = arg1.method5966();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!ofa;)V")
	public void method7828(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5966();
			if (local13 == 0) {
				return;
			}
			this.method7826(local13, arg0);
		}
	}
}
