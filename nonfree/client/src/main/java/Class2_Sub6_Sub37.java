import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class2_Sub6_Sub37 extends Class2_Sub6 {

	@OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
	private int anInt10026 = 4096;

	@OriginalMember(owner = "client!wea", name = "Q", descriptor = "I")
	private int anInt10031 = 0;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(25) int[][] local25 = this.method8465(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			for (@Pc(51) int local51 = 0; local51 < Static51.anInt1085; local51++) {
				@Pc(57) int local57 = local29[local51];
				@Pc(61) int local61 = local33[local51];
				@Pc(65) int local65 = local37[local51];
				if (this.anInt10031 > local57) {
					local41[local51] = this.anInt10031;
				} else if (this.anInt10026 >= local57) {
					local41[local51] = local57;
				} else {
					local41[local51] = this.anInt10026;
				}
				if (this.anInt10031 > local61) {
					local45[local51] = this.anInt10031;
				} else if (this.anInt10026 >= local61) {
					local45[local51] = local61;
				} else {
					local45[local51] = this.anInt10026;
				}
				if (local65 < this.anInt10031) {
					local49[local51] = this.anInt10031;
				} else if (this.anInt10026 < local65) {
					local49[local51] = this.anInt10026;
				} else {
					local49[local51] = local65;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(26) int[] local26 = this.method8461(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static51.anInt1085; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt10031 > local34) {
					local16[local28] = this.anInt10031;
				} else if (this.anInt10026 >= local34) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt10026;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt10031 = arg1.method8546();
		} else if (arg0 == 1) {
			this.anInt10026 = arg1.method8546();
		} else if (arg0 == 2) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}
}
