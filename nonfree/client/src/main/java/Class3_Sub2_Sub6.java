import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "[Lclient!uea;")
	private Class18[] aClass18Array1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			this.method1020(super.aClass84_41.method2126());
		}
		return local20;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass18Array1 = new Class18[arg0.method5633()];
			for (@Pc(28) int local28 = 0; local28 < this.aClass18Array1.length; local28++) {
				@Pc(34) int local34 = arg0.method5633();
				if (local34 == 0) {
					this.aClass18Array1[local28] = Static285.method6793(arg0);
				} else if (local34 == 1) {
					this.aClass18Array1[local28] = Static349.method8594(arg0);
				} else if (local34 == 2) {
					this.aClass18Array1[local28] = Static171.method2837(arg0);
				} else if (local34 == 3) {
					this.aClass18Array1[local28] = Static575.method8067(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean778 = arg0.method5633() == 1;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([[II)V")
	private void method1020(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static201.anInt3738;
		@Pc(9) int local9 = Static414.anInt7271;
		Static162.method2784(arg0);
		Static611.method8363(Static201.anInt3740, Static575.anInt9412);
		if (this.aClass18Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass18Array1.length; local31++) {
			@Pc(38) Class18 local38 = this.aClass18Array1[local31];
			@Pc(41) int local41 = local38.anInt3587;
			@Pc(44) int local44 = local38.anInt3585;
			if (local41 >= 0) {
				if (local44 < 0) {
					local38.method3075(local7, local9);
				} else {
					local38.method3073(local9, local7);
				}
			} else if (local44 >= 0) {
				local38.method3076(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(25) int local25 = Static201.anInt3738;
			@Pc(27) int local27 = Static414.anInt7271;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass296_41.method7239();
			this.method1020(local31);
			for (@Pc(42) int local42 = 0; local42 < Static414.anInt7271; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static201.anInt3738; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}
}
