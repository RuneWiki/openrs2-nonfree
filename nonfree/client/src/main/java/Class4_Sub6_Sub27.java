import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class4_Sub6_Sub27 extends Class4_Sub6 {

	@OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
	private int anInt5239 = 0;

	@OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
	private int anInt5240 = 20;

	@OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
	private int anInt5238 = 1365;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
	private int anInt5243 = 0;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			for (@Pc(17) int local17 = 0; local17 < Static80.anInt1616; local17++) {
				@Pc(31) int local31 = (Static341.anIntArray504[local17] << 12) / this.anInt5238 + this.anInt5243;
				@Pc(43) int local43 = (Static165.anIntArray209[arg0] << 12) / this.anInt5238 + this.anInt5239;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local57 + local63 < 16384 && local65 < this.anInt5240) {
					local51 = (local49 * local51 >> 12) * 2 + local43;
					local49 = local31 + local57 - local63;
					local65++;
					local57 = local49 * local49 >> 12;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = local65 < this.anInt5240 - 1 ? (local65 << 12) / this.anInt5240 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt5238 = arg1.method2536();
		} else if (arg0 == 1) {
			this.anInt5240 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt5243 = arg1.method2536();
		} else if (arg0 == 3) {
			this.anInt5239 = arg1.method2536();
		}
	}
}
