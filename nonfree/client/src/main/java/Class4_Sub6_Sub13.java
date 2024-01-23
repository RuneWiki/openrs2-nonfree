import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class4_Sub6_Sub13 extends Class4_Sub6 {

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	private int anInt2133 = 0;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
	private int anInt2134 = 0;

	@OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
	private int anInt2140 = 1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2133 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt2134 = arg0.method1874();
		} else if (arg1 == 3) {
			this.anInt2140 = arg0.method1874();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		Static197.method3082();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(15) int local15 = Static273.anIntArray127[arg0];
			@Pc(21) int local21 = local15 - 2048 >> 1;
			for (@Pc(23) int local23 = 0; local23 < Static2.anInt19; local23++) {
				@Pc(34) int local34 = Static192.anIntArray318[local23];
				@Pc(40) int local40 = local34 - 2048 >> 1;
				@Pc(53) int local53;
				if (this.anInt2133 == 0) {
					local53 = (local34 - local15) * this.anInt2140;
				} else {
					@Pc(66) int local66 = local40 * local40 + local21 * local21 >> 12;
					local53 = (int) (Math.sqrt((double) ((float) local66 / 4096.0F)) * 4096.0D);
					local53 = (int) ((double) (local53 * this.anInt2140) * 3.141592653589793D);
				}
				local53 -= local53 & 0xFFFFF000;
				if (this.anInt2134 == 0) {
					local53 = Static53.anIntArray123[local53 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2134 == 2) {
					local53 -= 2048;
					if (local53 < 0) {
						local53 = -local53;
					}
					local53 = 2048 - local53 << 1;
				}
				local7[local23] = local53;
			}
		}
		return local7;
	}
}
