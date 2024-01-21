import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class2_Sub2_Sub1_Sub5 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!s", name = "yb", descriptor = "I")
	private final int anInt3515;

	@OriginalMember(owner = "client!s", name = "nb", descriptor = "I")
	private final int anInt3505;

	@OriginalMember(owner = "client!s", name = "tb", descriptor = "I")
	private final int anInt3511;

	@OriginalMember(owner = "client!s", name = "rb", descriptor = "I")
	private final int anInt3509;

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
	private final int anInt3504;

	@OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
	private final int anInt3510;

	@OriginalMember(owner = "client!s", name = "ub", descriptor = "Lclient!tc;")
	private Class2_Sub2_Sub15 aClass2_Sub2_Sub15_2;

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
	private int anInt3502;

	@OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
	private int anInt3507;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIIIZLclient!ac;)V")
	public Class2_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub2_Sub1 arg8) {
		this.anInt3515 = arg5;
		this.anInt3505 = arg2;
		this.anInt3511 = arg3;
		this.anInt3509 = arg1;
		this.anInt3504 = arg0;
		this.anInt3510 = arg4;
		if (arg6 != -1) {
			this.aClass2_Sub2_Sub15_2 = Static140.method2333(arg6);
			this.anInt3502 = 0;
			this.anInt3507 = Static143.anInt3513 - 1;
			if (this.aClass2_Sub2_Sub15_2.anInt3724 == 0 && arg8 != null && arg8 instanceof Class2_Sub2_Sub1_Sub5) {
				@Pc(50) Class2_Sub2_Sub1_Sub5 local50 = (Class2_Sub2_Sub1_Sub5) arg8;
				if (local50.aClass2_Sub2_Sub15_2 == this.aClass2_Sub2_Sub15_2) {
					this.anInt3507 = local50.anInt3507;
					this.anInt3502 = local50.anInt3502;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub2_Sub15_2.anInt3736 != -1) {
				this.anInt3502 = (int) (Math.random() * (double) this.aClass2_Sub2_Sub15_2.anIntArray548.length);
				this.anInt3507 -= (int) ((double) this.aClass2_Sub2_Sub15_2.anIntArray549[this.anInt3502] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Lclient!cd;")
	@Override
	protected Class2_Sub2_Sub1_Sub2 method2908() {
		if (this.aClass2_Sub2_Sub15_2 != null) {
			@Pc(14) int local14 = Static143.anInt3513 - this.anInt3507;
			if (local14 > 100 && this.aClass2_Sub2_Sub15_2.anInt3736 > 0) {
				local14 = 100;
			}
			label46: {
				do {
					do {
						if (local14 <= this.aClass2_Sub2_Sub15_2.anIntArray549[this.anInt3502]) {
							break label46;
						}
						local14 -= this.aClass2_Sub2_Sub15_2.anIntArray549[this.anInt3502];
						this.anInt3502++;
					} while (this.anInt3502 < this.aClass2_Sub2_Sub15_2.anIntArray548.length);
					this.anInt3502 -= this.aClass2_Sub2_Sub15_2.anInt3736;
				} while (this.anInt3502 >= 0 && this.anInt3502 < this.aClass2_Sub2_Sub15_2.anIntArray548.length);
				this.aClass2_Sub2_Sub15_2 = null;
			}
			this.anInt3507 = Static143.anInt3513 - local14;
		}
		@Pc(106) Class2_Sub2_Sub5 local106 = Static121.method2129(this.anInt3504);
		if (local106.anIntArray73 != null) {
			local106 = local106.method347();
		}
		if (local106 == null) {
			return null;
		}
		@Pc(141) int local141;
		@Pc(138) int local138;
		if (this.anInt3505 == 1 || this.anInt3505 == 3) {
			local141 = local106.anInt538;
			local138 = local106.anInt520;
		} else {
			local138 = local106.anInt538;
			local141 = local106.anInt520;
		}
		@Pc(156) int local156 = (local141 >> 1) + this.anInt3510;
		@Pc(166) int local166 = this.anInt3510 + (local141 + 1 >> 1);
		@Pc(173) int local173 = this.anInt3515 + (local138 >> 1);
		@Pc(183) int local183 = this.anInt3515 + (local138 + 1 >> 1);
		@Pc(188) int[][] local188 = Static122.anIntArrayArrayArray2[this.anInt3511];
		@Pc(197) int local197 = (local141 << 6) + (this.anInt3510 << 7);
		@Pc(225) int local225 = local188[local166][local173] + local188[local156][local173] + local188[local156][local183] + local188[local166][local183] >> 2;
		@Pc(235) int local235 = (this.anInt3515 << 7) + (local138 << 6);
		return local106.method345(local235, local225, local188, local197, this.anInt3502, this.anInt3505, this.aClass2_Sub2_Sub15_2, this.anInt3509);
	}
}
