import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class8_Sub2_Sub11 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "[Lclient!cha;")
	private Class5[] aClass5Array1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(25) int local25 = Static538.anInt9297;
			@Pc(27) int local27 = Static159.anInt8698;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass269_41.method6816();
			this.method2864(local31);
			for (@Pc(42) int local42 = 0; local42 < Static159.anInt8698; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static538.anInt9297; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[[I)V")
	private void method2864(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static538.anInt9297;
		@Pc(9) int local9 = Static159.anInt8698;
		Static34.method6681(arg0);
		Static283.method4801(Static263.anInt5634, Static17.anInt866);
		if (this.aClass5Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass5Array1.length; local23++) {
			@Pc(30) Class5 local30 = this.aClass5Array1[local23];
			@Pc(33) int local33 = local30.anInt7726;
			@Pc(36) int local36 = local30.anInt7728;
			if (local33 < 0) {
				if (local36 >= 0) {
					local30.method6417(local9, local7);
				}
			} else if (local36 < 0) {
				local30.method6414(local7, local9);
			} else {
				local30.method6416(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			this.method2864(super.aClass50_41.method1693());
		}
		return local9;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.aClass5Array1 = new Class5[arg1.method8525()];
			for (@Pc(15) int local15 = 0; local15 < this.aClass5Array1.length; local15++) {
				@Pc(21) int local21 = arg1.method8525();
				if (local21 == 0) {
					this.aClass5Array1[local15] = Static12.method162(arg1);
				} else if (local21 == 1) {
					this.aClass5Array1[local15] = Static202.method3723(arg1);
				} else if (local21 == 2) {
					this.aClass5Array1[local15] = Static307.method5076(arg1);
				} else if (local21 == 3) {
					this.aClass5Array1[local15] = Static245.method8261(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}
}
