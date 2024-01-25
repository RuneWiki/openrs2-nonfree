import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub8_Sub30 extends Class1_Sub8 {

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "Z")
	private boolean aBoolean404 = true;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "Z")
	private boolean aBoolean405 = true;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(37) int[][] local37 = this.method6035(this.aBoolean404 ? Static443.anInt7904 - arg0 : arg0, 0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean405) {
				for (local66 = 0; local66 < Static18.anInt439; local66++) {
					local53[local66] = local41[Static283.anInt5397 - local66];
					local57[local66] = local45[Static283.anInt5397 - local66];
					local61[local66] = local49[Static283.anInt5397 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static18.anInt439; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.aBoolean405 = arg1.method1171() == 1;
		} else if (arg0 == 1) {
			this.aBoolean404 = arg1.method1171() == 1;
		} else if (arg0 == 2) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(37) int[] local37 = this.method6037(0, this.aBoolean404 ? Static443.anInt7904 - arg0 : arg0);
			if (this.aBoolean405) {
				for (@Pc(42) int local42 = 0; local42 < Static18.anInt439; local42++) {
					local19[local42] = local37[Static283.anInt5397 - local42];
				}
			} else {
				Static469.method6020(local37, 0, local19, 0, Static18.anInt439);
			}
		}
		return local19;
	}
}
