import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
	private int anInt563 = 4;

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
	private int anInt571 = 4;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(16) int local16 = Static105.anInt2391 / this.anInt563;
			@Pc(21) int local21 = Static53.anInt1436 / this.anInt571;
			@Pc(40) int[][] local40;
			if (local21 > 0) {
				@Pc(30) int local30 = arg0 % local21;
				local40 = this.method3501(local30 * Static53.anInt1436 / local21, 0);
			} else {
				local40 = this.method3501(0, 0);
			}
			@Pc(54) int[] local54 = local40[0];
			@Pc(58) int[] local58 = local40[2];
			@Pc(62) int[] local62 = local40[1];
			@Pc(66) int[] local66 = local7[0];
			@Pc(70) int[] local70 = local7[2];
			@Pc(74) int[] local74 = local7[1];
			for (@Pc(76) int local76 = 0; local76 < Static105.anInt2391; local76++) {
				@Pc(90) int local90;
				if (local16 > 0) {
					@Pc(84) int local84 = local76 % local16;
					local90 = local84 * Static105.anInt2391 / local16;
				} else {
					local90 = 0;
				}
				local66[local76] = local54[local90];
				local74[local76] = local62[local90];
				local70[local76] = local58[local90];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt563 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt571 = arg0.method895();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(25) int local25 = Static105.anInt2391 / this.anInt563;
			@Pc(30) int local30 = Static53.anInt1436 / this.anInt571;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local30 <= 0) {
				local41 = this.method3514(0, 0);
			} else {
				local47 = arg0 % local30;
				local41 = this.method3514(local47 * Static53.anInt1436 / local30, 0);
			}
			for (local47 = 0; local47 < Static105.anInt2391; local47++) {
				if (local25 > 0) {
					@Pc(70) int local70 = local47 % local25;
					local16[local47] = local41[local70 * Static105.anInt2391 / local25];
				} else {
					local16[local47] = local41[0];
				}
			}
		}
		return local16;
	}
}
