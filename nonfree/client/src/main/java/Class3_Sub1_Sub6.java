import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!e", name = "O", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt996 = arg1.method208();
		} else if (arg0 == 1) {
			this.anInt988 = arg1.method208();
		} else if (arg0 == 2) {
			this.anInt994 = arg1.method208();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(29) int[][] local29 = this.method2913(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[1];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static141.anInt3261; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local65 == local61 && local69 == local65) {
					local45[local55] = this.anInt996 * local61 >> 12;
					local49[local55] = this.anInt988 * local65 >> 12;
					local53[local55] = local69 * this.anInt994 >> 12;
				} else {
					local45[local55] = this.anInt996;
					local49[local55] = this.anInt988;
					local53[local55] = this.anInt994;
				}
			}
		}
		return local19;
	}
}
