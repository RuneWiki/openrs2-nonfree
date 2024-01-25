import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean260 = arg0.method4130() == 1;
		} else if (arg1 == 1) {
			this.aBoolean259 = arg0.method4130() == 1;
		} else if (arg1 == 2) {
			super.aBoolean494 = arg0.method4130() == 1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(29) int[][] local29 = this.method6072(0, this.aBoolean259 ? Static274.anInt4887 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean260) {
				for (local58 = 0; local58 < Static347.anInt5974; local58++) {
					local45[local58] = local33[Static307.anInt5524 - local58];
					local49[local58] = local37[Static307.anInt5524 - local58];
					local53[local58] = local41[Static307.anInt5524 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static347.anInt5974; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(29) int[] local29 = this.method6076(0, this.aBoolean259 ? Static274.anInt4887 - arg0 : arg0);
			if (this.aBoolean260) {
				for (@Pc(42) int local42 = 0; local42 < Static347.anInt5974; local42++) {
					local11[local42] = local29[Static307.anInt5524 - local42];
				}
			} else {
				Static460.method4216(local29, 0, local11, 0, Static347.anInt5974);
			}
		}
		return local11;
	}
}
