import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class4_Sub3_Sub11 extends Class4_Sub3 {

	@OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
	private int anInt1257;

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
	private int anInt1258;

	@OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
	private int anInt1256;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(27) int local27 = Static148.anIntArray321[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static134.anInt3188; local35++) {
				@Pc(41) int local41 = Static67.anIntArray170[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt1258 == 0) {
					local61 = (local41 - local27) * this.anInt1257;
				} else {
					@Pc(73) int local73 = local33 * local33 + local47 * local47 >> 12;
					local61 = (int) (Math.sqrt((double) (local73 / 4096)) * 4096.0D);
					local61 = (int) ((double) (local61 * this.anInt1257) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt1256 == 0) {
					local61 = Static49.anIntArray123[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1256 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local11[local35] = local61;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1258 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt1256 = arg1.method1253();
		} else if (arg0 == 3) {
			this.anInt1257 = arg1.method1253();
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		Static97.method1889();
	}
}
