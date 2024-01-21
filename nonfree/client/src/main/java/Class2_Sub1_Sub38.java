import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class2_Sub1_Sub38 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean194 = arg0.method260() == 1;
		} else if (arg1 == 1) {
			this.aBoolean195 = arg0.method260() == 1;
		} else if (arg1 == 2) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(24) int[][] local24 = this.method3259(this.aBoolean195 ? Static207.anInt4078 - arg0 : arg0, 0);
			@Pc(28) int[] local28 = local24[2];
			@Pc(32) int[] local32 = local24[1];
			@Pc(36) int[] local36 = local7[1];
			@Pc(40) int[] local40 = local24[0];
			@Pc(44) int[] local44 = local7[0];
			@Pc(48) int[] local48 = local7[2];
			@Pc(53) int local53;
			if (this.aBoolean194) {
				for (local53 = 0; local53 < Static135.anInt2897; local53++) {
					local44[local53] = local40[Static201.anInt3995 - local53];
					local36[local53] = local32[Static201.anInt3995 - local53];
					local48[local53] = local28[Static201.anInt3995 - local53];
				}
			} else {
				for (local53 = 0; local53 < Static135.anInt2897; local53++) {
					local44[local53] = local40[local53];
					local36[local53] = local32[local53];
					local48[local53] = local28[local53];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(34) int[] local34 = this.method3265(this.aBoolean195 ? Static207.anInt4078 - arg0 : arg0, 0);
			if (this.aBoolean194) {
				for (@Pc(47) int local47 = 0; local47 < Static135.anInt2897; local47++) {
					local16[local47] = local34[Static201.anInt3995 - local47];
				}
			} else {
				Static222.method2225(local34, 0, local16, 0, Static135.anInt2897);
			}
		}
		return local16;
	}
}
