import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ka;IZ)V")
	private void method417(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt528 = arg0.method359();
			this.anInt534 = arg0.method336();
			this.anInt530 = arg0.method336();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!ka;)V")
	public void method420(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method336();
			if (local13 == 0) {
				return;
			}
			this.method417(arg0, local13);
		}
	}
}
