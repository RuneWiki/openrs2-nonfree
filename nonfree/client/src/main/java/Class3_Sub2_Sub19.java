import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
	private int anInt6406 = 4096;

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
	private int anInt6410 = 0;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(33) int[][] local33 = this.method8337(0, arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local13[0];
			@Pc(53) int[] local53 = local13[1];
			@Pc(57) int[] local57 = local13[2];
			for (@Pc(59) int local59 = 0; local59 < Static164.anInt8839; local59++) {
				@Pc(65) int local65 = local37[local59];
				@Pc(69) int local69 = local41[local59];
				@Pc(73) int local73 = local45[local59];
				if (this.anInt6410 > local65) {
					local49[local59] = this.anInt6410;
				} else if (this.anInt6406 >= local65) {
					local49[local59] = local65;
				} else {
					local49[local59] = this.anInt6406;
				}
				if (local69 < this.anInt6410) {
					local53[local59] = this.anInt6410;
				} else if (local69 > this.anInt6406) {
					local53[local59] = this.anInt6406;
				} else {
					local53[local59] = local69;
				}
				if (this.anInt6410 > local73) {
					local57[local59] = this.anInt6410;
				} else if (this.anInt6406 >= local73) {
					local57[local59] = local73;
				} else {
					local57[local59] = this.anInt6406;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(29) int[] local29 = this.method8340(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static164.anInt8839; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt6410) {
					local19[local31] = this.anInt6410;
				} else if (local37 > this.anInt6406) {
					local19[local31] = this.anInt6406;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt6410 = arg1.method8414();
		} else if (arg0 == 1) {
			this.anInt6406 = arg1.method8414();
		} else if (arg0 == 2) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}
}
