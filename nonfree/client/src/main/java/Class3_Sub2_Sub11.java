import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
	public int anInt2392;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
	public int anInt2393;

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
	public int anInt2398;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!hd;)V")
	public void method1879(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1545();
			if (local3 == 0) {
				return;
			}
			this.method1881(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!hd;II)V")
	private void method1881(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2398 = arg0.method1510();
			this.anInt2392 = arg0.method1545();
			this.anInt2393 = arg0.method1545();
		}
	}
}
