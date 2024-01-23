import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(35) int[] local35 = this.method4117(0, this.aBoolean145 ? Static42.anInt1193 - arg0 : arg0);
			if (this.aBoolean146) {
				for (@Pc(40) int local40 = 0; local40 < Static110.anInt2934; local40++) {
					local17[local40] = local35[Static2.anInt38 - local40];
				}
			} else {
				Static274.method2690(local35, 0, local17, 0, Static110.anInt2934);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(37) int[][] local37 = this.method4129(0, this.aBoolean145 ? Static42.anInt1193 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[1];
			@Pc(45) int[] local45 = local37[0];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[1];
			@Pc(57) int[] local57 = local19[0];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean146) {
				for (local66 = 0; local66 < Static110.anInt2934; local66++) {
					local57[local66] = local45[Static2.anInt38 - local66];
					local53[local66] = local41[Static2.anInt38 - local66];
					local61[local66] = local49[Static2.anInt38 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static110.anInt2934; local66++) {
					local57[local66] = local45[local66];
					local53[local66] = local41[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean146 = arg0.method1772() == 1;
		} else if (arg1 == 1) {
			this.aBoolean145 = arg0.method1772() == 1;
		} else if (arg1 == 2) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}
}
