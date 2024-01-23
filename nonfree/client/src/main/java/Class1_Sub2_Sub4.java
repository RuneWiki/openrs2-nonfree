import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!cm", name = "P", descriptor = "Z")
	private boolean aBoolean60 = true;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(35) int[] local35 = this.method4570(this.aBoolean61 ? Static167.anInt3492 - arg0 : arg0, 0);
			if (this.aBoolean60) {
				for (@Pc(40) int local40 = 0; local40 < Static299.anInt5670; local40++) {
					local13[local40] = local35[Static142.anInt2791 - local40];
				}
			} else {
				Static319.method513(local35, 0, local13, 0, Static299.anInt5670);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean60 = arg0.method2595() == 1;
		} else if (arg1 == 1) {
			this.aBoolean61 = arg0.method2595() == 1;
		} else if (arg1 == 2) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(37) int[][] local37 = this.method4575(0, this.aBoolean61 ? Static167.anInt3492 - arg0 : arg0);
			@Pc(41) int[] local41 = local18[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[0];
			@Pc(53) int[] local53 = local37[2];
			@Pc(57) int[] local57 = local18[1];
			@Pc(61) int[] local61 = local18[2];
			@Pc(66) int local66;
			if (this.aBoolean60) {
				for (local66 = 0; local66 < Static299.anInt5670; local66++) {
					local41[local66] = local49[Static142.anInt2791 - local66];
					local57[local66] = local45[Static142.anInt2791 - local66];
					local61[local66] = local53[Static142.anInt2791 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static299.anInt5670; local66++) {
					local41[local66] = local49[local66];
					local57[local66] = local45[local66];
					local61[local66] = local53[local66];
				}
			}
		}
		return local18;
	}
}
