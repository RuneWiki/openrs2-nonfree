import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class3_Sub2_Sub38 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "Z")
	private boolean aBoolean852 = true;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "Z")
	private boolean aBoolean853 = true;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.aBoolean853 = arg1.method8401() == 1;
		} else if (arg0 == 1) {
			this.aBoolean852 = arg1.method8401() == 1;
		} else if (arg0 == 2) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(33) int[][] local33 = this.method8337(0, this.aBoolean852 ? Static46.anInt1029 - arg0 : arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local16[0];
			@Pc(53) int[] local53 = local16[1];
			@Pc(57) int[] local57 = local16[2];
			@Pc(62) int local62;
			if (this.aBoolean853) {
				for (local62 = 0; local62 < Static164.anInt8839; local62++) {
					local49[local62] = local37[Static52.anInt1120 - local62];
					local53[local62] = local41[Static52.anInt1120 - local62];
					local57[local62] = local45[Static52.anInt1120 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static164.anInt8839; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(29) int[] local29 = this.method8340(this.aBoolean852 ? Static46.anInt1029 - arg0 : arg0, 0);
			if (this.aBoolean853) {
				for (@Pc(34) int local34 = 0; local34 < Static164.anInt8839; local34++) {
					local11[local34] = local29[Static52.anInt1120 - local34];
				}
			} else {
				Static655.method6408(local29, 0, local11, 0, Static164.anInt8839);
			}
		}
		return local11;
	}
}
