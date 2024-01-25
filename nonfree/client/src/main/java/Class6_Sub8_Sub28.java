import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class6_Sub8_Sub28 extends Class6_Sub8 {

	@OriginalMember(owner = "client!pha", name = "G", descriptor = "[Lclient!gha;")
	private Class134[] aClass134Array1;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			this.method7010(super.aClass325_41.method7753());
		}
		return local9;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "([[IZ)V")
	private void method7010(@OriginalArg(0) int[][] arg0) {
		@Pc(12) int local12 = Static83.anInt1268;
		@Pc(14) int local14 = Static226.anInt4404;
		Static585.method8159(arg0);
		Static478.method7150(Static165.anInt3453, Static333.anInt5727);
		if (this.aClass134Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass134Array1.length; local28++) {
			@Pc(35) Class134 local35 = this.aClass134Array1[local28];
			@Pc(38) int local38 = local35.anInt9223;
			@Pc(41) int local41 = local35.anInt9222;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method8051(local12, local14);
				}
			} else if (local41 < 0) {
				local35.method8052(local12, local14);
			} else {
				local35.method8050(local12, local14);
			}
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.aClass134Array1 = new Class134[arg1.method3030()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass134Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method3030();
				if (local20 == 0) {
					this.aClass134Array1[local14] = Static317.method5002(arg1);
				} else if (local20 == 1) {
					this.aClass134Array1[local14] = Static477.method4599(arg1);
				} else if (local20 == 2) {
					this.aClass134Array1[local14] = Static23.method258(arg1);
				} else if (local20 == 3) {
					this.aClass134Array1[local14] = Static566.method7362(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(25) int local25 = Static83.anInt1268;
			@Pc(27) int local27 = Static226.anInt4404;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass140_41.method3746();
			this.method7010(local31);
			for (@Pc(42) int local42 = 0; local42 < Static226.anInt4404; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static83.anInt1268; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}
}
