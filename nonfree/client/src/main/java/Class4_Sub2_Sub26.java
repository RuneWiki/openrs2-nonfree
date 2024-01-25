import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class4_Sub2_Sub26 extends Class4_Sub2 {

	@OriginalMember(owner = "client!mt", name = "J", descriptor = "[Lclient!wt;")
	private Class43[] aClass43Array1;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(17) int local17 = Static350.anInt6330;
			@Pc(19) int local19 = Static160.anInt3006;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass207_41.method4804();
			this.method3512(local23);
			for (@Pc(34) int local34 = 0; local34 < Static160.anInt3006; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static350.anInt6330; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			this.method3512(super.aClass9_41.method276());
		}
		return local9;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[[I)V")
	private void method3512(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static350.anInt6330;
		@Pc(17) int local17 = Static160.anInt3006;
		Static380.method5184(arg0);
		Static171.method2499(Static323.anInt5763, Static144.anInt2707);
		if (this.aClass43Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass43Array1.length; local31++) {
			@Pc(38) Class43 local38 = this.aClass43Array1[local31];
			@Pc(41) int local41 = local38.anInt7284;
			@Pc(44) int local44 = local38.anInt7285;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method5624(local7, local17);
				}
			} else if (local44 >= 0) {
				local38.method5621(local17, local7);
			} else {
				local38.method5622(local7, local17);
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.aClass43Array1 = new Class43[arg1.method4864()];
			for (@Pc(37) int local37 = 0; local37 < this.aClass43Array1.length; local37++) {
				@Pc(43) int local43 = arg1.method4864();
				if (local43 == 0) {
					this.aClass43Array1[local37] = Static173.method2535(arg1);
				} else if (local43 == 1) {
					this.aClass43Array1[local37] = Static181.method2907(arg1);
				} else if (local43 == 2) {
					this.aClass43Array1[local37] = Static350.method4919(arg1);
				} else if (local43 == 3) {
					this.aClass43Array1[local37] = Static447.method5740(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}
}
