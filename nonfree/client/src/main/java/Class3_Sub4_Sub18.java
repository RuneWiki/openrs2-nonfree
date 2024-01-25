import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class3_Sub4_Sub18 extends Class3_Sub4 {

	@OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
	public int anInt7662 = 0;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!sl;)V")
	public void method6640(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4225();
			if (local13 == 0) {
				return;
			}
			this.method6642(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method6642(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt7662 = arg0.method4221();
		}
	}
}
