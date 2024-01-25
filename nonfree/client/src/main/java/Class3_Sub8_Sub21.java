import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class3_Sub8_Sub21 extends Class3_Sub8 {

	@OriginalMember(owner = "client!os", name = "G", descriptor = "I")
	private int anInt7179 = 4;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "I")
	private int anInt7185 = 4;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(20) int local20 = Static91.anInt1849 / this.anInt7179;
			@Pc(25) int local25 = Static589.anInt9553 / this.anInt7185;
			@Pc(36) int[][] local36;
			if (local25 <= 0) {
				local36 = this.method8779(0, 0);
			} else {
				@Pc(42) int local42 = arg0 % local25;
				local36 = this.method8779(0, Static589.anInt9553 * local42 / local25);
			}
			@Pc(56) int[] local56 = local36[0];
			@Pc(60) int[] local60 = local36[1];
			@Pc(64) int[] local64 = local36[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static91.anInt1849; local78++) {
				@Pc(84) int local84;
				if (local20 <= 0) {
					local84 = 0;
				} else {
					@Pc(90) int local90 = local78 % local20;
					local84 = local90 * Static91.anInt1849 / local20;
				}
				local68[local78] = local56[local84];
				local72[local78] = local60[local84];
				local76[local78] = local64[local84];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(25) int local25 = Static91.anInt1849 / this.anInt7179;
			@Pc(30) int local30 = Static589.anInt9553 / this.anInt7185;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method8776(local36 * Static589.anInt9553 / local30, 0);
			} else {
				local46 = this.method8776(0, 0);
			}
			for (local36 = 0; local36 < Static91.anInt1849; local36++) {
				if (local25 > 0) {
					@Pc(64) int local64 = local36 % local25;
					local11[local36] = local46[local64 * Static91.anInt1849 / local25];
				} else {
					local11[local36] = local46[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt7179 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt7185 = arg1.method7954();
		}
	}
}
