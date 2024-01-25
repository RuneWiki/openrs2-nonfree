import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class14_Sub7_Sub12 extends Class14_Sub7 {

	@OriginalMember(owner = "client!fn", name = "P", descriptor = "[Lclient!qo;")
	private Class74[] aClass74Array1;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(25) int local25 = Static613.anInt10114;
			@Pc(27) int local27 = Static497.anInt8633;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass340_41.method8151();
			this.method2460(local31);
			for (@Pc(42) int local42 = 0; local42 < Static497.anInt8633; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static613.anInt10114; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([[IZ)V")
	private void method2460(@OriginalArg(0) int[][] arg0) {
		@Pc(12) int local12 = Static613.anInt10114;
		@Pc(14) int local14 = Static497.anInt8633;
		Static299.method4898(arg0);
		Static598.method8461(Static660.anInt6757, Static677.anInt11036);
		if (this.aClass74Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass74Array1.length; local28++) {
			@Pc(35) Class74 local35 = this.aClass74Array1[local28];
			@Pc(38) int local38 = local35.anInt8750;
			@Pc(41) int local41 = local35.anInt8751;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method7572(local14, local12);
				}
			} else if (local41 >= 0) {
				local35.method7574(local12, local14);
			} else {
				local35.method7570(local14, local12);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			this.method2460(super.aClass83_41.method1818());
		}
		return local9;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.aClass74Array1 = new Class74[arg1.method7695(126)];
			for (@Pc(20) int local20 = 0; local20 < this.aClass74Array1.length; local20++) {
				@Pc(26) int local26 = arg1.method7695(101);
				if (local26 == 0) {
					this.aClass74Array1[local20] = Static583.method8311(arg1);
				} else if (local26 == 1) {
					this.aClass74Array1[local20] = Static98.method1621(arg1);
				} else if (local26 == 2) {
					this.aClass74Array1[local20] = Static144.method4052(arg1);
				} else if (local26 == 3) {
					this.aClass74Array1[local20] = Static256.method4310(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean773 = arg1.method7695(107) == 1;
		}
	}
}
