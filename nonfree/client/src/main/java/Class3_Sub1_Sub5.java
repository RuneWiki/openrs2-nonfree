import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!de", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
	private int[] method783(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray181;
		} else if (arg0 >= this.anIntArrayArray11.length) {
			return this.anIntArray182;
		} else {
			return this.anIntArrayArray11[arg0];
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt952 = arg1.method1545();
		this.anIntArrayArray11 = new int[arg1.method1545()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray11.length; local20++) {
			this.anIntArrayArray11[local20][0] = arg1.method1510();
			this.anIntArrayArray11[local20][1] = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		if (this.anIntArrayArray11 == null) {
			this.anIntArrayArray11 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray11.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt952 == 2) {
			this.method787();
		}
		Static160.method2981();
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	private void method787() {
		@Pc(8) int[] local8 = this.anIntArrayArray11[0];
		@Pc(17) int[] local17 = this.anIntArrayArray11[this.anIntArrayArray11.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray11[1];
		@Pc(31) int[] local31 = this.anIntArrayArray11[this.anIntArrayArray11.length - 1];
		this.anIntArray182 = new int[] { local17[0] + local17[0] - local31[0], local17[1] + -local31[1] + local17[1] };
		this.anIntArray181 = new int[] { local8[0] + local8[0] - local22[0], local8[1] + -local22[1] + local8[1] };
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(26) int[] local26 = this.method3120(0, arg0);
			@Pc(29) int local29 = this.anInt952;
			@Pc(47) int local47;
			@Pc(45) int local45;
			@Pc(82) int[] local82;
			@Pc(87) int[] local87;
			@Pc(96) int local96;
			@Pc(104) int local104;
			@Pc(100) int local100;
			if (local29 == 2) {
				for (local29 = 0; local29 < Static129.anInt3285; local29++) {
					local45 = local26[local29];
					for (local47 = 1; this.anIntArrayArray11.length - 1 > local47 && this.anIntArrayArray11[local47][0] <= local45; local47++) {
					}
					local82 = this.anIntArrayArray11[local47 - 1];
					local87 = this.anIntArrayArray11[local47];
					local96 = this.method783(local47 - 2)[1];
					local100 = local87[1];
					local104 = local82[1];
					@Pc(113) int local113 = this.method783(local47 + 1)[1];
					@Pc(130) int local130 = (local45 - local82[0] << 12) / (local87[0] - local82[0]);
					@Pc(140) int local140 = local113 + local104 - local100 - local96;
					@Pc(145) int local145 = local100 - local96;
					@Pc(151) int local151 = local130 * local130 >> 12;
					@Pc(159) int local159 = local96 - local140 - local104;
					@Pc(171) int local171 = local151 * (local130 * local140 >> 12) >> 12;
					@Pc(177) int local177 = local159 * local151 >> 12;
					@Pc(183) int local183 = local130 * local145 >> 12;
					local16[local29] = local177 + local171 + local183 + local104;
				}
			} else if (local29 == 1) {
				for (local29 = 0; local29 < Static129.anInt3285; local29++) {
					local45 = local26[local29];
					for (local47 = 1; local47 < this.anIntArrayArray11.length - 1 && this.anIntArrayArray11[local47][0] <= local45; local47++) {
					}
					local87 = this.anIntArrayArray11[local47];
					local82 = this.anIntArrayArray11[local47 - 1];
					local96 = (local45 - local82[0] << 12) / (local87[0] - local82[0]);
					local104 = 4096 - Static61.anIntArray316[local96 >> 5 & 0xFF] >> 1;
					local100 = 4096 - local104;
					local16[local29] = local82[1] * local100 + local104 * local87[1] >> 12;
				}
			} else {
				for (local29 = 0; local29 < Static129.anInt3285; local29++) {
					local45 = local26[local29];
					for (local47 = 1; local47 < this.anIntArrayArray11.length - 1 && local45 >= this.anIntArrayArray11[local47][0]; local47++) {
					}
					local87 = this.anIntArrayArray11[local47];
					local82 = this.anIntArrayArray11[local47 - 1];
					local96 = (local45 - local82[0] << 12) / (local87[0] - local82[0]);
					local104 = 4096 - local96;
					local16[local29] = local96 * local87[1] + local104 * local82[1] >> 12;
				}
			}
		}
		return local16;
	}
}
