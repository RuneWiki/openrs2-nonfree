import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class2_Sub11_Sub18 extends Class2_Sub11 {

	@OriginalMember(owner = "client!oo", name = "N", descriptor = "Z")
	private boolean aBoolean658 = true;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "Z")
	private boolean aBoolean659 = true;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.aBoolean658 = arg1.method8581(-17416) == 1;
		} else if (arg0 == 1) {
			this.aBoolean659 = arg1.method8581(-17416) == 1;
		} else if (arg0 == 2) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(39) int[][] local39 = this.method9538(0, this.aBoolean659 ? Static332.anInt5074 - arg0 : arg0);
			@Pc(43) int[] local43 = local39[0];
			@Pc(47) int[] local47 = local39[1];
			@Pc(51) int[] local51 = local39[2];
			@Pc(55) int[] local55 = local18[0];
			@Pc(59) int[] local59 = local18[1];
			@Pc(63) int[] local63 = local18[2];
			@Pc(68) int local68;
			if (this.aBoolean658) {
				for (local68 = 0; local68 < Static301.anInt10214; local68++) {
					local55[local68] = local43[Static78.anInt1356 - local68];
					local59[local68] = local47[Static78.anInt1356 - local68];
					local63[local68] = local51[Static78.anInt1356 - local68];
				}
			} else {
				for (local68 = 0; local68 < Static301.anInt10214; local68++) {
					local55[local68] = local43[local68];
					local59[local68] = local47[local68];
					local63[local68] = local51[local68];
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(31) int[] local31 = this.method9540(this.aBoolean659 ? Static332.anInt5074 - arg0 : arg0, 0);
			if (this.aBoolean658) {
				for (@Pc(46) int local46 = 0; local46 < Static301.anInt10214; local46++) {
					local11[local46] = local31[Static78.anInt1356 - local46];
				}
			} else {
				Static728.method273(local31, 0, local11, 0, Static301.anInt10214);
			}
		}
		return local11;
	}
}
