import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class177 {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
	public static final int[] anIntArray843 = new int[16384];

	@OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
	public static final int[] anIntArray844 = new int[16384];

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public int anInt4344 = 0;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray843[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray844[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBLclient!kk;)V")
	private void method3908(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 5) {
			this.anInt4344 = arg1.method5312();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method3909(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5350();
			if (local10 == 0) {
				return;
			}
			this.method3908(local10, arg0);
		}
	}
}
