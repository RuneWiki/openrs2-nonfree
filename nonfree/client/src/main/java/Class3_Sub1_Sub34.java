import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class3_Sub1_Sub34 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "Z")
	private boolean aBoolean670 = true;

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "Z")
	private boolean aBoolean671 = true;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(40) int[][] local40 = this.method9576(this.aBoolean670 ? Static652.anInt2344 - arg0 : arg0, 0);
			@Pc(44) int[] local44 = local40[0];
			@Pc(48) int[] local48 = local40[1];
			@Pc(52) int[] local52 = local40[2];
			@Pc(56) int[] local56 = local19[0];
			@Pc(60) int[] local60 = local19[1];
			@Pc(64) int[] local64 = local19[2];
			@Pc(69) int local69;
			if (this.aBoolean671) {
				for (local69 = 0; local69 < Static379.anInt5859; local69++) {
					local56[local69] = local44[Static711.anInt10997 - local69];
					local60[local69] = local48[Static711.anInt10997 - local69];
					local64[local69] = local52[Static711.anInt10997 - local69];
				}
			} else {
				for (local69 = 0; local69 < Static379.anInt5859; local69++) {
					local56[local69] = local44[local69];
					local60[local69] = local48[local69];
					local64[local69] = local52[local69];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(38) int[] local38 = this.method9577(0, this.aBoolean670 ? Static652.anInt2344 - arg0 : arg0);
			if (this.aBoolean671) {
				for (@Pc(53) int local53 = 0; local53 < Static379.anInt5859; local53++) {
					local18[local53] = local38[Static711.anInt10997 - local53];
				}
			} else {
				Static732.method6321(local38, 0, local18, 0, Static379.anInt5859);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean671 = arg1.method2048(255) == 1;
		} else if (arg0 == 1) {
			this.aBoolean670 = arg1.method2048(255) == 1;
		} else if (arg0 == 2) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}
}
