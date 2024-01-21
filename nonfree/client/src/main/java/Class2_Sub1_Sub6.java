import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fd", name = "Bb", descriptor = "I")
	public int anInt1127;

	@OriginalMember(owner = "client!fd", name = "Lb", descriptor = "I")
	public int anInt1134;

	@OriginalMember(owner = "client!fd", name = "Nb", descriptor = "I")
	public int anInt1136;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!ba;)V")
	public void method772(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method791();
			if (local9 == 0) {
				return;
			}
			this.method773(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ba;II)V")
	private void method773(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1127 = arg0.method792();
			this.anInt1134 = arg0.method791();
			this.anInt1136 = arg0.method791();
		}
	}
}
