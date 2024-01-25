import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class8_Sub2_Sub22 extends Class8_Sub2 {

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "Z")
	private boolean aBoolean405 = true;

	@OriginalMember(owner = "client!jp", name = "N", descriptor = "Z")
	private boolean aBoolean406 = true;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean405 = arg1.method8525() == 1;
		} else if (arg0 == 1) {
			this.aBoolean406 = arg1.method8525() == 1;
		} else if (arg0 == 2) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(36) int[] local36 = this.method8505(this.aBoolean406 ? Static17.anInt866 - arg0 : arg0, 0);
			if (this.aBoolean405) {
				for (@Pc(41) int local41 = 0; local41 < Static538.anInt9297; local41++) {
					local11[local41] = local36[Static263.anInt5634 - local41];
				}
			} else {
				Static649.method5529(local36, 0, local11, 0, Static538.anInt9297);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(36) int[][] local36 = this.method8510(0, this.aBoolean406 ? Static17.anInt866 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local19[0];
			@Pc(56) int[] local56 = local19[1];
			@Pc(60) int[] local60 = local19[2];
			@Pc(65) int local65;
			if (this.aBoolean405) {
				for (local65 = 0; local65 < Static538.anInt9297; local65++) {
					local52[local65] = local40[Static263.anInt5634 - local65];
					local56[local65] = local44[Static263.anInt5634 - local65];
					local60[local65] = local48[Static263.anInt5634 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static538.anInt9297; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local19;
	}
}
