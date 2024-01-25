import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class81_Sub1_Sub1 extends Class81_Sub1 {

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "Lclient!nm;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
	private final int anInt2147;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
	private final int anInt2148;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_7;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
	private final int anInt2145;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	private final int anInt2152;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	private final int anInt2149;

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
	private final int anInt2153;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!jj;IIIIII)V")
	public Class81_Sub1_Sub1(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2147 = arg3;
		this.anInt2148 = arg4;
		this.aClass75_Sub1_7 = arg0;
		this.anInt2145 = arg2;
		this.anInt2152 = arg1;
		this.anInt2149 = arg5;
		this.anInt2153 = arg6;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Lclient!nm;")
	@Override
	public Interface19 method2065() {
		if (this.anInterface19_1 == null) {
			Static488.anIntArray518[1] = this.anInt2145;
			Static488.anIntArray518[5] = this.anInt2153;
			@Pc(29) Interface11 local29 = this.aClass75_Sub1_7.anInterface11_10;
			Static488.anIntArray518[4] = this.anInt2149;
			Static488.anIntArray518[3] = this.anInt2148;
			Static488.anIntArray518[0] = this.anInt2152;
			Static488.anIntArray518[2] = this.anInt2147;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local29.method6032(Static488.anIntArray518[local55])) {
					return null;
				}
				@Pc(76) Class297 local76 = local29.method6027(Static488.anIntArray518[local55]);
				@Pc(84) int local84 = local76.aBoolean630 ? 64 : 128;
				if (local76.aByte120 > 0) {
					local51 = true;
				}
				if (local53 < local84) {
					local53 = local84;
				}
			}
			for (@Pc(107) int local107 = 0; local107 < 6; local107++) {
				Static676.anIntArrayArray59[local107] = local29.method6031(1.0F, local53, local53, Static488.anIntArray518[local107], false);
			}
			this.anInterface19_1 = this.aClass75_Sub1_7.method6765(local53, Static676.anIntArrayArray59, local51);
		}
		return this.anInterface19_1;
	}
}
