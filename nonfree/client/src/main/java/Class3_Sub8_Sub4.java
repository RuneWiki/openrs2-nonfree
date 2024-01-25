import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class3_Sub8_Sub4 extends Class3_Sub8 {

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.aBoolean107 = arg1.method7954() == 1;
		} else if (arg0 == 1) {
			this.aBoolean106 = arg1.method7954() == 1;
		} else if (arg0 == 2) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(37) int[][] local37 = this.method8779(0, this.aBoolean106 ? Static635.anInt10496 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean107) {
				for (local66 = 0; local66 < Static91.anInt1849; local66++) {
					local53[local66] = local41[Static348.anInt5973 - local66];
					local57[local66] = local45[Static348.anInt5973 - local66];
					local61[local66] = local49[Static348.anInt5973 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static91.anInt1849; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(37) int[] local37 = this.method8776(this.aBoolean106 ? Static635.anInt10496 - arg0 : arg0, 0);
			if (this.aBoolean107) {
				for (@Pc(50) int local50 = 0; local50 < Static91.anInt1849; local50++) {
					local11[local50] = local37[Static348.anInt5973 - local50];
				}
			} else {
				Static681.method4031(local37, 0, local11, 0, Static91.anInt1849);
			}
		}
		return local11;
	}
}
