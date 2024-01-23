import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "[Lclient!kd;")
	private Class31[] aClass31Array1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass31Array1 = new Class31[arg0.method2199()];
			for (@Pc(43) int local43 = 0; local43 < this.aClass31Array1.length; local43++) {
				@Pc(56) int local56 = arg0.method2199();
				if (local56 == 0) {
					this.aClass31Array1[local43] = Static266.method4022(arg0);
				} else if (local56 == 1) {
					this.aClass31Array1[local43] = Static310.method4690(arg0);
				} else if (local56 == 2) {
					this.aClass31Array1[local43] = Static104.method1729(arg0);
				} else if (local56 == 3) {
					this.aClass31Array1[local43] = Static86.method1568(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			this.method2954(this.aClass194_41.method4740());
		}
		return local9;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[[I)V")
	private void method2954(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static62.anInt1350;
		@Pc(14) int local14 = Static265.anInt5306;
		Static20.method431(arg0);
		Static244.method3199(Static302.anInt6003, Static279.anInt5616);
		if (this.aClass31Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass31Array1.length; local31++) {
			@Pc(41) Class31 local41 = this.aClass31Array1[local31];
			@Pc(44) int local44 = local41.anInt5792;
			@Pc(47) int local47 = local41.anInt5797;
			if (local44 < 0) {
				if (local47 >= 0) {
					local41.method4426(local14, local7);
				}
			} else if (local47 < 0) {
				local41.method4428(local7, local14);
			} else {
				local41.method4431(local14, local7);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(23) int local23 = Static62.anInt1350;
			@Pc(25) int local25 = Static265.anInt5306;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = this.aClass45_41.method1137();
			this.method2954(local29);
			for (@Pc(40) int local40 = 0; local40 < Static265.anInt5306; local40++) {
				@Pc(51) int[] local51 = local29[local40];
				@Pc(55) int[][] local55 = local34[local40];
				@Pc(59) int[] local59 = local55[1];
				@Pc(63) int[] local63 = local55[2];
				@Pc(67) int[] local67 = local55[0];
				for (@Pc(69) int local69 = 0; local69 < Static62.anInt1350; local69++) {
					@Pc(76) int local76 = local51[local69];
					local63[local69] = (local76 & 0xFF) << 4;
					local59[local69] = local76 >> 4 & 0xFF0;
					local67[local69] = local76 >> 12 & 0xFF0;
				}
			}
		}
		return local12;
	}
}
