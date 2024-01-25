import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cfa", name = "F", descriptor = "Z")
	private boolean aBoolean56 = true;

	@OriginalMember(owner = "client!cfa", name = "C", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(34) int[] local34 = this.method7836(this.aBoolean56 ? Static98.anInt1743 - arg0 : arg0, 0);
			if (this.aBoolean55) {
				for (@Pc(39) int local39 = 0; local39 < Static501.anInt8748; local39++) {
					local16[local39] = local34[Static326.anInt4973 - local39];
				}
			} else {
				Static598.method775(local34, 0, local16, 0, Static501.anInt8748);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.aBoolean55 = arg1.method7974() == 1;
		} else if (arg0 == 1) {
			this.aBoolean56 = arg1.method7974() == 1;
		} else if (arg0 == 2) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(36) int[][] local36 = this.method7833(0, this.aBoolean56 ? Static98.anInt1743 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local11[0];
			@Pc(56) int[] local56 = local11[1];
			@Pc(60) int[] local60 = local11[2];
			@Pc(65) int local65;
			if (this.aBoolean55) {
				for (local65 = 0; local65 < Static501.anInt8748; local65++) {
					local52[local65] = local40[Static326.anInt4973 - local65];
					local56[local65] = local44[Static326.anInt4973 - local65];
					local60[local65] = local48[Static326.anInt4973 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static501.anInt8748; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local11;
	}
}
