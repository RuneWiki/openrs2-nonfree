import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class1_Sub5_Sub33 extends Class1_Sub5 {

	@OriginalMember(owner = "client!se", name = "T", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "I")
	private int anInt3424;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		if (this.anIntArrayArray28 == null) {
			this.anIntArrayArray28 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray28.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3424 == 2) {
			this.method2630();
		}
		Static80.method1357();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3424 = arg0.method336();
		this.anIntArrayArray28 = new int[arg0.method336()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray28.length; local29++) {
			this.anIntArrayArray28[local29][0] = arg0.method359();
			this.anIntArrayArray28[local29][1] = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)[I")
	private int[] method2629(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray360;
		} else if (this.anIntArrayArray28.length <= arg0) {
			return this.anIntArray361;
		} else {
			return this.anIntArrayArray28[arg0];
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	private void method2630() {
		@Pc(4) int[] local4 = this.anIntArrayArray28[0];
		@Pc(17) int[] local17 = this.anIntArrayArray28[this.anIntArrayArray28.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray28[1];
		@Pc(39) int[] local39 = this.anIntArrayArray28[this.anIntArrayArray28.length - 1];
		this.anIntArray360 = new int[] { local4[0] + local4[0] - local22[0], local4[1] - local22[1] - -local4[1] };
		this.anIntArray361 = new int[] { local17[0] + local17[0] - local39[0], local17[1] - local39[1] + local17[1] };
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(26) int[] local26 = this.method3145(0, arg0);
			@Pc(29) int local29 = this.anInt3424;
			@Pc(49) int local49;
			@Pc(47) int local47;
			@Pc(80) int[] local80;
			@Pc(85) int[] local85;
			@Pc(94) int local94;
			@Pc(98) int local98;
			@Pc(102) int local102;
			if (local29 == 2) {
				for (local29 = 0; local29 < Static177.anInt4018; local29++) {
					local47 = local26[local29];
					for (local49 = 1; local49 < this.anIntArrayArray28.length - 1 && this.anIntArrayArray28[local49][0] <= local47; local49++) {
					}
					local80 = this.anIntArrayArray28[local49 - 1];
					local85 = this.anIntArrayArray28[local49];
					local94 = this.method2629(local49 - 2)[1];
					local98 = local80[1];
					local102 = local85[1];
					@Pc(108) int local108 = local102 - local94;
					@Pc(117) int local117 = this.method2629(local49 + 1)[1];
					@Pc(127) int local127 = local117 + local98 - local102 - local94;
					@Pc(144) int local144 = (local47 - local80[0] << 12) / (local85[0] - local80[0]);
					@Pc(150) int local150 = local108 * local144 >> 12;
					@Pc(158) int local158 = local94 - local127 - local98;
					@Pc(164) int local164 = local144 * local144 >> 12;
					@Pc(170) int local170 = local158 * local164 >> 12;
					@Pc(180) int local180 = (local144 * local127 >> 12) * local164 >> 12;
					local16[local29] = local98 + local180 + local170 + local150;
				}
			} else if (local29 == 1) {
				for (local29 = 0; local29 < Static177.anInt4018; local29++) {
					local47 = local26[local29];
					for (local49 = 1; this.anIntArrayArray28.length - 1 > local49 && this.anIntArrayArray28[local49][0] <= local47; local49++) {
					}
					local85 = this.anIntArrayArray28[local49];
					local80 = this.anIntArrayArray28[local49 - 1];
					local94 = (local47 - local80[0] << 12) / (local85[0] - local80[0]);
					local98 = 4096 - Static61.anIntArray125[local94 >> 5 & 0xFF] >> 1;
					local102 = 4096 - local98;
					local16[local29] = local102 * local80[1] + local98 * local85[1] >> 12;
				}
			} else {
				for (local29 = 0; local29 < Static177.anInt4018; local29++) {
					local47 = local26[local29];
					for (local49 = 1; local49 < this.anIntArrayArray28.length - 1 && local47 >= this.anIntArrayArray28[local49][0]; local49++) {
					}
					local80 = this.anIntArrayArray28[local49 - 1];
					local85 = this.anIntArrayArray28[local49];
					local94 = (local47 - local80[0] << 12) / (local85[0] - local80[0]);
					local98 = 4096 - local94;
					local16[local29] = local80[1] * local98 + local94 * local85[1] >> 12;
				}
			}
		}
		return local16;
	}
}
