import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
	private int anInt3968 = 4;

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
	private int anInt3966 = 4;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3966 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt3968 = arg0.method2655();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(29) int local29 = Static75.anInt1848 / this.anInt3966;
			@Pc(34) int local34 = Static6.anInt2264 / this.anInt3968;
			@Pc(53) int[][] local53;
			if (local34 > 0) {
				@Pc(43) int local43 = arg0 % local34;
				local53 = this.method4758(0, local43 * Static6.anInt2264 / local34);
			} else {
				local53 = this.method4758(0, 0);
			}
			@Pc(64) int[] local64 = local53[0];
			@Pc(68) int[] local68 = local53[1];
			@Pc(72) int[] local72 = local15[0];
			@Pc(76) int[] local76 = local15[1];
			@Pc(80) int[] local80 = local53[2];
			@Pc(84) int[] local84 = local15[2];
			for (@Pc(86) int local86 = 0; local86 < Static75.anInt1848; local86++) {
				@Pc(100) int local100;
				if (local29 <= 0) {
					local100 = 0;
				} else {
					@Pc(106) int local106 = local86 % local29;
					local100 = Static75.anInt1848 * local106 / local29;
				}
				local72[local86] = local64[local100];
				local76[local86] = local68[local100];
				local84[local86] = local80[local100];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(26) int local26 = Static75.anInt1848 / this.anInt3966;
			@Pc(31) int local31 = Static6.anInt2264 / this.anInt3968;
			@Pc(39) int[] local39;
			@Pc(45) int local45;
			if (local31 <= 0) {
				local39 = this.method4746(0, 0);
			} else {
				local45 = arg0 % local31;
				local39 = this.method4746(0, local45 * Static6.anInt2264 / local31);
			}
			for (local45 = 0; local45 < Static75.anInt1848; local45++) {
				if (local26 > 0) {
					@Pc(71) int local71 = local45 % local26;
					local17[local45] = local39[Static75.anInt1848 * local71 / local26];
				} else {
					local17[local45] = local39[0];
				}
			}
		}
		return local17;
	}
}
