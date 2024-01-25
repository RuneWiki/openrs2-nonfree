import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class3_Sub1_Sub39 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
	private int anInt6211 = 0;

	@OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
	private int anInt6212 = 4096;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(26) int[][] local26 = this.method5551(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static238.anInt4221; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt6211 > local58) {
					local42[local52] = this.anInt6211;
				} else if (this.anInt6212 < local58) {
					local42[local52] = this.anInt6212;
				} else {
					local42[local52] = local58;
				}
				if (this.anInt6211 > local62) {
					local46[local52] = this.anInt6211;
				} else if (this.anInt6212 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt6212;
				}
				if (local66 < this.anInt6211) {
					local50[local52] = this.anInt6211;
				} else if (this.anInt6212 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt6212;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(23) int[] local23 = this.method5547(arg0, 0);
			for (@Pc(25) int local25 = 0; local25 < Static238.anInt4221; local25++) {
				@Pc(31) int local31 = local23[local25];
				if (this.anInt6211 > local31) {
					local13[local25] = this.anInt6211;
				} else if (this.anInt6212 < local31) {
					local13[local25] = this.anInt6212;
				} else {
					local13[local25] = local31;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6211 = arg0.method2767();
		} else if (arg1 == 1) {
			this.anInt6212 = arg0.method2767();
		} else if (arg1 == 2) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}
}
