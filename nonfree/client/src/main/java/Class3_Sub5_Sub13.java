import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class3_Sub5_Sub13 extends Class3_Sub5 {

	@OriginalMember(owner = "client!i", name = "W", descriptor = "[Lclient!we;")
	private Class31[] aClass31Array1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([[IB)V")
	private void method1103(@OriginalArg(0) int[][] arg0) {
		@Pc(15) int local15 = Static104.anInt2195;
		@Pc(17) int local17 = Static88.anInt1834;
		Static50.method740(arg0);
		Static150.method2409(Static112.anInt2517, Static23.anInt543);
		if (this.aClass31Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass31Array1.length; local31++) {
			@Pc(38) Class31 local38 = this.aClass31Array1[local31];
			@Pc(41) int local41 = local38.anInt3938;
			@Pc(44) int local44 = local38.anInt3936;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method2817(local17, local15);
				}
			} else if (local44 >= 0) {
				local38.method2821(local15, local17);
			} else {
				local38.method2819(local17, local15);
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			this.method1103(super.aClass39_41.method1115());
		}
		return local9;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.aClass31Array1 = new Class31[arg1.method2107()];
			for (@Pc(28) int local28 = 0; local28 < this.aClass31Array1.length; local28++) {
				@Pc(34) int local34 = arg1.method2107();
				if (local34 == 0) {
					this.aClass31Array1[local28] = Static94.method1431(arg1);
				} else if (local34 == 1) {
					this.aClass31Array1[local28] = Static21.method342(arg1);
				} else if (local34 == 2) {
					this.aClass31Array1[local28] = Static81.method1214(arg1);
				} else if (local34 == 3) {
					this.aClass31Array1[local28] = Static48.method731(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(25) int local25 = Static104.anInt2195;
			@Pc(27) int local27 = Static88.anInt1834;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass89_41.method2878();
			this.method1103(local31);
			for (@Pc(42) int local42 = 0; local42 < Static88.anInt1834; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static104.anInt2195; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}
}
