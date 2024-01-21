import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class2_Sub4_Sub18 extends Class2_Sub4 {

	@OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
	private int anInt2515 = 4;

	@OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
	private int anInt2519 = 4;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(20) int local20 = Static38.anInt3056 / this.anInt2519;
			@Pc(25) int local25 = Static118.anInt2608 / this.anInt2515;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local20 <= 0) {
				local38 = this.method3129(0, 0);
			} else {
				local44 = arg0 % local20;
				local38 = this.method3129(0, local44 * Static38.anInt3056 / local20);
			}
			for (local44 = 0; local44 < Static118.anInt2608; local44++) {
				if (local25 <= 0) {
					local11[local44] = local38[0];
				} else {
					@Pc(72) int local72 = local44 % local25;
					local11[local44] = local38[local72 * Static118.anInt2608 / local25];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(21) int local21 = Static118.anInt2608 / this.anInt2515;
			@Pc(26) int local26 = Static38.anInt3056 / this.anInt2519;
			@Pc(45) int[][] local45;
			if (local26 > 0) {
				@Pc(35) int local35 = arg0 % local26;
				local45 = this.method3130(local35 * Static38.anInt3056 / local26, 0);
			} else {
				local45 = this.method3130(0, 0);
			}
			@Pc(57) int[] local57 = local45[0];
			@Pc(61) int[] local61 = local45[1];
			@Pc(65) int[] local65 = local45[2];
			@Pc(69) int[] local69 = local12[0];
			@Pc(73) int[] local73 = local12[1];
			@Pc(77) int[] local77 = local12[2];
			for (@Pc(79) int local79 = 0; local79 < Static118.anInt2608; local79++) {
				@Pc(85) int local85;
				if (local21 <= 0) {
					local85 = 0;
				} else {
					@Pc(91) int local91 = local79 % local21;
					local85 = local91 * Static118.anInt2608 / local21;
				}
				local69[local79] = local57[local85];
				local73[local79] = local61[local85];
				local77[local79] = local65[local85];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2515 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt2519 = arg1.method1534();
		}
	}
}
