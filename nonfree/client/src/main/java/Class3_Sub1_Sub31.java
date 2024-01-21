import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public class Class3_Sub1_Sub31 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "[I")
	protected int[] anIntArray405;

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
	protected int anInt3560;

	@OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
	protected int anInt3562;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
	private int anInt3555;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87 && this.method2573()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = this.anInt3560 * (this.anInt3562 == Static141.anInt3259 ? arg0 : this.anInt3562 * arg0 / Static141.anInt3259);
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (this.anInt3560 == Static141.anInt3261) {
				for (local53 = 0; local53 < Static141.anInt3261; local53++) {
					local62 = this.anIntArray405[local47++];
					local31[local53] = (local62 & 0xFF) << 4;
					local27[local53] = local62 >> 4 & 0xFF0;
					local23[local53] = local62 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static141.anInt3261; local53++) {
					local62 = local53 * this.anInt3560 / Static141.anInt3261;
					@Pc(70) int local70 = this.anIntArray405[local47 + local62];
					local31[local53] = (local70 & 0xFF) << 4;
					local27[local53] = local70 >> 4 & 0xFF0;
					local23[local53] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)I")
	@Override
	public final int method2910() {
		return this.anInt3555;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Z")
	protected final boolean method2573() {
		if (this.anIntArray405 != null) {
			return true;
		} else if (this.anInt3555 >= 0) {
			@Pc(22) Class3_Sub2_Sub3_Sub3 local22 = Static100.method1648(this.anInt3555, Static141.aClass44_26);
			local22.method1878();
			this.anInt3562 = local22.anInt2698;
			this.anInt3560 = local22.anInt2694;
			this.anIntArray405 = local22.anIntArray301;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public final void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3555 = arg1.method208();
		}
	}
}
