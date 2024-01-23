import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class4_Sub1_Sub14 extends Class4_Sub1 {

	@OriginalMember(owner = "client!km", name = "T", descriptor = "[Lclient!lc;")
	private Class11[] aClass11Array1;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			this.method2398(this.aClass35_41.method729());
		}
		return local9;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(26) int local26 = Static73.anInt1626;
			@Pc(28) int local28 = Static25.anInt379;
			@Pc(32) int[][] local32 = new int[local28][local26];
			@Pc(37) int[][][] local37 = this.aClass116_41.method2707();
			this.method2398(local32);
			for (@Pc(43) int local43 = 0; local43 < Static25.anInt379; local43++) {
				@Pc(50) int[][] local50 = local37[local43];
				@Pc(54) int[] local54 = local50[1];
				@Pc(58) int[] local58 = local50[2];
				@Pc(62) int[] local62 = local32[local43];
				@Pc(66) int[] local66 = local50[0];
				for (@Pc(68) int local68 = 0; local68 < Static73.anInt1626; local68++) {
					@Pc(79) int local79 = local62[local68];
					local58[local68] = (local79 & 0xFF) << 4;
					local54[local68] = local79 >> 4 & 0xFF0;
					local66[local68] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass11Array1 = new Class11[arg0.method4666()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass11Array1.length; local11++) {
				@Pc(24) int local24 = arg0.method4666();
				if (local24 == 0) {
					this.aClass11Array1[local11] = Static249.method3959(arg0);
				} else if (local24 == 1) {
					this.aClass11Array1[local11] = Static251.method3990(arg0);
				} else if (local24 == 2) {
					this.aClass11Array1[local11] = Static249.method3958(arg0);
				} else if (local24 == 3) {
					this.aClass11Array1[local11] = Static305.method4711(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean398 = arg0.method4666() == 1;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B[[I)V")
	private void method2398(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int local15 = Static73.anInt1626;
		@Pc(17) int local17 = Static25.anInt379;
		Static286.method4372(arg0);
		Static107.method4411(Static262.anInt5002, Static48.anInt901);
		if (this.aClass11Array1 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass11Array1.length; local32++) {
			@Pc(46) Class11 local46 = this.aClass11Array1[local32];
			@Pc(49) int local49 = local46.anInt2466;
			@Pc(52) int local52 = local46.anInt2463;
			if (local52 < 0) {
				if (local49 >= 0) {
					local46.method1939(local15, local17);
				}
			} else if (local49 < 0) {
				local46.method1936(local15, local17);
			} else {
				local46.method1935(local15, local17);
			}
		}
	}
}
