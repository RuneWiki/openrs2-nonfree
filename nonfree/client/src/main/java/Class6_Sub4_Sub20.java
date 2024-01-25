import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class6_Sub4_Sub20 extends Class6_Sub4 {

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
	private int anInt5488 = 4096;

	@OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
	private int anInt5491 = 0;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt5491 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt5488 = arg1.method6003();
		} else if (arg0 == 2) {
			super.aBoolean728 = arg1.method6069() == 1;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(29) int[] local29 = this.method7748(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static408.anInt7209; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt5491) {
					local11[local31] = this.anInt5491;
				} else if (this.anInt5488 >= local37) {
					local11[local31] = local37;
				} else {
					local11[local31] = this.anInt5488;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(29) int[][] local29 = this.method7747(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static408.anInt7209; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt5491 > local61) {
					local45[local55] = this.anInt5491;
				} else if (this.anInt5488 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt5488;
				}
				if (this.anInt5491 > local65) {
					local49[local55] = this.anInt5491;
				} else if (this.anInt5488 >= local65) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt5488;
				}
				if (this.anInt5491 > local69) {
					local53[local55] = this.anInt5491;
				} else if (this.anInt5488 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt5488;
				}
			}
		}
		return local11;
	}
}
