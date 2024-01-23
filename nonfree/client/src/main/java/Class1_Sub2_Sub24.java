import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "Z")
	private boolean aBoolean169 = true;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean169 = arg0.method895() == 1;
		} else if (arg1 == 1) {
			this.aBoolean170 = arg0.method895() == 1;
		} else if (arg1 == 2) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(34) int[] local34 = this.method3514(this.aBoolean170 ? Static92.anInt2170 - arg0 : arg0, 0);
			if (this.aBoolean169) {
				for (@Pc(39) int local39 = 0; local39 < Static105.anInt2391; local39++) {
					local11[local39] = local34[Static32.anInt814 - local39];
				}
			} else {
				Static221.method32(local34, 0, local11, 0, Static105.anInt2391);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(14) int[][] local14 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(36) int[][] local36 = this.method3501(this.aBoolean170 ? Static92.anInt2170 - arg0 : arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local14[1];
			@Pc(52) int[] local52 = local36[2];
			@Pc(56) int[] local56 = local14[2];
			@Pc(60) int[] local60 = local14[0];
			@Pc(65) int local65;
			if (this.aBoolean169) {
				for (local65 = 0; local65 < Static105.anInt2391; local65++) {
					local60[local65] = local40[Static32.anInt814 - local65];
					local48[local65] = local44[Static32.anInt814 - local65];
					local56[local65] = local52[Static32.anInt814 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static105.anInt2391; local65++) {
					local60[local65] = local40[local65];
					local48[local65] = local44[local65];
					local56[local65] = local52[local65];
				}
			}
		}
		return local14;
	}
}
