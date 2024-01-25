import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class5_Sub2_Sub26 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "[Lclient!mg;")
	private Class9[] aClass9Array1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[[I)V")
	private void method6429(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int local15 = Static195.anInt3759;
		@Pc(17) int local17 = Static195.anInt3756;
		Static110.method2093(arg0);
		Static23.method292(Static388.anInt6925, Static115.anInt2379);
		if (this.aClass9Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass9Array1.length; local31++) {
			@Pc(38) Class9 local38 = this.aClass9Array1[local31];
			@Pc(41) int local41 = local38.anInt8565;
			@Pc(44) int local44 = local38.anInt8564;
			if (local41 >= 0) {
				if (local44 < 0) {
					local38.method7305(local17, local15);
				} else {
					local38.method7304(local15, local17);
				}
			} else if (local44 >= 0) {
				local38.method7306(local15, local17);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass9Array1 = new Class9[arg0.method7816()];
			for (@Pc(26) int local26 = 0; local26 < this.aClass9Array1.length; local26++) {
				@Pc(32) int local32 = arg0.method7816();
				if (local32 == 0) {
					this.aClass9Array1[local26] = Static622.method8433(arg0);
				} else if (local32 == 1) {
					this.aClass9Array1[local26] = Static569.method7786(arg0);
				} else if (local32 == 2) {
					this.aClass9Array1[local26] = Static215.method6881(arg0);
				} else if (local32 == 3) {
					this.aClass9Array1[local26] = Static110.method2092(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(25) int local25 = Static195.anInt3759;
			@Pc(27) int local27 = Static195.anInt3756;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass180_41.method4549();
			this.method6429(local31);
			for (@Pc(42) int local42 = 0; local42 < Static195.anInt3756; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static195.anInt3759; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			this.method6429(super.aClass333_41.method7746());
		}
		return local9;
	}
}
