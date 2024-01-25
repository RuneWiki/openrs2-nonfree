import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class4_Sub2_Sub31 extends Class4_Sub2 {

	@OriginalMember(owner = "client!te", name = "M", descriptor = "I")
	private int anInt9406 = 4;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "I")
	private int anInt9405 = 4;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(28) int local28 = Static417.anInt5248 / this.anInt9406;
			@Pc(33) int local33 = Static38.anInt1239 / this.anInt9405;
			@Pc(52) int[][] local52;
			if (local33 > 0) {
				@Pc(42) int local42 = arg0 % local33;
				local52 = this.method8202(Static38.anInt1239 * local42 / local33, 0);
			} else {
				local52 = this.method8202(0, 0);
			}
			@Pc(64) int[] local64 = local52[0];
			@Pc(68) int[] local68 = local52[1];
			@Pc(72) int[] local72 = local52[2];
			@Pc(76) int[] local76 = local19[0];
			@Pc(80) int[] local80 = local19[1];
			@Pc(84) int[] local84 = local19[2];
			for (@Pc(86) int local86 = 0; local86 < Static417.anInt5248; local86++) {
				@Pc(100) int local100;
				if (local28 > 0) {
					@Pc(94) int local94 = local86 % local28;
					local100 = local94 * Static417.anInt5248 / local28;
				} else {
					local100 = 0;
				}
				local76[local86] = local64[local100];
				local80[local86] = local68[local100];
				local84[local86] = local72[local100];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9406 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt9405 = arg0.method7004();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(27) int local27 = Static417.anInt5248 / this.anInt9406;
			@Pc(32) int local32 = Static38.anInt1239 / this.anInt9405;
			@Pc(40) int[] local40;
			@Pc(46) int local46;
			if (local32 <= 0) {
				local40 = this.method8208(0, 0);
			} else {
				local46 = arg0 % local32;
				local40 = this.method8208(0, Static38.anInt1239 * local46 / local32);
			}
			for (local46 = 0; local46 < Static417.anInt5248; local46++) {
				if (local27 > 0) {
					@Pc(69) int local69 = local46 % local27;
					local18[local46] = local40[local69 * Static417.anInt5248 / local27];
				} else {
					local18[local46] = local40[0];
				}
			}
		}
		return local18;
	}
}
