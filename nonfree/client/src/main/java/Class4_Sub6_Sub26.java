import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class4_Sub6_Sub26 extends Class4_Sub6 {

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
	private int anInt3909 = 0;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
	private int anInt3914 = 4096;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(28) int[][] local28 = this.method4377(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local28[2];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static2.anInt19; local54++) {
				@Pc(61) int local61 = local32[local54];
				@Pc(65) int local65 = local36[local54];
				@Pc(69) int local69 = local44[local54];
				if (local61 < this.anInt3909) {
					local40[local54] = this.anInt3909;
				} else if (local61 > this.anInt3914) {
					local40[local54] = this.anInt3914;
				} else {
					local40[local54] = local61;
				}
				if (local65 < this.anInt3909) {
					local48[local54] = this.anInt3909;
				} else if (this.anInt3914 >= local65) {
					local48[local54] = local65;
				} else {
					local48[local54] = this.anInt3914;
				}
				if (local69 < this.anInt3909) {
					local52[local54] = this.anInt3909;
				} else if (this.anInt3914 >= local69) {
					local52[local54] = local69;
				} else {
					local52[local54] = this.anInt3914;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(27) int[] local27 = this.method4372(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static2.anInt19; local29++) {
				@Pc(40) int local40 = local27[local29];
				if (this.anInt3909 > local40) {
					local17[local29] = this.anInt3909;
				} else if (local40 > this.anInt3914) {
					local17[local29] = this.anInt3914;
				} else {
					local17[local29] = local40;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3909 = arg0.method1837();
		} else if (arg1 == 1) {
			this.anInt3914 = arg0.method1837();
		} else if (arg1 == 2) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}
}
