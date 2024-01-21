import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class3_Sub1_Sub19 extends Class3_Sub1 {

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "[I")
	private int[] anIntArray497;

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
	private int anInt2838;

	@OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
	private int anInt2839;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
	private int anInt2836;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1 && this.method2235()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(49) int local49 = (this.anInt2839 == Static104.anInt2685 ? arg0 : this.anInt2839 * arg0 / Static104.anInt2685) * this.anInt2838;
			@Pc(53) int[] local53 = local17[2];
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (this.anInt2838 == Static129.anInt3285) {
				for (local63 = 0; local63 < Static129.anInt3285; local63++) {
					local72 = this.anIntArray497[local49++];
					local53[local63] = (local72 & 0xFF) << 4;
					local33[local63] = local72 >> 4 & 0xFF0;
					local29[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static129.anInt3285; local63++) {
					local72 = local63 * this.anInt2838 / Static129.anInt3285;
					@Pc(79) int local79 = this.anIntArray497[local49 + local72];
					local53[local63] = (local79 & 0xFF) << 4;
					local33[local63] = local79 >> 4 & 0xFF0;
					local29[local63] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2836 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I")
	@Override
	public int method3128() {
		return this.anInt2836;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Z")
	private boolean method2235() {
		if (this.anIntArray497 != null) {
			return true;
		} else if (this.anInt2836 >= 0) {
			@Pc(29) int local29 = Static50.anInterface2_2.method1829(this.anInt2836) ? 64 : 128;
			this.anIntArray497 = Static50.anInterface2_2.method1828(this.anInt2836);
			this.anInt2838 = local29;
			this.anInt2839 = local29;
			return this.anIntArray497 != null;
		} else {
			return false;
		}
	}
}
