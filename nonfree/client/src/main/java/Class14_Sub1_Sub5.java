import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class14_Sub1_Sub5 extends Class14_Sub1 {

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	private int anInt2005 = 4;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt2006 = 4;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(24) int local24 = Static371.anInt6835 / this.anInt2006;
			@Pc(29) int local29 = Static535.anInt9239 / this.anInt2005;
			@Pc(45) int[] local45;
			@Pc(35) int local35;
			if (local29 > 0) {
				local35 = arg0 % local29;
				local45 = this.method8897(0, Static535.anInt9239 * local35 / local29);
			} else {
				local45 = this.method8897(0, 0);
			}
			for (local35 = 0; local35 < Static371.anInt6835; local35++) {
				if (local24 <= 0) {
					local11[local35] = local45[0];
				} else {
					@Pc(74) int local74 = local35 % local24;
					local11[local35] = local45[Static371.anInt6835 * local74 / local24];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2006 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt2005 = arg0.method5866();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(24) int local24 = Static371.anInt6835 / this.anInt2006;
			@Pc(29) int local29 = Static535.anInt9239 / this.anInt2005;
			@Pc(48) int[][] local48;
			if (local29 > 0) {
				@Pc(38) int local38 = arg0 % local29;
				local48 = this.method8904(0, Static535.anInt9239 * local38 / local29);
			} else {
				local48 = this.method8904(0, 0);
			}
			@Pc(60) int[] local60 = local48[0];
			@Pc(64) int[] local64 = local48[1];
			@Pc(68) int[] local68 = local48[2];
			@Pc(72) int[] local72 = local15[0];
			@Pc(76) int[] local76 = local15[1];
			@Pc(80) int[] local80 = local15[2];
			for (@Pc(82) int local82 = 0; local82 < Static371.anInt6835; local82++) {
				@Pc(96) int local96;
				if (local24 > 0) {
					@Pc(90) int local90 = local82 % local24;
					local96 = local90 * Static371.anInt6835 / local24;
				} else {
					local96 = 0;
				}
				local72[local82] = local60[local96];
				local76[local82] = local64[local96];
				local80[local82] = local68[local96];
			}
		}
		return local15;
	}
}
