import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
	private int anInt8559 = 2048;

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
	private int anInt8557 = 3072;

	@OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
	private int anInt8562 = 1024;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(26) int[][] local26 = this.method7880(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static87.anInt1964; local52++) {
				local42[local52] = (local30[local52] * this.anInt8559 >> 12) + this.anInt8562;
				local46[local52] = (this.anInt8559 * local34[local52] >> 12) + this.anInt8562;
				local50[local52] = (this.anInt8559 * local38[local52] >> 12) + this.anInt8562;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8562 = arg1.method4426();
		} else if (arg0 == 1) {
			this.anInt8557 = arg1.method4426();
		} else if (arg0 == 2) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		this.anInt8559 = this.anInt8557 - this.anInt8562;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(27) int[] local27 = this.method7882(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static87.anInt1964; local29++) {
				local17[local29] = this.anInt8562 + (this.anInt8559 * local27[local29] >> 12);
			}
		}
		return local17;
	}
}
