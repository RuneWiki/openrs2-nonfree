import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub1_Sub33 extends Class3_Sub1 {

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.aBoolean153 = arg1.method191() == 1;
		} else if (arg0 == 1) {
			this.aBoolean154 = arg1.method191() == 1;
		} else if (arg0 == 2) {
			super.aBoolean171 = arg1.method191() == 1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(37) int[][] local37 = this.method2913(this.aBoolean154 ? Static169.anInt3754 - arg0 : arg0, 0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local19[0];
			@Pc(53) int[] local53 = local37[2];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean153) {
				for (local66 = 0; local66 < Static141.anInt3261; local66++) {
					local49[local66] = local41[Static67.anInt1764 - local66];
					local57[local66] = local45[Static67.anInt1764 - local66];
					local61[local66] = local53[Static67.anInt1764 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static141.anInt3261; local66++) {
					local49[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local53[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(25) int[] local25 = this.method2904(0, this.aBoolean154 ? Static169.anInt3754 - arg0 : arg0);
			if (this.aBoolean153) {
				for (@Pc(38) int local38 = 0; local38 < Static141.anInt3261; local38++) {
					local7[local38] = local25[Static67.anInt1764 - local38];
				}
			} else {
				Static184.method1306(local25, 0, local7, 0, Static141.anInt3261);
			}
		}
		return local7;
	}
}
