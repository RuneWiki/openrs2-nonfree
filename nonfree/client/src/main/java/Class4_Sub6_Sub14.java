import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class4_Sub6_Sub14 extends Class4_Sub6 {

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Z")
	private boolean aBoolean321 = true;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "Z")
	private boolean aBoolean322 = true;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(37) int[] local37 = this.method5508(this.aBoolean321 ? Static211.anInt3929 - arg0 : arg0, 0);
			if (this.aBoolean322) {
				for (@Pc(42) int local42 = 0; local42 < Static80.anInt1616; local42++) {
					local19[local42] = local37[Static203.anInt3883 - local42];
				}
			} else {
				Static459.method3331(local37, 0, local19, 0, Static80.anInt1616);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(34) int[][] local34 = this.method5516(0, this.aBoolean321 ? Static211.anInt3929 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean322) {
				for (local63 = 0; local63 < Static80.anInt1616; local63++) {
					local50[local63] = local38[Static203.anInt3883 - local63];
					local54[local63] = local42[Static203.anInt3883 - local63];
					local58[local63] = local46[Static203.anInt3883 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static80.anInt1616; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.aBoolean322 = arg1.method2490() == 1;
		} else if (arg0 == 1) {
			this.aBoolean321 = arg1.method2490() == 1;
		} else if (arg0 == 2) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}
}
