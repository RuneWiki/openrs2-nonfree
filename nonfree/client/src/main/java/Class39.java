import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class39 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public int anInt1015 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public int anInt1013 = 2048;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public int anInt1019 = 0;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	public int anInt1018 = 2048;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!vt;)V")
	public void method734(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5732();
			if (local5 == 0) {
				return;
			}
			this.method737(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!vt;II)V")
	private void method737(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1019 = arg0.method5732();
		} else if (arg1 == 2) {
			this.anInt1013 = arg0.method5753();
		} else if (arg1 == 3) {
			this.anInt1018 = arg0.method5753();
		} else if (arg1 == 4) {
			this.anInt1015 = arg0.method5743();
		}
	}
}
