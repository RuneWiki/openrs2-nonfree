import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class4_Sub3_Sub25 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
	private int anInt2952;

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
	private int anInt2959;

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
	private int anInt2951;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2951 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)Z")
	private boolean method2204() {
		if (this.anIntArray279 != null) {
			return true;
		} else if (this.anInt2951 >= 0) {
			@Pc(29) int local29 = Static73.anInterface1_1.method382(this.anInt2951) ? 64 : 128;
			this.anIntArray279 = Static73.anInterface1_1.method385(this.anInt2951);
			this.anInt2952 = local29;
			this.anInt2959 = local29;
			return this.anIntArray279 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(B)I")
	@Override
	public int method3159() {
		return this.anInt2951;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84 && this.method2204()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = (this.anInt2959 == Static61.anInt1639 ? arg0 : this.anInt2959 * arg0 / Static61.anInt1639) * this.anInt2952;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (Static134.anInt3188 == this.anInt2952) {
				for (local62 = 0; local62 < Static134.anInt3188; local62++) {
					local71 = this.anIntArray279[local56++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static134.anInt3188; local62++) {
					local71 = local62 * this.anInt2952 / Static134.anInt3188;
					@Pc(78) int local78 = this.anIntArray279[local71 + local56];
					local36[local62] = (local78 & 0xFF) << 4;
					local32[local62] = local78 >> 4 & 0xFF0;
					local28[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
