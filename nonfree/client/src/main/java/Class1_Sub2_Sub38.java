import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class1_Sub2_Sub38 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ws", name = "M", descriptor = "I")
	private int anInt7368 = 4096;

	@OriginalMember(owner = "client!ws", name = "P", descriptor = "I")
	private int anInt7371 = 0;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7371 = arg0.method2896();
		} else if (arg1 == 1) {
			this.anInt7368 = arg0.method2896();
		} else if (arg1 == 2) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(26) int[] local26 = this.method5964(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static218.anInt3990; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt7371) {
					local11[local28] = this.anInt7371;
				} else if (local34 <= this.anInt7368) {
					local11[local28] = local34;
				} else {
					local11[local28] = this.anInt7368;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(26) int[][] local26 = this.method5968(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static218.anInt3990; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt7371 > local58) {
					local42[local52] = this.anInt7371;
				} else if (this.anInt7368 < local58) {
					local42[local52] = this.anInt7368;
				} else {
					local42[local52] = local58;
				}
				if (this.anInt7371 > local62) {
					local46[local52] = this.anInt7371;
				} else if (this.anInt7368 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt7368;
				}
				if (this.anInt7371 > local66) {
					local50[local52] = this.anInt7371;
				} else if (local66 > this.anInt7368) {
					local50[local52] = this.anInt7368;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}
}
