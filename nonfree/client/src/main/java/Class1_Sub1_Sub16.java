import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!he", name = "I", descriptor = "I")
	private int anInt2111 = 1;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "I")
	private int anInt2116 = 0;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "I")
	private int anInt2120 = 0;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2120 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt2116 = arg0.method1853();
		} else if (arg1 == 3) {
			this.anInt2111 = arg0.method1853();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(26) int local26 = Static10.anIntArray604[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static6.anInt4960; local34++) {
				@Pc(41) int local41 = Static298.anIntArray589[local34];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(73) int local73;
				if (this.anInt2120 == 0) {
					local73 = (local41 - local26) * this.anInt2111;
				} else {
					@Pc(63) int local63 = local32 * local32 + local47 * local47 >> 12;
					local73 = (int) (Math.sqrt((double) ((float) local63 / 4096.0F)) * 4096.0D);
					local73 = (int) ((double) (this.anInt2111 * local73) * 3.141592653589793D);
				}
				local73 -= local73 & 0xFFFFF000;
				if (this.anInt2116 == 0) {
					local73 = Static58.anIntArray98[local73 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2116 == 2) {
					local73 -= 2048;
					if (local73 < 0) {
						local73 = -local73;
					}
					local73 = 2048 - local73 << 1;
				}
				local17[local34] = local73;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		Static129.method2272();
	}
}
