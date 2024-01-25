import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class3_Sub1_Sub30 extends Class3_Sub1 {

	@OriginalMember(owner = "client!oda", name = "F", descriptor = "Z")
	private boolean aBoolean418 = true;

	@OriginalMember(owner = "client!oda", name = "N", descriptor = "Z")
	private boolean aBoolean420 = true;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.aBoolean420 = arg1.method7548() == 1;
		} else if (arg0 == 1) {
			this.aBoolean418 = arg1.method7548() == 1;
		} else if (arg0 == 2) {
			super.aBoolean687 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(37) int[][] local37 = this.method7779(0, this.aBoolean418 ? Static485.anInt8693 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean420) {
				for (local66 = 0; local66 < Static307.anInt4846; local66++) {
					local53[local66] = local41[Static324.anInt6207 - local66];
					local57[local66] = local45[Static324.anInt6207 - local66];
					local61[local66] = local49[Static324.anInt6207 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static307.anInt4846; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(33) int[] local33 = this.method7778(0, this.aBoolean418 ? Static485.anInt8693 - arg0 : arg0);
			if (this.aBoolean420) {
				for (@Pc(38) int local38 = 0; local38 < Static307.anInt4846; local38++) {
					local16[local38] = local33[Static324.anInt6207 - local38];
				}
			} else {
				Static559.method5952(local33, 0, local16, 0, Static307.anInt4846);
			}
		}
		return local16;
	}
}
