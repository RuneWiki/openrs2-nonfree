import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!au", name = "G", descriptor = "I")
	private int anInt807 = 4;

	@OriginalMember(owner = "client!au", name = "F", descriptor = "I")
	private int anInt806 = 4;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(25) int local25 = Static87.anInt1964 / this.anInt807;
			@Pc(30) int local30 = Static4.anInt81 / this.anInt806;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method7882(0, local36 * Static4.anInt81 / local30);
			} else {
				local46 = this.method7882(0, 0);
			}
			for (local36 = 0; local36 < Static87.anInt1964; local36++) {
				if (local25 <= 0) {
					local16[local36] = local46[0];
				} else {
					@Pc(72) int local72 = local36 % local25;
					local16[local36] = local46[Static87.anInt1964 * local72 / local25];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(25) int local25 = Static87.anInt1964 / this.anInt807;
			@Pc(30) int local30 = Static4.anInt81 / this.anInt806;
			@Pc(41) int[][] local41;
			if (local30 <= 0) {
				local41 = this.method7880(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local30;
				local41 = this.method7880(local47 * Static4.anInt81 / local30, 0);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static87.anInt1964; local83++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local25;
					local89 = local95 * Static87.anInt1964 / local25;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt807 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt806 = arg1.method4393();
		}
	}
}
