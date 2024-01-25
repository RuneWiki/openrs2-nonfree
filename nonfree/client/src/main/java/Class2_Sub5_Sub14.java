import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub5_Sub14 extends Class2_Sub5 {

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "[I")
	public static final int[] anIntArray496 = new int[4096];

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	public int anInt5811 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray496[local4] = Static259.method3896(local4);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!si;)V")
	public void method4684(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5495();
			if (local13 == 0) {
				return;
			}
			this.method4685(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!si;II)V")
	private void method4685(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt5811 = arg0.method5500();
		}
	}
}
