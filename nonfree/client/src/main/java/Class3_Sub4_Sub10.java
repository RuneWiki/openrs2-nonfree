import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub4_Sub10 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
	private int anInt1533 = 4;

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
	private int anInt1535 = 4;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1533 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt1535 = arg0.method4096();
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(25) int local25 = Static148.anInt2687 / this.anInt1533;
			@Pc(30) int local30 = Static140.anInt2503 / this.anInt1535;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method6139(0, Static140.anInt2503 * local36 / local30);
			} else {
				local46 = this.method6139(0, 0);
			}
			for (local36 = 0; local36 < Static148.anInt2687; local36++) {
				if (local25 <= 0) {
					local16[local36] = local46[0];
				} else {
					@Pc(72) int local72 = local36 % local25;
					local16[local36] = local46[local72 * Static148.anInt2687 / local25];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(28) int local28 = Static148.anInt2687 / this.anInt1533;
			@Pc(33) int local33 = Static140.anInt2503 / this.anInt1535;
			@Pc(52) int[][] local52;
			if (local33 > 0) {
				@Pc(42) int local42 = arg0 % local33;
				local52 = this.method6138(local42 * Static140.anInt2503 / local33, 0);
			} else {
				local52 = this.method6138(0, 0);
			}
			@Pc(64) int[] local64 = local52[0];
			@Pc(68) int[] local68 = local52[1];
			@Pc(72) int[] local72 = local52[2];
			@Pc(76) int[] local76 = local19[0];
			@Pc(80) int[] local80 = local19[1];
			@Pc(84) int[] local84 = local19[2];
			for (@Pc(86) int local86 = 0; local86 < Static148.anInt2687; local86++) {
				@Pc(92) int local92;
				if (local28 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local86 % local28;
					local92 = Static148.anInt2687 * local98 / local28;
				}
				local76[local86] = local64[local92];
				local80[local86] = local68[local92];
				local84[local86] = local72[local92];
			}
		}
		return local19;
	}
}
