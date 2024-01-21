import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
	private int anInt2176;

	@OriginalMember(owner = "client!jc", name = "lb", descriptor = "I")
	private int anInt2183;

	@OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
	private int anInt2184;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		Static160.method2981();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2176 = arg1.method1545();
		} else if (arg0 == 1) {
			this.anInt2184 = arg1.method1545();
		} else if (arg0 == 3) {
			this.anInt2183 = arg1.method1545();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(20) int local20 = Static22.anIntArray152[arg0];
			@Pc(26) int local26 = local20 - 2048 >> 1;
			for (@Pc(28) int local28 = 0; local28 < Static129.anInt3285; local28++) {
				@Pc(34) int local34 = Static146.anIntArray618[local28];
				@Pc(40) int local40 = local34 - 2048 >> 1;
				@Pc(66) int local66;
				if (this.anInt2176 == 0) {
					local66 = (local34 - local20) * this.anInt2183;
				} else {
					@Pc(57) int local57 = local40 * local40 + local26 * local26 >> 12;
					local66 = (int) (Math.sqrt((double) (local57 / 4096)) * 4096.0D);
					local66 = (int) ((double) (this.anInt2183 * local66) * 3.141592653589793D);
				}
				local66 -= local66 & 0xFFFFF000;
				if (this.anInt2184 == 0) {
					local66 = Static167.anIntArray680[local66 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2184 == 2) {
					local66 -= 2048;
					if (local66 < 0) {
						local66 = -local66;
					}
					local66 = 2048 - local66 << 1;
				}
				local7[local28] = local66;
			}
		}
		return local7;
	}
}
