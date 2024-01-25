import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class211 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	public int anInt5978;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	public int anInt5981;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	public int anInt5983;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!wn;B)V")
	public void method4953(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4614();
			if (local9 == 0) {
				return;
			}
			this.method4954(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!wn;I)V")
	private void method4954(@OriginalArg(1) Class4_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5978 = arg0.method4560();
			this.anInt5983 = arg0.method4614();
			this.anInt5981 = arg0.method4614();
		}
	}
}
