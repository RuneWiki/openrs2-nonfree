import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fb", name = "Q", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
	private int anInt1125;

	@OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
	private int anInt1128;

	@OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
	private int anInt1129;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
	@Override
	public int method2576() {
		return this.anInt1129;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118 && this.method871()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(53) int local53 = (this.anInt1125 == Static2.anInt36 ? arg0 : arg0 * this.anInt1125 / Static2.anInt36) * this.anInt1128;
			@Pc(57) int[] local57 = local17[2];
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (Static149.anInt3233 == this.anInt1128) {
				for (local67 = 0; local67 < Static149.anInt3233; local67++) {
					local75 = this.anIntArray134[local53++];
					local57[local67] = (local75 & 0xFF) << 4;
					local33[local67] = local75 >> 4 & 0xFF0;
					local29[local67] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static149.anInt3233; local67++) {
					local75 = local67 * this.anInt1128 / Static149.anInt3233;
					@Pc(127) int local127 = this.anIntArray134[local75 + local53];
					local57[local67] = (local127 & 0xFF) << 4;
					local33[local67] = local127 >> 4 & 0xFF0;
					local29[local67] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1129 = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)Z")
	private boolean method871() {
		if (this.anIntArray134 != null) {
			return true;
		} else if (this.anInt1129 >= 0) {
			@Pc(25) Class2_Sub1_Sub4_Sub2 local25 = Static149.method2287(this.anInt1129, Static149.aClass29_61);
			local25.method718();
			this.anIntArray134 = local25.anIntArray71;
			this.anInt1125 = local25.anInt892;
			this.anInt1128 = local25.anInt893;
			return true;
		} else {
			return false;
		}
	}
}
