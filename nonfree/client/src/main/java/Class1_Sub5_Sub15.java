import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public class Class1_Sub5_Sub15 extends Class1_Sub5 {

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
	protected int anInt2047;

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "[I")
	protected int[] anIntArray231;

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
	protected int anInt2052;

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
	private int anInt2054;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public final void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2054 = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)Z")
	protected final boolean method1571() {
		if (this.anIntArray231 != null) {
			return true;
		} else if (this.anInt2054 >= 0) {
			@Pc(20) Class1_Sub2_Sub2_Sub3 local20 = Static69.method1231(Static27.aClass82_13, this.anInt2054);
			local20.method2120();
			this.anInt2047 = local20.anInt2737;
			this.anInt2052 = local20.anInt2736;
			this.anIntArray231 = local20.anIntArray288;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)I")
	@Override
	public final int method3151() {
		return this.anInt2054;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90 && this.method1571()) {
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[0];
			@Pc(55) int local55 = (this.anInt2052 == Static101.anInt2218 ? arg0 : arg0 * this.anInt2052 / Static101.anInt2218) * this.anInt2047;
			@Pc(59) int[] local59 = local11[2];
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (this.anInt2047 == Static177.anInt4018) {
				for (local65 = 0; local65 < Static177.anInt4018; local65++) {
					local74 = this.anIntArray231[local55++];
					local59[local65] = (local74 & 0xFF) << 4;
					local31[local65] = local74 >> 4 & 0xFF0;
					local35[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static177.anInt4018; local65++) {
					local74 = this.anInt2047 * local65 / Static177.anInt4018;
					@Pc(81) int local81 = this.anIntArray231[local74 + local55];
					local59[local65] = (local81 & 0xFF) << 4;
					local31[local65] = local81 >> 4 & 0xFF0;
					local35[local65] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
