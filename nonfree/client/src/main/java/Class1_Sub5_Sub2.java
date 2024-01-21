import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "[Lclient!lb;")
	private Class52[] aClass52Array1;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(17) int local17 = Static177.anInt4018;
			@Pc(19) int local19 = Static101.anInt2218;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass53_41.method1588();
			this.method529(local23);
			for (@Pc(34) int local34 = 0; local34 < Static101.anInt2218; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static177.anInt4018; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			this.method529(super.aClass2_41.method18());
		}
		return local14;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z[[I)V")
	private void method529(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int local10 = Static101.anInt2218;
		@Pc(16) int local16 = Static177.anInt4018;
		Static121.method2082(arg0);
		Static155.method2686(Static151.anInt3420, Static47.anInt1130);
		if (this.aClass52Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass52Array1.length; local30++) {
			@Pc(37) Class52 local37 = this.aClass52Array1[local30];
			@Pc(40) int local40 = local37.anInt2070;
			@Pc(43) int local43 = local37.anInt2074;
			if (local40 >= 0) {
				if (local43 < 0) {
					local37.method1585(local16, local10);
				} else {
					local37.method1583(local10, local16);
				}
			} else if (local43 >= 0) {
				local37.method1582(local16, local10);
			}
		}
	}
}
