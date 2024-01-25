import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class2_Sub11_Sub16 extends Class2_Sub11 {

	@OriginalMember(owner = "client!nfa", name = "H", descriptor = "I")
	private int anInt6873 = 4096;

	@OriginalMember(owner = "client!nfa", name = "K", descriptor = "I")
	private int anInt6877 = 0;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6877 = arg1.method8575();
		} else if (arg0 == 1) {
			this.anInt6873 = arg1.method8575();
		} else if (arg0 == 2) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(27) int[] local27 = this.method9540(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static301.anInt10214; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt6877 > local35) {
					local11[local29] = this.anInt6877;
				} else if (local35 > this.anInt6873) {
					local11[local29] = this.anInt6873;
				} else {
					local11[local29] = local35;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(29) int[][] local29 = this.method9538(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static301.anInt10214; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt6877 > local61) {
					local45[local55] = this.anInt6877;
				} else if (this.anInt6873 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt6873;
				}
				if (local65 < this.anInt6877) {
					local49[local55] = this.anInt6877;
				} else if (local65 <= this.anInt6873) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt6873;
				}
				if (this.anInt6877 > local69) {
					local53[local55] = this.anInt6877;
				} else if (local69 <= this.anInt6873) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt6873;
				}
			}
		}
		return local19;
	}
}
