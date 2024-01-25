import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!as", name = "K", descriptor = "I")
	private int anInt444 = 4;

	@OriginalMember(owner = "client!as", name = "N", descriptor = "I")
	private int anInt446 = 4;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt444 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt446 = arg0.method4130();
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(25) int local25 = Static347.anInt5974 / this.anInt444;
			@Pc(30) int local30 = Static241.anInt4307 / this.anInt446;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local30 <= 0) {
				local41 = this.method6076(0, 0);
			} else {
				local47 = arg0 % local30;
				local41 = this.method6076(0, Static241.anInt4307 * local47 / local30);
			}
			for (local47 = 0; local47 < Static347.anInt5974; local47++) {
				if (local25 > 0) {
					@Pc(67) int local67 = local47 % local25;
					local16[local47] = local41[Static347.anInt5974 * local67 / local25];
				} else {
					local16[local47] = local41[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(28) int local28 = Static347.anInt5974 / this.anInt444;
			@Pc(33) int local33 = Static241.anInt4307 / this.anInt446;
			@Pc(41) int[][] local41;
			if (local33 <= 0) {
				local41 = this.method6072(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local33;
				local41 = this.method6072(0, local47 * Static241.anInt4307 / local33);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local19[1];
			@Pc(81) int[] local81 = local19[2];
			for (@Pc(83) int local83 = 0; local83 < Static347.anInt5974; local83++) {
				@Pc(100) int local100;
				if (local28 > 0) {
					@Pc(94) int local94 = local83 % local28;
					local100 = Static347.anInt5974 * local94 / local28;
				} else {
					local100 = 0;
				}
				local73[local83] = local61[local100];
				local77[local83] = local65[local100];
				local81[local83] = local69[local100];
			}
		}
		return local19;
	}
}
