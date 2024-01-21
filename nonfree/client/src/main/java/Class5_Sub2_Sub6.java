import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class5_Sub2_Sub6 extends Class5_Sub2 {

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "[I")
	public static int[] anIntArray179 = new int[99];

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
	public int anInt1101;

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
	public int anInt1104;

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
	public int anInt1109;

	static {
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 99; local18++) {
			@Pc(23) int local23 = local18 + 1;
			@Pc(36) int local36 = (int) (Math.pow(2.0D, (double) local23 / 7.0D) * 300.0D + (double) local23);
			local16 += local36;
			anIntArray179[local18] = local16 / 4;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!pa;)V")
	public void method758(@OriginalArg(1) Class5_Sub14 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1471();
			if (local3 == 0) {
				return;
			}
			this.method759(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!pa;II)V")
	private void method759(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1101 = arg0.method1478();
			this.anInt1104 = arg0.method1471();
			this.anInt1109 = arg0.method1471();
		}
	}
}
