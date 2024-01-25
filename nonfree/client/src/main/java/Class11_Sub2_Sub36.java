import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class11_Sub2_Sub36 extends Class11_Sub2 {

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "[Lclient!bl;")
	private Class27[] aClass27Array1;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			this.method5539(super.aClass124_41.method2856());
		}
		return local14;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass27Array1 = new Class27[arg0.method5185()];
			for (@Pc(15) int local15 = 0; local15 < this.aClass27Array1.length; local15++) {
				@Pc(21) int local21 = arg0.method5185();
				if (local21 == 0) {
					this.aClass27Array1[local15] = Static316.method5283(arg0);
				} else if (local21 == 1) {
					this.aClass27Array1[local15] = Static126.method3654(arg0);
				} else if (local21 == 2) {
					this.aClass27Array1[local15] = Static87.method1246(arg0);
				} else if (local21 == 3) {
					this.aClass27Array1[local15] = Static206.method3691(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([[II)V")
	private void method5539(@OriginalArg(0) int[][] arg0) {
		@Pc(12) int local12 = Static339.anInt6549;
		@Pc(14) int local14 = Static113.anInt2160;
		Static154.method2468(arg0);
		Static91.method1485(Static75.anInt1419, Static323.anInt6272);
		if (this.aClass27Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass27Array1.length; local28++) {
			@Pc(35) Class27 local35 = this.aClass27Array1[local28];
			@Pc(38) int local38 = local35.anInt6262;
			@Pc(41) int local41 = local35.anInt6257;
			if (local38 >= 0) {
				if (local41 < 0) {
					local35.method5366(local14, local12);
				} else {
					local35.method5360(local12, local14);
				}
			} else if (local41 >= 0) {
				local35.method5361(local14, local12);
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(22) int local22 = Static339.anInt6549;
			@Pc(24) int local24 = Static113.anInt2160;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(35) int[][][] local35 = super.aClass63_41.method1120();
			this.method5539(local28);
			for (@Pc(41) int local41 = 0; local41 < Static113.anInt2160; local41++) {
				@Pc(47) int[] local47 = local28[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static339.anInt6549; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
