import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class3_Sub4_Sub27 extends Class3_Sub4 {

	@OriginalMember(owner = "client!pt", name = "P", descriptor = "Z")
	private boolean aBoolean398 = true;

	@OriginalMember(owner = "client!pt", name = "O", descriptor = "Z")
	private boolean aBoolean397 = true;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(34) int[] local34 = this.method6139(0, this.aBoolean397 ? Static165.anInt2326 - arg0 : arg0);
			if (this.aBoolean398) {
				for (@Pc(47) int local47 = 0; local47 < Static148.anInt2687; local47++) {
					local16[local47] = local34[Static225.anInt3793 - local47];
				}
			} else {
				Static466.method204(local34, 0, local16, 0, Static148.anInt2687);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(36) int[][] local36 = this.method6138(this.aBoolean397 ? Static165.anInt2326 - arg0 : arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local19[0];
			@Pc(56) int[] local56 = local19[1];
			@Pc(60) int[] local60 = local19[2];
			@Pc(65) int local65;
			if (this.aBoolean398) {
				for (local65 = 0; local65 < Static148.anInt2687; local65++) {
					local52[local65] = local40[Static225.anInt3793 - local65];
					local56[local65] = local44[Static225.anInt3793 - local65];
					local60[local65] = local48[Static225.anInt3793 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static148.anInt2687; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean398 = arg0.method4096() == 1;
		} else if (arg1 == 1) {
			this.aBoolean397 = arg0.method4096() == 1;
		} else if (arg1 == 2) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}
}
