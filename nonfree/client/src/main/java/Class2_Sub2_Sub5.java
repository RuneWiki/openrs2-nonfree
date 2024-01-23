import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
	private int anInt982 = 4;

	@OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
	private int anInt987 = 4;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(25) int local25 = Static11.anInt313 / this.anInt987;
			@Pc(30) int local30 = Static54.anInt953 / this.anInt982;
			@Pc(49) int[][] local49;
			if (local25 > 0) {
				@Pc(39) int local39 = arg0 % local25;
				local49 = this.method3952(0, local39 * Static11.anInt313 / local25);
			} else {
				local49 = this.method3952(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[2];
			@Pc(69) int[] local69 = local49[1];
			@Pc(73) int[] local73 = local7[0];
			@Pc(77) int[] local77 = local7[1];
			@Pc(81) int[] local81 = local7[2];
			for (@Pc(83) int local83 = 0; local83 < Static54.anInt953; local83++) {
				@Pc(100) int local100;
				if (local30 > 0) {
					@Pc(94) int local94 = local83 % local30;
					local100 = Static54.anInt953 * local94 / local30;
				} else {
					local100 = 0;
				}
				local73[local83] = local61[local100];
				local77[local83] = local69[local100];
				local81[local83] = local65[local100];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt982 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt987 = arg0.method2122();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(25) int local25 = Static54.anInt953 / this.anInt982;
			@Pc(30) int local30 = Static11.anInt313 / this.anInt987;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method3955(0, local36 * Static11.anInt313 / local30);
			} else {
				local46 = this.method3955(0, 0);
			}
			for (local36 = 0; local36 < Static54.anInt953; local36++) {
				if (local25 > 0) {
					@Pc(64) int local64 = local36 % local25;
					local7[local36] = local46[Static54.anInt953 * local64 / local25];
				} else {
					local7[local36] = local46[0];
				}
			}
		}
		return local7;
	}
}
