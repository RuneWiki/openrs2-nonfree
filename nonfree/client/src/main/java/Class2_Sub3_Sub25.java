import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub3_Sub25 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
	private int anInt2917;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!qb", name = "fb", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)Z")
	private boolean method2261() {
		if (this.anIntArray271 != null) {
			return true;
		} else if (this.anInt2920 >= 0) {
			@Pc(29) int local29 = Static100.anInterface1_1.method187(this.anInt2920) ? 64 : 128;
			this.anIntArray271 = Static100.anInterface1_1.method192(this.anInt2920);
			this.anInt2917 = local29;
			this.anInt2912 = local29;
			return this.anIntArray271 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt2920 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
	@Override
	public int method3018() {
		return this.anInt2920;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77 && this.method2261()) {
			@Pc(39) int local39 = (Static34.anInt889 == this.anInt2912 ? arg0 : this.anInt2912 * arg0 / Static34.anInt889) * this.anInt2917;
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt2917 == Static53.anInt1184) {
				for (local57 = 0; local57 < Static53.anInt1184; local57++) {
					local65 = this.anIntArray271[local39++];
					local51[local57] = (local65 & 0xFF) << 4;
					local43[local57] = local65 >> 4 & 0xFF0;
					local47[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static53.anInt1184; local57++) {
					local65 = this.anInt2917 * local57 / Static53.anInt1184;
					@Pc(114) int local114 = this.anIntArray271[local39 + local65];
					local51[local57] = (local114 & 0xFF) << 4;
					local43[local57] = local114 >> 4 & 0xFF0;
					local47[local57] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
