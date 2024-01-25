import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class4_Sub6_Sub19 extends Class4_Sub6 {

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
	private int anInt3950 = 4096;

	@OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
	private int anInt3952 = 4096;

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
	private int anInt3957 = 4096;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3950 = arg1.method2536();
		} else if (arg0 == 1) {
			this.anInt3957 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt3952 = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(29) int[][] local29 = this.method5516(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static80.anInt1616; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local69 == local65) {
					local45[local55] = local61 * this.anInt3950 >> 12;
					local49[local55] = this.anInt3957 * local65 >> 12;
					local53[local55] = local69 * this.anInt3952 >> 12;
				} else {
					local45[local55] = this.anInt3950;
					local49[local55] = this.anInt3957;
					local53[local55] = this.anInt3952;
				}
			}
		}
		return local19;
	}
}
