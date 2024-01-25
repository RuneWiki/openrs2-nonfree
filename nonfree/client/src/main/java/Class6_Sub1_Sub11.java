import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class6_Sub1_Sub11 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fia", name = "F", descriptor = "Z")
	private boolean aBoolean286 = true;

	@OriginalMember(owner = "client!fia", name = "H", descriptor = "Z")
	private boolean aBoolean287 = true;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(33) int[][] local33 = this.method8725(this.aBoolean287 ? Static117.anInt3013 - arg0 : arg0, 0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			@Pc(62) int local62;
			if (this.aBoolean286) {
				for (local62 = 0; local62 < Static53.anInt1787; local62++) {
					local49[local62] = local37[Static564.anInt9697 - local62];
					local53[local62] = local41[Static564.anInt9697 - local62];
					local57[local62] = local45[Static564.anInt9697 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static53.anInt1787; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean286 = arg1.method8246() == 1;
		} else if (arg0 == 1) {
			this.aBoolean287 = arg1.method8246() == 1;
		} else if (arg0 == 2) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(36) int[] local36 = this.method8731(this.aBoolean287 ? Static117.anInt3013 - arg0 : arg0, 0);
			if (this.aBoolean286) {
				for (@Pc(41) int local41 = 0; local41 < Static53.anInt1787; local41++) {
					local17[local41] = local36[Static564.anInt9697 - local41];
				}
			} else {
				Static653.method6534(local36, 0, local17, 0, Static53.anInt1787);
			}
		}
		return local17;
	}
}
