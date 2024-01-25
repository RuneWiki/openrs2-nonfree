import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class7_Sub4_Sub35 extends Class7_Sub4 {

	@OriginalMember(owner = "client!up", name = "I", descriptor = "I")
	private int anInt6198 = 4;

	@OriginalMember(owner = "client!up", name = "M", descriptor = "I")
	private int anInt6199 = 4;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(20) int local20 = Static201.anInt4174 / this.anInt6198;
			@Pc(25) int local25 = Static216.anInt4322 / this.anInt6199;
			@Pc(33) int[] local33;
			@Pc(39) int local39;
			if (local25 <= 0) {
				local33 = this.method5634(0, 0);
			} else {
				local39 = arg0 % local25;
				local33 = this.method5634(0, local39 * Static216.anInt4322 / local25);
			}
			for (local39 = 0; local39 < Static201.anInt4174; local39++) {
				if (local20 > 0) {
					@Pc(62) int local62 = local39 % local20;
					local11[local39] = local33[local62 * Static201.anInt4174 / local20];
				} else {
					local11[local39] = local33[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6198 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt6199 = arg0.method2772();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(20) int local20 = Static201.anInt4174 / this.anInt6198;
			@Pc(25) int local25 = Static216.anInt4322 / this.anInt6199;
			@Pc(44) int[][] local44;
			if (local25 > 0) {
				@Pc(34) int local34 = arg0 % local25;
				local44 = this.method5638(local34 * Static216.anInt4322 / local25, 0);
			} else {
				local44 = this.method5638(0, 0);
			}
			@Pc(56) int[] local56 = local44[0];
			@Pc(60) int[] local60 = local44[1];
			@Pc(64) int[] local64 = local44[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static201.anInt4174; local78++) {
				@Pc(92) int local92;
				if (local20 > 0) {
					@Pc(86) int local86 = local78 % local20;
					local92 = Static201.anInt4174 * local86 / local20;
				} else {
					local92 = 0;
				}
				local68[local78] = local56[local92];
				local72[local78] = local60[local92];
				local76[local78] = local64[local92];
			}
		}
		return local11;
	}
}
