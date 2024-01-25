import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class7_Sub4_Sub24 extends Class7_Sub4 {

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
	private int anInt4286 = 4096;

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
	private int anInt4287 = 4096;

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
	private int anInt4293 = 4096;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(29) int[][] local29 = this.method5638(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static201.anInt4174; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local65 == local69) {
					local45[local55] = this.anInt4286 * local61 >> 12;
					local49[local55] = local65 * this.anInt4287 >> 12;
					local53[local55] = this.anInt4293 * local69 >> 12;
				} else {
					local45[local55] = this.anInt4286;
					local49[local55] = this.anInt4287;
					local53[local55] = this.anInt4293;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4286 = arg0.method2764();
		} else if (arg1 == 1) {
			this.anInt4287 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt4293 = arg0.method2764();
		}
	}
}
