import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class3_Sub1_Sub30 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
	private int anInt9126 = 4096;

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "I")
	private int anInt9129 = 0;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(31) int[] local31 = this.method9577(0, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static379.anInt5859; local33++) {
				@Pc(39) int local39 = local31[local33];
				if (local39 < this.anInt9129) {
					local11[local33] = this.anInt9129;
				} else if (local39 <= this.anInt9126) {
					local11[local33] = local39;
				} else {
					local11[local33] = this.anInt9126;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt9129 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.anInt9126 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(23) int[][] local23 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(33) int[][] local33 = this.method9576(arg0, 0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local23[0];
			@Pc(53) int[] local53 = local23[1];
			@Pc(57) int[] local57 = local23[2];
			for (@Pc(59) int local59 = 0; local59 < Static379.anInt5859; local59++) {
				@Pc(65) int local65 = local37[local59];
				@Pc(69) int local69 = local41[local59];
				@Pc(73) int local73 = local45[local59];
				if (local65 < this.anInt9129) {
					local49[local59] = this.anInt9129;
				} else if (local65 <= this.anInt9126) {
					local49[local59] = local65;
				} else {
					local49[local59] = this.anInt9126;
				}
				if (local69 < this.anInt9129) {
					local53[local59] = this.anInt9129;
				} else if (local69 <= this.anInt9126) {
					local53[local59] = local69;
				} else {
					local53[local59] = this.anInt9126;
				}
				if (this.anInt9129 > local73) {
					local57[local59] = this.anInt9129;
				} else if (local73 > this.anInt9126) {
					local57[local59] = this.anInt9126;
				} else {
					local57[local59] = local73;
				}
			}
		}
		return local23;
	}
}
