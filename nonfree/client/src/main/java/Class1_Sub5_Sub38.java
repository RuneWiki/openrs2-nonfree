import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub5_Sub38 extends Class1_Sub5 {

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
	private int anInt4080;

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
	private int anInt4086;

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
	private int anInt4088;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90 && this.method3107()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(51) int local51 = this.anInt4086 * (Static101.anInt2218 == this.anInt4080 ? arg0 : this.anInt4080 * arg0 / Static101.anInt2218);
			@Pc(55) int[] local55 = local11[2];
			@Pc(59) int[] local59 = local11[1];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (this.anInt4086 == Static177.anInt4018) {
				for (local65 = 0; local65 < Static177.anInt4018; local65++) {
					local73 = this.anIntArray430[local51++];
					local55[local65] = (local73 & 0xFF) << 4;
					local59[local65] = local73 >> 4 & 0xFF0;
					local31[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static177.anInt4018; local65++) {
					local73 = local65 * this.anInt4086 / Static177.anInt4018;
					@Pc(125) int local125 = this.anIntArray430[local73 + local51];
					local55[local65] = (local125 & 0xFF) << 4;
					local59[local65] = local125 >> 4 & 0xFF0;
					local31[local65] = local125 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	@Override
	public int method3140() {
		return this.anInt4088;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)Z")
	private boolean method3107() {
		if (this.anIntArray430 != null) {
			return true;
		} else if (this.anInt4088 >= 0) {
			@Pc(26) int local26 = Static15.anInterface3_1.method1026(this.anInt4088) ? 64 : 128;
			this.anIntArray430 = Static15.anInterface3_1.method1023(this.anInt4088);
			this.anInt4080 = local26;
			this.anInt4086 = local26;
			return this.anIntArray430 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4088 = arg0.method359();
		}
	}
}
