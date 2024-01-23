import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "[Lclient!nc;")
	private Class25[] aClass25Array1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(25) int local25 = Static166.anInt3882;
			@Pc(27) int local27 = Static110.anInt2934;
			@Pc(32) int[][][] local32 = super.aClass21_41.method588();
			@Pc(36) int[][] local36 = new int[local25][local27];
			this.method1103(local36);
			for (@Pc(42) int local42 = 0; local42 < Static166.anInt3882; local42++) {
				@Pc(48) int[] local48 = local36[local42];
				@Pc(52) int[][] local52 = local32[local42];
				@Pc(56) int[] local56 = local52[1];
				@Pc(60) int[] local60 = local52[2];
				@Pc(64) int[] local64 = local52[0];
				for (@Pc(66) int local66 = 0; local66 < Static110.anInt2934; local66++) {
					@Pc(72) int local72 = local48[local66];
					local60[local66] = (local72 & 0xFF) << 4;
					local56[local66] = local72 >> 4 & 0xFF0;
					local64[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(10) int[] local10 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			this.method1103(super.aClass8_41.method107());
		}
		return local10;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass25Array1 = new Class25[arg0.method1772()];
			for (@Pc(22) int local22 = 0; local22 < this.aClass25Array1.length; local22++) {
				@Pc(28) int local28 = arg0.method1772();
				if (local28 == 0) {
					this.aClass25Array1[local22] = Static18.method333(arg0);
				} else if (local28 == 1) {
					this.aClass25Array1[local22] = Static44.method925(arg0);
				} else if (local28 == 2) {
					this.aClass25Array1[local22] = Static266.method4221(arg0);
				} else if (local28 == 3) {
					this.aClass25Array1[local22] = Static200.method3324(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[[I)V")
	private void method1103(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static110.anInt2934;
		@Pc(9) int local9 = Static166.anInt3882;
		Static17.method325(arg0);
		Static28.method576(Static42.anInt1193, Static2.anInt38);
		if (this.aClass25Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass25Array1.length; local31++) {
			@Pc(38) Class25 local38 = this.aClass25Array1[local31];
			@Pc(41) int local41 = local38.anInt4038;
			@Pc(44) int local44 = local38.anInt4034;
			if (local44 < 0) {
				if (local41 >= 0) {
					local38.method3013(local7, local9);
				}
			} else if (local41 < 0) {
				local38.method3008(local7, local9);
			} else {
				local38.method3012(local7, local9);
			}
		}
	}
}
