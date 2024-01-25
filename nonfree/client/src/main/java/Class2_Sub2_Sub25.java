import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
	private int anInt5407 = 0;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "I")
	private int anInt5406 = 4096;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(29) int[] local29 = this.method6266(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static398.anInt6955; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt5407) {
					local11[local31] = this.anInt5407;
				} else if (this.anInt5406 >= local37) {
					local11[local31] = local37;
				} else {
					local11[local31] = this.anInt5406;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5407 = arg0.method6148();
		} else if (arg1 == 1) {
			this.anInt5406 = arg0.method6148();
		} else if (arg1 == 2) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(29) int[][] local29 = this.method6276(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static398.anInt6955; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt5407) {
					local45[local55] = this.anInt5407;
				} else if (local61 > this.anInt5406) {
					local45[local55] = this.anInt5406;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt5407) {
					local49[local55] = this.anInt5407;
				} else if (this.anInt5406 >= local65) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt5406;
				}
				if (this.anInt5407 > local69) {
					local53[local55] = this.anInt5407;
				} else if (local69 > this.anInt5406) {
					local53[local55] = this.anInt5406;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local19;
	}
}
