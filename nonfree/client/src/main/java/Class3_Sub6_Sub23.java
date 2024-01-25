import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class3_Sub6_Sub23 extends Class3_Sub6 {

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
	private int anInt7447 = 0;

	@OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
	private int anInt7452 = 4096;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(26) int[] local26 = this.method8001(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static481.anInt8358; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt7447 > local34) {
					local16[local28] = this.anInt7447;
				} else if (this.anInt7452 >= local34) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt7452;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7447 = arg0.method6811();
		} else if (arg1 == 1) {
			this.anInt7452 = arg0.method6811();
		} else if (arg1 == 2) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(21) int[][] local21 = this.method8005(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static481.anInt8358; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt7447 > local53) {
					local37[local47] = this.anInt7447;
				} else if (local53 > this.anInt7452) {
					local37[local47] = this.anInt7452;
				} else {
					local37[local47] = local53;
				}
				if (this.anInt7447 > local57) {
					local41[local47] = this.anInt7447;
				} else if (local57 > this.anInt7452) {
					local41[local47] = this.anInt7452;
				} else {
					local41[local47] = local57;
				}
				if (local61 < this.anInt7447) {
					local45[local47] = this.anInt7447;
				} else if (this.anInt7452 >= local61) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt7452;
				}
			}
		}
		return local11;
	}
}
