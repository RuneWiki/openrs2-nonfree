import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub1_Sub27 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
	private int anInt2947;

	@OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
	private int anInt2948;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2947 = arg1.method208();
		} else if (arg0 == 1) {
			this.anInt2948 = arg1.method208();
		} else if (arg0 == 2) {
			super.aBoolean171 = arg1.method191() == 1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(21) int[] local21 = this.method2904(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static141.anInt3261; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt2947) {
					local7[local23] = this.anInt2947;
				} else if (local29 > this.anInt2948) {
					local7[local23] = this.anInt2948;
				} else {
					local7[local23] = local29;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(29) int[][] local29 = this.method2913(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static141.anInt3261; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local45[local55];
				@Pc(69) int local69 = local37[local55];
				if (this.anInt2947 > local61) {
					local41[local55] = this.anInt2947;
				} else if (this.anInt2948 >= local61) {
					local41[local55] = local61;
				} else {
					local41[local55] = this.anInt2948;
				}
				if (this.anInt2947 > local69) {
					local49[local55] = this.anInt2947;
				} else if (this.anInt2948 < local69) {
					local49[local55] = this.anInt2948;
				} else {
					local49[local55] = local69;
				}
				if (this.anInt2947 > local65) {
					local53[local55] = this.anInt2947;
				} else if (this.anInt2948 < local65) {
					local53[local55] = this.anInt2948;
				} else {
					local53[local55] = local65;
				}
			}
		}
		return local11;
	}
}
