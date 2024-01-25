import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class1_Sub8_Sub21 extends Class1_Sub8 {

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "[Lclient!fo;")
	private Class90[] aClass90Array1;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[[I)V")
	private void method4063(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static18.anInt439;
		@Pc(9) int local9 = Static217.anInt4363;
		Static218.method3398(arg0);
		Static396.method5459(Static443.anInt7904, Static283.anInt5397);
		if (this.aClass90Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass90Array1.length; local23++) {
			@Pc(30) Class90 local30 = this.aClass90Array1[local23];
			@Pc(33) int local33 = local30.anInt7688;
			@Pc(36) int local36 = local30.anInt7684;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method5865(local7, local9);
				} else {
					local30.method5868(local9, local7);
				}
			} else if (local36 >= 0) {
				local30.method5869(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(25) int local25 = Static18.anInt439;
			@Pc(27) int local27 = Static217.anInt4363;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass130_41.method3106();
			this.method4063(local31);
			for (@Pc(42) int local42 = 0; local42 < Static217.anInt4363; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static18.anInt439; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.aClass90Array1 = new Class90[arg1.method1171()];
			for (@Pc(20) int local20 = 0; local20 < this.aClass90Array1.length; local20++) {
				@Pc(26) int local26 = arg1.method1171();
				if (local26 == 0) {
					this.aClass90Array1[local20] = Static394.method5455(arg1);
				} else if (local26 == 1) {
					this.aClass90Array1[local20] = Static224.method5331(arg1);
				} else if (local26 == 2) {
					this.aClass90Array1[local20] = Static403.method5531(arg1);
				} else if (local26 == 3) {
					this.aClass90Array1[local20] = Static378.method5233(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			this.method4063(super.aClass225_41.method5086());
		}
		return local9;
	}
}
