import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
	private int anInt1708 = 32768;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		Static110.method1653();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1708 = arg0.method3023() << 4;
		} else if (arg1 == 1) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(26) int[] local26 = this.method3393(arg0, 1);
			@Pc(32) int[] local32 = this.method3393(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static107.anInt2321; local46++) {
				@Pc(57) int local57 = this.anInt1708 * local32[local46] >> 12;
				@Pc(67) int local67 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(75) int local75 = Static7.anIntArray17[local67] * local57 >> 12;
				@Pc(83) int local83 = Static22.anIntArray48[local67] * local57 >> 12;
				@Pc(91) int local91 = Static15.anInt388 & (local83 >> 12) + arg0;
				@Pc(99) int local99 = Static144.anInt2893 & (local75 >> 12) + local46;
				@Pc(105) int[][] local105 = this.method3397(0, local91);
				local36[local46] = local105[0][local99];
				local40[local46] = local105[1][local99];
				local44[local46] = local105[2][local99];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(25) int[] local25 = this.method3393(arg0, 1);
			@Pc(31) int[] local31 = this.method3393(arg0, 2);
			for (@Pc(33) int local33 = 0; local33 < Static107.anInt2321; local33++) {
				@Pc(43) int local43 = local25[local33] >> 4 & 0xFF;
				@Pc(52) int local52 = this.anInt1708 * local31[local33] >> 12;
				@Pc(60) int local60 = local52 * Static7.anIntArray17[local43] >> 12;
				@Pc(68) int local68 = local33 + (local60 >> 12) & Static144.anInt2893;
				@Pc(76) int local76 = local52 * Static22.anIntArray48[local43] >> 12;
				@Pc(84) int local84 = (local76 >> 12) + arg0 & Static15.anInt388;
				@Pc(90) int[] local90 = this.method3393(local84, 0);
				local15[local33] = local90[local68];
			}
		}
		return local15;
	}
}
