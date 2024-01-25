import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class4_Sub6_Sub26 extends Class4_Sub6 {

	@OriginalMember(owner = "client!po", name = "M", descriptor = "Z")
	private boolean aBoolean377 = true;

	@OriginalMember(owner = "client!po", name = "Q", descriptor = "Z")
	private boolean aBoolean379 = true;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(37) int[] local37 = this.method5702(this.aBoolean377 ? Static341.anInt266 - arg0 : arg0, 0);
			if (this.aBoolean379) {
				for (@Pc(42) int local42 = 0; local42 < Static31.anInt797; local42++) {
					local19[local42] = local37[Static335.anInt6403 - local42];
				}
			} else {
				Static359.method764(local37, 0, local19, 0, Static31.anInt797);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean379 = arg1.method3440() == 1;
		} else if (arg0 == 1) {
			this.aBoolean377 = arg1.method3440() == 1;
		} else if (arg0 == 2) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(36) int[][] local36 = this.method5693(0, this.aBoolean377 ? Static341.anInt266 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local16[0];
			@Pc(56) int[] local56 = local16[1];
			@Pc(60) int[] local60 = local16[2];
			@Pc(65) int local65;
			if (this.aBoolean379) {
				for (local65 = 0; local65 < Static31.anInt797; local65++) {
					local52[local65] = local40[Static335.anInt6403 - local65];
					local56[local65] = local44[Static335.anInt6403 - local65];
					local60[local65] = local48[Static335.anInt6403 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static31.anInt797; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local16;
	}
}
