import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class4_Sub2_Sub20 extends Class4_Sub2 {

	@OriginalMember(owner = "client!og", name = "P", descriptor = "Z")
	private boolean aBoolean541 = true;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "Z")
	private boolean aBoolean540 = true;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(36) int[][] local36 = this.method8202(this.aBoolean540 ? Static565.anInt5164 - arg0 : arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local11[0];
			@Pc(56) int[] local56 = local11[1];
			@Pc(60) int[] local60 = local11[2];
			@Pc(65) int local65;
			if (this.aBoolean541) {
				for (local65 = 0; local65 < Static417.anInt5248; local65++) {
					local52[local65] = local40[Static359.anInt6929 - local65];
					local56[local65] = local44[Static359.anInt6929 - local65];
					local60[local65] = local48[Static359.anInt6929 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static417.anInt5248; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(37) int[] local37 = this.method8208(0, this.aBoolean540 ? Static565.anInt5164 - arg0 : arg0);
			if (this.aBoolean541) {
				for (@Pc(50) int local50 = 0; local50 < Static417.anInt5248; local50++) {
					local11[local50] = local37[Static359.anInt6929 - local50];
				}
			} else {
				Static599.method3062(local37, 0, local11, 0, Static417.anInt5248);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean541 = arg0.method7004() == 1;
		} else if (arg1 == 1) {
			this.aBoolean540 = arg0.method7004() == 1;
		} else if (arg1 == 2) {
			super.aBoolean713 = arg0.method7004() == 1;
		}
	}
}
