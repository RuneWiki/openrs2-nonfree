import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "[Lclient!faa;")
	private Class78[] aClass78Array1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.aClass78Array1 = new Class78[arg1.method4393()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass78Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method4393();
				if (local20 == 0) {
					this.aClass78Array1[local14] = Static237.method3847(arg1);
				} else if (local20 == 1) {
					this.aClass78Array1[local14] = Static553.method7506(arg1);
				} else if (local20 == 2) {
					this.aClass78Array1[local14] = Static502.method6985(arg1);
				} else if (local20 == 3) {
					this.aClass78Array1[local14] = Static387.method5564(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			this.method7703(super.aClass26_41.method789());
		}
		return local9;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(25) int local25 = Static87.anInt1964;
			@Pc(27) int local27 = Static4.anInt81;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass153_41.method3558();
			this.method7703(local31);
			for (@Pc(42) int local42 = 0; local42 < Static4.anInt81; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static87.anInt1964; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([[IB)V")
	private void method7703(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static87.anInt1964;
		@Pc(9) int local9 = Static4.anInt81;
		Static514.method7038(arg0);
		Static424.method5939(Static451.anInt8721, Static561.anInt6003);
		if (this.aClass78Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass78Array1.length; local31++) {
			@Pc(38) Class78 local38 = this.aClass78Array1[local31];
			@Pc(41) int local41 = local38.anInt7671;
			@Pc(44) int local44 = local38.anInt7670;
			if (local41 >= 0) {
				if (local44 < 0) {
					local38.method6318(local7, local9);
				} else {
					local38.method6317(local7, local9);
				}
			} else if (local44 >= 0) {
				local38.method6316(local9, local7);
			}
		}
	}
}
