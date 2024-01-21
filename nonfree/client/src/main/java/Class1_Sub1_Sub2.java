import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(26) int[] local26 = this.method3012(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static65.anInt1933; local28++) {
				local16[local28] = (local26[local28] * this.anInt93 >> 12) + this.anInt98;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		this.anInt93 = this.anInt94 - this.anInt98;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt98 = arg1.method1642();
		} else if (arg0 == 1) {
			this.anInt94 = arg1.method1642();
		} else if (arg0 == 2) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(17) int[][] local17 = this.method3013(arg0, 0);
			@Pc(21) int[] local21 = local17[1];
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local7[0];
			@Pc(33) int[] local33 = local17[2];
			@Pc(37) int[] local37 = local7[1];
			@Pc(41) int[] local41 = local7[2];
			for (@Pc(43) int local43 = 0; local43 < Static65.anInt1933; local43++) {
				local29[local43] = (this.anInt93 * local25[local43] >> 12) + this.anInt98;
				local37[local43] = this.anInt98 + (local21[local43] * this.anInt93 >> 12);
				local41[local43] = (this.anInt93 * local33[local43] >> 12) + this.anInt98;
			}
		}
		return local7;
	}
}
