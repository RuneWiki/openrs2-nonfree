import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class4_Sub6_Sub29 extends Class4_Sub6 {

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
	private int anInt4576 = 1365;

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
	private int anInt4572 = 0;

	@OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
	private int anInt4575 = 0;

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
	private int anInt4573 = 20;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			for (@Pc(24) int local24 = 0; local24 < Static2.anInt19; local24++) {
				@Pc(39) int local39 = (Static192.anIntArray318[local24] << 12) / this.anInt4576 + this.anInt4575;
				@Pc(51) int local51 = this.anInt4572 + (Static273.anIntArray127[arg0] << 12) / this.anInt4576;
				@Pc(57) int local57 = local39;
				@Pc(63) int local63 = local51 * local51 >> 12;
				@Pc(65) int local65 = local51;
				@Pc(71) int local71 = local39 * local39 >> 12;
				@Pc(73) int local73;
				for (local73 = 0; local71 + local63 < 16384 && this.anInt4573 > local73; local73++) {
					local65 = local51 + (local57 * local65 >> 12) * 2;
					local57 = local39 + local71 - local63;
					local71 = local57 * local57 >> 12;
					local63 = local65 * local65 >> 12;
				}
				local7[local24] = local73 < this.anInt4573 - 1 ? (local73 << 12) / this.anInt4573 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4576 = arg0.method1837();
		} else if (arg1 == 1) {
			this.anInt4573 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt4575 = arg0.method1837();
		} else if (arg1 == 3) {
			this.anInt4572 = arg0.method1837();
		}
	}
}
