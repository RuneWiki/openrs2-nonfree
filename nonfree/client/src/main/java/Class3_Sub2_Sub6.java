import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(28) int local28 = Static152.anInt3405 / this.anInt977;
			@Pc(33) int local33 = Static86.anInt1942 / this.anInt983;
			@Pc(44) int[][] local44;
			if (local28 <= 0) {
				local44 = this.method2785(0, 0);
			} else {
				@Pc(50) int local50 = arg0 % local28;
				local44 = this.method2785(local50 * Static152.anInt3405 / local28, 0);
			}
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local44[2];
			@Pc(76) int[] local76 = local7[0];
			@Pc(80) int[] local80 = local7[1];
			@Pc(84) int[] local84 = local7[2];
			for (@Pc(86) int local86 = 0; local86 < Static86.anInt1942; local86++) {
				@Pc(92) int local92;
				if (local33 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local86 % local33;
					local92 = local98 * Static86.anInt1942 / local33;
				}
				local76[local86] = local64[local92];
				local80[local86] = local68[local92];
				local84[local86] = local72[local92];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(25) int local25 = Static86.anInt1942 / this.anInt983;
			@Pc(30) int local30 = Static152.anInt3405 / this.anInt977;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method2787(Static152.anInt3405 * local36 / local30, 0);
			} else {
				local46 = this.method2787(0, 0);
			}
			for (local36 = 0; local36 < Static86.anInt1942; local36++) {
				if (local25 > 0) {
					@Pc(64) int local64 = local36 % local25;
					local16[local36] = local46[local64 * Static86.anInt1942 / local25];
				} else {
					local16[local36] = local46[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt983 = arg0.method1354();
		} else if (arg1 == 1) {
			this.anInt977 = arg0.method1354();
		}
	}
}
