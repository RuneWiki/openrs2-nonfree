import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class4_Sub6_Sub7 extends Class4_Sub6 {

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "[Lclient!og;")
	private Class95[] aClass95Array1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass95Array1 = new Class95[arg0.method1874()];
			for (@Pc(12) int local12 = 0; local12 < this.aClass95Array1.length; local12++) {
				@Pc(21) int local21 = arg0.method1874();
				if (local21 == 0) {
					this.aClass95Array1[local12] = Static295.method4351(arg0);
				} else if (local21 == 1) {
					this.aClass95Array1[local12] = Static2.method16(arg0);
				} else if (local21 == 2) {
					this.aClass95Array1[local12] = Static194.method3022(arg0);
				} else if (local21 == 3) {
					this.aClass95Array1[local12] = Static27.method1071(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([[II)V")
	private void method836(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static2.anInt19;
		@Pc(9) int local9 = Static16.anInt308;
		Static11.method179(arg0);
		Static236.method2949(Static137.anInt2812, Static168.anInt3337);
		if (this.aClass95Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass95Array1.length; local31++) {
			@Pc(45) Class95 local45 = this.aClass95Array1[local31];
			@Pc(48) int local48 = local45.anInt4991;
			@Pc(51) int local51 = local45.anInt4995;
			if (local48 >= 0) {
				if (local51 >= 0) {
					local45.method3993(local7, local9);
				} else {
					local45.method3991(local7, local9);
				}
			} else if (local51 >= 0) {
				local45.method3990(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(26) int local26 = Static16.anInt308;
			@Pc(28) int local28 = Static2.anInt19;
			@Pc(32) int[][] local32 = new int[local26][local28];
			@Pc(37) int[][][] local37 = this.aClass84_41.method2154();
			this.method836(local32);
			for (@Pc(43) int local43 = 0; local43 < Static16.anInt308; local43++) {
				@Pc(54) int[] local54 = local32[local43];
				@Pc(58) int[][] local58 = local37[local43];
				@Pc(62) int[] local62 = local58[0];
				@Pc(66) int[] local66 = local58[1];
				@Pc(70) int[] local70 = local58[2];
				for (@Pc(72) int local72 = 0; local72 < Static2.anInt19; local72++) {
					@Pc(79) int local79 = local54[local72];
					local70[local72] = (local79 & 0xFF) << 4;
					local66[local72] = local79 >> 4 & 0xFF0;
					local62[local72] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			this.method836(this.aClass156_41.method3755());
		}
		return local15;
	}
}
