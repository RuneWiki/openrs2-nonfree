import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
	private int anInt7196 = 0;

	@OriginalMember(owner = "client!oga", name = "A", descriptor = "I")
	private int anInt7195 = 4096;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(29) int[][] local29 = this.method8718(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static30.anInt908; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt7196 > local61) {
					local45[local55] = this.anInt7196;
				} else if (local61 > this.anInt7195) {
					local45[local55] = this.anInt7195;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt7196) {
					local49[local55] = this.anInt7196;
				} else if (local65 > this.anInt7195) {
					local49[local55] = this.anInt7195;
				} else {
					local49[local55] = local65;
				}
				if (local69 < this.anInt7196) {
					local53[local55] = this.anInt7196;
				} else if (this.anInt7195 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt7195;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7196 = arg0.method4858();
		} else if (arg1 == 1) {
			this.anInt7195 = arg0.method4858();
		} else if (arg1 == 2) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(28) int[] local28 = this.method8716(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static30.anInt908; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (this.anInt7196 > local36) {
					local18[local30] = this.anInt7196;
				} else if (this.anInt7195 < local36) {
					local18[local30] = this.anInt7195;
				} else {
					local18[local30] = local36;
				}
			}
		}
		return local18;
	}
}
