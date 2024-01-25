import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class1_Sub8_Sub10 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
	private int anInt2875 = 0;

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
	private int anInt2877 = 1;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	private int anInt2883 = 0;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2875 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt2883 = arg1.method1171();
		} else if (arg0 == 3) {
			this.anInt2877 = arg1.method1171();
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		Static9.method2255();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(27) int local27 = Static134.anIntArray308[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static18.anInt439; local35++) {
				@Pc(41) int local41 = Static198.anIntArray749[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt2875 == 0) {
					local71 = (local41 - local27) * this.anInt2877;
				} else {
					@Pc(61) int local61 = local47 * local47 + local33 * local33 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (local71 * this.anInt2877) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt2883 == 0) {
					local71 = Static435.anIntArray722[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2883 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local19[local35] = local71;
			}
		}
		return local19;
	}
}
