import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fi", name = "ab", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!fi", name = "gb", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(29) int[] local29 = this.method3393(this.aBoolean86 ? Static15.anInt388 - arg0 : arg0, 0);
			if (this.aBoolean85) {
				for (@Pc(34) int local34 = 0; local34 < Static107.anInt2321; local34++) {
					local11[local34] = local29[Static144.anInt2893 - local34];
				}
			} else {
				Static216.method2201(local29, 0, local11, 0, Static107.anInt2321);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(37) int[][] local37 = this.method3397(0, this.aBoolean86 ? Static15.anInt388 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local15[0];
			@Pc(57) int[] local57 = local15[1];
			@Pc(61) int[] local61 = local15[2];
			@Pc(66) int local66;
			if (this.aBoolean85) {
				for (local66 = 0; local66 < Static107.anInt2321; local66++) {
					local53[local66] = local41[Static144.anInt2893 - local66];
					local57[local66] = local45[Static144.anInt2893 - local66];
					local61[local66] = local49[Static144.anInt2893 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static107.anInt2321; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean85 = arg0.method3010() == 1;
		} else if (arg1 == 1) {
			this.aBoolean86 = arg0.method3010() == 1;
		} else if (arg1 == 2) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}
}
