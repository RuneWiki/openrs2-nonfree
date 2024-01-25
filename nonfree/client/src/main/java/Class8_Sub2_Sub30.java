import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class8_Sub2_Sub30 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
	private int anInt8754 = 4096;

	@OriginalMember(owner = "client!ro", name = "O", descriptor = "I")
	private int anInt8758 = 4096;

	@OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
	private int anInt8753 = 4096;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8758 = arg1.method8578();
		} else if (arg0 == 1) {
			this.anInt8754 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt8753 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(29) int[][] local29 = this.method8510(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static538.anInt9297; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local65 == local69) {
					local45[local55] = local61 * this.anInt8758 >> 12;
					local49[local55] = this.anInt8754 * local65 >> 12;
					local53[local55] = local69 * this.anInt8753 >> 12;
				} else {
					local45[local55] = this.anInt8758;
					local49[local55] = this.anInt8754;
					local53[local55] = this.anInt8753;
				}
			}
		}
		return local11;
	}
}
