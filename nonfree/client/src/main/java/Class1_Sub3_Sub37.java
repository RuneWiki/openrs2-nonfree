import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class1_Sub3_Sub37 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
	private int anInt4332 = 4;

	@OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
	private int anInt4335 = 4;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(22) int local22 = Static76.anInt1531 / this.anInt4332;
			@Pc(27) int local27 = Static30.anInt572 / this.anInt4335;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local27 > 0) {
				local36 = arg0 % local27;
				local46 = this.method3468(local36 * Static30.anInt572 / local27, 0);
			} else {
				local46 = this.method3468(0, 0);
			}
			for (local36 = 0; local36 < Static76.anInt1531; local36++) {
				if (local22 > 0) {
					@Pc(67) int local67 = local36 % local22;
					local13[local36] = local46[local67 * Static76.anInt1531 / local22];
				} else {
					local13[local36] = local46[0];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(28) int local28 = Static30.anInt572 / this.anInt4335;
			@Pc(33) int local33 = Static76.anInt1531 / this.anInt4332;
			@Pc(44) int[][] local44;
			if (local28 <= 0) {
				local44 = this.method3465(0, 0);
			} else {
				@Pc(50) int local50 = arg0 % local28;
				local44 = this.method3465(Static30.anInt572 * local50 / local28, 0);
			}
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local44[2];
			@Pc(80) int[] local80 = local11[2];
			@Pc(84) int[] local84 = local11[0];
			for (@Pc(86) int local86 = 0; local86 < Static76.anInt1531; local86++) {
				@Pc(100) int local100;
				if (local33 > 0) {
					@Pc(94) int local94 = local86 % local33;
					local100 = Static76.anInt1531 * local94 / local33;
				} else {
					local100 = 0;
				}
				local84[local86] = local64[local100];
				local72[local86] = local68[local100];
				local80[local86] = local76[local100];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4332 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt4335 = arg1.method2142();
		}
	}
}
