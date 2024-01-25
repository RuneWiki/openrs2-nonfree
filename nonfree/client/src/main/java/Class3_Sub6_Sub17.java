import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class3_Sub6_Sub17 extends Class3_Sub6 {

	@OriginalMember(owner = "client!jl", name = "L", descriptor = "Z")
	private boolean aBoolean327 = true;

	@OriginalMember(owner = "client!jl", name = "P", descriptor = "Z")
	private boolean aBoolean328 = true;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean327 = arg0.method6814() == 1;
		} else if (arg1 == 1) {
			this.aBoolean328 = arg0.method6814() == 1;
		} else if (arg1 == 2) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(35) int[] local35 = this.method8001(0, this.aBoolean328 ? Static527.anInt10285 - arg0 : arg0);
			if (this.aBoolean327) {
				for (@Pc(40) int local40 = 0; local40 < Static481.anInt8358; local40++) {
					local11[local40] = local35[Static325.anInt5932 - local40];
				}
			} else {
				Static604.method6224(local35, 0, local11, 0, Static481.anInt8358);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(36) int[][] local36 = this.method8005(0, this.aBoolean328 ? Static527.anInt10285 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local11[0];
			@Pc(56) int[] local56 = local11[1];
			@Pc(60) int[] local60 = local11[2];
			@Pc(65) int local65;
			if (this.aBoolean327) {
				for (local65 = 0; local65 < Static481.anInt8358; local65++) {
					local52[local65] = local40[Static325.anInt5932 - local65];
					local56[local65] = local44[Static325.anInt5932 - local65];
					local60[local65] = local48[Static325.anInt5932 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static481.anInt8358; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local11;
	}
}
