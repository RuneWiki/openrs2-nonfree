import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!h", name = "V", descriptor = "[Lclient!nh;")
	private Class61[] aClass61Array1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(17) int local17 = Static30.anInt1097;
			@Pc(19) int local19 = Static65.anInt1933;
			@Pc(23) int[][] local23 = new int[local17][local19];
			@Pc(28) int[][][] local28 = super.aClass40_41.method1588();
			this.method1433(local23);
			for (@Pc(34) int local34 = 0; local34 < Static30.anInt1097; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[1];
				@Pc(52) int[] local52 = local44[0];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static65.anInt1933; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local48[local58] = local64 >> 4 & 0xFF0;
					local52[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			this.method1433(super.aClass80_41.method2740());
		}
		return local9;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[[I)V")
	private void method1433(@OriginalArg(1) int[][] arg0) {
		@Pc(12) int local12 = Static30.anInt1097;
		@Pc(14) int local14 = Static65.anInt1933;
		Static171.method2891(arg0);
		Static23.method849(Static64.anInt1922, Static93.anInt2716);
		if (this.aClass61Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass61Array1.length; local28++) {
			@Pc(35) Class61 local35 = this.aClass61Array1[local28];
			@Pc(38) int local38 = local35.anInt3150;
			@Pc(41) int local41 = local35.anInt3149;
			if (local41 >= 0) {
				if (local38 >= 0) {
					local35.method2237(local12, local14);
				} else {
					local35.method2239(local12, local14);
				}
			} else if (local38 >= 0) {
				local35.method2238(local12, local14);
			}
		}
	}
}
