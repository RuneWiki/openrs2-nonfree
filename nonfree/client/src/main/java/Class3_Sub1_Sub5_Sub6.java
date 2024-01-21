import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class3_Sub1_Sub5_Sub6 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!qg", name = "rb", descriptor = "I")
	private final int anInt3299;

	@OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
	private final int anInt3288;

	@OriginalMember(owner = "client!qg", name = "pb", descriptor = "I")
	private final int anInt3298;

	@OriginalMember(owner = "client!qg", name = "nb", descriptor = "I")
	private final int anInt3296;

	@OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
	private final int anInt3291;

	@OriginalMember(owner = "client!qg", name = "tb", descriptor = "I")
	private final int anInt3301;

	@OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lclient!ri;")
	private Class3_Sub1_Sub15 aClass3_Sub1_Sub15_3;

	@OriginalMember(owner = "client!qg", name = "vb", descriptor = "I")
	private int anInt3302;

	@OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
	private int anInt3289;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIIIZLclient!dd;)V")
	public Class3_Sub1_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class3_Sub1_Sub5 arg8) {
		this.anInt3299 = arg0;
		this.anInt3288 = arg1;
		this.anInt3298 = arg5;
		this.anInt3296 = arg4;
		this.anInt3291 = arg3;
		this.anInt3301 = arg2;
		if (arg6 != -1) {
			this.aClass3_Sub1_Sub15_3 = Static148.method2368(arg6);
			this.anInt3302 = Static193.anInt4411 - 1;
			this.anInt3289 = 0;
			if (this.aClass3_Sub1_Sub15_3.anInt3554 == 0 && arg8 != null && arg8 instanceof Class3_Sub1_Sub5_Sub6) {
				@Pc(51) Class3_Sub1_Sub5_Sub6 local51 = (Class3_Sub1_Sub5_Sub6) arg8;
				if (local51.aClass3_Sub1_Sub15_3 == this.aClass3_Sub1_Sub15_3) {
					this.anInt3289 = local51.anInt3289;
					this.anInt3302 = local51.anInt3302;
					return;
				}
			}
			if (arg7 && this.aClass3_Sub1_Sub15_3.anInt3549 != -1) {
				this.anInt3289 = (int) (Math.random() * (double) this.aClass3_Sub1_Sub15_3.anIntArray439.length);
				this.anInt3302 -= (int) (Math.random() * (double) this.aClass3_Sub1_Sub15_3.anIntArray440[this.anInt3289]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Lclient!vf;")
	@Override
	protected Class3_Sub1_Sub5_Sub3 method3056() {
		if (this.aClass3_Sub1_Sub15_3 != null) {
			@Pc(10) int local10 = Static193.anInt4411 - this.anInt3302;
			if (local10 > 100 && this.aClass3_Sub1_Sub15_3.anInt3549 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (local10 <= this.aClass3_Sub1_Sub15_3.anIntArray440[this.anInt3289]) {
							break label46;
						}
						local10 -= this.aClass3_Sub1_Sub15_3.anIntArray440[this.anInt3289];
						this.anInt3289++;
					} while (this.anInt3289 < this.aClass3_Sub1_Sub15_3.anIntArray439.length);
					this.anInt3289 -= this.aClass3_Sub1_Sub15_3.anInt3549;
				} while (this.anInt3289 >= 0 && this.aClass3_Sub1_Sub15_3.anIntArray439.length > this.anInt3289);
				this.aClass3_Sub1_Sub15_3 = null;
			}
			this.anInt3302 = Static193.anInt4411 - local10;
		}
		@Pc(97) Class3_Sub1_Sub1 local97 = Static162.method2627(this.anInt3299);
		if (local97.anIntArray23 != null) {
			local97 = local97.method125();
		}
		if (local97 == null) {
			return null;
		}
		@Pc(124) int local124;
		@Pc(121) int local121;
		if (this.anInt3301 == 1 || this.anInt3301 == 3) {
			local121 = local97.anInt145;
			local124 = local97.anInt150;
		} else {
			local121 = local97.anInt150;
			local124 = local97.anInt145;
		}
		@Pc(140) int local140 = this.anInt3296 + (local124 >> 1);
		@Pc(149) int local149 = (local124 + 1 >> 1) + this.anInt3296;
		@Pc(156) int local156 = (local121 >> 1) + this.anInt3298;
		@Pc(161) int[][] local161 = Static42.anIntArrayArrayArray1[this.anInt3291];
		@Pc(170) int local170 = (local121 + 1 >> 1) + this.anInt3298;
		@Pc(179) int local179 = (local121 << 6) + (this.anInt3298 << 7);
		@Pc(188) int local188 = (local124 << 6) + (this.anInt3296 << 7);
		@Pc(221) int local221 = local161[local149][local156] + local161[local140][local156] + local161[local140][local170] + local161[local149][local170] >> 2;
		return local97.method116(local179, local161, local221, this.anInt3301, local188, this.aClass3_Sub1_Sub15_3, this.anInt3288, this.anInt3289);
	}
}
