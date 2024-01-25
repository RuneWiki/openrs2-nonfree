import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub10_Sub25 extends Class2_Sub10 {

	@OriginalMember(owner = "client!q", name = "C", descriptor = "I")
	private int anInt7896 = 4096;

	@OriginalMember(owner = "client!q", name = "J", descriptor = "I")
	private int anInt7902 = 0;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(26) int[] local26 = this.method8402(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static93.anInt1862; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt7902 > local34) {
					local16[local28] = this.anInt7902;
				} else if (this.anInt7896 >= local34) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt7896;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7902 = arg0.method6884();
		} else if (arg1 == 1) {
			this.anInt7896 = arg0.method6884();
		} else if (arg1 == 2) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(26) int[][] local26 = this.method8408(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static93.anInt1862; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt7902 > local58) {
					local42[local52] = this.anInt7902;
				} else if (local58 <= this.anInt7896) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt7896;
				}
				if (this.anInt7902 > local62) {
					local46[local52] = this.anInt7902;
				} else if (this.anInt7896 < local62) {
					local46[local52] = this.anInt7896;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt7902 > local66) {
					local50[local52] = this.anInt7902;
				} else if (this.anInt7896 < local66) {
					local50[local52] = this.anInt7896;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local11;
	}
}
