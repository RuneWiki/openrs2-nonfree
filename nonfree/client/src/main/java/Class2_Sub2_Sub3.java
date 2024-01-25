import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ct", name = "K", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!ct", name = "R", descriptor = "Z")
	private boolean aBoolean66 = true;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(36) int[][] local36 = this.method5840(this.aBoolean65 ? Static246.anInt4669 - arg0 : arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local19[0];
			@Pc(56) int[] local56 = local19[1];
			@Pc(60) int[] local60 = local19[2];
			@Pc(65) int local65;
			if (this.aBoolean66) {
				for (local65 = 0; local65 < Static429.anInt6518; local65++) {
					local52[local65] = local40[Static303.anInt5406 - local65];
					local56[local65] = local44[Static303.anInt5406 - local65];
					local60[local65] = local48[Static303.anInt5406 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static429.anInt6518; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean66 = arg0.method5495() == 1;
		} else if (arg1 == 1) {
			this.aBoolean65 = arg0.method5495() == 1;
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method5495() == 1;
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(34) int[] local34 = this.method5839(this.aBoolean65 ? Static246.anInt4669 - arg0 : arg0, 0);
			if (this.aBoolean66) {
				for (@Pc(47) int local47 = 0; local47 < Static429.anInt6518; local47++) {
					local16[local47] = local34[Static303.anInt5406 - local47];
				}
			} else {
				Static457.method685(local34, 0, local16, 0, Static429.anInt6518);
			}
		}
		return local16;
	}
}
