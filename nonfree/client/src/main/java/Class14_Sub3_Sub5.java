import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class14_Sub3_Sub5 extends Class14_Sub3 {

	@OriginalMember(owner = "client!cp", name = "R", descriptor = "[Lclient!hf;")
	private Class37[] aClass37Array1;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(25) int local25 = Static294.anInt5657;
			@Pc(27) int local27 = Static65.anInt5731;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass58_41.method1953();
			this.method1136(local31);
			for (@Pc(42) int local42 = 0; local42 < Static65.anInt5731; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static294.anInt5657; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			this.method1136(super.aClass157_41.method4023());
		}
		return local15;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass37Array1 = new Class37[arg0.method2548()];
			for (@Pc(29) int local29 = 0; local29 < this.aClass37Array1.length; local29++) {
				@Pc(35) int local35 = arg0.method2548();
				if (local35 == 0) {
					this.aClass37Array1[local29] = Static45.method1114(arg0);
				} else if (local35 == 1) {
					this.aClass37Array1[local29] = Static36.method888(arg0);
				} else if (local35 == 2) {
					this.aClass37Array1[local29] = Static324.method5565(arg0);
				} else if (local35 == 3) {
					this.aClass37Array1[local29] = Static273.method4636(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([[IB)V")
	private void method1136(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static294.anInt5657;
		@Pc(9) int local9 = Static65.anInt5731;
		Static58.method1317(arg0);
		Static90.method2136(Static179.anInt3689, Static329.anInt6352);
		if (this.aClass37Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass37Array1.length; local31++) {
			@Pc(38) Class37 local38 = this.aClass37Array1[local31];
			@Pc(41) int local41 = local38.anInt5257;
			@Pc(44) int local44 = local38.anInt5256;
			if (local41 >= 0) {
				if (local44 >= 0) {
					local38.method4688(local7, local9);
				} else {
					local38.method4690(local7, local9);
				}
			} else if (local44 >= 0) {
				local38.method4692(local7, local9);
			}
		}
	}
}
