import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class4_Sub1_Sub13 extends Class4_Sub1 {

	@OriginalMember(owner = "client!he", name = "L", descriptor = "I")
	private int anInt2010 = 4;

	@OriginalMember(owner = "client!he", name = "P", descriptor = "I")
	private int anInt2012 = 4;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2012 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt2010 = arg1.method3110();
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(28) int local28 = Static68.anInt1753 / this.anInt2012;
			@Pc(33) int local33 = Static33.anInt660 / this.anInt2010;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method4538(0, local42 * Static33.anInt660 / local33);
			} else {
				local52 = this.method4538(0, 0);
			}
			for (local42 = 0; local42 < Static68.anInt1753; local42++) {
				if (local28 > 0) {
					@Pc(75) int local75 = local42 % local28;
					local19[local42] = local52[local75 * Static68.anInt1753 / local28];
				} else {
					local19[local42] = local52[0];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(24) int local24 = Static68.anInt1753 / this.anInt2012;
			@Pc(29) int local29 = Static33.anInt660 / this.anInt2010;
			@Pc(40) int[][] local40;
			if (local29 <= 0) {
				local40 = this.method4549(0, 0);
			} else {
				@Pc(46) int local46 = arg0 % local29;
				local40 = this.method4549(0, local46 * Static33.anInt660 / local29);
			}
			@Pc(60) int[] local60 = local40[0];
			@Pc(64) int[] local64 = local40[1];
			@Pc(68) int[] local68 = local40[2];
			@Pc(72) int[] local72 = local15[0];
			@Pc(76) int[] local76 = local15[2];
			@Pc(80) int[] local80 = local15[1];
			for (@Pc(82) int local82 = 0; local82 < Static68.anInt1753; local82++) {
				@Pc(102) int local102;
				if (local24 > 0) {
					@Pc(96) int local96 = local82 % local24;
					local102 = local96 * Static68.anInt1753 / local24;
				} else {
					local102 = 0;
				}
				local72[local82] = local60[local102];
				local80[local82] = local64[local102];
				local76[local82] = local68[local102];
			}
		}
		return local15;
	}
}
