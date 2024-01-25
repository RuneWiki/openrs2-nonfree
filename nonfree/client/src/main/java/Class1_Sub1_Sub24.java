import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
	private int anInt4063 = 0;

	@OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
	private int anInt4065 = 4096;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4063 = arg1.method4485();
		} else if (arg0 == 1) {
			this.anInt4065 = arg1.method4485();
		} else if (arg0 == 2) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(21) int[] local21 = this.method5620(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static434.anInt4326; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt4063 > local29) {
					local11[local23] = this.anInt4063;
				} else if (local29 > this.anInt4065) {
					local11[local23] = this.anInt4065;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(29) int[][] local29 = this.method5624(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static434.anInt4326; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt4063) {
					local45[local55] = this.anInt4063;
				} else if (local61 > this.anInt4065) {
					local45[local55] = this.anInt4065;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt4063) {
					local49[local55] = this.anInt4063;
				} else if (local65 <= this.anInt4065) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt4065;
				}
				if (local69 < this.anInt4063) {
					local53[local55] = this.anInt4063;
				} else if (local69 > this.anInt4065) {
					local53[local55] = this.anInt4065;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local19;
	}
}
