import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!af", name = "L", descriptor = "I")
	private int anInt810 = 4096;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "I")
	private int anInt813 = 4096;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "I")
	private int anInt814 = 4096;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt810 = arg0.method7054();
		} else if (arg1 == 1) {
			this.anInt813 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt814 = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(29) int[][] local29 = this.method8202(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static417.anInt5248; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local69 == local65) {
					local45[local55] = this.anInt810 * local61 >> 12;
					local49[local55] = local65 * this.anInt813 >> 12;
					local53[local55] = local69 * this.anInt814 >> 12;
				} else {
					local45[local55] = this.anInt810;
					local49[local55] = this.anInt813;
					local53[local55] = this.anInt814;
				}
			}
		}
		return local11;
	}
}
