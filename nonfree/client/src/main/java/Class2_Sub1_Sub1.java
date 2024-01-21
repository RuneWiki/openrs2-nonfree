import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
	private int anInt58 = 4096;

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
	private int anInt61 = 0;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(29) int[] local29 = this.method3265(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static135.anInt2897; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt61 > local37) {
					local19[local31] = this.anInt61;
				} else if (this.anInt58 >= local37) {
					local19[local31] = local37;
				} else {
					local19[local31] = this.anInt58;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt61 = arg0.method269();
		} else if (arg1 == 1) {
			this.anInt58 = arg0.method269();
		} else if (arg1 == 2) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(29) int[][] local29 = this.method3259(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static135.anInt2897; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt61 > local61) {
					local45[local55] = this.anInt61;
				} else if (this.anInt58 < local61) {
					local45[local55] = this.anInt58;
				} else {
					local45[local55] = local61;
				}
				if (this.anInt61 > local65) {
					local49[local55] = this.anInt61;
				} else if (local65 > this.anInt58) {
					local49[local55] = this.anInt58;
				} else {
					local49[local55] = local65;
				}
				if (local69 < this.anInt61) {
					local53[local55] = this.anInt61;
				} else if (this.anInt58 < local69) {
					local53[local55] = this.anInt58;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local19;
	}
}
