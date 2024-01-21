import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public class Class2_Sub3_Sub24 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "[I")
	protected int[] anIntArray328;

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
	protected int anInt3710;

	@OriginalMember(owner = "client!qa", name = "db", descriptor = "I")
	protected int anInt3712;

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
	private int anInt3706;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)Z")
	protected final boolean method2824() {
		if (this.anIntArray328 != null) {
			return true;
		} else if (this.anInt3706 >= 0) {
			@Pc(20) Class2_Sub2_Sub2_Sub3 local20 = Static144.method2371(Static148.aClass11_113, this.anInt3706);
			local20.method1528();
			this.anInt3712 = local20.anInt1885;
			this.anIntArray328 = local20.anIntArray191;
			this.anInt3710 = local20.anInt1886;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public final void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt3706 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77 && this.method2824()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(53) int local53 = (Static34.anInt889 == this.anInt3712 ? arg0 : arg0 * this.anInt3712 / Static34.anInt889) * this.anInt3710;
			@Pc(57) int[] local57 = local17[2];
			@Pc(67) int local67;
			@Pc(76) int local76;
			if (this.anInt3710 == Static53.anInt1184) {
				for (local67 = 0; local67 < Static53.anInt1184; local67++) {
					local76 = this.anIntArray328[local53++];
					local57[local67] = (local76 & 0xFF) << 4;
					local33[local67] = local76 >> 4 & 0xFF0;
					local29[local67] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static53.anInt1184; local67++) {
					local76 = local67 * this.anInt3710 / Static53.anInt1184;
					@Pc(84) int local84 = this.anIntArray328[local53 + local76];
					local57[local67] = (local84 & 0xFF) << 4;
					local33[local67] = local84 >> 4 & 0xFF0;
					local29[local67] = local84 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)I")
	@Override
	public final int method3021() {
		return this.anInt3706;
	}
}
