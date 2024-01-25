import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class7_Sub3_Sub27 extends Class7_Sub3 {

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
	private int anInt5512 = 4096;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
	private int anInt5514 = 0;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt5514 = arg1.method3943();
		} else if (arg0 == 1) {
			this.anInt5512 = arg1.method3943();
		} else if (arg0 == 2) {
			super.aBoolean490 = arg1.method3981() == 1;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(29) int[][] local29 = this.method5597(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static58.anInt1052; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt5514) {
					local45[local55] = this.anInt5514;
				} else if (this.anInt5512 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt5512;
				}
				if (local65 < this.anInt5514) {
					local49[local55] = this.anInt5514;
				} else if (this.anInt5512 >= local65) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt5512;
				}
				if (local69 < this.anInt5514) {
					local53[local55] = this.anInt5514;
				} else if (this.anInt5512 < local69) {
					local53[local55] = this.anInt5512;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(21) int[] local21 = this.method5591(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static58.anInt1052; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt5514 > local29) {
					local11[local23] = this.anInt5514;
				} else if (local29 <= this.anInt5512) {
					local11[local23] = local29;
				} else {
					local11[local23] = this.anInt5512;
				}
			}
		}
		return local11;
	}
}
