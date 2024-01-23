import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub4_Sub24 extends Class1_Sub4 {

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	private int anInt3349 = 3072;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	private int anInt3352 = 1024;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	private int anInt3354 = 2048;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3352 = arg0.method1386();
		} else if (arg1 == 1) {
			this.anInt3349 = arg0.method1386();
		} else if (arg1 == 2) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(26) int[][] local26 = this.method4749(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local11[0];
			for (@Pc(52) int local52 = 0; local52 < Static182.anInt3492; local52++) {
				local50[local52] = (local30[local52] * this.anInt3354 >> 12) + this.anInt3352;
				local42[local52] = (local38[local52] * this.anInt3354 >> 12) + this.anInt3352;
				local46[local52] = (local34[local52] * this.anInt3354 >> 12) + this.anInt3352;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(27) int[] local27 = this.method4750(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static182.anInt3492; local29++) {
				local17[local29] = (local27[local29] * this.anInt3354 >> 12) + this.anInt3352;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		this.anInt3354 = this.anInt3349 - this.anInt3352;
	}
}
