import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "Z")
	private boolean aBoolean19 = true;

	@OriginalMember(owner = "client!ak", name = "G", descriptor = "Z")
	private boolean aBoolean18 = true;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(36) int[][] local36 = this.method7130(this.aBoolean18 ? Static323.anInt5914 - arg0 : arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local19[0];
			@Pc(56) int[] local56 = local19[1];
			@Pc(60) int[] local60 = local19[2];
			@Pc(65) int local65;
			if (this.aBoolean19) {
				for (local65 = 0; local65 < Static452.anInt7734; local65++) {
					local52[local65] = local40[Static80.anInt1453 - local65];
					local56[local65] = local44[Static80.anInt1453 - local65];
					local60[local65] = local48[Static80.anInt1453 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static452.anInt7734; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean19 = arg0.method3922() == 1;
		} else if (arg1 == 1) {
			this.aBoolean18 = arg0.method3922() == 1;
		} else if (arg1 == 2) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(31) int[] local31 = this.method7128(0, this.aBoolean18 ? Static323.anInt5914 - arg0 : arg0);
			if (this.aBoolean19) {
				for (@Pc(36) int local36 = 0; local36 < Static452.anInt7734; local36++) {
					local11[local36] = local31[Static80.anInt1453 - local36];
				}
			} else {
				Static551.method3487(local31, 0, local11, 0, Static452.anInt7734);
			}
		}
		return local11;
	}
}
