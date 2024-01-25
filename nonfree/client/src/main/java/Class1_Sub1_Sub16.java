import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
	public static final int[] anIntArray586 = new int[16384];

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "[I")
	public static final int[] anIntArray587 = new int[16384];

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public int anInt4596 = 0;

	static {
		@Pc(12) double local12 = 3.834951969714103E-4D;
		for (@Pc(14) int local14 = 0; local14 < 16384; local14++) {
			anIntArray587[local14] = (int) (Math.sin((double) local14 * local12) * 32768.0D);
			anIntArray586[local14] = (int) (Math.cos((double) local14 * local12) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!eb;)V")
	private void method4206(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 2) {
			this.anInt4596 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!eb;)V")
	public void method4210(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3141();
			if (local9 == 0) {
				return;
			}
			this.method4206(local9, arg0);
		}
	}
}
