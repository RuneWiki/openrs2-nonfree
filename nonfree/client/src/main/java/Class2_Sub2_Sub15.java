import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!j", name = "M", descriptor = "[Lclient!qe;")
	private Class104[] aClass104Array1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(25) int local25 = Static429.anInt6518;
			@Pc(27) int local27 = Static51.anInt1129;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass175_41.method4052();
			this.method2840(local31);
			for (@Pc(42) int local42 = 0; local42 < Static51.anInt1129; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static429.anInt6518; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([[II)V")
	private void method2840(@OriginalArg(0) int[][] arg0) {
		@Pc(13) int local13 = Static429.anInt6518;
		@Pc(15) int local15 = Static51.anInt1129;
		Static430.method5625(arg0);
		Static138.method2339(Static303.anInt5406, Static246.anInt4669);
		if (this.aClass104Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass104Array1.length; local31++) {
			@Pc(38) Class104 local38 = this.aClass104Array1[local31];
			@Pc(41) int local41 = local38.anInt6745;
			@Pc(44) int local44 = local38.anInt6746;
			if (local41 >= 0) {
				if (local44 >= 0) {
					local38.method5332(local13, local15);
				} else {
					local38.method5333(local15, local13);
				}
			} else if (local44 >= 0) {
				local38.method5336(local13, local15);
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			this.method2840(super.aClass82_41.method2032());
		}
		return local9;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass104Array1 = new Class104[arg0.method5495()];
			for (@Pc(36) int local36 = 0; local36 < this.aClass104Array1.length; local36++) {
				@Pc(42) int local42 = arg0.method5495();
				if (local42 == 0) {
					this.aClass104Array1[local36] = Static42.method3515(arg0);
				} else if (local42 == 1) {
					this.aClass104Array1[local36] = Static4.method142(arg0);
				} else if (local42 == 2) {
					this.aClass104Array1[local36] = Static107.method1985(arg0);
				} else if (local42 == 3) {
					this.aClass104Array1[local36] = Static66.method149(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method5495() == 1;
			return;
		}
	}
}
