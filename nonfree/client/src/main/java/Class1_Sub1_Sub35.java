import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "[Lclient!fo;")
	private Class43[] aClass43Array1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(25) int local25 = Static279.anInt4906;
			@Pc(27) int local27 = Static52.anInt1010;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass46_41.method854();
			this.method7042(local31);
			for (@Pc(42) int local42 = 0; local42 < Static52.anInt1010; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static279.anInt4906; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			this.method7042(super.aClass223_41.method4437());
		}
		return local9;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass43Array1 = new Class43[arg0.method5750()];
			for (@Pc(30) int local30 = 0; local30 < this.aClass43Array1.length; local30++) {
				@Pc(36) int local36 = arg0.method5750();
				if (local36 == 0) {
					this.aClass43Array1[local30] = Static594.method7868(arg0);
				} else if (local36 == 1) {
					this.aClass43Array1[local30] = Static550.method7488(arg0);
				} else if (local36 == 2) {
					this.aClass43Array1[local30] = Static473.method6473(arg0);
				} else if (local36 == 3) {
					this.aClass43Array1[local30] = Static310.method4309(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean737 = arg0.method5750() == 1;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([[IZ)V")
	private void method7042(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static279.anInt4906;
		@Pc(9) int local9 = Static52.anInt1010;
		Static461.method6374(arg0);
		Static422.method5838(Static216.anInt4134, Static171.anInt3020);
		if (this.aClass43Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass43Array1.length; local23++) {
			@Pc(30) Class43 local30 = this.aClass43Array1[local23];
			@Pc(33) int local33 = local30.anInt8896;
			@Pc(36) int local36 = local30.anInt8895;
			if (local33 < 0) {
				if (local36 >= 0) {
					local30.method7275(local9, local7);
				}
			} else if (local36 < 0) {
				local30.method7274(local9, local7);
			} else {
				local30.method7276(local7, local9);
			}
		}
	}
}
