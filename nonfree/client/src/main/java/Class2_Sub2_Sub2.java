import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!af", name = "db", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118 && this.method137()) {
			@Pc(40) int local40 = this.anInt204 * (Static2.anInt36 == this.anInt200 ? arg0 : arg0 * this.anInt200 / Static2.anInt36);
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[0];
			@Pc(52) int[] local52 = local16[2];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt204 == Static149.anInt3233) {
				for (local62 = 0; local62 < Static149.anInt3233; local62++) {
					local71 = this.anIntArray14[local40++];
					local52[local62] = (local71 & 0xFF) << 4;
					local44[local62] = local71 >> 4 & 0xFF0;
					local48[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static149.anInt3233; local62++) {
					local71 = this.anInt204 * local62 / Static149.anInt3233;
					@Pc(78) int local78 = this.anIntArray14[local71 + local40];
					local52[local62] = (local78 & 0xFF) << 4;
					local44[local62] = local78 >> 4 & 0xFF0;
					local48[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt199 = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)Z")
	private boolean method137() {
		if (this.anIntArray14 != null) {
			return true;
		} else if (this.anInt199 >= 0) {
			@Pc(31) int local31 = Static141.anInterface2_2.method253(this.anInt199) ? 64 : 128;
			this.anIntArray14 = Static141.anInterface2_2.method258(this.anInt199);
			this.anInt204 = local31;
			this.anInt200 = local31;
			return this.anIntArray14 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)I")
	@Override
	public int method2578() {
		return this.anInt199;
	}
}
